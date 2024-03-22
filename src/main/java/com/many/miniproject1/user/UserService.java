package com.many.miniproject1.user;

import com.many.miniproject1._core.errors.exception.Exception401;
import com.many.miniproject1._core.errors.exception.Exception404;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {
    public final UserJPARepository userJPARepository;

    @Transactional
    public User 회원수정(int id, UserRequest.CompanyInfoUpdateDTO requestDTO){
        User user = userJPARepository.findById(id)
                .orElseThrow(() -> new Exception404("회원정보를 찾을 수 없습니다"));

        user.setProfile(requestDTO.getProfile());
        user.setAddress(requestDTO.getAddress());
        user.setTel(requestDTO.getTel());
        user.setEmail(requestDTO.getEmail());
        user.setPassword(requestDTO.getPassword());
        return user;
    }

    public User 회원조회(int id){
        User user = userJPARepository.findById(id)
                .orElseThrow(() -> new Exception404("회원정보를 찾을 수 없습니다"));
        return user;
    }

    public User 로그인(UserRequest.LoginDTO reqestDTO){
        User sessionUser = userJPARepository.findByUsernameAndPassword(reqestDTO.getUsername(), reqestDTO.getPassword())
                .orElseThrow(() -> new Exception401("인증되지 않았습니다"));
        return sessionUser;
    }

}
