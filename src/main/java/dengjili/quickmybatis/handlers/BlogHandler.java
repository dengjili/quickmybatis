/*package dengjili.quickmybatis.handlers;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import dengjili.quickmybatis.pojo.Blog;


*//**
 * <p>Blog作为其他的类的属性，需要类型转换，存进数据库</p>
 * <pre> //存入数据库代码
 * public String toString() {
 *		return id + "," + name;
 * }
 * </pre>
 * 
 * @see dengjili.quickmybatis.pojo.Blog Blog
 * 
 * @author it
 *
 *//*
public class BlogHandler extends BaseTypeHandler<Blog> {

	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, Blog parameter, JdbcType jdbcType)
			throws SQLException {
		ps.setString(i, parameter.toString());
	}

	@Override
	public Blog getNullableResult(ResultSet rs, String columnName) throws SQLException {
		String string = rs.getString(columnName);
		return new Blog(string);
	}

	@Override
	public Blog getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
		String string = rs.getString(columnIndex);
		return new Blog(string);
	}

	@Override
	public Blog getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
		String string = cs.getString(columnIndex);
		return new Blog(string);
	}

}
*/