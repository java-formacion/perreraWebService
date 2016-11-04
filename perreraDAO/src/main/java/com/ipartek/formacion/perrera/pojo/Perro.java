package com.ipartek.formacion.perrera.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity()
@Table(name = "perro")
/**
 * POJO de la clase Perro de perreraWebService
 * 
 * @author EkaitzAF
 *
 */
public class Perro {

	@Id()
	@GeneratedValue()
	/**
	 * clave y se genera automaticamente
	 */
	private long id;

	/**
	 * Persistente, un tipo basico (string)
	 */
	@Basic()
	@Column(name = "nombre")
	private String nombre;

	/**
	 * Persistente, un tipo basico (string)
	 */
	@Basic()
	@Column(name = "raza")
	private String raza;

	/**
	 * constructor usando parametros
	 * 
	 * @param nombre
	 *            nombre del perro
	 * @param raza
	 *            raza del perro
	 */
	public Perro(final String nombre, final String raza) {
		super();
		this.nombre = nombre;
		this.raza = raza;
	}

	/**
	 * constructor por defecto
	 */
	public Perro() {
		super();
		this.nombre = "";
		this.raza = "";
	}

	/**
	 * devuelve el id del perro
	 * 
	 * @return id
	 */
	public long getId() {
		return this.id;
	}

	/**
	 * introduce un id
	 * 
	 * @param id
	 */
	public void setId(final long id) {
		this.id = id;
	}

	/**
	 * devuelve el nombre del perro
	 * 
	 * @return nombre
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * introduce un nombre
	 * 
	 * @param nombre
	 */
	public void setNombre(final String nombre) {
		this.nombre = nombre;
	}

	/**
	 * devuelve la raza del perro
	 * 
	 * @return raza
	 */
	public String getRaza() {
		return this.raza;
	}

	/**
	 * introduce una raza
	 * 
	 * @param raza
	 */
	public void setRaza(final String raza) {
		this.raza = raza;
	}

	/**
	 * Si id = 0 es nuevo perro que no se ha persistido en una BBDD, cualquier
	 * id superior a 0 es perro persistido
	 * 
	 * @return boolean
	 */
	public boolean isNew() {
		return this.id > 0 ? true : false;
	}

	@Override()
	/**
	 * funcion toString con los campos
	 */
	public String toString() {
		return "Perro [nombre=" + this.nombre + ", raza=" + this.raza + "]";
	}

}
