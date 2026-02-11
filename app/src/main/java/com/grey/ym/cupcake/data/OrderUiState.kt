package com.grey.ym.cupcake.data

// Data class that represents the current UI state in terms of [quantity], [flavor], [dateOptions], selected pick [date] and [price]
data class OrderUiState(
    // Selected cupcake quantity (1, 6, 12)
    val quantity: Int = 0,
    // Flavor of the cupcakes in the order (such as "Chocolate", "Vanilla", etc...)
    val flavor: String = "",
    // Selected date for pickup (such as "January 1")
    val date: String = "",
    // Total price for the order
    val price: String = "",
    // Available pickup dates for the order
    val pickupOptions: List<String> = listOf()
)