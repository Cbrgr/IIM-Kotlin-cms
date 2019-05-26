package burger.constantin.cms

import burger.constantin.cms.model.Article

interface ArticleListPresenter {

    fun start()

    interface View {
        fun displayArticleList(list: List<Article>)
    }

}