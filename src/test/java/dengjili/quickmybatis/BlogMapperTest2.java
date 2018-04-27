package dengjili.quickmybatis;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
			
		/*	Blog blog = new Blog();
			blog.setId(1);
			blog.setName("fuck");
			mapper.updateBlog(blog);
			
			
			
			session.commit();*/
			
			List<Blog> selectAll = mapper.selectAll();
			log.error(selectAll);
		} finally {
			session.close();
		}
	}

}
