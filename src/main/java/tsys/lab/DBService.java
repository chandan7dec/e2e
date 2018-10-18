package tsys.lab;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DBService {

	@Autowired
	private DataSource dataSource;
	
	@RequestMapping(path="dbTest", method=RequestMethod.GET)
	public String dbTest() {
		String result = "No DB";
		
		try {
			result = dataSource.getConnection().getMetaData().getDatabaseProductName();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
		
		
		}
}
