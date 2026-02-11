package com.grey.ym.cupcake.data

import com.grey.ym.cupcake.R.string

object DataSource {

    val flavors = listOf(
        string.vanilla,
        string.chocolate,
        string.red_velvet,
        string.salted_caramel,
        string.coffee
    )

    val quantityOptions = listOf(
        Pair(string.one_cupcake, 1),
        Pair(string.six_cupcakes, 6),
        Pair(string.twelve_cupcakes, 12)
    )
}