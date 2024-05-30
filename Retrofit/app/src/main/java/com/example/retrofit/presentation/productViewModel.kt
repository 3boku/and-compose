package com.example.retrofit.presentation

import androidx.lifecycle.ViewModel
import com.example.retrofit.data.ProductRepository
import com.example.retrofit.data.model.Product
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class productViewModel(
    private val productRepository: ProductRepository
): ViewModel() {

    private val _products = MutableStateFlow<List<Product>>(emptyList())
    val products = _products.asStateFlow()
}
