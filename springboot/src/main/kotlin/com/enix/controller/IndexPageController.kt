package com.enix.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class IndexPageController {

    @GetMapping("/")
    fun index(model: Model): String {
        model.addAttribute("name", "Enix")
        model.addAttribute("randomNumber", (0..100).random())
        return "index"
    }

}