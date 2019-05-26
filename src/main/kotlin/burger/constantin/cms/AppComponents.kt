package burger.constantin.cms

import burger.constantin.cms.control.ArticleListPresenterImp
import burger.constantin.cms.control.ArticlePresenterImp

class AppComponents (val mysqlUrl: String, val mysqlUser: String, val mysqlPassword: String) {

    private val pool = ConnectionPool(mysqlUrl, mysqlUser, mysqlPassword)

    fun getPool() : ConnectionPool {
        return pool
    }

    private val model = MysqlModel(getPool())

    fun getModel(): Model {
        return model
    }

    fun getArticleListPresenter(view: ArticleListPresenter.View): ArticleListPresenter {
        return ArticleListPresenterImp(getModel(), view)
    }

    fun getArticlePresenter(view: ArticlePresenter.View): ArticlePresenter {
        return ArticlePresenterImp(getModel(), view)
    }


}