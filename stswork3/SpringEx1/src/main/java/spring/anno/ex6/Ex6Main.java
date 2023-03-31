package spring.anno.ex6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ex6Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext app= new ClassPathXmlApplicationContext("annoContext.xml");
		
		Manggo manggo=(philipinManggo)app.getBean("pmanggo");
		manggo.writeManngoName();
		ManggoController mcon=(ManggoController)app.getBean("manggoController");
		mcon.writeManggo();
	}

}
