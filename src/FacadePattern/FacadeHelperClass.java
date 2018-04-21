package FacadePattern;

import java.sql.Connection;

/**
 * Created by Harshraj on 06-04-2018.
 */
public class FacadeHelperClass {

    public static String mySQLData(DBTYPES DBType,String tableName){
        Connection connection = null;
        switch(DBType){
            case MYSQL:
                connection = MySQLDBClass.getMySQLDBConnection();
                MySQLDBClass.generatePDF(tableName,connection);
                return "Inside the MYSQL";

            case ORACLE:
                connection = OrcaleDBClass.getOracleDBConnection();
                OrcaleDBClass.generatePDF(tableName,connection);
                return "Inside the ORACLE";

            default:
                return "";
        }
    }

    public enum DBTYPES {

        MYSQL,
        ORACLE
    }
}
