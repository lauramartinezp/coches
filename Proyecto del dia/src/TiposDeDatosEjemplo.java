
public class TiposDeDatosEjemplo {
	
	final static String SEPARADOR="**************************************************************";

	public static void main(String[] args) {

		boolean result = true;
		char letraC = 'C';
		byte b = 100;
		short s = 10000;
		int i = 100000;
		double f = 10.65;
		float f1 = 10.6f;
		
		System.out.println(f);
		
		System.out.println(SEPARADOR);
		
		System.out.println( result==false);
		System.out.println(f>=10);
		System.out.println(f!=10.65);
		
		System.out.println(true&&result);
		System.out.println(true||result);
		
		System.out.println(SEPARADOR);
		
		//Array
		
		int[] arrayEnteros = new int[10];
		arrayEnteros[0]=0;
		arrayEnteros[1]=1;
		arrayEnteros[2]=2;
		arrayEnteros[3]=3;
		arrayEnteros[4]=4;
		arrayEnteros[5]=5;
		arrayEnteros[6]=6;
		arrayEnteros[7]=7;
		arrayEnteros[8]=8;
		arrayEnteros[9]=9;
		//arrayEnteros[10]=10;
		
		System.out.println(arrayEnteros.length);
		
		System.out.println(SEPARADOR);
		
		Client[] clientes =new Client[3];
		
		clientes[0]= cliente1;
		clientes[1]= cliente1;
		clientes[2]= cliente2;
		
		for (int j =0; j < clientes.length; j++) {
			System.out.println(clientes[j].getName());
		}
		
		//autoboxing
		
		int entero1=12;
		Integer entero2= new Integer(12);
		
		
	}

}
