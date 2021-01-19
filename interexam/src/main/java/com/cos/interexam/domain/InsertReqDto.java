package com.cos.interexam.domain;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class InsertReqDto {
	
	@NotBlank(message = "제목을 입력하세요")
	private String title;
	
	private double rating;
}
