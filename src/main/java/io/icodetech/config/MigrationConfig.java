package io.icodetech.config;

import org.flywaydb.core.Flyway;

public class MigrationConfig extends Flyway {

    public void repairAndMigrate() {
        this.repair();
        this.migrate();
    }
}
