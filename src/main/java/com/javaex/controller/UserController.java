package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.UserService;
import com.javaex.util.JsonResult;
import com.javaex.vo.UserVo;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping(value = "/api/movie")
	public JsonResult reservationMovieList(@RequestParam String phoneNumber) {
		System.out.println("UserController.reservationMovieList()");

		System.out.println(phoneNumber);

		List<UserVo> userList = userService.exeMovieList(phoneNumber);

		return JsonResult.success(userList);
	}

	@GetMapping(value = "/api/moviebyno")
	public JsonResult reservationMovie(@RequestParam(value = "m_r_no") int m_r_no) {
		System.out.println("UserController.reservationMovie()");

		UserVo reservation = userService.exeMovieNo(m_r_no);

		System.out.println(m_r_no);

		return JsonResult.success(reservation);
	}

}