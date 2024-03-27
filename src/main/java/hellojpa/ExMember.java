package hellojpa;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class ExMember {
    @Id @GeneratedValue
    @Column(name="MEMBER_ID")
    private Long id;
    @Column(name="USERNAME")
    private String name;

//    @Column(name="TEAM_ID")
//    private Long teamId;

    @ManyToOne
    @JoinColumn(name = "TEAM_ID")// join할 컬럼
    private ExTeam team;

    @OneToOne
    @JoinColumn(name = "LOCKER_ID")
    private ExLocker locker;

    //    @ManyToMany
//    @JoinTable(name = "MEMBER_PRODUCT") // 연결 테이블을 만들어준다.
//    private List<ExProduct> products = new ArrayList<>();
//    @OneToMany(mappedBy = "ExMemberProduct")
//    private List<ExMemberProduct> memberProducts = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
