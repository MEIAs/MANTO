package edu.uag.iidis.scec.vista;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.ValidatorForm;


/**
 * Form bean para el registro de una nueva persona.
 *
 * @author Victor Ramos
 */
public final class FormaNuevoAuto
        extends ValidatorForm {

    private String marca;
    private String color;
    private String placa;
    private String propietario;
    private String estado; 
    private	String pais;

    public void setMarca(String marca) {
        this.marca = marca;
    }
     public void setColor(String color) {
        this.color = color;
    }

     public void setPlaca(String placa) {
        this.placa = placa;
    }

 public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

     public void setEstado(String estado) {
        this.estado = estado;
    }
     public void setPais(String pais) {
        this.pais = pais;
    }
    public String getMarca() {
        return (this.marca);
    }

     public String getColor() {
        return (this.color);
    }

      public String getPlaca() {
        return (this.placa);
    }
      public String getPropietario() {
        return (this.propietario);
    }
      public String getEstado() {
        return (this.estado);
    }
      public String getPais() {
        return (this.pais);
    }

   
    


    public void reset(ActionMapping mapping,
                      HttpServletRequest request) {
        marca=null;
        color=null;
        placa=null;
        propietario=null;
        estado=null;
        pais=null;
    }


    public ActionErrors validate(ActionMapping mapping,
                                 HttpServletRequest request) {

        // Ejecuta las validaciones proporcionadas por Struts-Validator
        ActionErrors errores = super.validate(mapping, request);

        // Validaciones no cubiertas por Struts-Validator

        return errores;

    }

}
