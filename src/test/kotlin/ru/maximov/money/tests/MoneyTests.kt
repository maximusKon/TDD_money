package ru.maximov.money.tests

import org.junit.Assert.*
import org.junit.Test
import ru.maximov.money.Bank
import ru.maximov.money.Expression
import ru.maximov.money.Money

/**
 * Created by konstantin on 19.06.17.
 */
class MoneyTests {

    @Test
    fun testMultiplication () {
        val five = Money.dollar(5)
        assertEquals(Money.dollar(10), five.times(2))
        assertEquals(Money.dollar(15), five.times(3))
    }

    @Test
    fun testEquality () {
        assertTrue(Money.dollar(5) == Money.dollar(5))
        assertFalse(Money.dollar(5) == Money.dollar(6))
        assertFalse(Money.franc(5) == Money.dollar(5))
    }

    @Test
    fun testFrancMultiplication() {
        val five = Money.franc(5)
        assertEquals(Money.franc(10), five.times(2))
        assertEquals(Money.franc(15), five.times(3))
    }

    @Test
    fun testCurrency(){
        assertEquals("USD", Money.dollar(1).currency)
        assertEquals("CHF", Money.franc(1).currency)

    }

    @Test
    fun testSimpleAddition(){
        val five = Money.dollar(5)
        val sum = five.plus(five)
        val bank = Bank()
        val reduced = bank.reduce(sum, "USD")
        assertEquals(Money.dollar(10), reduced)
    }
}

