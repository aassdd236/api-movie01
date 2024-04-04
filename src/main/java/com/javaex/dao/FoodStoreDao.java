package com.javaex.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.FoodVo;
import com.javaex.vo.OrderItemVo;
import com.javaex.vo.OrderVo;
import com.javaex.vo.PointVo;

@Repository
public class FoodStoreDao {

	@Autowired
	private SqlSession sqlSession;

	public int insertRec(OrderVo orderVo) {
		System.out.println("FoodStoreDao.insertRec()");
		int count = sqlSession.insert("food.insertRec", orderVo);
		return count;
	}

	public void order(OrderItemVo orderItem) {
	    System.out.println("FoodStoreDao.order()");
	    
	    sqlSession.insert("food.order", orderItem);
	}


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

	public int usePoint(OrderVo orderVo) {
		System.out.println("FoodStoreDao.usePoint()");

		int point = sqlSession.update("food.update", orderVo);

		return point;
	}

	public int foodInsert(FoodVo foodVo) {
		System.out.println("FoodStoreDao.foodInsert()");

		int count = sqlSession.insert("foodInsert", foodVo);

		return count;
	}

	public List<PointVo> recSelect(int f_r_no) {
		System.out.println("FoodStoreDao.recSelect()");

		List<PointVo> recList = sqlSession.selectList("food.selectRec", f_r_no);
		System.out.println(recList);

		return recList;
	}
}
