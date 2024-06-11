package TASK1.DB_demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@SpringBootApplication
@Configuration
@EnableAspectJAutoProxy
public class DbDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DbDemoApplication.class, args);
	}

}
