package cl.generation.f202221024;

public class Ejercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//primer sistema sólo entre variables primitivas
		// de int a long
		int valor1 = 4224949;
		long nuevovalor1 = (long)valor1;
		System.out.println(valor1);
		System.out.println(nuevovalor1);
		
		// de long a float
		float nuevovalor2 = (float)nuevovalor1;
		System.out.println(nuevovalor2);
		
		// de float a double
		
		double nuevovalor3 = (double)nuevovalor2;
		System.out.println(nuevovalor3);
		
	
		
		
		// sistema alternativo 
		
		System.out.println("*****************");
		
		Integer numero3= 20;
		Long numero4 = 12312312312L;
		Float numero5 = (float) 435342432;
		Double numero6 = 1231231243223D;
		
		System.out.println(numero3.longValue());
		System.out.println(numero3.floatValue());
		System.out.println(numero3.doubleValue());
		System.out.println(numero5.intValue());
		System.out.println(numero5.longValue());
		System.out.println(numero5.floatValue());
		System.out.println(numero5.doubleValue());
		System.out.println(numero5.doubleValue());
		 
		
		// otro sistema
		System.out.println("*****************");
		
		int a = 693;
		float b = (float)a;
		double c = (long)b;
		Integer d = 58;
		
		System.out.println(a+ " "+b+ " "+c);
		System.out.println(d.longValue());
		System.out.println(d.valueOf(a));
		
		// another one de variables primitivas a objeto
		
		System.out.println("*****************");
		
		int num3 = 20;
		long num4 = 12312312312l;
		float num5= 435342432f;
		double num6 = 1231231243223d;
		
		System.out.println(Integer.valueOf(num3).longValue());
		System.out.println(Integer.valueOf(num3).floatValue());
		System.out.println(Integer.valueOf(num3).doubleValue());
		System.out.println(Long.valueOf(num4).intValue());
		System.out.println(Long.valueOf(num4).floatValue());
		System.out.println(Long.valueOf(num4).doubleValue());
		System.out.println(Float.valueOf(num5).doubleValue());
		
		
	}

}
