package andy.boot.dbini.repo;

import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

		private DataSource ds;
		
		private JdbcTemplate jdbcTmpl;
		
		private final  Logger logger=LoggerFactory.getLogger(getClass());
		
		@Autowired
		public UserRepository(@Qualifier("primaryDataSource") DataSource ds) {
			this.ds=ds;
			jdbcTmpl=new JdbcTemplate(ds);
		}
		
		public List<String> getAllUserNames(){
			return jdbcTmpl.queryForList("select username from user_authentication", String.class);
			
		}
}
