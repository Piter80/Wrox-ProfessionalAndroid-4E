/*
 * Professional Android, 4th Edition
 * Reto Meier and Ian Lake
 * Copyright 2018 John Wiley Wiley & Sons, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.professionalandroid.apps.earthquake;

import android.arch.persistence.room.Room;
import android.content.Context;

public class EarthquakeDatabaseAccessor {

  private static EarthquakeDatabase EarthquakeDatabaseInstance;
  private static final String EARTHQUAKE_DB_NAME = "earthquake_db";

  private EarthquakeDatabaseAccessor() {}

  public static EarthquakeDatabase getInstance(Context context) {
    if (EarthquakeDatabaseInstance == null) {
      // Create or open a new SQLite database, and return it as
      // a Room Database instance.
      EarthquakeDatabaseInstance = Room.databaseBuilder(context,
        EarthquakeDatabase.class, EARTHQUAKE_DB_NAME).build();
    }

    return EarthquakeDatabaseInstance;
  }
}