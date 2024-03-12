package com.example.cupcakesapp.data


/**
 * Data class represents the current UI state in terms of [Quantity] , [flavor] , [dateoptions], selected pickup [date] and [price]
 * */
data class OrderUiState(

    /** Selected cupcake quantity(1,6,12) */
    val quantity: Int = 0,
    /** flavor of cupcakes in order (Choclate,vanila,red velvet etc.,)*/
    val flavor: String = "",

    val date: String = "",

    val price: String = "",

    val pickupOptions: List<String> = listOf()


)
