package com.wisdomlife.vo.user;

import java.io.Serializable;

import com.wisdomlife.vo.base.BaseVO;

public class UserInfoVO extends BaseVO implements Serializable {

	// id
	private Long id;

	// 对外用户id
	private String outUserId;

	private String nickName;

	// 用户名
	private String userName;

	// 密码
	private String password;

	// 性别,1:男,2:女
	private Byte gender = 1;

	// 出生年月
	private Long birthday;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOutUserId() {
		return outUserId;
	}

	public void setOutUserId(String outUserId) {
		this.outUserId = outUserId;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Byte getGender() {
		return gender;
	}

	public void setGender(Byte gender) {
		this.gender = gender;
	}

	public Long getBirthday() {
		return birthday;
	}

	public void setBirthday(Long birthday) {
		this.birthday = birthday;
	}

}
