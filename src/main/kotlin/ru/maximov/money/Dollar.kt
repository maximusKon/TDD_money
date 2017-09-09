package ru.maximov.money


/**
 * Created by konstantin on 19.06.17.
 */
class Dollar(amount : Int, currency: String) : Money(amount,currency) {

    override fun  times(multiplier: Int) : Money {
        return dollar(amount * multiplier)
    }

}