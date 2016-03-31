package com.github.ivbaranov.leftpad

import kotlin.test.assertEquals
import org.junit.Test
import java.util.logging.Logger

class TestSource {
    @Test fun default() {
        assertEquals("  foo", "foo".leftPad(5))
    }

    @Test fun matchLength() {
        assertEquals("foobar", "foobar".leftPad(6))
    }

    @Test fun withChar() {
        assertEquals("01", "1".leftPad(2, "0"))
    }
}
