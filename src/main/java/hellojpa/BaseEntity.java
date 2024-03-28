package hellojpa;


import jakarta.persistence.MappedSuperclass;

import java.time.LocalDateTime;

@MappedSuperclass // mapping 정보만 받는.
public class BaseEntity {
    private LocalDateTime createdDate;
}
