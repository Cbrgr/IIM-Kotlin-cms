package burger.constantin.cms

import burger.constantin.cms.control.ArticlePresenterImp
import burger.constantin.cms.control.ArticleListPresenterImp
import burger.constantin.cms.model.Article
import burger.constantin.cms.tpl.IndexContext
import freemarker.cache.ClassTemplateLoader
import io.ktor.application.call
import io.ktor.application.install
import io.ktor.freemarker.FreeMarker
import io.ktor.freemarker.FreeMarkerContent
import io.ktor.http.HttpStatusCode
import io.ktor.response.respond
import io.ktor.routing.get
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import kotlinx.coroutines.launch

class App

fun main() {

    val appComponents = AppComponents("jdbc:mysql://localhost:3306/CMS?serverTimezone=UTC", "root", "")

    embeddedServer(Netty, 8080) {
        install(FreeMarker) {
            templateLoader = ClassTemplateLoader(App::class.java.classLoader, "templates")
        }

        routing {
            get("article/{id}") {

                val controller = appComponents.getArticlePresenter(object : ArticlePresenter.View {
                    override fun displayArticle(article: Article?) {
                        launch {
                            call.respond(FreeMarkerContent("article.ftl", article, "e"))
                        }
                    }

                    override fun displayNotFound() {
                        launch {
                            call.respond(HttpStatusCode.NotFound)
                        }
                    }
                })
                val id = call.parameters["id"]!!.toIntOrNull()
                if (id == null) {
                    call.respond(HttpStatusCode.NotFound)
                } else {
                    controller.start(id)
                }

            }
            get("/") {
                val controller = appComponents.getArticleListPresenter(object : ArticleListPresenter.View {
                    override fun displayArticleList(list: List<Article>) {
                        val context = IndexContext(list)
                        launch {
                            call.respond(FreeMarkerContent("index.ftl", context, "e"))
                        }
                    }
                })

                controller.start()
            }
        }
    }.start(wait = true)
}
