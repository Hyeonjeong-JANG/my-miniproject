package com.many.miniproject1.backup.resume;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ResumeQueryRepository {
    private final EntityManager em;
}
