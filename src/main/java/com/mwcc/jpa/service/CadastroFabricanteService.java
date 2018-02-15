package com.mwcc.jpa.service;

import com.mwcc.jpa.dao.FabricanteDAO;
import com.mwcc.jpa.model.Fabricante;
import com.mwcc.jpa.util.jpa.Transactional;

import javax.inject.Inject;
import java.io.Serializable;

public class CadastroFabricanteService implements Serializable {
    private static final long serialVersionUID = 1L;

    @Inject
    private FabricanteDAO fabricanteDAO;



    public void salvar(Fabricante fabricante)throws NegocioException{
        if (fabricante.getNome() == null || fabricante.getNome().trim().equals("")){
            throw new NegocioException("O nome do fabricante é obrigatório!");
        }

        this.fabricanteDAO.salvar(fabricante);
    }
}
