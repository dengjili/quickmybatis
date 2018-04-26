package dengjili.quickmybatis;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

/**
 *	测试数据库等基本信息是否配置完毕
 *
 *	@author it
 */
public class SqlSessionFactoryTest {

	private final static Logger log = Logger.getLogger(SqlSessionFactoryTest.class);
	
	public static void main(String[] args) throws Exception {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		log.debug(sqlSessionFactory);
	}

}
