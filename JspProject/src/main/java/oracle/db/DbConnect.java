package oracle.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnect {
	static final String ORACLEDRIVER = "oracle.jdbc.OracleDriver";
	static final String ORACLE_URL = "jdbc:oracle:thin:@localhost:1521:XE";

	public DbConnect() {
		try {
			Class.forName(ORACLEDRIVER);
		} catch (ClassNotFoundException e) {
			System.out.println("오라클드라이버 실패 : " + e.getMessage());
		}
	}

	public Connection getConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(ORACLE_URL, "Ung", "a1234");
		} catch (SQLException e) {
			System.out.println("오라클 연결 실패:" + e.getMessage());
		}
		return conn;
	}

	// close가4개 오버로딩 메서드 만들자! conn stmt(preparestatement) resultset
	public void dbClose(ResultSet rs, Statement stmt, Connection conn) {
		try {
			if (rs != null)
				rs.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void dbClose(ResultSet rs, PreparedStatement stmt, Connection conn) {
		try {
			if (rs != null)
				rs.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void dbClose(Statement stmt, Connection conn) {
		try {
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void dbClose(PreparedStatement stmt, Connection conn) {
		try {
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
