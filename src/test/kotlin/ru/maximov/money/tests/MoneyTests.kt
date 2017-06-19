package ru.maximov.money.tests

import org.junit.Assert.assertEquals
import org.junit.Test
import ru.maximov.money.Dollar

/**
 * Created by konstantin on 19.06.17.
 */
class MoneyTests {

    @Test
    fun testMultiplication () {
        var five = Dollar(5)
        five.times(2)
        assertEquals(10, five.amount)
    }
}
