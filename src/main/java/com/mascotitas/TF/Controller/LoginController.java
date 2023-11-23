package com.mascotitas.TF.Controller;

import com.mascotitas.TF.Service.LoginService;
import com.mascotitas.TF.entity.Login;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/login")
@RequiredArgsConstructor
public class LoginController {

    private final LoginService loginService;

    @PostMapping
    public ResponseEntity<Login> createLogin(@Valid @RequestBody Login login)
    {
        Login responseResource = loginService.createLogin(login);

        return new ResponseEntity<>(responseResource, HttpStatus.OK);

    }

    @GetMapping
    public ResponseEntity<List<Login>> getAllLogin()
    {
        List<Login> loginResponseResource = loginService.getAllLogin();
        return new ResponseEntity<>(loginResponseResource, HttpStatus.OK);
    }

}
