package com.example.groceryapp

class GroceryRepository (private val db: GroceryDatabase){

    suspend fun insert(items: GroceryItems) = db.getGroceryDao().insert(items)
    suspend fun delete(items: GroceryItems) = db.getGroceryDao().insert(items)

    fun getAllItems() = db.getGroceryDao().getAllGroceryItems()
}