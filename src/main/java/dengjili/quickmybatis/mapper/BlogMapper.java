package dengjili.quickmybatis.mapper;

import java.util.List;

import dengjili.quickmybatis.pojo.Blog;

public interface BlogMapper {
	Blog selectBlog(int id);
	
	void addBlog(Blog blog);
	
	void deleteBlog(int id);
	
	void updateBlog(Blog blog);
	
	List<Blog> selectAll();
}
