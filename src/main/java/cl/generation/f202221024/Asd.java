package cl.generation.f202221024;

import java.util.Arrays;

public class Asd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		
		System.out.println("**********");
		
		int[] arreglosssnew int [3];
		int pares = 0;
		//impares
		for (int = 0; i < numa10.length; i++) {}
		
		
		
		
		System.out.println("**********");
		
		float sumanumeros = 0;
		for(int i = 0; i < numa10.length;i++)
		{
			sumanumeros = sumanumeros + numa10[i];
		}
		System.out.println(sumanumeros/10);
		
		
		
	}

}
