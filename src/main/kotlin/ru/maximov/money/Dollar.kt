package ru.maximov.money


/**
 * Created by konstantin on 19.06.17.
 */
class Dollar(amount : Int) : Money(amount) {

    fun  times(multiplier: Int) : Dollar {
        return Dollar(amount * multiplier)
    }

}