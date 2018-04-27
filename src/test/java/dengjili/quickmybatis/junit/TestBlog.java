package dengjili.quickmybatis.junit;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import dengjili.quickmybatis.mapper.BlogMapper;
import dengjili.quickmybatis.pojo.Blog;
import dengjili.quickmybatis.utils.SessionFactory;

public class TestBlog {

	private final static Logger log = Logger.getLogger(TestBlog.class);
	private SqlSession session = SessionFactory.create();
	
	@Test
	public void selectAll() {
		BlogMapper mapper = session.getMapper(BlogMapper.class);
		List<Blog> selectAll = mapper.selectAll();
		log.error(selectAll);
	}
	
	@Test
	public void selectOne() {
		BlogMapper mapper = session.getMapper(BlogMapper.class);
		Blog blog = mapper.selectBlog(1);
		log.error(blog);
	}
	
	@Test
	public void updateOne() {
		BlogMapper mapper = session.getMapper(BlogMapper.class);
		Blog blog = new Blog();
		blog.setId(1);
		blog.setName("mimo i like");
		mapper.updateBlog(blog);
		
		session.commit();
		log.error(blog);
	}
	
	@Test
	public void addOne() {
		BlogMapper mapper = session.getMapper(BlogMapper.class);
		Blog blog = new Blog();
		blog.setName("hello");
		mapper.addBlog(blog);
		
		session.commit();
		log.error(blog);
	}
	
	
}
