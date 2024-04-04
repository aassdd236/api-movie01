package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.UserDao;
import com.javaex.vo.UserVo;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;

	public List<UserVo> exeMovieList(String phoneNumber) {
		System.out.println("UserService.exeMovieList()");

		List<UserVo> userList = userDao.userList(phoneNumber);
		return userList;

	}

	public UserVo exeMovieNo(int m_r_no) {
		System.out.println("UserService.exeMovieNo()");

		UserVo reservation = userDao.reservationMovie(m_r_no);

		return reservation;

	}

}