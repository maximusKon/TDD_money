package ru.maximov.money

interface Expression {
    fun reduce(to: String) : Money
}