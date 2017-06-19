package ru.maximov.money


/**
 * Created by konstantin on 19.06.17.
 */
class Dollar(private var amount: Int) {

    fun  times(multiplier: Int) : Dollar {
        return Dollar(amount * multiplier)
    }

    override fun equals(other: Any?): Boolean {
        val dollar =  other as Dollar
        return amount == dollar.amount
    }
}