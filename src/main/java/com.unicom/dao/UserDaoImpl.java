package com.unicom.dao;

import com.unicom.entity.User;
import com.unicom.untils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class UserDaoImpl{
	/**
	 * 根据账户和密码获取登录用户信息
	 *
	 */
	private SqlSession sqlSession;
	private SqlSession getSqlSession(){
		sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
		return sqlSession;
	}

	public User login(String useraccount, String userpassword) {

		String sql="select * from t_user where user_account=? and user_password=?;";
		User user=null;
		try {
			Connection connection=JDBCUtil.getConnection();
			PreparedStatement ps=connection.prepareStatement(sql);
			ps.setString(1, useraccount);
			ps.setString(2, userpassword);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				user=new User();
				int userId=rs.getInt("user_id");
				String userAccount=rs.getString("user_account");
				String userPassword=rs.getString("user_password");
				String userName=rs.getString("user_name");
				String userSex=rs.getString("user_sex");
				String userEmail=rs.getString("user_email");
				Date userBirthday=rs.getDate("user_birthday");
				String userPhone=rs.getString("user_phone");
				Date userRegisterTime=rs.getDate("user_register_time");
				Date userLastLoginTime=rs.getDate("user_last_login_time");
				int userLock=rs.getInt("user_lock");
				Date userLockTime=rs.getDate("user_lock_time");
				int userAdminFlag=rs.getInt("user_admin_flag");
				int userDeleted=rs.getInt("user_deleted");
				Date userDeletedTime=rs.getDate("user_deleted_time");
				int userRetain1=rs.getInt("user_retain1");
				String userRetain2=rs.getString("user_retain2");
				
				user.setUserId(userId);
				user.setUserAccount(userAccount);
				user.setUserPassword(userPassword);
				user.setUserName(userName);
				user.setUserSex(userSex);
				user.setUserEmail(userEmail);
				user.setUserBirthday(userBirthday);
				user.setUserPhone(userPhone);
				user.setUserRegisterTime(userRegisterTime);
				user.setUserLastLoginTime(userLastLoginTime);
				user.setUserLock(userLock);
				user.setUserLockTime(userLockTime);
				user.setUserAdminFlag(userAdminFlag);
				user.setUserDeleted(userDeleted);
				user.setUserDeletedTime(userDeletedTime);
				user.setUserRetain1(userRetain1);
				user.setUserRetain2(userRetain2);
			}
			JDBCUtil.close(connection, ps, rs);
			return user;
		} catch (Exception e) {
			System.out.println("获取登录信息失败"+e.getMessage());
			return null;
		}
	}

}
