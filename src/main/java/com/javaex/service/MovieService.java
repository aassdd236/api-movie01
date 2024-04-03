package com.javaex.service;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.javaex.dao.MovieDao;
import com.javaex.vo.MovieVo;

@Service
public class MovieService {

	@Autowired
	private MovieDao movieDao;

	// DB에 이미지 정보 저장
	public String exeUpload(MultipartFile file) {
		System.out.println("MovieService.exeUpload()");

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
		MovieVo movieVo = new MovieVo(filePath, orgName, saveName, fileSize);
		System.out.println(movieVo);

		// Dao만들기 --> DB저장 과제
		System.out.println(movieVo + "DB저장");

		movieDao.movieInsert(movieVo);

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

	// 영화 예매 리스트
	public List<MovieVo> exeMovieList() {
		System.out.println("MovieService.exeMovieList()");

		List<MovieVo> mList = movieDao.selectMovie();

		return mList;
	}

	// 회원정보수정폼(1명 데이터가져오기)
	public MovieVo exeMovieCount(int no) {
		System.out.println("UserService.exeModifyForm()");

		MovieVo movieVo = movieDao.userSelectCount(no);
		return movieVo;
	}

}
