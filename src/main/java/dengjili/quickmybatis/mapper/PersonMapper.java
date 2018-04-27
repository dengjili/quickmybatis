package dengjili.quickmybatis.mapper;

import java.util.List;
import java.util.Map;

import dengjili.quickmybatis.pojo.Person;

public interface PersonMapper {
	List<Person> selectPerson(int id);
	
	List<Person> selectPerson2(int id);
	
	List<Person> selectPerson3(int id);
	
	List<Map<Integer, Person>> selectPersonMap(int id);
	
	List<Person> selectPersons(List<Integer> ids);
	
	void insertPerson(Person person);
	
	void insertPersons(List<Person> list);
}