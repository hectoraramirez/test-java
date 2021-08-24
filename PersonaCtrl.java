package com.java.test;

import java.util.Scanner;

public class PersonaCtrl {
	
	public static String calcularIMC(String sexo, Double weigth) {
		String message = ""; 
		switch (sexo) {
		case "H":
			if ( weigth < 20) {
				message = "Falta de peso";
			}
			
			if ( weigth > 20 && weigth < 25) {
				message = "Peso normal";
			}
			
			if ( weigth > 25) {
				message = "Sobrepeso";
			}
			
			break;

		case "M":
			if ( weigth < 19) {
				message = "Falta de peso";
			}
			
			if ( weigth > 19 && weigth < 24) {
				message = "Peso normal";
			}
			
			if ( weigth > 24) {
				message = "Sobrepeso";
			}
			
			break;


		default:
			break;
		}
		
		return message;
		
	}
	
	
	public static boolean esMayorEdad(int edad) {
		return edad > 18;
	}
	
	
	static boolean comprobarSexo(String sexo) {
		if (sexo.equals("H") || sexo.equals("M")) {
			return true;
		} else {
			return false;
		}
		
	}
	
	static String generarNSS() {
		String format = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"+"0123456789";
		StringBuilder nss = new StringBuilder(8);
		
		for (int i = 0; i < 8; i++) {
			int myIndex = (int)(format.length()*Math.random());
			nss.append(format.charAt(myIndex));
		}
		
		return nss.toString();
	}
	
	public static void main(String[] args) {
		
		String nombre = "";
		int edad = 0;
		String sexo = "H";
		Double weigth = 0.0;
		Double tall = 0.0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese su nombre completo");
		nombre = entrada.nextLine();
		
		System.out.println("Ingrese su Sexo: H = HOMBRE M = MUJER");
        sexo = entrada.nextLine();
        if (comprobarSexo(sexo)) {
        	System.out.println("Ingrese su peso");
            weigth = entrada.nextDouble();
            
            System.out.println("Ingrese su edad");
            edad = entrada.nextInt();
            
            System.out.println("Ingrese su tall");
            tall = entrada.nextDouble();
            
            if (esMayorEdad(edad)) {
            	Persona persona = new Persona(nombre, edad, generarNSS(), sexo, weigth, tall);
        		System.out.println(calcularIMC(sexo, weigth));
        		System.out.println(persona.toString());
            } else {
            	System.out.println("Usted no es mayor de edad y no podemos darle esta informaciónH");
            }
            
            
        }
	}
}
