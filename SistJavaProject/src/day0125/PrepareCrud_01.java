package day0125;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import day0119.DbConnect;

public class PrepareCrud_01 {

	DbConnect db =new DbConnect();
	Scanner sc = new Scanner(System.in);
	
	//insert
	public void insertSangpum() {
		Connection conn =db.getConnection();
		PreparedStatement pstmt =null;
		
		
		System.out.println("입고된 상품명은?");
		String sang = sc.nextLine();
		System.out.println("입고된 수량은?");
		int su = Integer.parseInt(sc.nextLine());
		System.out.println("단가는?");
		int dan=Integer.parseInt(sc.nextLine());
		
		//sql
		//PreparedStatement 객체는 미완의 sql 문을 작성할 수 있다.
		//변수는 ?로 표시 후 바인딩 시켜준다.
		String sql ="insert into sales values(seq1.nextval,?,?,?,sysdate)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			//?를 순서대로 바인딩 후 업데이트
			pstmt.setString(1, sang);
			pstmt.setInt(2, su);
			pstmt.setInt(3, dan);
			
			int n=pstmt.executeUpdate();
			if(n==1)
				System.out.println("insert 성공!");
			else
				System.out.println("insert 실패!");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
		
				}
	//select
	public void selectSangpums()
	{
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		String sql="select * from sales order by num asc";
		
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			System.out.println("시퀀스\t상품명\t수량\t단가\t입고일");
			System.out.println("-------------------------------------------------------");
			while(rs.next())
			{
				System.out.println(rs.getInt("num")+"\t"
						+rs.getString("sangpum")+"\t"
						+rs.getInt("su")+"\t"
						+rs.getInt("dan")+"\t"
						+rs.getDate("ipgoday"));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, pstmt, conn);
		}
		
	}

	public void deleteSangPum() {
		Connection conn =db.getConnection();
		PreparedStatement pstmt =null;
		
		System.out.println("삭제할 번호는?");
		int num = Integer.parseInt(sc.nextLine());
		
		String sql="delete from sales where num=?";
		
		try {
			pstmt =conn.prepareStatement(sql);
			pstmt.setInt(1,num);
			
			int n=pstmt.executeUpdate();
			
			if(n==1) {
				System.out.println("삭제성공");
			}else {
					System.out.println("삭제실패");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
		
		
		
	}
	
	
	
	//num을 인자로 받아서 데이터가 있으면 true, 없으면 false값 반환하는 메서드
	
	public boolean getData(String num) {
		boolean b =false;
		
		Connection conn =db.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs =null;
		
		String sql="select *from sales where num=?";
		
		try {
			pstmt =conn.prepareStatement(sql);
			pstmt.setString(1, num);
			rs=pstmt.executeQuery();
		
			//1개일 경우는 if
			if(rs.next())
				b=true;
			else
				b=false;
			
			
			
			
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, pstmt, conn);
		}
		
		return b;
	}
	
	//update.. 시퀀스 입력 후 수정할데이터 수정
	
	public void updateSangpum() {
		Connection conn =db.getConnection();
		PreparedStatement pstmt =null;
		
		System.out.println("수정할 시퀀스번호?");
		String num =sc.nextLine();
		
		//여기에서 getData를 호출해서 그 번호가 존재하는지 확인
		if(!this.getData(num)) {
			System.out.println("해당번호는 존재하지않습니다.");
			return ;//메서드종료
		}
		System.out.println("수정할 상품명은?");
		String sang = sc.nextLine();
		System.out.println("수정할 수량은?");
		int su =Integer.parseInt(sc.nextLine());
		System.out.println("수정할 단가는?");
		int dan =Integer.parseInt(sc.nextLine());
		
		String sql="update sales set sangpum =?,su=?,dan=? where num=?";
		
		try {
			pstmt =conn.prepareStatement(sql);
			
			//4개 순서대로 바인딩
			pstmt.setString(1, sang);
			pstmt.setInt(2, su);
			pstmt.setInt(3, dan);
			pstmt.setString(4, num);
			
			pstmt.execute();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
		
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrepareCrud_01 pre = new PrepareCrud_01();
		Scanner sc = new Scanner(System.in);
		int n;
		
		while(true) {
			System.out.println("***상품입고***");
			System.out.println("1.상품추가   2.상품삭제   3.상품수정   4.전체출력   9.종료");
			n=Integer.parseInt(sc.nextLine());
			
			if(n==1)
				pre.insertSangpum();
			else if(n==4) {
				pre.selectSangpums();
			}else if (n==2) {
				pre.deleteSangPum();
			}else if(n==3) {
				pre.updateSangpum();
			}
			else if(n==9) {
				System.out.println("프로그램종료");
				break;
			}
		}
	}

}
