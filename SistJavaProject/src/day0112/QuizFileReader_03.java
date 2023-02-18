package day0112;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class QuizFileReader_03 {
	// 번호 상품명 수량 단가 총금액 (split_)
	public static void fileReader() {

		String fileName = "C:\\sist1226\\file\\CoffeShop.txt";
		FileReader fr = null;
		BufferedReader br = null;
		int cnt = 1;
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);

			System.out.println("번호\t상품명\t수량\t단가\t총금액");
			System.out.println("======================================");
			while (true) {
				String s = br.readLine();

				if (s == null) {
					break;
				}
//				String data[] = s.split(",");
//				System.out.println(cnt + "번\t" + data[0] + "\t" + data[1] + "\t" + data[2] + "\t"
//						+ (Integer.parseInt(data[1]) * Integer.parseInt(data[2])));
				
				//분리방법 2
				StringTokenizer st = new StringTokenizer(s, ",");
				String sang =st.nextToken();
				int su =Integer.parseInt(st.nextToken());
				int dan =Integer.parseInt(st.nextToken());
				int total =su *dan;
				
				System.out.println(cnt+"\t"+sang+"\t"+su+"\t"
						+dan+"\t"+total);
			
				cnt++;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e0) {

		} finally {
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
		fileReader();
	}

}
