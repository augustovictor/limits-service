package com.augustovictor.microservices.limitsservice.controller

import com.augustovictor.microservices.limitsservice.configuration.ConfigurationProperties
import com.augustovictor.microservices.limitsservice.model.LimitConfiguration
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/config")
class LimitsConfigurationController(
        val configProperties: ConfigurationProperties
) {

    @GetMapping
    fun getLimits(): LimitConfiguration {
        return LimitConfiguration(configProperties.minimum, configProperties.maximum)
    }
}