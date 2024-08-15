package br.com.gattodev.appstudies.model

import java.util.UUID

data class Article(
    val id: UUID,
    val title: String,
    val content: String
)
