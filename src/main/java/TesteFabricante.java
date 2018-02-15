import com.mwcc.jpa.model.Fabricante;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TesteFabricante {
    public static void main(String[]args){
        Fabricante fabricante = new Fabricante();

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("LocadoraPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        EntityTransaction trx = entityManager.getTransaction();

        trx.begin();

        fabricante.setNome("Wolksvagem");

        entityManager.persist(fabricante);

        trx.commit();
    }
}
