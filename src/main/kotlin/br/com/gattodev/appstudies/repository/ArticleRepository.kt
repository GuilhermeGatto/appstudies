package br.com.gattodev.appstudies.repository

import br.com.gattodev.appstudies.model.Article
import org.springframework.stereotype.Repository
import java.util.*

@Repository
class ArticleRepository {

    private val articles = listOf<Article>(
        Article(id = UUID.randomUUID(), title = "", content = ""),
        Article(id = UUID.randomUUID(), title = "", content = ""),
        Article(id = UUID.randomUUID(), title = "", content = "")
    )

    fun findAll(): List<Article> = articles

}
