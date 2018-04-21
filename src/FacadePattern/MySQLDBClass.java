package FacadePattern;

import java.sql.Connection;

/**
 * Created by Harshraj on 06-04-2018.
 */
public class MySQLDBClass {

    public static Connection getMySQLDBConnection(){
        return null;
    }

    public static void generatePDF(String tableName,Connection con){
        //generating PDF reports
    }
}

