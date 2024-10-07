package com.example.lunch3.repository;

import java.time.LocalDate;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.lunch3.entity.Lunch;

/**
 * Lunch：リポジトリ
 */
@Mapper
public interface LunchMapper {

	/**
	 * 全ての「ランチ」を取得します。
	 */
	List<Lunch> selectAll();

	/**
	 * 指定されたIDに対応する「ランチ」を取得します。
	 */
	Lunch selectById(@Param("id") Integer id);

	/**
	 * 「ランチ」を登録します。
	 */
	void insert(Lunch lunch);

	/**
	 * 「ランチ」を更新します。
	 */
	void update(Lunch lunch);

	/**
	 * 「ランチ　利用日」を更新します。
	 */
	void today(Lunch lunch);

	/**
	 * ★「ランチ　利用日」を更新します。
	 */
	void updateRecentDate(@Param("id") Integer id, @Param("recentDate") LocalDate recentDate,@Param("times") Integer times);
	
	/**
	 * 指定されたIDの「ランチ」を削除します。
	 */
	void delete(@Param("id") Integer id);
}