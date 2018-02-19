package com.mwcc.jpa.dao;

import com.mwcc.jpa.model.Fabricante;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.io.Serializable;

public class FabricanteDAO implements Serializable {
    private static final long serialVersionUID = 1L;


    @Inject
    private EntityManager manager;

    public void salvar(Fabricante fabricante){

        manager.merge(fabricante);

    }

}
