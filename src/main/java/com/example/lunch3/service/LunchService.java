package com.example.lunch3.service;

import java.time.LocalDate;
import java.util.List;

import com.example.lunch3.entity.Lunch;

/**
 * Lunch：サービス
 */
public interface LunchService {

	/**
	 * 全「メニュー」を検索します。
	 */
	List<Lunch> findAllLunch();

	/**
	 * 指定されたIDの「メニュー」を検索します。
	 */
	Lunch findByIdLunch(Integer id);

	/**
	 * 「メニュー」を新規登録します。
	 */
	void insertLunch(Lunch lunch);

	/**
	 * 「すること」を更新します。
	 */
	void updateLunch(Lunch lunch);

	/**
	 * ★「利用日」を更新します。
	 */
	void updateRecentDate(Integer id, LocalDate recentDate,Integer times);

	/**
	 * 指定されたIDの「すること」を削除します。
	 */
	void deleteLunch(Integer id);
}