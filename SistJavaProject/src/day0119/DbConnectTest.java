package day0119;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnectTest {

	static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";

	public static void connectSawon() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		String sql =" select * from sawon order by num ";
		
		try {
			conn =DriverManager.getConnection(URL, "dragon", "a1234");
			
			System.out.println("클라우드의 오라클 서버에 연결성공!!!!");
			
			stmt =conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			//여러줄을 가져와야 할경우 while문을 사용
			//rs.next(): 다음데이터로 이동하면서 true 반환, 더이상데이터가 없으면 false 반환
			while(rs.next()) {
				//db로부터 데이터 가져오기
				int num=rs.getInt("num");
				String name=rs.getString("name");
				String gender=rs.getString("gender");
				String buseo=rs.getString("buseo");
				int pay=rs.getInt("pay");
				
				System.out.println(num+"\t"+name+"\t"+gender+"\t"+buseo+"\t"+pay);
			}
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("서버연결 실패"+e.getMessage());
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DbConnectTest.connectSawon();
		
	}

}
