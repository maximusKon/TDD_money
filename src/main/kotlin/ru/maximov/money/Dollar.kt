package ru.maximov.money


/**
 * Created by konstantin on 19.06.17.
 */
class Dollar(amount : Int) : Money(amount) {

    override fun  times(multiplier: Int) : Money {
        return Dollar(amount * multiplier)
    }

}