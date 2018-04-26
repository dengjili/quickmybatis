package dengjili.quickmybatis.mapper;

import dengjili.quickmybatis.pojo.Blog;

public interface BlogMapper {
	Blog selectBlog(int id);
	
	void addBlog(Blog blog);
}
