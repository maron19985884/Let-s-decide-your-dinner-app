package com.example.demo.dto;

import java.io.Serializable;

import lombok.Data;
@Data
public class UserSearchRequest implements Serializable{
	 /**
	   * �W�������ƋC��
	   */
	  private String genre;
	  private String feeling;
}
