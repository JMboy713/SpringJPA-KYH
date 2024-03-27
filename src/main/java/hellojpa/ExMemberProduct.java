package hellojpa;

import hellojpa.domain.Member;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class ExMemberProduct {
    @Id @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "EX_PRODUCT_ID")
    private ExProduct product;

    private int count;
    private int price;

    private LocalDateTime orderDateTime;
}
