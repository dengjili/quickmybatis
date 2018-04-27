package dengjili.quickmybatis.junit;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import dengjili.quickmybatis.factory.MyObjectFactory;
import dengjili.quickmybatis.pojo.User;

public class TestObjectFactory {
	
	private final static Logger log = Logger.getLogger(TestObjectFactory.class);

	public static void main(String[] args) {
		String resource = "mybatis-config.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			log.error(e.getMessage());
		}
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession openSession = sqlSessionFactory.openSession();
		
		MyObjectFactory factory = new MyObjectFactory();
		User create = factory.create(User.class);
		log.error(create);
	}

}
