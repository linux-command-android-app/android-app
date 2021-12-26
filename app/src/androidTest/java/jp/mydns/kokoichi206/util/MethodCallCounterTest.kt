package jp.mydns.kokoichi206.util

import org.junit.Assert.*

import org.junit.Before
import org.junit.Test

class MethodCallCounterTest {

    private val counterKey = "COUNTER_KEY"

    private lateinit var counter: MethodCallCounter

    @Before
    fun setUp() {
        counter = MethodCallCounter()
    }

    @Test
    fun getCountForNullKey() {
        // Arrange

        // Act
        val count = counter.getCount(counterKey)

        // Assert
        assertEquals(0, count)
    }

    @Test
    fun incrementForNullKey() {
        // Arrange

        // Act
        counter.increment(counterKey)

        // Assert
        val count = counter.getCount(counterKey)
        assertEquals(1, count)
    }

    @Test
    fun incrementForNoneNullKey() {
        // Arrange
        counter.increment(counterKey)
        var count = counter.getCount(counterKey)
        assertEquals(1, count)

        // Act
        counter.increment(counterKey)

        // Assert
        count = counter.getCount(counterKey)
        assertEquals(2, count)
    }
}