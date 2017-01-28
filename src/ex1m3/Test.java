
package ex1m3;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {

        Element e = new Element(1,"Matias");
        Exercici1 ex1 = new Exercici1(e);
        
        
        System.out.println(ex1.obtenirSuperclasse() + " -------> Obtenir SuperClasse");
        System.out.println(ex1.obtenirClasseCompleta() + "  -------> Obtenir Classe Completa");
        System.out.println(ex1.obtenirNomesClasse() + " -------> Obtenir nomes classe");
        System.out.println(Arrays.toString(ex1.arrayAtribsField()) + " -------> Array atribs field");
        System.out.println(Arrays.toString(ex1.arrayMetodes()) + " -------> Array mètodes");
        System.out.println(Arrays.toString(ex1.arrayNomAtributs()) + " -------> Array nom atribus");
        System.out.println(Arrays.toString(ex1.arrayNomMetodes()) + " -------> Array nom metodes");
        System.out.println(Arrays.toString(ex1.modAtribut()) + " -------> Mod Atribut");
        
        System.out.println(ex1.executarMetodes() + " -------> Executar Metodes");
        System.out.println(Arrays.toString(ex1.modMetode()) + " -------> Mod Metode");
        
        ex1.crearInstancia(); //Crear instancia
        
        //Prova clons 
        Element eClon = ex1.clone();
        
        System.out.println("\n Clons");
        System.out.println(e.toString());
        System.out.println(eClon.toString());
    } 
}