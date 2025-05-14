package br.com.gusta.project1.activity.model

import java.io.Serializable

data class Lession(
    val title: String,
    val duration: String,
    val link: String,
    val picPath: String,
): Serializable
