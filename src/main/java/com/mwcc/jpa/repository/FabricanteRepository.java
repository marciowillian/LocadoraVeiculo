package com.mwcc.jpa.repository;

import com.mwcc.jpa.dao.FabricanteDAO;
import com.mwcc.jpa.model.Fabricante;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.io.Serializable;
import java.util.List;

public class FabricanteRepository implements Serializable{
    private static final long serialVersionUID = 1L;

    @Inject
    private EntityManager manager;

    @Inject
    private FabricanteDAO fabricanteDAO;

    public List<Fabricante> fabricantes(){
        return manager.createQuery("from Fabricante ", Fabricante.class).getResultList();
    }

}
