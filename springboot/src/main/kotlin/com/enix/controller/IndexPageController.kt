package com.enix.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@Controller
class IndexPageController {

    private val beanCreateTime = LocalDateTime.now()

    private val datatimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")

    /**
     * index.html page
     * @param model
     * @return HTML file path
     */
    @GetMapping("/")
    fun index(model: Model): String {
        model.addAttribute("name", "Enix")
        model.addAttribute("beanCreateTime", datatimeFormatter.format(beanCreateTime))
        model.addAttribute("randomNumber", (0..100).random())
        return "index"
    }

}