package com.example.lab_4.data.database
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.lab_4.domain.Chiuit


@Dao
interface ChiuitDao {

    @Query("SELECT * FROM chiuits")
    fun getAll(): List<ChiuitEntity>

    @Insert
    fun insert(chiuit: ChiuitEntity)

    @Delete
    fun delete(chiuit: ChiuitEntity)
}