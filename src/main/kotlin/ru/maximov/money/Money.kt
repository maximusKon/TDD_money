package ru.maximov.money

open class Money(val amount: Int, val currency : String) {

    override fun equals(other: Any?): Boolean {
        val money =  other as Money
        return amount == money.amount && currency == money.currency
    }

    fun  times(multiplier: Int) : Money {
        return Money(amount * multiplier, currency)
    }

    companion object {

        fun dollar(amount: Int) : Money = Money(amount, "USD")

        fun franc(amount: Int) : Money = Money(amount, "CHF")

    }

    override fun toString(): String {
        return "$amount $currency"
    }
}