package io.waleedkhalid98.example.musicshop.store.service.impl;

import io.waleedkhalid98.example.musicshop.store.dto.SignUpDTO;
import io.waleedkhalid98.example.musicshop.store.service.LoginService;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Override
    public void signUp(SignUpDTO signUp) {
        System.out.println(signUp);
    }
}
