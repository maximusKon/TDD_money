package ru.maximov.money

class Money(val amount: Int, val currency : String) : Expression {
    override fun reduce(bank: Bank, to: String): Money  {
        val rate = bank.rate(currency, to)
        return Money(amount / rate, to)
    }


    override fun equals(other: Any?): Boolean {
        val money =  other as Money
        return amount == money.amount && currency == money.currency
    }

    fun  times(multiplier: Int) : Money = Money(amount * multiplier, currency)

    fun plus(addend: Money): Expression = Sum(this, addend)

    companion object {

        fun dollar(amount: Int) : Money = Money(amount, "USD")

        fun franc(amount: Int) : Money = Money(amount, "CHF")

    }

    override fun toString(): String = "$amount $currency"
}