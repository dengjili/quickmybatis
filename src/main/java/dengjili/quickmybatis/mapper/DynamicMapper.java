package dengjili.quickmybatis.mapper;

import java.util.List;

import dengjili.quickmybatis.pojo.Dynamic;

public interface DynamicMapper {
	List<Dynamic> selectDynamic(Dynamic dynamic);
	
	void updateDynamic(Dynamic dynamic);
	
	List<Dynamic> selectDynamic2(List<Integer> ids);
}
