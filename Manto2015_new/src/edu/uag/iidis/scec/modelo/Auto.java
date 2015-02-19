package edu.uag.iidis.scec.modelo;

import java.io.Serializable;
import java.util.*;


/**
 * Esta clase es usada para representar un rol de un
 * usuario. 
 *
 * <p><a href="Auto.java.html"><i>Ver código fuente</i></a></p>
 *
 * @author <a href="mailto:vramos@uag.mx">Victor Ramos</a>
 * @version 1.0
 */
public class Auto extends ClaseBase 
        implements Serializable {

    private Long id;
    private String marca; 
    private String modelo; 
    private String color; 
    private String placa; 
    private String estado; 
    private String pais;

    private List usuarios = new ArrayList();

    public Auto() {
    }

    public Auto(Long id){
        this.id = id;
    }

    public Auto(String marca, String modelo,String color,String placa,String estado,String pais){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.placa = placa;
        this.estado = estado;
        this.pais = pais;
    }

    /**
     * Regresa el id del rol.
     * @return Long
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Establece el id del rol.
     * @return void
     */

    public void setMarca(String marca)
    {
    	this.marca = marca;

    }
    public String getMarca(){

    	return this.marca;
    }
    public void setModelo(String modelo){
    	this.modelo = modelo;

    }
    public String getModelo(){

    	return this.modelo;
    }
    public void setColor(String color){

    	this.color = color;

    }

    public String getColor(){
    	return this.color;
    }

    public void setPlaca(String placa){
    	this.placa = placa;
    }
    public String getPlaca(){

    return this.placa;

    }

    public void setEstado(String estado){
    	this.estado = estado;

    }

    public String getEstado(){

    	return this.estado;
    }

    public void setPais(String pais){
    	this.pais = pais;

    }

    public String getPais(){
    	return this.pais;
    }

    

}
