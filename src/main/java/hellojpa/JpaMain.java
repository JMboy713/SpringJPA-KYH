package hellojpa;

import hellojpa.domain.Order;
import hellojpa.domain.OrderItem;
import jakarta.persistence.*;

public class JpaMain {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");// 매니저 팩토리 생성
        EntityManager em = emf.createEntityManager();// 매니저 생성

        EntityTransaction tx = em.getTransaction();
        tx.begin();
        //code
        try {
            Order order = new Order();
            order.addOrderItem(new OrderItem());




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
