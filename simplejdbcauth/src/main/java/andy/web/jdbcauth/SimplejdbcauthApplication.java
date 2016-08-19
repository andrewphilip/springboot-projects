package andy.web.jdbcauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootApplication
public class SimplejdbcauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimplejdbcauthApplication.class, args);
	}
	
	@Bean(name="dataSource")
	public DriverManagerDataSource dataSource(){
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/andydb");
		ds.setUsername("andrew");
		ds.setPassword("agnusdei");
		
		return ds;
	}
}
