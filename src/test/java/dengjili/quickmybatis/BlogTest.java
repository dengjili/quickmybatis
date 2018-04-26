package dengjili.quickmybatis;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import dengjili.quickmybatis.pojo.Blog;

/**
 * 加载pojo,测试
 * 
 * @author it
 *
 */
public class BlogTest {

	private final static Logger log = Logger.getLogger(BlogTest.class);

	public static void main(String[] args) throws Exception {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

		SqlSession session = sqlSessionFactory.openSession();
		try {
			Blog blog = (Blog) session.selectOne("dengjili.quickmvnweb.mapper.BlogMapper.selectBlog", 1);
			log.debug(blog.getName());
		} finally {
			session.close();
		}
	}

}
