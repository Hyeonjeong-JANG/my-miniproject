package com.many.miniproject1.main;

import com.many.miniproject1.post.Post;
import com.many.miniproject1.resume.Resume;
import com.many.miniproject1.user.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class MainRepository {
    private final EntityManager em;

    public List<User> findAll() {
        Query query = em.createNativeQuery("select * from user_tb", User.class);

        return query.getResultList();
    }

    public List<Post> findPost(int id) {
        Query query = em.createNativeQuery("select * from post_tb where company_id=?", Post.class);
        query.setParameter(1, id);
        return query.getResultList();
    }

    public List<Resume> findResume(int id) {
        Query query = em.createNativeQuery("select * from resume_tb where person_id=?", Resume.class);
        query.setParameter(1, id);
        return query.getResultList();
    }

    public Integer findPersonId(int resumeId) {
        Query query = em.createNativeQuery("select person_id from resume_tb where  id=?");
        query.setParameter(1, resumeId);

        Integer personId = (Integer) query.getSingleResult();
        return personId;
    }
    public Integer findCompanyId(int id) {
        Query query = em.createNativeQuery("select company_id from post_tb where id=?");
        query.setParameter(1, id);

        Integer companyId = (Integer) query.getSingleResult();
        return companyId;
    }



}
