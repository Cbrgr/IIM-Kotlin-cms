package burger.constantin.cms.control

import burger.constantin.cms.ArticleListPresenter
import burger.constantin.cms.Model

class ArticleListPresenterImp(val model: Model, val view: ArticleListPresenter.View) : ArticleListPresenter {

    override fun start() {
        val list = model.getArticleList()
        view.displayArticleList(list)
    }
}