package ru.maximov.money

abstract class Money(protected var amount: Int) {

    override fun equals(other: Any?): Boolean {
        val money =  other as Money
        return amount == money.amount && javaClass.equals(money.javaClass)
    }

    abstract fun times(multiplier : Int) : Money

    companion object {

        fun dollar(amount: Int) : Money = Dollar(amount)

        fun franc(amount: Int) : Money = Franc(amount)

    }
}