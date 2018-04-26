package dengjili.quickmybatis.mapper;

import org.apache.ibatis.annotations.Select;

import dengjili.quickmybatis.pojo.Banana;

public interface BananaMapper {
	@Select("select * from Banana where id = #{id}")
	Banana selectBanana(int id);
}
