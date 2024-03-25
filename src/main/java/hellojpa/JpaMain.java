package hellojpa;

import jakarta.persistence.*;

public class JpaMain {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");// 매니저 팩토리 생성
        EntityManager em = emf.createEntityManager();// 매니저 생성

        EntityTransaction tx = em.getTransaction();
        tx.begin();
        //code
        try{
            // 생성
            Member member = new Member();
            member.setId(1L);
            member.setName("HelloA");// JPA는 트랜잭션 안에서 실행되어야 한다.
            em.persist(member);

            // 조회
            Member findMember = em.find(Member.class, 1L);// pk로 조회
            System.out.println("findMember.id = "+findMember.getId());
            System.out.println("findMember.name = "+findMember.getName());//1차 캐시에 저장되어있었어서 hibernate가 select 쿼리를 날리지 않음.
            // 삭제
//            em.remove(findMember);
            // 수정
//            findMember.setName("HelloJPA");
//            em.persist(findMember); -> 저장하지 않아도 된다.


            tx.commit();
        }catch(Exception e){
            tx.rollback();
        }finally{
            em.close();
        }

        emf.close();
    }
}
