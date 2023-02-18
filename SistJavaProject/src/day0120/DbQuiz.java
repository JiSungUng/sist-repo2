package day0120;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import day0119.DbConnect;

public class DbQuiz {

	DbConnect db = new DbConnect();
	Scanner sc = new Scanner(System.in);

	public void insertStudent() {
		String name, hp, dream;
		int age;
		String sql = " ";

		System.out.println("이름 입력");
		name = sc.nextLine();
		System.out.println("번호 입력");
		hp = sc.nextLine();
		System.out.println("꿈 입력");
		dream = sc.nextLine();
		System.out.println("나이 입력");
		age = Integer.parseInt(sc.nextLine());

		sql = "insert into mystudent values(seq_s.nextval,'" + name + "','" + hp + "','" + dream + "'," + age
				+ ",sysdate)";

		Connection conn = null;
		Statement stmt = null;

		conn = db.getConnection();
		try {
			stmt = conn.createStatement();
			stmt.execute(sql);
			System.out.println("추가되었습니다.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(stmt, conn);
		}

	}

	public void selectStudent() {
		String sql = "select * from mystudent order by num";
		Connection conn = db.getConnection();
		Statement stmt = null;
		ResultSet rs = null;

		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			System.out.println("시퀀스\t이름\t번호\t꿈\t나이\t날짜");
			System.out.println("============================================================");

			while (rs.next()) {
				int seq = rs.getInt("num");
				String name =rs.getString("name");
				String hp =rs.getString("hp");
				String dream =rs.getString("dream");
				int age = rs.getInt("age");
				Date sdate= rs.getDate("sdate");

				System.out.println(seq+"\t"+name+"\t"+hp+"\t"+dream+"\t"+age+"\t"+sdate);


			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, stmt, conn);
		}

	}

	public void deleteStudent() {
		String num;
		String sql=" ";
		
		System.out.println("삭제할 번호 입력");
		num=sc.nextLine();
		
		sql="delete from mystudent where num="+num;
		System.out.println(sql);
		
		Connection conn = db.getConnection();
		try {
			Statement stmt = conn.createStatement();
			int a= stmt.executeUpdate(sql);
			
			if( a==0) {
				System.out.println("없는 데이터입니다.");
			}else 
				System.out.println("삭제완료!!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(null, conn);
			
		}
	}

	public void updateStudent() {
		String name, hp ,dream ;
		int age;
		int num;
		String sql="" ;
		
		System.out.println("수정할 시퀀스입력");
		num=Integer.parseInt(sc.nextLine());
		System.out.println("수정할 이름은?");
		name=sc.nextLine();
		System.out.println("수정할 번호는?");
		hp=sc.nextLine();
		System.out.println("수정할 꿈은?");
		dream=sc.nextLine();
		System.out.println("수정할 나이는?");
		age=Integer.parseInt(sc.nextLine());

	
		sql="update mystudent set name= '"+name+"',hp ='"+hp+"',dream ='"+dream+"',age= "+age+" where num="+num;
		System.out.println(sql);
		Connection conn = db.getConnection();
		Statement stmt =null;
		try {
			stmt=conn.createStatement();
			
			int a = stmt.executeUpdate(sql);
			if(a==0) {
				System.out.println("***수정할 데이터가 존재하지 않습니다.***");
			}else {
				System.out.println("**수정되었습니다.**");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(stmt, conn);
			
		}

	
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DbQuiz dq = new DbQuiz();
		Scanner sc = new Scanner(System.in);
		int n;
		while (true) {
			System.out.println("**오라클 Info_db 연습예제**");
			System.out.println("1.insert   2.select   3.delete   4.update   9.exit");
			n = Integer.parseInt(sc.nextLine());

			if (n == 1)
				dq.insertStudent();
			else if (n == 2) {
				dq.selectStudent();
			} else if (n == 3) {
				dq.deleteStudent();
			} else if (n == 4) {
				dq.updateStudent();
			} else if (n == 9) {
				System.out.println("종료하겠습니다.");
				break;
			}
		}
	}

}
