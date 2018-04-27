package dengjili.quickmybatis.junit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import dengjili.quickmybatis.mapper.BlogMapper;
import dengjili.quickmybatis.mapper.PersonMapper;
import dengjili.quickmybatis.pojo.Blog;
import dengjili.quickmybatis.pojo.Person;
import dengjili.quickmybatis.utils.SessionFactory;

public class TestPerson {

	private final static Logger log = Logger.getLogger(TestPerson.class);
	private SqlSession session = SessionFactory.create();
	
	@Test
	public void selectAll() {
		PersonMapper mapper = session.getMapper(PersonMapper.class);
		List<Integer> ids = Arrays.asList(1, 2, 3, 4);
		List<Person> list = mapper.selectPersons(ids);
		log.error(list);
	}
	
	@Test
	public void selectOne() {
		PersonMapper mapper = session.getMapper(PersonMapper.class);
		List<Person> selectPerson = mapper.selectPerson(1);
		log.error(selectPerson);
	}
	
	@Test
	public void selectOne2() {
		PersonMapper mapper = session.getMapper(PersonMapper.class);
		List<Person> selectPerson = mapper.selectPerson2(1);
		log.error(selectPerson);
	}
	
	@Test
	public void selectOne3() {
		PersonMapper mapper = session.getMapper(PersonMapper.class);
		List<Person> selectPerson = mapper.selectPerson3(1);
		log.error(selectPerson);
		for (Person person : selectPerson) {
			List<Blog> blogs = person.getBlogs();
			for (Blog blog : blogs) {
				log.error(blog);
			}
		}
	}
	
	@Test
	public void selectselectPersonMap() {
		PersonMapper mapper = session.getMapper(PersonMapper.class);
		List<Map<Integer, Person>> selectPersonMap = mapper.selectPersonMap(9);
		log.error(selectPersonMap);
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
		PersonMapper mapper = session.getMapper(PersonMapper.class);
		Person person = new Person();
		person.setName("hello");
		person.setPassword("hello");
		mapper.insertPerson(person);
		
		session.commit();
		log.error(person);
	}
	
	@Test
	public void addAll() {
		PersonMapper mapper = session.getMapper(PersonMapper.class);
		Person person = new Person();
		person.setName("11");
		person.setPassword("11");
		
		Person person2 = new Person();
		person2.setName("22");
		person2.setPassword("22");
		
		List<Person> list = new ArrayList<Person>();
		list.add(person);
		list.add(person2);
		mapper.insertPersons(list);
		
		session.commit();
		log.error(person);
	}
	
	
}
