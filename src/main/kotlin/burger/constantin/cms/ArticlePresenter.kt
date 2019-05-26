package burger.constantin.cms

import burger.constantin.cms.model.Article

interface ArticlePresenter {

    fun start(id: Int)

    interface View {
        fun displayArticle(article: Article?)
        fun displayNotFound()
    }
}