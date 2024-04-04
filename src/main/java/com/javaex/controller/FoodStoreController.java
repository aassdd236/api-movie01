package com.javaex.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.javaex.service.FoodStoreService;
import com.javaex.util.JsonResult;
import com.javaex.vo.FoodVo;
import com.javaex.vo.OrderVo;
import com.javaex.vo.PointVo;

@RestController
public class FoodStoreController {

	@Autowired
	private FoodStoreService foodStoreService;

	// 주문하기
	@PostMapping("/api/food/order")
	public JsonResult order(@RequestBody OrderVo orderVo) {
		System.out.println("FoodStoreController.order()");
		System.out.println("우웩: "+orderVo);
		
		foodStoreService.exeOrder(orderVo);
		
		return JsonResult.success("주문 완료");
	}

	// 영수증 뽑기
	@GetMapping("/api/food/rec")
	public JsonResult rec(@RequestParam int f_r_no) {
		System.out.println("FoodStoreController.rec()");

		List<PointVo> recList = foodStoreService.exeRec(f_r_no);

		return JsonResult.success(recList);
	}

	// 메뉴 리스트
	@GetMapping("/api/food/list")
	public JsonResult list() {
		System.out.println("FoodStoreController.list()");

		List<FoodVo> foodList = foodStoreService.exeList();

		return JsonResult.success(foodList);
	}

	// 포인트 조회
	@GetMapping("/api/food/point")
	public JsonResult point(@RequestParam String phoneNumber) {
		System.out.println("FoodStoreController.point()");
		int point = foodStoreService.exePoint(phoneNumber);
		return JsonResult.success(point);
	}

	// 포인트 조회(폰번호, 생년월일)
	@GetMapping("/api/food/point02")
	public JsonResult pointUse(@RequestParam Map<String, String> params) {
		System.out.println("FoodStoreController.pointUse()");
		int point = foodStoreService.exePoint02(params);
		return JsonResult.success(point);
	}

	// 포인트 수정 put
	@PutMapping("/api/food/pointuse")
	public JsonResult pointUpdate(@RequestBody Map<String, String> params) {
		System.out.println("FoodStoreController.pointUpdate()");

		String phoneNumber = params.get("phoneNumber");
		String pointStr = params.get("point");
		if (pointStr == null) {
			pointStr = "0";
		}
		int point = Integer.parseInt(pointStr);

		foodStoreService.exeUserPoint(params);

		return JsonResult.success(params);
	}

	// 주문 정보 리스트

	// db 정보 등록
	@PostMapping("/api/food/attach")
	public JsonResult upload(@RequestParam MultipartFile file, @ModelAttribute FoodVo foodVo) {
		String saveName = foodStoreService.exeUpload(file);

		return JsonResult.success(saveName);
	}
}
