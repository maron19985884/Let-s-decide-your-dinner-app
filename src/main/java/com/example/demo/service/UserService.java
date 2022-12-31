package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UserSearchRequest;
import com.example.demo.entity.User;
import com.example.demo.repository.UserMapper;

@Service
public class UserService {
	   /**
     * ���[�U�[��� Mapper
     */
    @Autowired
    private UserMapper userMapper;
    /**
    t ���N�G�X�g�f�[�^
     * ��������
     */
    public User search(UserSearchRequest userSearchRequest) {
        return userMapper.search(userSearchRequest);
    }
}
