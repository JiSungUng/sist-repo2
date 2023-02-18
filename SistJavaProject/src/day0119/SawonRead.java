package day0119;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SawonRead {

	DbConnect db= new DbConnect();
	
	public void listSawon() {
		String sql="select buseo,count(*) count,round(avg(pay),0) pay from sawon group by buseo ";
		
		Connection conn = db.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			System.out.println("부서명\t인원수\t평균급여");
			System.out.println("=============================");
			
			while(rs.next()) {
				String buseo =rs.getString("buseo");
				int count = rs.getInt("count");
				int pay = rs.getInt("pay");
				
				System.out.println(buseo+"\t"+count+"명\t"+pay+"원");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, stmt, conn);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SawonRead sr = new SawonRead();
		sr.listSawon();
	}

}
