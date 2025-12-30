package com.hussain.testingproject.productmodel

import androidx.annotation.DrawableRes

/**
 * Simple UI model representing a product item that can be displayed and animated
 * across the list and detail screens.
 */
data class Product(
    val id: String,
    val title: String,
    val subtitle: String,
    @DrawableRes val imageRes: Int,
)