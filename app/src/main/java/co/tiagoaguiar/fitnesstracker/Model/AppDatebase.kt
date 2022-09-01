package co.tiagoaguiar.fitnesstracker.Model

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(entities = [Calc::class], version = 1)
@TypeConverters(DateConverter::class)
abstract class AppDatebase : RoomDatabase() {

    abstract fun calcDao(): CalcDao

    companion object {

        private var INSTANCE: AppDatebase? = null

        fun getDatabase(context: Context): AppDatebase {
            return if (INSTANCE == null) {
                synchronized(this) {
                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        AppDatebase::class.java,
                        "fitnesss_tracker"
                    ).build()
                }
                INSTANCE as AppDatebase
            } else {
                INSTANCE as AppDatebase
            }
        }

    }

}