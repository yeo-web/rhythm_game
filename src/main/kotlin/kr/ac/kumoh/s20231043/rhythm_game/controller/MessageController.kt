package kr.ac.kumoh.s20231043.rhythm_game.controller

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/Message")
class MessageController {
    @GetMapping
    @CrossOrigin(origins = ["http://localhost:300"])
    fun getMessage()= mapOf("status" to "success")
}