package com.wisdomlife.idao.user;

import com.wisdomlife.vo.user.UserInfoVO;


public interface IUserDAO {


	public UserInfoVO userLogin(String userName, String password);
	
}
