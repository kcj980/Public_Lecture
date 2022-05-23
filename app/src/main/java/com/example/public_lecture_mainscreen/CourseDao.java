package com.example.public_lecture_mainscreen;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.RawQuery;
import androidx.room.Update;
import androidx.sqlite.db.SupportSQLiteQuery;

import java.util.List;

@Dao
public interface CourseDao {
    @Insert
    void setInsertCourse(Course course);

    @Update
    void setUpdateUser(Course course);

    @Delete
    void setDeleteUser(Course course);

    @Query("SELECT * FROM Course")
    List<Course> getCouresAll();

    @Query("SELECT * FROM Course WHERE lctreNm LIKE :title")
    List<Course> test_select(String title);

    @Query("DELETE FROM Course")
    void AllDelete_Couresdb();

    @RawQuery
    List<Course> getLct(SupportSQLiteQuery query);
}
