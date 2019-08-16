import javax.swing.JOptionPane;

public class Arreglo5
{

	private int numero;
	private int numeros[];
	private int numeros2[];

	private void obtenerDatos()
	{

		String strN;

		for(int i=0; i<numeros.length; i++)
			{
				strN= JOptionPane.showInputDialog("Casilla ["+i+"] = ");
				numero = Integer.parseInt(strN);
				numeros[i] = numero;
			}
	}

	private void desplegarDatos(int arreglo[])
	{
		String valores="Contenido del arreglo: \n";
		for(int i=0; i<arreglo.length; i++)
			valores = valores + "Casilla ["+i+"] = "+arreglo[i]+"\n";

		JOptionPane.showMessageDialog(null,valores);
	}

	private void intercambiarDatosrev()
	{
		int j=numeros.length - 1;
		for(int i=0; i<numeros.length; i++)
		{
			numeros2[i] = numeros[j];
			j--;
		}
	}

	private boolean ordenar(int arreglo[]){
		if()
	}

	private void ordenar(int arreglo[])
	{
		int t;
		while(ordenado(arreglo)){
			for(int i=0; i<arreglo; i++){

			}
		}
	}

	private void principal()
	{
		System.out.println("01368358");

		//1. Obtener Casillas del arreglo
		String strN = JOptionPane.showInputDialog("No. de casillas del Arreglo = ");
		numero = Integer.parseInt(strN);

		//2. Crear el arreglo en Ram

		numeros = new int[numero];
		numeros2 = new int[numero];

		//3. Obtener datos y asignarlos

		obtenerDatos();

		//4. Desplegar datos del arreglo
		desplegarDatos(numeros);

		//5. Intercambiar datos de un arreglo 1 a un arreglo 2 al reves
		intercambiarDatosrev();

		//6. Desplegar datos
		desplegarDatos(numeros2);

		//7. Ordenar el arreglo 1 o el arreglo 2
		ordenar(numeros);

		//8. Desplegar los datos del arreglo elegido
		desplegarDatos(numeros);
	}

	public static void main(String args[])
	{
		Arreglo5 objeto = new Arreglo5();

		objeto.principal();
	}
}
