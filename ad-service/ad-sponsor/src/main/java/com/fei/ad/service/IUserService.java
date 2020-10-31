package com.fei.ad.service;


import com.fei.ad.exception.AdException;
import com.fei.ad.vo.CreateUserRequest;
import com.fei.ad.vo.CreateUserResponse;

/**
 * Created by Qinyi.
 */
public interface IUserService {

    /**
     * <h2>创建用户</h2>
     * */
    CreateUserResponse createUser(CreateUserRequest request)
            throws AdException;
}
