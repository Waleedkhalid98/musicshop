package io.waleedkhalid98.example.musicshop.store.controller;

//import lombok.extern.slf4j.Slf4j;
import io.waleedkhalid98.example.musicshop.store.dto.SignUpDTO;
import io.waleedkhalid98.example.musicshop.store.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {"http://localhost:4200", "http://127.0.0.1:4200"})
@RequestMapping(value = "/account")
//@Slf4j
public class LoginController {
    private final LoginService loginService;

    @Autowired
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping(path = "/sign-up")
    public ResponseEntity<Void> signUp(@RequestBody SignUpDTO signUp){
//        log.info("Starting signup for: {}", signUp);
//        log.info("Finish signup for: {}", signUp);
        loginService.signUp(signUp);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
