package co.i014114.www.mysqlite.Utilitis;

/**
 * Created by root on 19/10/17.
 */

public class Utilities {

    public final static String TABLE_NAME="users";
    public final static String TABLE_FIELD_ID="id";
    public final static String TABLE_FIELD_NAME="name";
    public final static String TABLE_FIELD_LAST_NAME="lastName";
    public final static String TABLE_FIELD_PHONE="phone";

    public final static String CREATE_TABLE = "CREATE TABLE "+TABLE_NAME+
            "("+TABLE_FIELD_ID+" INTEGER,"+TABLE_FIELD_NAME+" TEXT,"+TABLE_FIELD_LAST_NAME+" TEXT,"+TABLE_FIELD_PHONE+" INTEGER)";

}
