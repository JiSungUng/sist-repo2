package boot.quiz.book;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"data.*"})
@MapperScan({"data.*"})
public class BootMybatisBookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMybatisBookstoreApplication.class, args);
	}

}
