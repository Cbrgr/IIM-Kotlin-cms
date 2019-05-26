package burger.constantin.cms.control

import burger.constantin.cms.ArticlePresenter
import burger.constantin.cms.Model

class ArticlePresenterImp(val model: Model, val view: ArticlePresenter.View) : ArticlePresenter {

    override fun start(id: Int) {
        val article = model.getArticle(id)
        if (article != null) {
            view.displayArticle(article)
        } else {
            view.displayNotFound()
        }
    }
}