package com.deborah.api_rest_dio.service;

import com.deborah.api_rest_dio.domain.model.*;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
