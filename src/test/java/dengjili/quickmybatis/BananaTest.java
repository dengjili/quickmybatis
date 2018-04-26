package dengjili.quickmybatis;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import dengjili.quickmybatis.pojo.Banana;
import dengjili.quickmybatis.utils.LocalLog;

/**
 * 加载pojo,测试
 * 
 * @author it
 *
 */
public class BananaTest {

	public static void main(String[] args) throws Exception {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

		SqlSession session = sqlSessionFactory.openSession();
		try {
			Banana banana = (Banana) session.selectOne("dengjili.quickmvnweb.mapper.BananaMapper.selectBanana", 1);
			LocalLog.print(banana.getName());
		} finally {
			session.close();
		}
	}

}
