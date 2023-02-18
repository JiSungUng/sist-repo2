package day0112;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class ExFileWriter_06 {
	
	public static void fileWrite() {
		FileWriter fw=null;
		String fileName ="C:\\sist1226\\file\\test1.txt";
		try {
			fw=new FileWriter(fileName);//파일을 샐로생성(같은이름이 있으면 새로생성)
			
			//파일에 내용추가하기
			fw.write("Have a Nice Day\n");
			fw.write(new Date().toString());
			
			System.out.println("**파일저장성공**");
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
	
	public static void fileWrite2() {
		FileWriter fw=null;
		String fileName ="C:\\sist1226\\file\\test2.txt";
		try {
			fw =new FileWriter(fileName,true);//true로 하면 추가모드.
			fw.write("내 이름은 지성웅!!\n");
			fw.write("-----------------------\n");
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fileWrite();
		fileWrite2();
	}

}
