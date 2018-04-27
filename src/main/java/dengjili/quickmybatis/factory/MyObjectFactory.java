package dengjili.quickmybatis.factory;

import java.util.Date;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import org.apache.ibatis.reflection.factory.DefaultObjectFactory;

import dengjili.quickmybatis.pojo.User;

public class MyObjectFactory extends DefaultObjectFactory {

	private static final long serialVersionUID = -3406291975739392126L;

	@Override
	public <T> T create(Class<T> type) {

		if (type.isAssignableFrom(User.class)) {
			User user = new User();
			user.setName("haha");
			user.setPrice(11f);
			user.setDesc("haha2");
			user.setBirth(new Date());
			return (T) user;
		}

		return super.create(type);
	}

	@Override
	public void setProperties(Properties properties) {
		Set<Entry<Object, Object>> entrySet = properties.entrySet();
		System.out.println(" ====== ");
		for (Entry<Object, Object> entry : entrySet) {
			System.out.println(entry.getKey() + "：" + entry.getValue());
		}
		System.out.println(" ====== ");
		super.setProperties(properties);
	}

}
