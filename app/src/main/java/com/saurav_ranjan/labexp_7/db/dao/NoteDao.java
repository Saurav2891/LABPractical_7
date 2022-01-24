package com.saurav_ranjan.labexp_7.db.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import com.saurav_ranjan.labexp_7.db.entity.NoteEntity;

/**
 * Created by ravi on 05/02/18.
 */

@Dao
public interface NoteDao {

    @Query("SELECT * FROM notes ORDER BY id DESC")
    LiveData<List<NoteEntity>> getAllNotes();

    @Query("SELECT * FROM notes WHERE id=:id")
    NoteEntity getNoteById(int id);

    @Query("SELECT * FROM notes WHERE id=:id")
    LiveData<NoteEntity> getNote(int id);

    @Insert
    long insert(NoteEntity note);

    @Update
    void update(NoteEntity note);

    @Delete
    void delete(NoteEntity note);

    @Query("DELETE FROM notes")
    void deleteAll();
}