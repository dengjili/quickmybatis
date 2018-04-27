package dengjili.quickmybatis.junit;

import java.util.Arrays;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import dengjili.quickmybatis.mapper.DynamicMapper;
import dengjili.quickmybatis.pojo.Dynamic;
import dengjili.quickmybatis.utils.SessionFactory;

public class TestDynamic {

	private final static Logger log = Logger.getLogger(TestDynamic.class);
	private SqlSession session = SessionFactory.create();
	
	@Test
	public void selectAll() {
		
		Dynamic dynamic = new Dynamic();
		dynamic.setName("zhangsan");
		
		DynamicMapper mapper = session.getMapper(DynamicMapper.class);
		List<Dynamic> selectDynamic = mapper.selectDynamic(dynamic);
		log.error(selectDynamic);
	}
	
	@Test
	public void updateDynamic() {
		
		Dynamic dynamic = new Dynamic();
		dynamic.setId(1);
		dynamic.setName("momoyou");
		
		DynamicMapper mapper = session.getMapper(DynamicMapper.class);
		mapper.updateDynamic(dynamic);
	}
	
	
	@Test
	public void sDynamic() {
		
		List<Integer> ids = Arrays.asList(1,2);
		
		DynamicMapper mapper = session.getMapper(DynamicMapper.class);
		List<Dynamic> selectDynamic = mapper.selectDynamic2(ids);
		
		log.error(selectDynamic);
	}
	
	
	
}
