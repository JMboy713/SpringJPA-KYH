package hellojpa;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)// 조인전략
@DiscriminatorColumn // Dtype
public class ExItem {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private int price;
}
