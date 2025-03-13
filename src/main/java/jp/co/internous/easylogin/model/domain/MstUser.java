package jp.co.internous.easylogin.model.domain;

public class MstUser {
	
	private int id;
	private String userName;
	private String password;
	private String fullName;
	
	
//	id設定
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
//	ここまでid設定
	
//	userName設定
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
//	ここまでuserName設定
	
//	password設定
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
//	ここまでpassword設定
	
//	fullName設定
	public String getFullName() {
		return fullName;
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
//	ここまでfullName設定
	
}
