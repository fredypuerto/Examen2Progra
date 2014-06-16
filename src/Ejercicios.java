



public class Ejercicios
{	
	//devuelve true si numero es multiplo de 3, de lo contrario devuelve false
	//2 puntos
	static boolean esMultiploDeTres(int num)
		{
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
		 if ((a < b) && (a < c)) 
		 { 
	      return a;
		 }

	     if ((b < a) && (b < c)) 
	     {
	    	 return b;
	     }

	      if ((c < a) && (c < b))
	      { 
	       return c;
	      }
	}     

	 return resultado;          
}       

	
	//devuelve el promedio los elementos de un arreglo
	//5 puntos
	
	int getPromedio(int arreglo[])
	{
	int resultado = 0; 
	int cantidad_numeros = 0;
	for(int i=0; i<arreglo.length; i++) 
	{ 
	resultado += arreglo[i]; 
	cantidad_numeros ++; 
	} 

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
			
			int resultado;
			
			if (num == 0)
			{
				resultado = 0;
			}else
			{ resultado = num + funcionRecursiva(num -1);
			}
			return resultado;
			}


		public static void main(String args[])
		{
		}
	}
