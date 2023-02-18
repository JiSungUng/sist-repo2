//package day0125;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.Scanner;
//
//import day0119.DbConnect;
//
//public class ScoreDb_02 {
//
//	DbConnect db=new DbConnect();
//	Scanner sc = new Scanner(System.in);
//	
//	//insert
//	public void insertScore() {
//		Connection conn =db.getConnection();
//		PreparedStatement pstmt = null;
//		System.out.println("학생명");
//		String name =sc.nextLine();
//		System.out.println("자바점수");
//		int java =Integer.parseInt(sc.nextLine());
//		System.out.println("오라클점수");
//		int oracle =Integer.parseInt(sc.nextLine());
//		
//		String sql="insert into score (num,name,java,oracle) values(seq_score.nextval,?,?,?)";
//		
//		try {
//			pstmt=conn.prepareStatement(sql);
//			
//			pstmt.setString(1, name);
//			pstmt.setInt(2, java);
//			pstmt.setInt(3,oracle);
//			
//			//실행
//			pstmt.execute();
//			System.out.println("추가되었습니다.");
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//			db.dbClose(pstmt, conn);
//		}
//		
//	}
//	//총점, 평균 다시계산
//	public void calcTotAvg() {
//		Connection conn =db.getConnection();
//		PreparedStatement pstmt=null;
//		
//		String sql="update score set total = java+oracle, average =(java+oracle)/2";
//		try {
//			pstmt = conn.prepareStatement(sql);
//			pstmt.execute()
//		}
//	}
//	public void selectAllScore() {
//		this.calcTotAvg();
//		Connection conn=db.getConnection();
//		PreparedStatement pstmt =null;
//		ResultSet rs =null;
//		
//		String sql ="select *from score order by num";
//		
//		System.out.println("***학생성적 출력***");
//		System.out.println();
//		System.out.println("번호\t학생명\t자바점수\t오라클점수\t총점\t평균");
//		System.out.println("-----------------------------------------------------------------------");
//		
//		try {
//			pstmt=conn.prepareStatement(sql);
//			rs=pstmt.executeQuery();
//			
//			while(rs.next()) {
//				System.out.println(rs.getInt(num)
//						);
//			}
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	public void deleteScore() {
//		
//	}
//	public void updateScore() {
//		
//	}
//	
//	
//	
//	
//	
//	
//	
//	//실행
//	public void process() {
//		while(true) {
//			System.out.println("1.학생성적추가 2.학생정보삭제   3.학생성적수정 4.학생전체출력   9.종료");
//			System.out.println("------------------------------------------------------------");
//			int num=Integer.parseInt(sc.nextLine());
//			
//			if(num==1)
//				this.insertScore();
//			else if (num ==4)
//				this.selectAllScore();
//			else if(num==9) {
//				System.out.println("프로그램 종료");
//				break;
//			}
//		}
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		ScoreDb_02 score=new ScoreDb_02();
//		score.process();
//		
//	}
//
//}
