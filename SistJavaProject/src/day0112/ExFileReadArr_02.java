package day0112;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class ExFileReadArr_02 {
	public static void fileRead() {
		String fileName ="C:\\sist1226\\file\\Info1.txt";
		FileReader fr =null;
		BufferedReader br = null;
		
		try {
			fr=new FileReader(fileName);
			br=new BufferedReader(fr);
			
			System.out.println("**파일 읽기 학생정보**");
			System.out.println("이름\t학교\t학년");
			System.out.println("-----------------------------");
			
			while(true) {
				String s=br.readLine();
				
				if(s ==null)
					break;
			
//				//split으로 부리하기
//				String [] data =s.split(",");
//				//배열 개수만큼 반복해서 출력
//				System.out.println(data[0]+"\t"+data[1]+"\t"+data[2]);
			//split 대신 StringTokkenizer를 이용해서 분리
				StringTokenizer st = new StringTokenizer(s, ",");
				System.out.println(st.nextToken()+"\t"+st.nextToken()+"\t"
						+st.nextToken()+" ");
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			
		}finally{
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fileRead();
	}

}
