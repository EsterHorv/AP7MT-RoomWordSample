package com.utb.fai.roomworsample.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "word_table") /* vytvoření entity*/
data class Word(@PrimaryKey @ColumnInfo(name = "word") val word: String)