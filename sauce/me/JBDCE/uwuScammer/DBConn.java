package sauce.me.JBDCE.uwuScammer;

import java.sql.*;

public class DBConn {
    
    private static DBConn connObj = null;

    private Connection loliConn;
	private Statement statement;
	
	private DBConn(String address, String user, String pass) throws SQLException{
        DriverManager.setLoginTimeout(2);
        this.loliConn = DriverManager.getConnection("jdbc:mysql://" + address, user, pass);
        this.statement = loliConn.createStatement();
	}
	
	public ResultSet executeQuery(String sql) {
		try {
			return statement.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
    }
    
    public static DBConn getInstance() throws Exception{
        if(connObj == null){
            throw new Exception("Error DBPantsu not found..");
        }
        return connObj;
    }

    public static DBConn getInstance(String address, String user, String password) throws SQLException{
        if(connObj == null){
            connObj = new DBConn(address, user, password);
        }
        return connObj;
    }
}