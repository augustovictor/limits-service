package com.augustovictor.microservices.limitsservice.configuration

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties("limits-service")
class ConfigurationProperties {
    var minimum = 0
    var maximum = 0
}