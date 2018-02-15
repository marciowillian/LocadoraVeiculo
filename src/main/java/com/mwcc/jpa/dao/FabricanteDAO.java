package com.mwcc.jpa.dao;

import com.mwcc.jpa.model.Fabricante;
import com.mwcc.jpa.util.jpa.EntityManagerProducer;
import com.mwcc.jpa.util.jpa.Transactional;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.RollbackException;
import java.io.Serializable;

public class FabricanteDAO implements Serializable {
    private static final long serialVersionUID = 1L;

    @Inject
    EntityManagerProducer entityManagerProducer;

    @Inject
    EntityManager manager;

    public void salvar(Fabricante fabricante) {
        if (manager.getTransaction() != null) {
            try {
                manager.getTransaction().begin();
                manager.merge(fabricante);
                manager.getTransaction().commit();
            } catch (Exception e) {
                manager.getTransaction().rollback();
            } finally {
                manager.close();
            }
        }
    }

    public Fabricante buscaPorId(Long id){
        return manager.find(Fabricante.class, id);
    }

}
