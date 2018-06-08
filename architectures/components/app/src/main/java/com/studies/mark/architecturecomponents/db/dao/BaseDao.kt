package com.studies.mark.architecturecomponents.db.dao

import android.arch.persistence.room.*

@Dao
interface BaseDao<in TData> {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertData(data: TData)

    @Delete
    fun deleteData(data: TData)

    @Update
    fun updateData(data: TData)

}