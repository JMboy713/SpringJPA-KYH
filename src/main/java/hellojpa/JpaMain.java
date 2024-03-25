package hellojpa;

import jakarta.persistence.*;

public class JpaMain {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");// 매니저 팩토리 생성
        EntityManager em = emf.createEntityManager();// 매니저 생성

        EntityTransaction tx = em.getTransaction();
        tx.begin();
        //code
        Member member = new Member();
        member.setId(1L);
        member.setName("HelloA");// JPA는 트랜잭션 안에서 실행되어야 한다.

        em.persist(member);
        tx.commit();
        em.close();
        emf.close();
    }
}
