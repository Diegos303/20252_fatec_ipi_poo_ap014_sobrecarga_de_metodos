//package ap014_sobrecarga_de_metodos;

public class TesteCalculadora {
  public static void main(String[] args) {
    int [] v = {4,3, 2};
    var calc = new Calculadora();
    System.out.println(calc.somar());
    System.out.println(calc.somar(1));
    System.out.println(calc.somar(2,1));
    System.out.println(calc.somar(1,2,3));
    System.out.println(calc.somar(v));



    
    //int a = 3, b =2, c =2;
    //double d1 = 2.5, d2 = 3.7;
    //String s1 = "2", s2 = "3";

    
    //System.out.println(calc.somar(a, b));
    //System.out.println(calc.somar(c,b,b));
    //System.out.println(calc.somar(d1, d2));
    //System.out.println(calc.somar(s1, s2));
    
  }
  
}
