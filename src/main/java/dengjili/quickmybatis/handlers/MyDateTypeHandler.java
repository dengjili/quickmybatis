package dengjili.quickmybatis.handlers;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;


/**
 * 其中@MappedTypes为拦截器作用，需要使用类型转换的类
 * 
 * @author it
 *
 */
@MappedJdbcTypes(JdbcType.VARCHAR)
@MappedTypes(Date.class)
public class MyDateTypeHandler extends BaseTypeHandler<Date> {

	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, Date parameter, JdbcType jdbcType)
			throws SQLException {
		//向数据库存
		ps.setString(i, String.valueOf(parameter.getTime()));
	}

	@Override
	public Date getNullableResult(ResultSet rs, String columnName) throws SQLException {
		return new Date(rs.getLong(columnName));
	}

	@Override
	public Date getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
		return new Date(rs.getLong(columnIndex));
	}

	@Override
	public Date getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
		return new Date(cs.getLong(columnIndex));
	}

}
