package com.example.demo.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.UserSearchRequest;
import com.example.demo.entity.User;

@Mapper
public interface UserMapper {
	   /**
     * ���[�U�[��񌟍�
  
     */
    User search(UserSearchRequest user);
}
