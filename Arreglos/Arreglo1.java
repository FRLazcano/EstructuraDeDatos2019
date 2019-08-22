import javax.swing.*;

public class Arreglo1{
  public static void main(String[] args) {
    String str[]=new String[4];
    for(int i=0; i<args.length; i++){
      str[i]="Casilla["+i+"]: "+args[i];
    }
    for(int i=0; i<args.length; i++){
      JOptionPane.showMessageDialog(null,str[i]);
    }
  }
}
