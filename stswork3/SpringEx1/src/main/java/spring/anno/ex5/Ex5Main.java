package spring.anno.ex5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.anno.ex4.LogicController;

public class Ex5Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext app=new ClassPathXmlApplicationContext("annoContext.xml");
		
		MysqlController cont=(MysqlController)app.getBean("mysqlController");
		cont.insert("������");
		cont.select("������");
		cont.delete("3");
	}

	}


