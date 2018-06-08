package com.studies.mark.architecturecomponents.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase

@Database(entities = [], version = 1, exportSchema = false)
abstract class ComponentsDatabase : RoomDatabase()