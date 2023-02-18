package day0111;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*BufferReader: 버퍼를 사용해서 파일 읽기
 * Filereader: 경로에 있는 파일로드*/


public class FileReader_15 {
	
	public static void read() {
		
		//경로 표시할땐 \일경우에는 \\표시 , / 는 /표시
		String fileName="C:\\sist1226\\file\\memo1.txt";
		BufferedReader br =null;
		FileReader fr =null;
		
		//읽기위해서 파일열기
		try {
			fr = new FileReader(fileName);
			System.out.println("파일을 열었습니다.!!");
			br = new BufferedReader(fr);
			
			//여러줄을 읽어야 하므로 while 문으로 읽는다
			while(true) {
				String s = br.readLine();
				
				//마지막 줄일 경우 null 값을 읽는다. null일경우 while문 빠져나가기
				if (s ==null)
					break;
				System.out.println(s);
			}
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			
		}finally {
			try { //닫을땐 역순으로 닫기
				br.close();
				fr.close();
				
				System.out.println("파일에 대한 자원들을 모두 닫았음!!!!");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		read();
		System.out.println("**정상종료**");
	}

}
