package com.cloudhub.pull

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PullTestApplication

fun main(args: Array<String>) {
    runApplication<PullTestApplication>(*args)
}
