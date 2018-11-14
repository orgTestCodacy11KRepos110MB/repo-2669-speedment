package com.speedment.runtime.connector.sqlite.internal;

import com.speedment.runtime.config.Dbms;
import com.speedment.runtime.core.db.ConnectionUrlGenerator;

/**
 * @author Emil Forslund
 * @since  3.1.9
 */
public final class SqliteConnectionUrlGenerator implements ConnectionUrlGenerator {

    @Override
    public String from(Dbms dbms) {
        return "jdbc:sqlite::memory:"; // TODO: Add custom config property to read from a file.
    }
}