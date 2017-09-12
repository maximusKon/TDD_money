package ru.maximov.money

interface Expression {
    fun reduce(bank: Bank, to: String): Money
    fun times(multiplier: Int) : Expression
    fun plus(addend: Expression): Expression
}