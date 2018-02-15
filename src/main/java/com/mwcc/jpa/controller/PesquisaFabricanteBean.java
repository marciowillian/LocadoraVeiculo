package com.mwcc.jpa.controller;

import com.mwcc.jpa.model.Fabricante;
import com.mwcc.jpa.repository.FabricanteRepository;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@ViewScoped
public class PesquisaFabricanteBean implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<Fabricante> fabricantes = new ArrayList<>();

    @Inject
    private FabricanteRepository fabricanteRepository;

    public void inicializar(){
        fabricantes = fabricanteRepository.fabricantes();
    }

    public List<Fabricante> getFabricantes() {
        return fabricantes;
    }

    public void setFabricantes(List<Fabricante> fabricantes) {
        this.fabricantes = fabricantes;
    }
}
