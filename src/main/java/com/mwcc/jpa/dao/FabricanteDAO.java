package com.mwcc.jpa.dao;

import com.mwcc.jpa.model.Fabricante;
import com.mwcc.jpa.util.jpa.EntityManagerProducer;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.io.Serializable;

public class FabricanteDAO implements Serializable {
    private static final long serialVersionUID = 1L;

    @Inject
    EntityManagerProducer entityManagerProducer;

    @Inject
    EntityManager manager;

    EntityTransaction trx;

    public void salvar(Fabricante fabricante){

        manager.merge(fabricante);


    }

}
