package cl.generation.f202221024;

import java.io.ByteArrayInputStream;
import java.util.Arrays;

public class Arreglos {

	public static void main(String[] args) {
		/*Arreglo en Java
		son estáticos en su tamaño, no cambian*/
		int[] arreglo = new int [3]; //al definir el tipo de dato al inicio de un array, este se vuelve restrintivo. también establecemos su tamaño máximo.
		// arreglo.length; tamaño del arreglo
		
		//agregar datos
		arreglo[0] = 4;
		arreglo[1] = 10;
		arreglo[2] = 29;
		//arreglo[3] = 24; Error fuera de indice
		System.out.println(arreglo.toString()); //solo estamos conviertiendo a string el espacio de memoria
		System.out.println(Arrays.toString(arreglo));
		System.out.println(arreglo[0]);
		
		//{}
		
		int[] sinNum = {};
		System.out.println(sinNum.length); //el resultado del arreglo será 0 ya que el tamaño es 0.
		// sinNum[0] = 78; para un arreglo vacío no se puede integrar. fuera de indice
		System.out.println(Arrays.toString(sinNum));
		
		
		String [] vocales = {"a", "e", "i", "o", "u",};
		
		System.out.println("Cantidad de elementos: " +vocales.length);
		vocales[1]= "o";
		vocales[3]= "e";
		vocales[2]= "y";
		System.out.println(Arrays.toString(vocales));
		
		
		System.out.println("*************");
		//crear un array de numeros flotantes de tamaño 6
		float [] flotantes = new float [6];
		// agregar 6 elementos al arreglo
		flotantes[0] = 33;
		
		int[] numeroInt = new int [2];
		numeroInt[0] = (int) 0.9;
		System.out.println(numeroInt[0]);
		
		
		//crear arreglo de enteros tamaño 100 y agregar valores dinamicamente, desde el 1 al 100
		
		int [] array1to100 = new int[100];
		for (int i = 0; i < array1to100.length; i++) {
			array1to100[i] = i + 1;
			}
		System.out.println(Arrays.toString(array1to100));
		
	
	
		int[] array100to1 = new int [100]; 
		for (int i = 99; i >= 0; i--) {
			array100to1[99 - i]= i + 1;
		}
		
		System.out.println(Arrays.toString(array100to1));
		
		
		int[] arreglo100a1 = new int[100];
		//{100,99,98,97...0}
		for(int i =arreglo100a1.length; i>0  ;i-- ) {
			arreglo100a1[arreglo100a1.length - i] = i;
		}
		
		System.out.println(Arrays.toString(arreglo100a1));

		//ejercicio 1
		int[] numa10 = {-3,-5, 4,12, 3,35, -35,77,-1, 0};
		int maxNuma10 = 0;
		int minNuma10 = 0;
		for (int i=0; i>=numa10.length; i++ ) {
			numa10[i]=i;
		}
		for (int i=0; i<numa10.length; i++ ) {
			if (maxNuma10 < numa10[i]) {
				maxNuma10 = numa10[i];
			}else if(minNuma10 > numa10[i]){
				minNuma10 =numa10[i];
			}
		}
		System.out.println(Arrays.toString(numa10));
		System.out.println(maxNuma10);
		System.out.println(minNuma10);
		
		//ejercicio 2
		
		int[] impares = new int [numa10.length];
		int[] pares = new int [numa10.length];
		for(int i = 0;i < numa10.length;i++)
		{
			if(numa10[i] % 2 == 0)
			{
				pares[i] = numa10[i];
			}
			else
			{
				impares[i] = numa10[i];
			}
		}
		System.out.println(Arrays.toString(pares));
		System.out.println(Arrays.toString(impares));
		
			
		
		
		
		
	
				
				
		

		

		}
		
	}


