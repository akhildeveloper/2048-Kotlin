package com.akhi.my2048

import java.io.Serializable

/**
 * Created by steve on 13/10/16.
 */
class MyPassingObject : Serializable {

    private val myStrName = "Bob"

    override fun toString(): String {
        return super.toString() + "myStrName = " + myStrName
    }
}
