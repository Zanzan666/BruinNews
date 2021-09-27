package com.zanzan.bruinnews.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.zanzan.bruinnews.model.Article;

@Database(entities = {Article.class}, version = 1, exportSchema = false)
public abstract class BruinNewsDatabase extends RoomDatabase {
    public abstract ArticleDao articleDao();


}
