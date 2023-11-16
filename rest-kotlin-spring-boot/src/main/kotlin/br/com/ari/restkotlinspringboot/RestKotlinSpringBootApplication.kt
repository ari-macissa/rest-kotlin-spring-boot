package br.com.ari.restkotlinspringboot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RestKotlinSpringBootApplication

fun main(args: Array<String>) {
    runApplication<RestKotlinSpringBootApplication>(*args)
}