package in.jk;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {
	
	
	private JdbcTemplate postgresJdbcTemplate;
	
	
	
	private JdbcTemplate postgresJdbcTemplate1;

	public JdbcTemplate getPostgresJdbcTemplate1() {
		return postgresJdbcTemplate1;
	}

	public void setPostgresJdbcTemplate1(JdbcTemplate postgresJdbcTemplate1) {
		this.postgresJdbcTemplate1 = postgresJdbcTemplate1;
	}
	
	
	public JdbcTemplate getPostgresJdbcTemplate() {
		return postgresJdbcTemplate;
	}



	public void setPostgresJdbcTemplate(JdbcTemplate postgresJdbcTemplate) {
		this.postgresJdbcTemplate = postgresJdbcTemplate;
	}



	public List<Employee> loadAllEmployee(){
		
	DataSource dataSource =	postgresJdbcTemplate.getDataSource();
	
	try {
		Connection con = dataSource.getConnection();
		System.out.println(con);
		
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
		
		return null;
		
		
	}

	public List<Employee> loadAllEmployeeFromOtherDB(){
		
		DataSource dataSource =	postgresJdbcTemplate1.getDataSource();
		
		try {
			Connection con = dataSource.getConnection();
			System.out.println("postgresJdbcTemplate1 :: "+con);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
			
			return null;
			
			
		}

}
