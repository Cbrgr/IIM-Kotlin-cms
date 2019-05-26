package burger.constantin.cms

import burger.constantin.cms.model.Article

interface  Model {
    fun getArticleList(): List<Article>

    fun getArticle(id: Int): Article?
}