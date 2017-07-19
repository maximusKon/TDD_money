package ru.maximov.money.tests

import org.junit.Assert.*
import org.junit.Test
import ru.maximov.money.Dollar
import ru.maximov.money.Franc

/**
 * Created by konstantin on 19.06.17.
 */
class MoneyTests {

    @Test
    fun testMultiplication () {
        val five = Dollar(5)
        assertEquals(Dollar(10), five.times(2))
        assertEquals(Dollar(15), five.times(3))
    }

    @Test
    fun testEquality () {
        assertTrue(Dollar(5).equals(Dollar(5)))
        assertFalse(Dollar(5).equals(Dollar(6)))
    }

    @Test
    fun testFrancMultiplication() {
        val five = Franc(5)
        assertEquals(Franc(10), five.times(2))
        assertEquals(Franc(15), five.times(3))
    }
}