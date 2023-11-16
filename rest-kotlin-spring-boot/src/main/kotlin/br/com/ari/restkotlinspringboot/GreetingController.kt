package br.com.ari.restkotlinspringboot

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class GreetingController {
    val counter: AtomicLong = AtomicLong(0)

    @RequestMapping(value = ["/greeting"], method = [RequestMethod.GET])
    fun greeting(@RequestParam(value = "name", defaultValue = "Kotlin") name: String?): Greeting {
        return Greeting(counter.incrementAndGet(), "Hello ${name}!")
    }


}