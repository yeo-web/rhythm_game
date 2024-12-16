package kr.ac.kumoh.s20231043.rhythm_game.controller

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@CrossOrigin(origins = ["https://yeofrontend.netlify.app"])
class MessageController {

    @GetMapping
    fun getRoot() = mapOf("status" to "success")

    @GetMapping("/api/message")
    fun getMessage()= mapOf("status" to "success")
}