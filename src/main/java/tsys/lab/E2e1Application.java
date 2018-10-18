package tsys.lab;

import javax.sql.DataSource;

//import javax.activation.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

//import ch.qos.logback.core.db.DriverManagerConnectionSource;

@SpringBootApplication
public class E2e1Application {
	
	@Bean
	public DataSource dataSource() {
		
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("org.apache.derby.jdbc.EmbeddedDriver");
		ds.setUrl("jdbc:derby:c:/test;create=true");
		return ds;
	}

	public static void main(String[] args) {
		SpringApplication.run(E2e1Application.class, args);
	}
}
