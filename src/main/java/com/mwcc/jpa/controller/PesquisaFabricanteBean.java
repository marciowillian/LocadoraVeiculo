package com.mwcc.jpa.controller;

import com.mwcc.jpa.dao.FabricanteDAO;
import com.mwcc.jpa.model.Fabricante;
import com.mwcc.jpa.repository.FabricanteRepository;
import com.mwcc.jpa.service.NegocioException;
import com.mwcc.jpa.util.jsf.FacesUtil;

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

    private Fabricante fabricanteSelecionado;
    private List<Fabricante> fabricantes = new ArrayList<>();


    @Inject
    private FabricanteRepository fabricanteRepository;

    @Inject
    private FabricanteDAO fabricanteDAO;

    public void inicializar(){
        fabricantes = fabricanteRepository.fabricantes();
    }

    /*public void excluir(){
        try {
            fabricanteDAO.excluir(fabricanteSelecionado);
            this.fabricantes.remove(fabricanteSelecionado);
            FacesUtil.addInfoMessage("Fabricante" + fabricanteSelecionado.getNome() + "excluído com sucesso!");
        }catch (NegocioException e){
            FacesUtil.addErrorMessage(e.getMessage());
        }
    }*/

    public List<Fabricante> getFabricantes() {
        return fabricantes;
    }

    public void setFabricantes(List<Fabricante> fabricantes) {
        this.fabricantes = fabricantes;
    }

    public Fabricante getFabricanteSelecionado() {
        return fabricanteSelecionado;
    }

    public void setFabricanteSelecionado(Fabricante fabricanteSelecionado) {
        this.fabricanteSelecionado = fabricanteSelecionado;
    }
}
