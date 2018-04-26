package dengjili.quickmybatis;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import dengjili.quickmybatis.mapper.BlogMapper;
import dengjili.quickmybatis.pojo.Blog;

/**
 * 加载pojo,测试Mapper对象
 * 
 * @author it
 *
 */
public class BlogMapperTest2 {
	
	private final static Logger log = Logger.getLogger(BlogMapperTest2.class);

	public static void main(String[] args) throws Exception {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

		SqlSession session = sqlSessionFactory.openSession();
		try {
			BlogMapper mapper = session.getMapper(BlogMapper.class);
			Blog blog = mapper.selectBlog(1);
			log.error(blog.getName());
		} finally {
			
			session.close();
		}
	}

}
