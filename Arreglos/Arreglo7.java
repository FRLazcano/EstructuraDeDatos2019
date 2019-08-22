import javax.swing.JOptionPane;

public class Arreglo7
{
    private String nombre;
    private String nombres[];
    private String nombres2[];


    private void obtenerDatos()
    {
        String strN;

        for(int i=0; i<nombres.length; i++)
            nombres[i] = JOptionPane.showInputDialog("Casilla["+i+"] =");
    }

    private void desplegarDatos(String arreglo[])
    {
        String valores="Contenido del Arreglo:\n";

        for(int i=0; i<arreglo.length; i++)
            valores = valores + "Casilla["+i+"] = "+arreglo[i]+"\n";

        JOptionPane.showMessageDialog(null,valores);
    }

    private void intercambiarDatos()
    {
        int j=nombres.length - 1;

        for(int i=0; i<nombres.length; i++)
        {
            nombres2[i] = nombres[j];
            j--;
        }
    }


    private void principal(String[] args)
    {
        // 1. Obtener el no. de casillas del arreglo
        int numero = Integer.parseInt(args[0]);

        // 2. Crear el arreglo en RAM
        nombres   = new String[numero];
        nombres2 = new String[numero];

        // 3. Obtener datos y asignarlos al arreglo
        obtenerDatos();

        // 4. Desplegar los datos del arreglo
        desplegarDatos(nombres);

        // 5. Intercambiar datos de un arreglo 1 a un arreglo 2
        intercambiarDatos();

        // 6. Desplegar los datos del arreglo
        desplegarDatos(nombres2);
    }

    public static void main(String args[])
    {
        Arreglo7 objeto = new Arreglo7();

        objeto.principal(args);
    }
}
