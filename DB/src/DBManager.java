import java.sql.*;

public class DBManager {
	
	private Connection conn;
	private static final String id = "root";
	private static final String pwd = "47TYdndryj";
	private static final String dburl = "jdbc:mysql://localhost/connectdb";
	
	public DBManager() {
		
		try {
			
			System.out.println("������");
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(dburl,id,pwd);
			System.out.println("����̹� �ε� ����");
			
		} catch (Exception e) {
			
			System.out.println("����̹� �ε� ����");
			
			try {
				
				conn.close();
				
			} catch (SQLException e1) {}
		}
	}

	
	
}
