/*
 * Generated by Robotoworks Mechanoid
 */
package com.robotoworks.example.ghissues.db.migrations;

import android.database.sqlite.SQLiteDatabase;
import com.robotoworks.mechanoid.db.SQLiteMigration;

public class DefaultGithubDBMigrationV2 extends SQLiteMigration {
	@Override
	public void onBeforeUp(SQLiteDatabase db) {}
	
	@Override
	public void up(SQLiteDatabase db) {
		db.execSQL(
			"alter table issues add column created integer "
		);	
	}
	
	@Override
	public void onAfterUp(SQLiteDatabase db) {}
}
