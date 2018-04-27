package dengjili.quickmybatis.junit;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import dengjili.quickmybatis.factory.MyObjectFactory;
import dengjili.quickmybatis.mapper.BlogMapper;
import dengjili.quickmybatis.mapper.UserMapper;
import dengjili.quickmybatis.pojo.Blog;
import dengjili.quickmybatis.pojo.User;
import dengjili.quickmybatis.utils.SessionFactory;

public class TestUser {

	private final static Logger log = Logger.getLogger(TestUser.class);
	private SqlSession session = SessionFactory.create();
	
	@Test
	public void selectAll() {
		UserMapper mapper = session.getMapper(UserMapper.class);
		List<User> selectUser = mapper.selectUser();
		log.error(selectUser);
	}
	
	@Test
	public void selectAll2() {
		UserMapper mapper = session.getMapper(UserMapper.class);
		List<User> selectUser = mapper.selectUser2();
		log.error(selectUser);
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
		UserMapper mapper = session.getMapper(UserMapper.class);

		User user = new User();
		user.setName("lisi");
		user.setPrice(11f);
		user.setDesc("test");
		user.setBirth(new Date());
		
		mapper.addUser(user);
		session.commit();
		
		log.error("ok");
	}
	
	@Test
	public void addOne2() {
		UserMapper mapper = session.getMapper(UserMapper.class);

		User user = new User();
		user.setName("lisi");
		user.setPrice(11f);
		user.setDesc("test");
		user.setBirth(new Date());
		
		mapper.addUser2(user);
		session.commit();
		
		log.error("ok");
	}
	
	
}
