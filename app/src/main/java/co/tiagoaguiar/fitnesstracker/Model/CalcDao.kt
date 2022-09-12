package co.tiagoaguiar.fitnesstracker.Model

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface CalcDao {

    @Insert
    fun insert(calc: Calc)

    @Query("SELECT * FROM Calc WHERE type = :type")
    fun getRegisterBtType(type: String) : List<Calc>


}