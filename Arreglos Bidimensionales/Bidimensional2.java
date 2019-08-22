import javax.swing.JOptionPane;

public class Bidimensional2{

  int[][] matrizA;
  int[][] matrizB;

  public int[][] newMatriz(String s){
    String str="Introduzca los renglones de "+s;
    int renglones=Integer.parseInt(JOptionPane.showInputDialog(str));
    str="Introduzca las columnas de "+s;
    int columnas=Integer.parseInt(JOptionPane.showInputDialog(str));
    int[][] matriz=new int[renglones][columnas];
    return matriz;
  }

  public void setMatriz(int[][] matriz){
    
  }

  public Bidimensional2(){
    matrizA=newMatriz("A");
    matrizA=newMatriz("B");
  }

  public static void main(String[] args) {
    Bidimensional2 obj=new Bidimensional2();
  }
}
