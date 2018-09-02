package io.icodetech.config;

import org.flywaydb.core.Flyway;

import javax.sql.DataSource;

public class MigrationConfig extends Flyway {

    private MigrationConfig(DataSource dataSource) {
        this.setDataSource(dataSource);
    }

    public static MigrationConfig of(DataSource dataSource) {
        return new MigrationConfig(dataSource);
    }

    public void repairAndMigrate() {
        this.setBaselineOnMigrate(true);
        this.setLocations("classpath:db/migration");
        this.repair();
        this.migrate();
    }
}
