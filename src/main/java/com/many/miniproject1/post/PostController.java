package com.many.miniproject1.post;

import com.many.miniproject1.skill.Skill;
import com.many.miniproject1.user.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class PostController {
    private final HttpSession session;

    //회사 공고 관리
    @GetMapping("/company/posts")
    public String companyPosts(HttpServletRequest request, Skill skill) { // 이 페이지는 포스트들을 확인할 수 있는 페이지라 이름 변경했습니다.
        User sessionUser = (User) session.getAttribute("sessionUser");
        return "company/posts";
    }

    @GetMapping("/company/posts/{id}") // 포스트 디테일 페이지 보기
    public String companyPostDetailForm(@PathVariable int id, HttpServletRequest request) {
        User sessionUser = (User) session.getAttribute("sessionUser");
        return "company/post-detail";
    }

    @GetMapping("/company/posts/save-form")
    public String companyPostForm(PostRequest.SaveDTO requestDTO, HttpServletRequest request) {
        User sessionUser = (User) session.getAttribute("sessionUser");
        // request.setAttribute("company", sessionUser);
        return "company/post-save-form";
    }

    @PostMapping("/company/posts/save")
    public String companySavePost(HttpServletRequest request) {
        User sessionUser = (User) session.getAttribute("sessionUser");
        return "redirect:/company/posts";
    }

    @GetMapping("/company/posts/{id}/update-form")
    public String companyUpdatePostForm(@PathVariable int id, HttpServletRequest request) {
        User sessionUser = (User) session.getAttribute("sessionUser");
        return "company/post-update-form";
    }

    @PostMapping("/company/posts/{id}/update")
    public String companyUpdatePost(@PathVariable int id, HttpServletRequest request) {
        User sessionUser = (User) session.getAttribute("sessionUser");
//        return "redirect:/company/posts" + id;
        return "redirect:/company/posts/" + id;
    }

    @PostMapping("/company/posts/{id}/delete")
    public String companyDeletePost(@PathVariable int id, HttpServletRequest request) {
        User sessionUser = (User) session.getAttribute("sessionUser");
        return "redirect:/company/posts";
    }
}