package org.apache.flyway;

import org.flywaydb.core.Flyway;

public class DbSql{
	 public static void main(String[] args) {
	        // Create the Flyway instance
	        Flyway flyway = new Flyway();
	        // Point it to the database
	        flyway.setDataSource("jdbc:mysql://192.168.0.254:3306/test?useUnicode=true&characterEncoding=utf8", "root", "123456");
	        //flyway.setBaselineOnMigrate(true);
	        //flyway.baselineOnMigrate(true);  
	        // Start the migration
	        flyway.migrate();
	        
	        //flyway.baseline();
	    }
}
