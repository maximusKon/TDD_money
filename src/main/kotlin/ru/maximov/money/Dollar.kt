package ru.maximov.money


/**
 * Created by konstantin on 19.06.17.
 */
class Dollar(var amount: Int) {

    fun  times(multiplier: Int) {
        amount *= multiplier
    }

}