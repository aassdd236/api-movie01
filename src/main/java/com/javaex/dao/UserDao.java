package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.UserVo;

@Repository
public class UserDao {

	@Autowired
	private SqlSession sqlSession;

	// 핸드폰 번호로 예약 정보 조회
	public List<UserVo> userList(String phoneNumber) {
		System.out.println("UserDao.userList()");

		List<UserVo> userList = sqlSession.selectList("user.list", phoneNumber);
		System.out.println(userList);

		return userList;

	}

    // 예약 번호로 예약 정보 조회
    public UserVo reservationMovie(int m_r_no) {
        System.out.println("UserDao.reservationMovie()");
        
        return sqlSession.selectOne("user.reservationMovie", m_r_no);
        
    }



}