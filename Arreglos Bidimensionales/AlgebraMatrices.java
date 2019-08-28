import javax.swing.JOptionPane;

public class AlgebraMatrices
{

  private int matrizA[][];
  private int matrizB[][];
  private int matrizC[][];
  private int renglones, columnas;
  private String suma;
  private String multi;

  public int[][] newMatriz(String s){
    String str="Introduzca los renglones de "+s;
    int renglones=Integer.parseInt(JOptionPane.showInputDialog(str));
    str="Introduzca las columnas de "+s;
    int columnas=Integer.parseInt(JOptionPane.showInputDialog(str));
    int[][] matriz=new int[renglones][columnas];
    return matriz;
  }

  public void setMatriz(int[][] matriz, String str){

    String s=" ";
    int renglones=matriz.length;
    int columnas=matriz[0].length;

    for(int i=0; i<renglones; i++){
      for(int j=0; j<columnas; j++){
        s="Introduzca el valor de "+str+" en ["+i+"]["+j+"]";
        matriz[i][j]  =Integer.parseInt(JOptionPane.showInputDialog(s));
      }
    }
  }

  public void showData(int[][] matriz, String str){
    String s="Los valores de "+str+" son: \n";
    int renglones=matriz.length;
    int columnas=matriz[0].length;

    for(int i=0; i<renglones; i++){
      for(int j=0; j<columnas; j++){
        s+=" ["+i+"]["+j+"]="+matriz[i][j]+"  ";
      }
      s+="\n";
    }
    JOptionPane.showMessageDialog(null,s);
  }

  public void multi(){

    this.matrizA=newMatriz("A");
    this.matrizB=new int[matrizA[0].length][matrizA.length];

    this.setMatriz(matrizA, "A");
    this.setMatriz(matrizB, "B");

    this.matrizC=new int[matrizA.length][matrizA.length];
    System.out.println(matrizC.length);

    int renglones=matrizC.length;
    int columnas=matrizC[0].length;

    for(int i=0; i<renglones; i++){
      for(int j=0; j<columnas; j++){

      }
    }

    this.showData(matrizA,"A");
    this.showData(matrizB,"B");
    this.showData(matrizC,"C");
  }

  private void obtenerDatos(String str, int matriz[][], int r, int c)
  {
    for(int i=0; i<r; i++)
    {
      for(int j=0; j<c; j++)
      {
        matriz[i][j]= Integer.parseInt(JOptionPane.showInputDialog(str + "\n" + "Casilla["+i+"]"+"Casilla["+j+"] = "));
      }
    }
  }

  private void desplegarDatos(String str, int matriz[][], int r, int c)
  {
    String valores= str + "\n";
    for(int i=0; i<r;i++)
    {
      for(int j=0; j<c; j++)
      {
        valores= valores + matriz[i][j] + "   ";
      }
      valores= valores + "\n";
    }
    JOptionPane.showMessageDialog(null,valores);
  }

  private void sumamatrices()
  {
    matrizC=new int[matrizA.length][matrizA[0].length];
    suma= "La suma de las matrices es: " + "\n";
    int sumatoria=0;
    for(int i=0; i<renglones;i++)
    {
      for(int j=0; j<columnas;j++)
      {

        sumatoria=matrizA[i][j]+matrizB[i][j];
        matrizC[i][j]=sumatoria;
        suma= suma + matrizC[i][j] + "    ";
      }
      suma= suma + "\n";
    }
  }

    private void sumaa()
    {
      String strN;

        // 1. Obtener el no. de renglones y columnas del arreglo
        strN= JOptionPane.showInputDialog("Numero de renglones =");
        renglones= Integer.parseInt(strN);

        strN= JOptionPane.showInputDialog("Numero de columnas =");
        columnas= Integer.parseInt(strN);
        // 2. Crear las matrices en memoria
        matrizA = new int[renglones][columnas];
        matrizB = new int[renglones][columnas];


        // 3. Obtener datos de la matriz a y b
        obtenerDatos("Valores Matriz A:", matrizA, renglones, columnas);
        obtenerDatos("Valores Matriz B:",matrizB, renglones, columnas);

        //4. Desplegar los datos de la matrizes
        desplegarDatos("Valores Matriz A:", matrizA, renglones, columnas);
        desplegarDatos("Valores Matriz B:", matrizB, renglones, columnas);

        // 5. Sumar matrices
        sumamatrices();

        //6: Desplegar datos de las matriz c
        JOptionPane.showMessageDialog(null,suma);
    }

    private void resta()
    {
      String strN;

        // 1. Obtener el no. de renglones y columnas del arreglo
        strN= JOptionPane.showInputDialog("Numero de renglones =");
        renglones= Integer.parseInt(strN);

        strN= JOptionPane.showInputDialog("Numero de columnas =");
        columnas= Integer.parseInt(strN);
        // 2. Crear las matrices en memoria
        matrizA = new int[renglones][columnas];
        matrizB = new int[renglones][columnas];


        // 3. Obtener datos de la matriz a y b
        obtenerDatos("Valores Matriz A:", matrizA, renglones, columnas);
        obtenerDatos("Valores Matriz B:",matrizB, renglones, columnas);

        //4. Desplegar los datos de la matrizes
        desplegarDatos("Valores Matriz A:", matrizA, renglones, columnas);
        desplegarDatos("Valores Matriz B:", matrizB, renglones, columnas);

        // 5. Sumar matrices
        restamatrices();

        //6: Desplegar datos de las matriz c
        JOptionPane.showMessageDialog(null,suma);
    }

    public void restamatrices(){
      matrizC=new int[matrizA.length][matrizA[0].length];

      suma= "La resta de las matrices es: " + "\n";
      int sumatoria=0;
      for(int i=0; i<renglones;i++)
      {
        for(int j=0; j<columnas;j++)
        {

          sumatoria=matrizA[i][j]-matrizB[i][j];
          matrizC[i][j]=sumatoria;
          suma= suma + matrizC[i][j] + "    ";
        }
        suma= suma + "\n";
      }
    }

    private void productomatrices()
    {
      String strN;

        // 1. Obtener el no. de renglones y columnas del arreglo
        strN= JOptionPane.showInputDialog("Numero de renglones =");
        renglones= Integer.parseInt(strN);

        strN= JOptionPane.showInputDialog("Numero de columnas =");
        columnas= Integer.parseInt(strN);
        // 2. Crear las matrices en memoria
        matrizA = new int[renglones][columnas];
        matrizB = new int[columnas][renglones];
        matrizC= new int[renglones][renglones];


        // 3. Obtener datos de la matriz a y b
        obtenerDatos("Valores Matriz A:", matrizA, renglones, columnas);
        obtenerDatos("Valores Matriz B:",matrizB, columnas, renglones);

        //4. Desplegar los datos de la matrizes
        desplegarDatos("Valores Matriz A:", matrizA, renglones, columnas);
        desplegarDatos("Valores Matriz B:", matrizB, columnas, renglones);

        // 5. Sumar matrices
        multiplicarmatrices();

        //6: Desplegar datos de las matriz c
        JOptionPane.showMessageDialog(null,multi);
    }


    private void principal()
    {
      String opcion="";

      do {
        //1: Desplegar opciones al usuario y obtener la opcion
        opcion= JOptionPane.showInputDialog("Algebra de Matrices" + "\n" + "1:Suma de matrices" + "\n" + "2:Resta de matrices" + "\n"
        + "3:Multiplicacion de matrices" + "\n" + "4:Exit"+ "\n" + "Opcion=");
        //2:ejecutar la operacion seleccionada de acuerdo a la opcion

        //3:
        if(opcion.equals("1")) sumaa();
        if(opcion.equals("2")) resta();
        if(opcion.equals("3")) multi();

      } while (!opcion.equals("4"));

    }

    public static void main(String args[])
    {
        AlgebraMatrices objeto = new AlgebraMatrices();
        objeto.principal();
    }
}
