package com.generation.clase1602;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Clase1602Application {

	/* Condicionales en JS
	 * if(condicion){
	 * se ejecuta aquí si se cumple la condicion
	 * }else if(condicion) {
	 * si no se cumple la de arriba pero la de aquí, entra aquí
	 * }else{
	 * si no cumplen ninguna de las condiciones anteriores, se realiza esta opción
	 * }
	 * Esto se escribe y funciona exactamente igual en JAVA 
	 */

	 /*Cuales son los ciclos que conocemos
		For, while, do...while
	  * for en JS
		for(let i = 0; condición; i++){
			mientras la condición sea verdad, esto se va a ejecutar :D
		}
		while en JS
		while(condición){
			mientras la condición sea verdad, esto se va a ejecutar :D
		}

		do{
			entra al menos una vez y luego comprueba la condición y si es verdadera vuelve a iterar :D
		}while(condición);
		-------------------------------
		los while se ecriben exactamente igual en JV, pero el for cambia LEVEMENTE

		for(int i = 0; condición; i++){
			mientras la condición sea verdad, esto se va a ejecutar :D
		}

	  */

	  /* Como se escribian en JS
	   * const nomArray = [];
	   * Array en JAVA
	   * Paso1: importar librería de array (import java.util.ArrayList;)
	   * primero definimos el tipo de dato (arraylist)
	   * luego definimos el tipo de dato QUE VA A CONTENER el arraylist
	   * luego se le entrega el nombre y se inicializa con el new
	   * ArrayList <String> nomArrayString = new ArrayList<String>();
	   * ArrayList <Integer> nomArrayInt = new ArrayList<Integer>();
	   * Este es un ejemplo de ArrayList<String>
	   * ["string1", "string2", "string3"]
	   * ["string2", 2, "otro string"] -> esto está malo, porque tiene un valor int 
	   * Este es un ejemplo de ArrayList<Integer>
	   * [1, 2, 4, 14]
	   * [1, 3, 4.4, 7]-> esto está malo, porque tiene un valor Double
	   * dentro de un array de Strings
	   * Funcionalidades de los ArrayList
	   * 
	   * Para agregar datos a un arraylist 
	   * es el simil de push
	   * nomArrayString.add("palabra");
	   * 
	   * Para obtener el valor que existe en un indice predeterminado
	   * nomArrayString.get(0); (donde 0 es el indice que yo voy a buscar)
	   * 
	   * Para cambiar un dato en específico según si indice 
	   * nomArrayString.set(0, "newString1"); (donde 0 es el indice que yo voy a 
	   * cambiar y "newString1" será la nueva palabra)
	   * 
	   * Para remover o eliminar un dato según su indice
	   * nomArrayString.remove(0); Donde 0 es el indice
	   * 
	   * Para limpiar un arraylist COMPLETO, BORRA TODOO
	   * nomArrayString.clear();
	   * 
	   * Para obtener la cantidad de datos que tiene un arraylist
	   * nomArrayString.size();
	   * 
	   */

	   /*HashMap
		* Para poder ocupar HashMap debemos primero importar si librería
		(import java.util.HashMap;)
		Para poder definir un HashMap, se hace de la siguente forma
		HashMap <String, Double> nomHashMap = new HashMap<String, Double>();
		ejemplo de como se vería en consola :D
		[
			{"Pamela": 4.0},
			{"Fabian": 6.8},
			{"Diego": 6.5}
		]

		Como ingresamos datos al hashMap
		nomHashMap.put("Danissa", 6.2);
		nomHashMap.put("Camila", 6.3);

		como obtener datos segun la llave
		nomHashMap.get("Fabian")
		//Devuelve->6.8

		Como podemos remover datos segun una llave
		nomHashMap.remove("Pamela");

		Como limpiar todos los valores de un HashMap
		nomHashMap.clear();

		Como obtengo el valor total de los datos que tengo en un HashMap
		nomHashMap.size();

		Como iterar un hashmap obteniendo la llave y el valor
		Manda el tipo de dato de la llave
		for(String i : nomHashMap.keySet()){
			System.out.println("Key: "+ i + " Valor: "+ nomHashMap.get(i));
		}

	    */

	public static void main(String[] args) {
		
		
	}

}
