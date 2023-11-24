package com.auth.backend.services.auth;

import com.auth.backend.dto.SignupDTO;
import com.auth.backend.dto.UserDTO;

public interface AuthService {
    UserDTO createUser(SignupDTO signupDTO);
}
