package com.javaex.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.FoodVo;

@Repository
public class FoodStoreDao {

	@Autowired
	private SqlSession sqlSession;

	public List<FoodVo> foodSelect() {
		System.out.println("FoodStoreDao.foodSelect()");

		List<FoodVo> foodList = sqlSession.selectList("food.select");
		System.out.println(foodList);

		return foodList;
	}

	public int selectPoint(String phoneNumber) {
		System.out.println("FoodStoreDao.selectPoint()");

		int point = sqlSession.selectOne("food.selectpoint", phoneNumber);

		return point;
	}
	
	public int selectPoint02(Map<String, String> params) {
		System.out.println("FoodStoreDao.selectPoint02()");

		int point = sqlSession.selectOne("food.usepoint", params);

		return point;
	}
	
	public int usePoint(Map<String, String> params) {
		System.out.println("FoodStoreDao.usePoint()");

		int point = sqlSession.update("food.update", params);
		System.out.println(params);

		return point;
	}

	public int foodInsert(FoodVo foodVo) {
		System.out.println("FoodStoreDao.foodInsert()");

		int count = sqlSession.insert("foodInsert", foodVo);

		return count;
	}

	public void order(FoodVo item) {
		System.out.println("FoodStoreDao.order()");
		int result = sqlSession.insert("food.insertOrder", item);
	}

}
