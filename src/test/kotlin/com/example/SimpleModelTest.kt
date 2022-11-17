package com.example

import io.micronaut.serde.ObjectMapper
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

@MicronautTest
class SimpleModelTest{

    @Test
    fun testSerializeDeserialize(objectMapper: ObjectMapper) {
        val simple = SimpleModel("test")

        val theString = objectMapper.writeValueAsString(simple)
        val expectedString = """
            {"test_debug":"test"}
        """.trimIndent()


        val simple2 = objectMapper.readValue(expectedString, SimpleModel::class.java)

        assertEquals(expectedString,theString)
        assertEquals(simple.testDebug, simple2.testDebug)
    }
}