package day0119;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnectTest2 {

	static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";

	public static void connectFood() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		String sql =" select f.fno  , name , food , price ,shop ,loc  ,addr  from food2 f, jumun3 j where f.fno = j.fno";
		
		try {
			conn =DriverManager.getConnection(URL, "dragon", "a1234");
			
			System.out.println("클라우드의 오라클 서버에 연결성공!!!!");
			
			stmt =conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			System.out.println("\t\t****주문 고객 리스트****");
			System.out.println("주문번호\t고객명\t음식명\t가격\t가게이름\t가게위치\t주문위치");
			System.out.println("===========================================================");
			//여러줄을 가져와야 할경우 while문을 사용
			//rs.next(): 다음데이터로 이동하면서 true 반환, 더이상데이터가 없으면 false 반환
			while(rs.next()) {
				//db로부터 데이터 가져오기
				int seq=rs.getInt("fno");
				String name=rs.getString("name");
				String food=rs.getString("food");
				int price=rs.getInt("price");
				String shop=rs.getString("shop");
				String loc=rs.getString("loc");
				String addr=rs.getString("addr");
				
				System.out.println(seq+"\t"+name+"\t"+food+"\t"+price
						+"\t"+shop+"\t"+loc+"\t"+addr);
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
		DbConnectTest2.connectFood();
		
	}

}
