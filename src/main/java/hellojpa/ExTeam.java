package hellojpa;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class ExTeam {
    @Id @GeneratedValue
    @Column(name="TEAM_ID")
    private long id;
    private String name;

    @OneToMany(mappedBy = "team")
    List<ExMember> members = new ArrayList<ExMember>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
