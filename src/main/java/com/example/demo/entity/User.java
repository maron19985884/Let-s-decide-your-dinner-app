package com.example.demo.entity;

import lombok.Data;

@Data
public class User {
	
    /**
     * 名前
     */
    private String name;
    /**
     * ジャンル
     */
    private String genre;
    /**
     * 気分
     */
    private String feeling;

 
}
