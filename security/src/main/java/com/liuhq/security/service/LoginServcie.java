package com.liuhq.security.service;

import com.liuhq.security.domain.ResponseResult;
import com.liuhq.security.domain.User;

public interface LoginServcie {
    ResponseResult login(User user);

    ResponseResult logout();
}
