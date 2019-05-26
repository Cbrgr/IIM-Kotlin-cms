package burger.constantin.cms

import burger.constantin.cms.control.ArticleListPresenterImp
import burger.constantin.cms.control.ArticlePresenterImp
import burger.constantin.cms.model.Article
import com.nhaarman.mockitokotlin2.*
import org.junit.Test

class PresenterTests {

    @Test
    fun testArticleListPresenter() {

        val list = listOf(Article(1, "Un", ""), Article(2, "Deux", ""))

        val model = mock<Model> {
            on { getArticleList() } doReturn list
        }

        val view = mock<ArticleListPresenter.View>()

        val presenter = ArticleListPresenterImp(model, view)
        presenter.start()

        verify(model).getArticleList()
        verify(view).displayArticleList(list)
        verifyNoMoreInteractions(model, view)
    }

    @Test
    fun testArticlePresenter() {

        val article = Article(1, "Un", "Lorem Ipsum")
        val id = 1

        val model = mock<Model> {
            on { getArticle(id) } doReturn article
        }

        val view = mock<ArticlePresenter.View>()

        val presenter = ArticlePresenterImp(model, view)
        presenter.start(id)

        verify(model).getArticle(id)
        verify(view).displayArticle(article)
        verify(view, never()).displayNotFound()
        verifyNoMoreInteractions(model, view)
    }

//    @Test
//    fun testInvalidArticlePresenter() {
//
//        val model = mock<Model> {
//            on { getArticle(any) } doReturn article
//        }
//
//        val view = mock<ArticlePresenter.View>()
//
//        val presenter = ArticlePresenterImp(model, view)
//        presenter.start(id)
//
//        verify(model).getArticle(id)
//        verify(view).displayArticle(article)
//        verify(view, never()).displayNotFound()
//        verifyNoMoreInteractions(model, view)
//    }

}