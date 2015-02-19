package edu.uag.iidis.scec.modelo;

import java.io.Serializable;
import java.util.*;


/**
 * Esta clase es usada para representar un rol de un
 * usuario. 
 *
 * <p><a href="Personas.java.html"><i>Ver código fuente</i></a></p>
 *
 * @author <a href="mailto:vramos@uag.mx">Victor Ramos</a>
 * @version 1.0
 */
public class Personas extends ClaseBase 
        implements Serializable {

    private String name;
    private String apellido;
    private String direccion;
	private String ciundadnacimiento;
	private int numero;

    public Personas() {
    }

    public Personas(String name){
        this.name = name;
    }

    public Personas(String name, String apellido, String direccion, int numero, String ciundadnacimiento){
        this.name=name;
        this.apellido=apellido;
		this.direccion=direccion;
		this.numero=numero;
		this.ciundadnacimiento=ciundadnacimiento;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
	public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
	
	public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
	
	public String getCiudadNacimiento() {
        return this.ciundadnacimiento;
    }

    public void setCiudadNacimiento(String ciundadnacimiento) {
        this.ciundadnacimiento = ciundadnacimiento;
    }

}
