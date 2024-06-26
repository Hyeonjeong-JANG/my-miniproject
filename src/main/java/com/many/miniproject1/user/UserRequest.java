package com.many.miniproject1.user;

import com.many.miniproject1._core.common.ProfileImageService;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.sql.Date;

public class UserRequest {

    @Data
    public static class PersonUpdateDTO {
        private String email;
        private String name;
        private String password;
        private String tel;
        private String address;
        private Date birth;
        private MultipartFile profile;
    }

    @Data
    public static class PersonJoinDTO {
        private String role;
        private MultipartFile profile;
        private String username;
        private String name;
        private String email;
        private String birth;
        private String tel;
        private String address;
        private String password;

        public User toEntity() {
            String profileImagePath = ProfileImageService.saveProfile(profile);
            return User.builder()
                    .role(role)
                    .profile(profileImagePath)
                    .username(username)
                    .name(name)
                    .email(email)
                    .birth(Date.valueOf(birth))
                    .tel(tel)
                    .address(address)
                    .password(password)
                    .build();
        }
    }

    @Data
    public static class CompanyInfoUpdateDTO {
        private Integer id;
        private MultipartFile profile;
        private String address;
        private String tel;
        private String email;
        private String password;
        private String newPassword;
    }

    @Data
    public static class LoginDTO {
        private String username;
        private String password;
    }

    @Data
    public static class CompanyJoinDTO {
        private String role;        // 구직자 or 회사
        private MultipartFile profile;     // 사진
        private String companyName; // 회사명
        private String companyNum;  // 사업자번호
        private String username;    // 로그인ID
        private String name;        // 담당자 이름
        private String tel;         // 전화번호
        private String address;     // 회사 주소
        private String email;       // 담당자 이메일
        private String password;    // 비밀번호

        public User toEntity(){
            String profileImagePath = ProfileImageService.saveProfile(profile);
            return User.builder()
                    .role(role)
                    .profile(profileImagePath)
                    .companyName(companyName)
                    .companyNum(companyNum)
                    .username(username)
                    .name(name)
                    .tel(tel)
                    .address(address)
                    .email(email)
                    .password(password)
                    .build();
        }
    }
}