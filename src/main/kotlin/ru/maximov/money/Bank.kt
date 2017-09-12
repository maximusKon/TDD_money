package ru.maximov.money

class Bank {

    fun reduce(source : Expression, to : String) : Money = source.reduce(to)

}