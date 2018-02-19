package com.mwcc.jpa.converter;

import com.mwcc.jpa.dao.FabricanteDAO;
import com.mwcc.jpa.model.Fabricante;
import com.mwcc.jpa.util.cdi.CDIServiceLocator;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(forClass = Fabricante.class)
public class FabricanteConverter implements Converter{

    private FabricanteDAO fabricanteDAO;

    public FabricanteConverter(){
        fabricanteDAO = CDIServiceLocator.getBean(FabricanteDAO.class);
    }

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String s) {
        Fabricante retorno = null;

        if (s != null){

           // retorno = this.fabricanteDAO.buscaPorId(new Long(s));

            // retorno = this.fabricanteDAO.buscarPeloCodigo(new Long(value));
        }

        return null;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object o) {
        if (o != null){
            Long codigo = ((Fabricante)o).getCodigo();
            String retorno = (codigo == null ? null : codigo.toString());
            return retorno;
        }
        return "";
    }
}
