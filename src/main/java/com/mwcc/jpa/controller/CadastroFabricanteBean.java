package com.mwcc.jpa.controller;

import com.mwcc.jpa.model.Fabricante;
import com.mwcc.jpa.service.CadastroFabricanteService;
import com.mwcc.jpa.service.NegocioException;
import com.mwcc.jpa.util.jsf.FacesUtil;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class CadastroFabricanteBean implements Serializable {
    private static final long serialVersionUID = 1L;

    @Inject
    private CadastroFabricanteService cadastroFabricanteService;

    private Fabricante fabricante;

    private Fabricante fabricanteSelecionado;

    @PostConstruct
    public void init(){
        limpar();

    }

    public void limpar(){
        this.fabricante = new Fabricante();
        this.fabricanteSelecionado = new Fabricante();
    }

    public void salvar(){
        try {
            this.cadastroFabricanteService.salvar(fabricante);
            FacesUtil.addInfoMessage("Fabricante salvo com sucesso!");
        }catch (NegocioException e){
            FacesUtil.addErrorMessage(e.getMessage());
        }
    }



    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public Fabricante getFabricanteSelecionado() {
        return fabricanteSelecionado;
    }

    public void setFabricanteSelecionado(Fabricante fabricanteSelecionado) {
        this.fabricanteSelecionado = fabricanteSelecionado;
    }
}
