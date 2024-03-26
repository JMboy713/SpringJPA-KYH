package hellojpa;

import jakarta.persistence.*;

public class JpaMain {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");// 매니저 팩토리 생성
        EntityManager em = emf.createEntityManager();// 매니저 생성

        EntityTransaction tx = em.getTransaction();
        tx.begin();
        //code
        try {
            ExTeam team = new ExTeam();
            team.setName("teamA");
            em.persist(team);

            ExMember member = new ExMember();
            member.setName("member1");
            member.setTeamId(team.getId());
            em.persist(member);



            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }

//
        emf.close();
    }
}
