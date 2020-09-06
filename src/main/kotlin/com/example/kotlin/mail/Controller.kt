package com.example.kotlin.mail

import lombok.RequiredArgsConstructor
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
@RequiredArgsConstructor
class Controller(
    val mailService: MailService
) {
    @PostMapping("/mail")
    fun sendMail(@RequestBody mailRequestDto: MailRequestDto) {

    }
}