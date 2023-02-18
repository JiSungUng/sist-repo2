package day0112;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Scanner;

//카페에 파일입출력 과제물 _캡쳐 여러장(코드 X)
public class QuizFileEnd {
	//파일에 저장  sangpum.txt
	//상품명과 수량 단가를 입력받아서 아이폰14,2,14000000 이런식으로 저장
	//키보드 입력받아서 저장할것
	static final String FILENAME ="C:\\sist1226\\file\\sangpum.txt";
	FileReader fr;
	BufferedReader br;
	FileWriter fw;
	Scanner sc = new Scanner(System.in);
	
	public int Menu() {
		int num =0;
		System.out.println("1.상품추가 2.전체상품출력 3. 파일삭제 9.종료");
		num = Integer.parseInt(sc.nextLine());
		return num;
	}
	public void snagPumIn() {
		System.out.println("상품명을 입력하세요:");
		String name =sc.nextLine();
		System.out.println("상품 수량을 입력하세요");
		int su=Integer.parseInt(sc.nextLine());
		System.out.println("단가를 입력하세요");
		int dan=Integer.parseInt(sc.nextLine());
		
		
		try {
			fw=new FileWriter(FILENAME,true);
			
			fw.write(name+",");
			fw.write(su+",");
			fw.write(dan+",");
			fw.write("\n");
			System.out.println("상품이 등록되었습니다.");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	

	
	//출력
	//번호 상품명 수량 단가 총금액
	public void sangPumOut() {
		System.out.println("\t**상품 정보**");
		System.out.println("번호\t상품명\t수량\t단가\t총금액");
		System.out.println("==================================================");
		NumberFormat nf =NumberFormat.getCurrencyInstance();
		try {
			fr=new FileReader(FILENAME);
			br= new BufferedReader(fr);
			
			int num =0;
			int n=0;
			while(true) {
				String s=br.readLine();
				if(s ==null)
					break;
				
				String data [] = s.split(",");
				System.out.println(++n+"번\t"+data[0]+"\t"+Integer.parseInt(data[1])
				+"개"+(nf.format(Integer.parseInt(data[2]))+"\t"+(nf.format(Integer.parseInt(data[1])*Integer.parseInt(data[2])))));
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e) {
			
		}finally {
			try {
				if(br!=null)
					br.close();
				if(fr!=null)
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
public void sangPumDel() {
		File file = new File("C:\\sist1226\\file\\sangpum.txt");
		boolean result =file.delete();
		if(result) {
			System.out.println("삭제되었습니다.");
		}else {
			System.out.println("삭제 실패!");
		}
	}
//if (file.exists())
//		file delete();  ->파일이 존재한다면 삭제한다.	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuizFileEnd end = new QuizFileEnd();
		
		while(true) {
			int num =end.Menu();
		//1.상품추가  2.전체상품출력 .3. 파일삭제  9.종료
		switch(num) {
		case 1:
			System.out.println("상품추가");
			end.snagPumIn();
			break;
		case 2:
			System.out.println("**전체상품출력**");
			end.sangPumOut();
			break;
		case 3:
			System.out.println("파일을 삭제합니다.");
			end.sangPumDel();
			break;
		case 9:
			System.out.println("프로그램을 종료합니다..");
			System.exit(0);
		default :
		System.out.println("번호를 다시한번 확인 후 입력해주세요");
		
		}
	}
	}

}
