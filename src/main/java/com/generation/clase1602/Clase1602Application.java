package com.generation.clase1602;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

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
			System.out.print("Key: "+ i + " Valor: "+ nomHashMap.get(i));
		}

	    */

		/*funciones del ejercicios colaborativo */
		/*funcion para sacar el promedio */
		public static Double promedioNotas(ArrayList<Double> notas){
			Double suma = 0.0;
			for (int i = 0; i < notas.size(); i++) {
				//suma = suma + notas.get(i) -> es lo mismo :D
				suma += notas.get(i);
			}
			return suma/notas.size();
		}
		/*funcion que verifica si el promedio del alumno está aprobado o reprobado */

		public static Boolean aprobado(ArrayList<Double> notas, Double notaAprobatoria){
			Double promedio = promedioNotas(notas);
			if(promedio >= notaAprobatoria){
				return true;
			}else{
				return false; 
			}
		}

		/*funcion que verifica si el promedio del alumno es mayor al promedio general */
		public static void sobrePromedio(Double promedioGeneral, ArrayList<Double> notas, String nombreAlum){
			Double promedioAlumno = promedioNotas(notas);
			if(promedioAlumno>promedioGeneral){
				System.out.println("El alumno "+nombreAlum+" está sobre el promedio");
			}else if(promedioAlumno == promedioGeneral){
				System.out.println("El alumno "+nombreAlum+" es igual al promedio general");
			}else{
				System.out.println("El alumno "+nombreAlum+" está bajo el promedio");
			}
		}



	public static void main(String[] args) {

	/* vamos a pedir al usuario que ingrese la cantidad de alumnos
	 * a los cuales les asignará una nota
	 * luego de que ingrese la cantidad de alumno y la cantidad de notas por alumnos
	 * se le mostrará un menú.
	 * opciones del menú: 
	 * mostrar el promedio de notas
	 * mostrar si la nota es aprobatria y reprobatoria
	 * mostrar si la nota está por sobre o por debajo del promedio del curso
	 */

	 /* solicitar al usuario la cantidad de alumnos*
	 *Solicitar el nombre de cada alumnos*
	 *solicitar la cantidad de notas de por alumno*
	  *ingresar notas por alumno*
	  *definir la nota aprobatoria*
	  *sacar el promedio por alumnos y general 
	  *verificar si el promedio del alumnos esta por sobre o 
	  por debajo del promedio general
	  *verificar si la nota aprueba o reprueba
	  *hacer el menú con solo 3 opciones con cero finalizando el menú
	  *hacer validaciones sobre las notas y la cantidad de alumnos
	  *verificar que el promedio se calcule previamente antes de las 
	  operaciones que lo requieren
	  */
		
		Scanner teclado = new Scanner(System.in);
		String nomAlum = "";
		Double notaAprobatoria = 4.0;
		HashMap <String, ArrayList<Double>> libroClase = new HashMap<String, ArrayList<Double>>();
		  
		//Se declara fuera del do...while ya que si la declaramos adentro
		//la variable pasa a ser local por ende no podríamos ocuparla fuera de este
		int cantAlum;
		int cantNotas;
		do{
			System.out.print("Indique la cantidad de alumnos que va a ingresar: ");
			cantAlum = teclado.nextInt();
			if(cantAlum <= 0){
				System.out.print("La cantidad de alumnos debe ser mayor a cero, porfavor intente denuevo");
			}

		}while(cantAlum <= 0);

		do{
			System.out.print("Indique la cantidad de notas por alumnos: ");
			cantNotas = teclado.nextInt();
			if(cantNotas <= 0){
				System.out.print("La cantidad de notas debe ser mayor a cero, por favor entente mas tarde");
			}
		}while(cantNotas <= 0);
		
		
		for(int i = 1; i <= cantAlum; i++){
			teclado.nextLine();
			ArrayList <Double> notasAlumnos = new ArrayList<Double>();
			System.out.print("Ingresa nombre del alumno: ");
			nomAlum = teclado.nextLine();
			for(int x = 1; x <= cantNotas; x++){
				System.out.print("Ingresa nota " +x+ " del alumno "+ nomAlum +": ");
				Double nota = teclado.nextDouble();
				notasAlumnos.add(nota);
			}
			libroClase.put(nomAlum, notasAlumnos);
			//desafio, verificar donde deberia o como deberia limpíar el arreglo para que funcione
			//con la declaración de manera global
			//notasAlumnos.clear();
		}
		
		// for(String i : libroClase.keySet()){
		// 	System.out.println("key: "+ i +" Valor:" + libroClase.get(i));
		// }
		int opcion = 1; 

		while(opcion != 0){

			do{
				System.out.println("**************Comienzo de Menú***************");
				System.out.println("Bienvenido/a");
				System.out.println("Seleccione 1 si quiere obtener el promedio de las notas por alumno.");
				System.out.println("Seleccione 2 si quiere ver si el alumno aprueba o reprueba");
				System.out.println("Seleccione 3 para ver si la nota está sobre o por debajo del promedio general");
				System.out.println("Seleccione 0 para salir del menú");
				System.out.print("Seleccione su opción: ");
				opcion = teclado.nextInt();
				
			}while(opcion < 0 || opcion > 3);

			if(opcion == 1){
				for(String i : libroClase.keySet()){
					//cada vez que ocupemos un for opara hashmap
					//el valor de la llave (en este caso el array)
					//está contenido dentro de la sintaxis nomHasmap.get(i)
					Double promAlum = promedioNotas(libroClase.get(i));
					System.out.println("El promedio del alumno: "+ i +" es de: " + promAlum);
				}
			}else if (opcion == 2){
				for(String i : libroClase.keySet()){
					Boolean aprobar = aprobado(libroClase.get(i), notaAprobatoria);
					//es lo mismo que poner if (aprobar == true)
					if(aprobar){
						System.out.println("El alumno/a "+i+" está aprobado");
					}else{
						System.out.println("El alumno/a "+i+" está reprobado");
					}
					
				}
			}else if(opcion == 3){
				Double sumaPromedio = 0.0;
				for(String i : libroClase.keySet()){
					sumaPromedio = sumaPromedio + promedioNotas(libroClase.get(i));
					
				}
				Double promedioGeneral = sumaPromedio / cantAlum;
				for(String i : libroClase.keySet()){
					sobrePromedio(promedioGeneral, libroClase.get(i), i);
				}
			}else{
				System.out.println("Gracias por cerrar el menú, hasta pronto :D");
			}

		}

		

		
	}

}
