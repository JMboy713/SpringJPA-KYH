package hellojpa;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "MEMBER")// 이름이 다를 경우 다음과 같이 매핑 가능
public class Member {
    @Id // pk 를 알려줌.
    private Long id;
    @Column(name = "name",insertable = true,updatable = false,nullable = false,length = 10) // DB에는 name
    private String username; // columnDefinition 은 데이터베이스 컬럼 정보를 직접 줄 수 있다.
    private Integer age;
    @Enumerated(EnumType.STRING) // ENUM 타입을 사용할 때
    private RoleType roleType;
    @Temporal(TemporalType.TIMESTAMP) // temporal을 사용할 때 date, time , timestamp
    private Date createdDate; // 날짜를 사용할 때
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;
    @Lob // varchar 이상의 큰 크기의 데이터를 넣을 때.
    private String description;

    @Transient // 컬럼에 매핑시키지 않음.
    private int temp;
    public Member() {
    }

}
