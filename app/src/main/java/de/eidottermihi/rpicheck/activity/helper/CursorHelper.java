/**
 * Copyright (C) 2015  RasPi Check Contributors
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */
package de.eidottermihi.rpicheck.activity.helper;

import android.database.Cursor;

import de.eidottermihi.rpicheck.db.CommandBean;

public class CursorHelper {

    public static CommandBean readCommand(Cursor c) {
        CommandBean command = new CommandBean();
        command.setId(c.getLong(0));
        command.setName(c.getString(1));
        command.setCommand(c.getString(2));
        command.setShowOutput(c.getInt(3) == 1 ? true : false);
        return command;
    }

}
