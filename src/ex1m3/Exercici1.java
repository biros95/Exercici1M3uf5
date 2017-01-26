package ex1m3;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Exercici1 {

    private Element e;

    public Exercici1(Element e) {
        this.e = e;
    }

    /**
     * Mètode per obtenir el nom de la superclasse
     *
     * @return
     */
    public String obtenirSuperclasse() {
        return e.getClass().getSuperclass().getName();
    }

    /**
     * Mètode per obtenir el nom de la classe complet
     *
     * @return
     */
    public String obtenirClasseCompleta() {
        return e.getClass().getCanonicalName();
    }

    /**
     * Obtenir només el nom de la classe
     *
     * @return
     */
    public String obtenirNomesClasse() {
        return e.getClass().getSimpleName();
    }

    /**
     * Array de fields declarats
     *
     * @return
     */
    public Field[] arrayAtribsField() {
        return e.getClass().getDeclaredFields();
    }

    /**
     * Array de mètodes
     *
     * @return
     */
    public Method[] arrayMetodes() {
        return e.getClass().getDeclaredMethods();
    }

    /**
     * Array dels noms dels atributs.
     *
     * @return
     */
    public String[] arrayNomAtributs() {
        String[] nomAtributs = new String[arrayAtribsField().length];
        Field[] att = arrayAtribsField();
        for (int i = 0; i < nomAtributs.length; i++) {
            nomAtributs[i] = att[i].getName();
        }
        return nomAtributs;
    }

    /**
     * Array dels noms dels mètodes.
     *
     * @return
     */
    public String[] arrayNomMetodes() {
        String[] nomMetodes = new String[arrayMetodes().length];
        Method[] meth = arrayMetodes();
        for (int i = 0; i < nomMetodes.length; i++) {
            nomMetodes[i] = meth[i].getName();
        }
        return nomMetodes;
    }

    /**
     * Modificador d'un atribut.
     *
     * @return
     */
    public int[] modAtribut() {
        int[] nomMetodes = new int[arrayMetodes().length];
        Method[] meth = arrayMetodes();
        for (int i = 0; i < nomMetodes.length; i++) {
            nomMetodes[i] = meth[i].getModifiers();
        }
        return nomMetodes;
    }

    /**
     * Modificador d'un mètode.
     *
     * @return
     */
    /**
     * Modificar el valor d'un atribut.
     *
     * @return
     */
    
    /**
     * Executar un dels seus mètodes.
     *
     */
    public void executarMetodes() {
        e.getCad();
    }
    
    /**
     * Crear una instància.
     *
     */
    public void crearInstancia() {
        
    }
    
    /**
     * Crear objecte clonat
     *
     * @return 
     * @throws java.lang.CloneNotSupportedException
     */
    @Override
    public Element clone() throws CloneNotSupportedException {
        return new Element(e.getNum(), e.getCad());
    }
}
