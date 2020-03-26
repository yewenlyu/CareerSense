package db;

public class MySQLDBUtil {
	private static final String INSTANCE = "careersense-db-instance.clsneuju03ko.us-east-2.rds.amazonaws.com";
	private static final String PORT_NUM = "3306";
	public static final String DB_NAME = "careersense_db";
	private static final String USERNAME = "admin";
	private static final String PASSWORD = "RgiCwzU32yAgG6u";
	public static final String URL = "jdbc:mysql://" + INSTANCE + ":" + PORT_NUM + "/" + DB_NAME + "?user=" + USERNAME
			+ "&password=" + PASSWORD + "&autoReconnect=true&serverTimezone=UTC";
}
