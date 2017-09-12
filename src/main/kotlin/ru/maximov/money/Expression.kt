package ru.maximov.money

interface Expression {
    fun reduce(bank: Bank, to: String): Money
}