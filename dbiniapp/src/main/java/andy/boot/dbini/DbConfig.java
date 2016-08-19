package andy.boot.dbini;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.sql.DataSource;

import org.h2.jdbcx.JdbcDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DbConfig {

	private static final String DBDIR=System.getProperty("java.io.tmpdir");
	
	@Bean(name="primaryDataSource")
	public DataSource dataSource(){
		JdbcDataSource ds=new JdbcDataSource();
		System.out.println("****************************************************");
		System.out.println("tmpdir: "+DBDIR);
		Path path=Paths.get(DBDIR, "h2db.mv.db");
		System.out.println(path.toString());
		File file=path.toFile();
		if(file.exists()){
			file.delete();
		}
		System.out.println("****************************************************");
		
		ds.setUrl("jdbc:h2:"+DBDIR+"/h2db;Mode=MySQL");
		return ds;
	}
}
