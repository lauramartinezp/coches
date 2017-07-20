
public class Utiles {

	public static void main(String[] args) {

			String prueba = "Esto es una prueba";
			String mayuprueba = prueba.toUpperCase();
			boolean empiezaESTO = mayuprueba.startsWith("ESTO");
			if(empiezaESTO == true) {
				System.out.println(mayuprueba);
			}else{
				System.out.println("Error");
			}
		
		System.out.println("*************************************************************************************************************************");
		
			String cadena ="La clase String, tiene varios métodos, muy útiles, como saber su longitud, trocear la cadena,etc";
			String[] separado = cadena.split(",");
			
			for (int i =0; i<separado.length; i++) {
			System.out.println(separado[i]);
			}
			
			
		System.out.println("*************************************************************************************************************************");
			
			String caracter1="Mi hija mejor tiene 10 años y su padre tiene 45";
			String caracter2="En este texto no voy a poner ningun digito";
			String caracter3="En este texto no voy a usar el numero 10 que no es mayor del 15 y ninguno de ellos mayor del numero esperado";
	
			
			String[] salida = caracter1.split(" ");
			
			
			
			
		System.out.println("*************************************************************************************************************************");
			
		
	
	
	
	
	}

}
