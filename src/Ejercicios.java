



public class Ejercicios
{	
	//devuelve true si numero es multiplo de 3, de lo contrario devuelve false
	//2 puntos
	static boolean esMultiploDeTres(int num)
		{
			//aqui se verifica si el numero es  multiplo de 3 y si lo es retorna true si no retorna false
			if ((num % 3)==0)
			return true;
			{			
			return false;
			}
		}
	//devuel
	static int getMenor(int a, int b, int c){
		int resultado=0;
	
	{
		//si a es meno que b y a menor que c va retronar a
		 if ((a < b) && (a < c)) 
		 { 
	      return a;
		 }
//si b es menor que a y b menor que c va a retornar b
	     if ((b < a) && (b < c)) 
	     {
	    	 return b;
	     }
//si c es menor que a y menor que b va a retornar c
	      if ((c < a) && (c < b))
	      { 
	       return c;
	      }
	}     
//si esto se cumple va a retornar el resultado
	 return resultado;          
}       

	
	//devuelve el promedio los elementos de un arreglo
	//5 puntos
	
	int getPromedio(int arreglo[])
	{
		//introducimos el arreglo
	int resultado = 0; 
	int cantidad_numeros = 0;
	for(int i=0; i<arreglo.length; i++) 
	{ 
	resultado += arreglo[i]; 
	cantidad_numeros ++; 
	} 
//el rsultado es el promedio de los numeros ingresdos 
	resultado = (resultado / cantidad_numeros); 
	return resultado; 
	} 

	//Realizar una funcion con las siguientes indicaciones:
	//Si el parametro recibido es "Honduras" devolvera "Tegucigalpa"
	//Si el parametro recibido es "Francia" devolvera "Paris"
	//Si el parametro recibido es "Inglaterra" devolvera "Londres"
	static String getCapital(String pais)
	{
		
	
		return "";
	}
	
	//realizarla siguiente funcion recurisva:
	
	/* Pseudocodigo*/
	//funcionRecursiva(num)
	//  si num == 0
	//    devolver 0
	//  fin si
	//  devolver num + funcionRecursiva(num-1)
	
	/*Notacion matematica*/
	//funcionRecusriva(num) = num + funcionRecursiva(num-1)
	//Donde funcionRecursiva(0) = 0
	
	//1 punto oro extra
		static int funcionRecursiva(int num)
		{
			//introducimos un mumero
			int resultado;
			
			if (num == 0)
			{
				resultado = 0;
			}else
			//aqui retorna el resultado la funcion recursiva
			{ resultado = num + funcionRecursiva(num -1);
			}
			return resultado;
			}


		public static void main(String args[])
		{
		}
	}
