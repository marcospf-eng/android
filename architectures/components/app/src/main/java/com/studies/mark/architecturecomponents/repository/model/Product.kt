package com.studies.mark.architecturecomponents.repository.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "product")
data class Product(var name: String, var quantity: String) {

    @PrimaryKey(autoGenerate = true)
    var id: Long = 0

}