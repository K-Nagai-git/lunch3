package com.example.lunch3.form;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ランチ：Form
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LunchForm {
	/** 管理ID */
	private Integer id;
	/** メニュー */
	private String menu;
	/** お店 */
	private String shop;
	/** 値段 */
	private Integer price;
	/** 前回利用日 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")  // フォーマットを指定
	private LocalDate recentDate;   
	/** 回数 */
	private Integer times;   
	/** 評価 */
	private String rate;
	/** メモ・コメント */
	private String memo;  
//	
    /** 新規判定 */
    private Boolean isNew;
}