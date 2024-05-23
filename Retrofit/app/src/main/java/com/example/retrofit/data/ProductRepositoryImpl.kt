package com.example.retrofit.data

import coil.network.HttpException
import com.example.retrofit.data.model.Product
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import okio.IOException

class ProductRepositoryImpl(
    private val api: Api
) : ProductRepository {
    override suspend fun getProductsList(): Flow<Result<List<Product>>> {
        return flow {
            val productsFromApi = try {
                api.getProductsList()
                
            } catch (e: IOException) {
                e.printStackTrace()
                emit(Result.Error(message = "Error loading producuts"))
                return@flow
            } catch (e: HttpException) {
                e.printStackTrace()
                emit(Result.Error(message = "Error loading producuts"))
                return@flow
            } catch (e: Exception) {
                e.printStackTrace()
                emit(Result.Error(message = "Error loading producuts"))
                return@flow
            }
        }
    }
}