package com.neccodes.navigationcomposeapp.routes

import kotlinx.serialization.Serializable

object Route {

    @Serializable
    object A

    @Serializable
    data class B(
        val myText: String,
        val myNumber: Int
    )

    @Serializable
    object C

}