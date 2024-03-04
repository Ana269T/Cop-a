package com.example.demo.model;

import jakarta.persistence.*;


@Entity
@Table(name = "Persona")
public class Persona {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 
	 @Column(name = "nombres")
	 private String nombres;

	 @Column(name = "apellidos")
	 private String apellidos;
    
    @Column(name = "cedula")
	 private String cedula;

	 @Column(name = "correo")
	 private String correo;
	
    @Column(name = "telefono")
	 private String telefono;

	public Persona() {
		super();
	}

	public Persona(Long id, String nombres, String apellidos, String cedula, String correo, String telefono) {
		super();
		this.id = id;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.cedula = cedula;
		this.correo = correo;
		this.telefono = telefono;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	} 
    
    
}
