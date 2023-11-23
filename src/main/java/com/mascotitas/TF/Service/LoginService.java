package com.mascotitas.TF.Service;

import com.mascotitas.TF.Repository.LoginRepository;
import com.mascotitas.TF.entity.Login;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final LoginRepository loginRepository;

    @Transactional
    public Login createLogin( Login login )
    {
        return loginRepository.save(login);
    }

    @Transactional
    public List<Login> getAllLogin()
    {
        return loginRepository.findAll();
    }

}
