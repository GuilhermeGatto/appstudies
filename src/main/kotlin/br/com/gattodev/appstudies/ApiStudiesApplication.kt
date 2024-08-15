package br.com.gattodev.appstudies

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ApiStudiesApplication

fun main(args: Array<String>) {
	runApplication<ApiStudiesApplication>(*args)
}
