package day0119;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QuizSawonGroup {
	
		DbConnect db = new DbConnect();
	public void connectBuseo() {
		
		String sql="select gender, count(*) count, to_char(round(avg(pay),0),'L999,999,999') 평균 ,to_char(max(pay),'L999,999,999') 최고급여 ,to_char(min(pay),'L999,999,999') 최저급여 from sawon group by gender ";

		Connection conn = db.getConnection();
		Statement stmt = null;
		ResultSet rs=null;
		
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			System.out.println("성별\t인원수\t\t평균급여\t\t\t최고급여\t\t\t최저급여");
			System.out.println("======================================================================================");
			while(rs.next()) {
				String gender =rs.getString("gender");
				int count= rs.getInt("count");
				String avg= rs.getString("평균");
				String max= rs.getString("최고급여");
				String min= rs.getString("최저급여");
				
				System.out.println(gender+"\t"+count+"명"+avg+"원"+max+"원"+min+"원");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, stmt, conn);
		}
	}
		
	public static void main(String[] args) {
		//성별	인원수	평균급여	최고급여	최저급여
		//to_char 이용해서 천단위 구분기호 화폐단위
		QuizSawonGroup qs =new QuizSawonGroup();
		qs.connectBuseo();
		
	}

}
