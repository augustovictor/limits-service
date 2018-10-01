package com.augustovictor.microservices.limitsservice.model

data class LimitConfiguration(
        val min: Int = 0,
        val max: Int = 0
)