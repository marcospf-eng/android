package com.studies.mark.architecturecomponents

import android.arch.persistence.room.Room
import android.content.Context
import com.studies.mark.architecturecomponents.db.ComponentsDatabase

object AppDatabase {

    private var componentsDatabase: ComponentsDatabase? = null

    fun provideDatabase(context: Context) : ComponentsDatabase {

        if (componentsDatabase == null) {
            componentsDatabase = Room.databaseBuilder(
                    context.applicationContext,
                    ComponentsDatabase::class.java,
                    "components-database"
            ).fallbackToDestructiveMigration().build()
        }

        return componentsDatabase!!
    }
}