package day0112;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;

public class QuizSawonFile_05 {

	/*가족수당 = 가족수 *50000
	 * 시간수당 = 시간수 *25000
	 * 총급여 = 기본급 +가족수당 +시간수당
	 * 번호	사원명	기본급	가족수	초과근무시간	가족수당	시간수당	총금여*/
	public static void payRead() {
		String fileName ="C:\\sist1226\\file\\sawon.txt";
		FileReader fr =null;
		BufferedReader br =null;
		int cnt=1;
		NumberFormat nf =NumberFormat.getCurrencyInstance();
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			System.out.println("번호\t사원명\t기본급\t가족수\t초과근무시간\t가족수당\t시간수당\t총급여");
			System.out.println("==========================================================================");
			while(true) {
				String s = br.readLine();
				if(s ==null) {
					break;
				}
				String data[] = s.split(",");
				System.out.println(cnt+"번\t"+data[0]+"\t"+data[1]+"원\t"+
				data[2]+"명\t"+data[3]+"시간\t"+(Integer.parseInt(data[2])*50000)+"원\t"+
				(Integer.parseInt(data[3])*25000)+"원\t"+
				(nf.format((Integer.parseInt(data[1])+(Integer.parseInt(data[2])*50000)+(Integer.parseInt(data[3])*25000)))));
				cnt ++;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e) {
			
		}finally {
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
		payRead();
	}

}
