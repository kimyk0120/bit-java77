package com.spring.user.dao;
import com.spring.user.vo.UserVo;

public interface UserDao {
	
	public int insertUser(UserVo userVo) throws Exception;
	public UserVo loginUser(UserVo userVo) throws Exception;
}
