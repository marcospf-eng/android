package com.studies.mark.architecturecomponents.db.dao

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Query
import com.studies.mark.architecturecomponents.repository.model.Product

@Dao
interface ProductDao : BaseDao<Product> {

    @Query("SELECT * FROM product")
    fun getProducts() : LiveData<List<Product>>

}