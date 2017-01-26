
package ex1m3;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {

        Element e = new Element(1,"Matias");
        Exercici1 ex1 = new Exercici1(e);
        Element eClon = ex1.clone();
        
        System.out.println(e.toString());
        System.out.println(eClon.toString());
    } 
}