package br.com.gattodev.appstudies.service

import br.com.gattodev.appstudies.model.Article
import br.com.gattodev.appstudies.repository.ArticleRepository
import org.springframework.stereotype.Service

@Service
class ArticleService(
    private val articleRepository: ArticleRepository
) {
    fun findAll(): List<Article> =
        articleRepository.findAll()
}