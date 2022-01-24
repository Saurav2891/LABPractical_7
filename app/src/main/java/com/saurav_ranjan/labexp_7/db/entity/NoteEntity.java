package com.saurav_ranjan.labexp_7.db.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.annotation.NonNull;

import java.util.Date;

/**
 * Created by ravi on 05/02/18.
 */

@Entity(tableName = "notes")
public class NoteEntity {
    @PrimaryKey(autoGenerate = true)
    int id;

    @ColumnInfo(name = "note")
    String note;

    @ColumnInfo(name = "timestamp")
    Date timestamp;

    public NoteEntity(@NonNull String note) {
        this.note = note;

        this.timestamp = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
