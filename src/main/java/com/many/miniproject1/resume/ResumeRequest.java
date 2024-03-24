package com.many.miniproject1.resume;

import com.many.miniproject1.skill.Skill;
import com.many.miniproject1.user.User;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;


import java.sql.Timestamp;
import java.util.List;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;


import java.sql.Timestamp;
import java.util.List;

public class ResumeRequest {

    @Data
    public static class SaveDTO{

        private User user;
        private String title;
        private MultipartFile profile;
        private String portfolio;
        private String introduce;
        private String career;
        private String simpleIntroduce;
        private List<String> skills;

        public Resume toEntity(){
            String profilePath=ProfileImageService.saveProfile(profile);
            return Resume.builder()
                    .user(user)
                    .title(title)
                    .profile(profilePath)
                    .introduce(introduce)
                    .career(career)
                    .simpleIntroduce(simpleIntroduce)
                    .build();
        }

    }

    @Data
    public static class ResumeDTO {
        private Integer id;
        private Integer personId;
        private String title;
        private MultipartFile profile;
        private String portfolio;
        private String introduce;
        private String career;
        private String simpleIntroduce;
        private String email;
        private String password;
        private String username;
        private String tel;
        private String address;
    }

    @Data
    public static class UpdateDTO {
        private Integer id;
        private Integer personId;
        private String title;
        private MultipartFile profile;
        private String portfolio;
        private String introduce;
        private String career;
        private String simpleIntroduce;
        private List<String> skill;
    }
}