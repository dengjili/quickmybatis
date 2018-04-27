package dengjili.quickmybatis.mapper;

import java.util.List;

import dengjili.quickmybatis.pojo.User;

public interface UserMapper {
	void addUser(User user);
	
	void addUser2(User user);
	
	List<User> selectUser();
	
	List<User> selectUser2();
}
