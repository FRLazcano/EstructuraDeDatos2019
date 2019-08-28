import javax.swing.JOptionPane;

public class Matrices {

  private int[][] matrizA;
  private int[][] matrizB;
  private int[][] matrizC;

  public int[][] newMatriz(){
    int renglones=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de renglones de la matriz"));
    int columnas=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de columnas de la matriz"));
    int [][] matriz=new int[renglones][columnas];
    return matriz;
  }

  public void setMatriz(int[][] matriz, String n){
    String str=" ";
    for(int i=0; i<matriz.length; i++){
      for(int j=0; j<matriz.length; j++){
        str="Introduzca el valor de "+n+" en ["+i+"]["+j+"]";
        matriz[i][j]=Integer.parseInt(JOptionPane.showInputDialog(str));
      }
    }
  }

  public void desplegarDatos(int[][] matriz, String n){
    String str="";
    for(int i=0; i<matriz.length; i++){
      for(int j=0; j<matriz.length; j++){
        str+=n+"["+i+"]["+j+"]="+matriz[i][j]+"   ";
      }
      str+="\n";
    }
    JOptionPane.showMessageDialog(null,str);
  }

  public void suma(int m){
    matrizA=newMatriz();

    int renglones=matrizA.length;
    int columnas=matrizA[0].length;

    matrizB=new int[renglones][columnas];
    matrizC=new int[renglones][columnas];

    setMatriz(matrizA,"A");
    setMatriz(matrizB,"B");

    for(int i=0; i<renglones; i++){
      for(int j=0; j<columnas; j++){
        matrizC[i][j]=matrizA[i][j]+(matrizB[i][j]*m);
      }
    }

    desplegarDatos(matrizA,"A");
    desplegarDatos(matrizB,"B");
    if(m==1){
      desplegarDatos(matrizC,"Suma");
    }else{
      desplegarDatos(matrizC,"Resta");
    }
  }

  public int mult(int a, int b){
    int sum=0;
    for(int l=0; l<matrizA.length; l++){
      sum+=matrizA[a][l]*matrizB[l][b];
    }
    return sum;
  }

  public void multiplicacion(){
    matrizA=newMatriz();

    int renglones=matrizA.length;
    int columnas=matrizA[0].length;

    matrizB=new int[columnas][renglones];
    matrizC=new int[renglones][renglones];

    setMatriz(matrizA,"A");
    setMatriz(matrizB,"B");

    for(int i=0; i<renglones; i++){
      for(int j=0; j<renglones; j++){
        matrizC[i][j]=mult(i,j);
      }
    }
    desplegarDatos(matrizA,"A");
    desplegarDatos(matrizB,"B");
    desplegarDatos(matrizC,"Multiplicacion");
  }

  public void opciones(int opc){
    switch(opc){
      case 1:
        suma(1);
        break;
      case 2:
        suma(-1);
        break;
      case 3:
        multiplicacion();
        break;
      case 4:
        break;

      default:
        JOptionPane.showMessageDialog(null,"Introduzca una opcion valida");
        break;
    }
  }

  public void menu(){
    int opcion=0;
    while(opcion!=4){
      opcion= Integer.parseInt(JOptionPane.showInputDialog("Algebra de Matrices" + "\n" + "1:Suma de matrices" + "\n" + "2:Resta de matrices" + "\n"
      + "3:Multiplicacion de matrices" + "\n" + "4:Exit"+ "\n" + "Opcion="));
      opciones(opcion);
    }
  }
  public Matrices(){
    menu();
  }

  public static void main(String[] args) {
    Matrices obj=new Matrices();
  }
}
