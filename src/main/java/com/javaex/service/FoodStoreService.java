package com.javaex.service;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.javaex.dao.FoodStoreDao;
import com.javaex.vo.FoodVo;
import com.javaex.vo.OrderItemVo;
import com.javaex.vo.OrderVo;
import com.javaex.vo.PointVo;

@Service
public class FoodStoreService {

	@Autowired
	private FoodStoreDao foodStoreDao;


	public void exeOrder(OrderVo orderVo) {
		System.out.println("FoodStoreService.exeOrder()");
		
		int count= foodStoreDao.insertRec(orderVo);
		
		
		for (OrderItemVo orderItem : orderVo.getOrderItemList()) {
			int f_r_no = orderVo.getF_r_no();
			orderItem.setF_r_no(f_r_no);
			
			foodStoreDao.order(orderItem);
		}
		
		foodStoreDao.usePoint(orderVo);
	}

	public List<FoodVo> exeList() {
		System.out.println("FoodStoreService.exeList()");

		List<FoodVo> foodList = foodStoreDao.foodSelect();

		return foodList;
	}

	public int exePoint(String phoneNumber) {
		System.out.println("FoodStoreService.exePoint()");

		int point = foodStoreDao.selectPoint(phoneNumber);

		return point;
	}
	
	public int exePoint02(Map<String, String> params) {
		System.out.println("FoodStoreService.exePoint02()");

		int point = foodStoreDao.selectPoint02(params);

		return point;
	}


	public String exeUpload(MultipartFile file) {
		System.out.println("FoodStoreService.exeUpload()");

		// 파일저장디렉토리
		String saveDir = "D:\\javaStudy\\upload";

		// (1)파일관련 정보 추출///////////////////////////////////////////////////

		// 오리지널 파일명
		String orgName = file.getOriginalFilename();
		System.out.println(orgName);

		// 확장자
		String exName = orgName.substring(orgName.lastIndexOf("."));
		System.out.println(exName);

		// 저장파일명(겹치지 않아야 된다)
		String saveName = System.currentTimeMillis() + UUID.randomUUID().toString() + exName;
		System.out.println(saveName);

		// 파일사이즈
		long fileSize = file.getSize();
		System.out.println(fileSize);

		// 파일전체경로
		String filePath = saveDir + "\\" + saveName;
		System.out.println(filePath);

		// vo로묶기
		FoodVo foodVo = new FoodVo(filePath, orgName, saveName, fileSize);
		System.out.println(foodVo);

		// Dao만들기 --> DB저장 과제
		System.out.println(foodVo + "DB저장");

		foodStoreDao.foodInsert(foodVo);

		// (2)파일을 하드디스크에 저장
		// 파일저장
		try {

			byte[] fileData = file.getBytes();

			OutputStream os = new FileOutputStream(filePath);
			BufferedOutputStream bos = new BufferedOutputStream(os);

			bos.write(fileData);
			bos.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		return saveName;
	}


	public List<PointVo> exeRec(int f_r_no) {
		System.out.println("FoodStoreService.exeRec()");

		List<PointVo> recList = foodStoreDao.recSelect(f_r_no);

		return recList;
	}
}
