package com.example.groceryapp
//model class / data class
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "grocerry_items")
data class GroceryItems
    (
        @ColumnInfo(name = "itemName")
        var itemName: String,

        @ColumnInfo(name = "itemQuantity")
        var itemQuantity: Int,

        @ColumnInfo(name = "ItemPrice")
        var itemPrice: Int,
    )
{
        @PrimaryKey(autoGenerate = true)
        var id: Int? = null
}