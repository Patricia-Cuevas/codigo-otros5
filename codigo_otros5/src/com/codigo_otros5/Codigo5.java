package com.codigo_otros5;

import java.util.Scanner; // se importa el Scanner

public class Codigo5 {
	 public static void main(String[] args) { //se crea instancia de main que faltaba

	    Scanner s = new Scanner(System.in); // se agrega system.in al scanner
	    System.out.println("Introduzca un número: ");// agregar print line y cerrar bien las ""
	    String ni = s.nextLine();
	    int c = Integer.parseInt(ni); //se parsea el ni
	    
	    int afo = 0;
	    int noAfo = 0;
	    
	    while (c > 0) { // aquí se cambia a c en vez de ni porque es el valor que queremos obtener
		  int digito = (int)(c % 10); // se cambia a c 
	      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
			afo++;
	      } else {
			noAfo++;
		  
		  c /= 10; //se cambia a c 
	    }
	    if (afo > noAfo) {
	      System.out.println("El " + c + " es un número afortunado.");//se agrega "t" en "prin"
	    } else {
	      System.out.println("El " + c + " no es un número afortunado.");
	    }
	    
	  }
	  
	}

}
