package ru.maximov.money

open class Money(protected var amount: Int) {

    override fun equals(other: Any?): Boolean {
        val money =  other as Money
        return amount == money.amount
    }

}