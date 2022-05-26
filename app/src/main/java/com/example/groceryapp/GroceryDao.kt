package com.example.groceryapp
//Data Access Object
import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface GroceryDao
{
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(item: GroceryItems)

    @Delete
    suspend fun delete(item: GroceryItems)

    @Query("Select * from grocerry_items")
    fun getAllGroceryItems(): LiveData<List<GroceryItems>>

}