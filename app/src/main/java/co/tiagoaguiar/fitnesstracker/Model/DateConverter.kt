package co.tiagoaguiar.fitnesstracker.Model

import androidx.room.TypeConverter
import java.util.*

object DateConverter {

    @JvmStatic
    @TypeConverter
    fun toDate(dateLong: Long?) : Date? {
return if (dateLong != null) Date(dateLong) else null
    }

    @JvmStatic
    @TypeConverter
    fun dromDate (date: Date?) : Long? {
        return date?.time
    }
}