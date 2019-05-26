package burger.constantin.cms

import burger.constantin.cms.model.Article
import burger.constantin.cms.tpl.IndexContext
import io.ktor.application.call
import io.ktor.freemarker.FreeMarkerContent
import io.ktor.http.HttpStatusCode
import io.ktor.response.respond

class MysqlModel(val pool: ConnectionPool) : Model {
    override fun getArticleList(): List<Article> {

        val list = ArrayList<Article>()

        pool.useConnection { connection ->
            connection.prepareStatement("SELECT * FROM articles").use {stmt ->
                stmt.executeQuery().use {result ->
                    while (result.next()) {
                        list += Article(
                            result.getInt("id"),
                            result.getString("title"),
                            result.getString("text")
                        )
                    }
                }
            }
        }
        return list
    }

    override fun getArticle(id: Int): Article? {

        pool.useConnection { connection ->
            connection.prepareStatement("SELECT * FROM articles WHERE id= ?").use {stmt ->
                stmt.setInt(1, id)

                stmt.executeQuery().use {result ->
                    if (result.next()) {
                        return Article(
                            result.getInt("id"),
                            result.getString("title"),
                            result.getString("text")
                        )

                    }
                }
            }
        }
        return null
    }

}