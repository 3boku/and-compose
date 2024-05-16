package com.example.bankingui.data

import androidx.compose.ui.graphics.Brush
import java.sql.Types

data class Card (
    val cardTypes: String,
    val cardNumber: String,
    val cardName: String,
    val balance: Double,
    val color: Brush
)