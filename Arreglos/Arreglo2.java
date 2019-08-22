import javax.swing.*;

public class Arreglo2{

  private int numero;
  private int numeros[];

  public void principal(){
    numeros=new int[5];
    this.numero=5;
    numeros[0]=this.numero;
    for(int i=0; i<this.numeros.length; i++){
      System.out.println(numeros[i]);
    }
  }

  public static void main(String[] args) {
    Arreglo2 obj=new Arreglo2();
    obj.principal();
  }
}
