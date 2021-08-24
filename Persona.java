package com.java.test;

public class Persona {
	
	private String nombre;
	private int edad;
	private String nss;
	private String sexo;
	private Double weigth;
	private Double length;
	
	public Persona() {
		
	}

	public Persona(String nombre, int edad, String nss, String sexo, Double weigth, Double length) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.nss = nss;
		this.sexo = sexo;
		this.weigth = weigth;
		this.length = length;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNss() {
		return nss;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Double getWeigth() {
		return weigth;
	}

	public void setWeigth(Double weigth) {
		this.weigth = weigth;
	}

	public Double getLength() {
		return length;
	}

	public void setLength(Double length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", nss=" + nss + ", sexo=" + sexo + ", weigth=" + weigth
				+ ", length=" + length + "]";
	}
	
	
}
