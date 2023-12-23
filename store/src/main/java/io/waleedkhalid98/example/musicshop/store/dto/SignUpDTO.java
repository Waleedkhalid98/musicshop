package io.waleedkhalid98.example.musicshop.store.dto;

import lombok.Data;

import java.util.Date;

@Data
public class SignUpDTO {
    private String email;
    private String password;
    private String firstname;
    private String lastname;
    private String address;
    private Date birthday;
}
