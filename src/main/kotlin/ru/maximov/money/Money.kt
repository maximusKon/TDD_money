package ru.maximov.money

abstract class Money(val amount: Int, val currency : String) {

    override fun equals(other: Any?): Boolean {
        val money =  other as Money
        return amount == money.amount && javaClass.equals(money.javaClass)
    }

    abstract fun times(multiplier : Int) : Money

    companion object {

        fun dollar(amount: Int) : Money = Dollar(amount, "USD")

        fun franc(amount: Int) : Money = Franc(amount, "CHF")

    }
}