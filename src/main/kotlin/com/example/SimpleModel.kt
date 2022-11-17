package com.example

import io.micronaut.serde.annotation.Serdeable
import io.micronaut.serde.config.naming.SnakeCaseStrategy

@Serdeable(naming = SnakeCaseStrategy::class)
data class SimpleModel(
    val testDebug: String
)