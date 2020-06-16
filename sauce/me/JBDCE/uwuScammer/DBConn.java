package sauce.me.JBDCE.uwuScammer;

import java.sql.*;

public class DBConn {
    
    private static DBConn connObj = null;

    private Connection loliConn;
	private Statement statement;
	
	private DBConn(String address, String user, String pass) {
		try {
			this.loliConn = DriverManager.getConnection("jdbc:mysql://" + address, user, pass);
			this.statement = loliConn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public ResultSet executeQuery(String sql) {
		try {
			return statement.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
    }
    
    public static DBConn getInstance(String address, String user, String password){
        if(connObj == null){
            connObj = new DBConn(address, user, password);
        }
        return connObj;
    }
}