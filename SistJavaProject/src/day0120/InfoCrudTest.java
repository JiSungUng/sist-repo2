package day0120;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import day0119.DbConnect;

public class InfoCrudTest {
	
	DbConnect db = new DbConnect();
	
	// insert
	public void insertInfo() {
		Scanner sc = new Scanner(System.in);
		
		String name, addr;
		String sql = " ";
		
		System.out.println("이름 입력");
		name = sc.nextLine();
		System.out.println("주소 입력");
		addr = sc.nextLine();
		
		sql="insert into info values (seq_info.nextval,'"+name+"','"+addr+"',sysdate)";
		
		
		//db연결
		Connection conn = null;
		//statement 
		Statement stmt =null;
		
		conn = db.getConnection();
		try {
			//sql문 전송에 필요한 Statement 객체를 createStatement객체를 통해 얻는다. 
			stmt=conn.createStatement();
			
			//sql문 실행
			stmt.execute(sql);// insert이므로 excute,excuteUpdate
			System.out.println("***추가되었습니다.***");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(stmt, conn);
		}
	}
	//select
	public void selectInfo() {
		String sql= "select * from info order by num ";
		
		Connection conn = db.getConnection();
		Statement stmt = null;
		ResultSet rs=null;
		
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			System.out.println("시퀀스\t이름\t주소\t날짜");
			System.out.println("========================");
			while(rs.next()) {
				int seq = rs.getInt("num");
				String name =rs.getString("name");
				String addr= rs.getString("addr");
				Date writeday= rs.getDate("writeday");
			
				System.out.println(seq+"\t"+name+"\t"+addr+"\t"+writeday);

			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, stmt, conn);
		}
		
	}
	public void deleteInfo() {
		//삭제할 번호입력 후 삭제
		Scanner sc = new Scanner(System.in);
		
		String num;
		String sql=" ";
		
		System.out.println("삭제할 번호 입력");
		num =sc.nextLine();
		
		sql="delete from info where num="+num;
		System.out.println(sql);
		
		Connection conn =db.getConnection();
		try {
			Statement stmt = conn.createStatement();
			int a=stmt.executeUpdate(sql); //성공한 레코드수 개수 반환
			
			//없는 번호를 입력하면 0반환
			if(a==0) {
				System.out.println("없는 데이터 번호입니다.");
			}else {
				System.out.println("***삭제되었습니다.***");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(null, conn);
			
		}
		
	}
	public void updateInfo() {
		//수정할 번호를 먼저입력하고, 수정할 이름,주소 입력
		Scanner sc =new Scanner(System.in);
		String name, addr;
		int num;
		String sql="";
		
		System.out.println("수정할 번호입력");
		num=Integer.parseInt(sc.nextLine());

		System.out.println("수정할 이름은?");
		name=sc.nextLine();
		
		System.out.println("수정할 주소는?");
		addr=sc.nextLine();
		
		//update info set name ='홍길동',addr ='서울시 마포구' whrer num=3;
		sql="update info set name ='"+name+"',addr ='"+addr+"' where num="+num;
		System.out.println(sql);
		
		Connection conn=db.getConnection();
		Statement stmt =null;
		try {
			stmt=conn.createStatement();
			
			int a= stmt.executeUpdate(sql);
			
			if(a==0) {
				System.out.println("***수정할 데이터가 존재하지 않습니다.***");
			}else {
				System.out.println("**수정되었습니다.**");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("updaterError: "+e.getMessage());
		}finally {
			db.dbClose(stmt, conn);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InfoCrudTest info = new InfoCrudTest();
		
		Scanner sc=new Scanner(System.in);
		int n;
		
		while(true) {
			System.out.println("**오라클 Info_db 연습예제**");
			System.out.println("1.insert   2.select   3.delete   4.update   9.exit");
			n=Integer.parseInt(sc.nextLine());
			
			if(n==1)
				info.insertInfo();
			else if (n==2) {
				info.selectInfo();
			}else if(n==3) {
				info.deleteInfo();
			}else if (n==4) {
				info.updateInfo();
			}
			else if(n==9) {
				System.out.println("종료하겠습니다.");
				break;
			}
		}
	}

}
