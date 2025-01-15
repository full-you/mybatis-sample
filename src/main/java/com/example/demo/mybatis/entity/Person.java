package com.example.demo.mybatis.entity;

import java.sql.Timestamp;

import lombok.Data;

/**
 * PersonテーブルEntity
 */
@Data // ★lomboKの機能でsetter/getterを自動生成してくれるので実装は不要
public class Person {
	private Integer personId;
	private String name;
	private Integer age;
	private Integer gender;
	private String tel;
	private String mail;
	private String insertUser;
	private Timestamp insertDatetime;
}
