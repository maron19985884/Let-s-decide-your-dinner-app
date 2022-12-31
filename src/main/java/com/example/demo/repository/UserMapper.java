package com.example.demo.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.UserSearchRequest;
import com.example.demo.entity.User;

@Mapper
public interface UserMapper {
	   /**
     * ƒ†[ƒU[î•ñŒŸõ
  
     */
    User search(UserSearchRequest user);
}
