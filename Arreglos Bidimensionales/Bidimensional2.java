import javax.swing.JOptionPane;

public class Bidimensional2{

  int[][] matrizA;
  int[][] matrizB;
  int[][] matrizC;

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

  public void suma(){

    int renglones=matrizA.length;
    int columnas=matrizA[0].length;

    this.matrizC=new int[matrizA.length][matrizA[0].length];

    for(int i=0; i<renglones; i++){
      for(int j=0; j<columnas; j++){
        matrizC[i][j]=matrizA[i][j]+matrizB[i][j];
      }
    }
  }

  public Bidimensional2(){
    this.matrizA=newMatriz("A");
    this.matrizB=new int[matrizA.length][matrizA[0].length];

    this.setMatriz(matrizA, "A");
    this.setMatriz(matrizB, "B");

    this.suma();

    this.showData(matrizA,"A");
    this.showData(matrizB,"B");
    this.showData(matrizC,"C");
  }

  public static void main(String[] args) {
    Bidimensional2 obj=new Bidimensional2();
  }
}
