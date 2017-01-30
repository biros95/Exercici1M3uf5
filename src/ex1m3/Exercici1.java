package ex1m3;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
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
        Field[] atrib = arrayAtribsField();
        String[] nomAtributs = new String[atrib.length];
        for (int i = 0; i < nomAtributs.length; i++) {
            nomAtributs[i] = atrib[i].getName();
        }
        return nomAtributs;
    }

    /**
     * Array dels noms dels mètodes.
     *
     * @return
     */
    public String[] arrayNomMetodes() {
        Method[] method = arrayMetodes();
        String[] nomMetodes = new String[method.length];
        for (int i = 0; i < nomMetodes.length; i++) {
            nomMetodes[i] = method[i].getName();
        }
        return nomMetodes;
    }

    /**
     * Modificador d'un atribut.
     *
     * @return
     */
    public int[] modAtribut() {
        Method[] method = arrayMetodes();
        int[] modAtribut = new int[method.length];
        for (int i = 0; i < modAtribut.length; i++) {
            modAtribut[i] = method[i].getModifiers();
        }
        return modAtribut;
    }

    /**
     * Modificador d'un mètode.
     *
     * @return
     */
    public int[] modMetode() {
        Field[] field = arrayAtribsField();
        int[] modMetode = new int[field.length];
        for (int i = 0; i < modMetode.length; i++) {
            modMetode[i] = field[i].getModifiers();
        }
        return modMetode;
    }

    /**
     * Modificar el valor d'un atribut.
     *
     * @param atribut
     * @param nouValor
     * @throws java.lang.IllegalAccessException
     */
    public void modValorAtribut(Field atribut, Object nouValor) throws IllegalArgumentException, IllegalAccessException {
        atribut.setAccessible(true);
        atribut.set(e, nouValor);
    }

    /**
     * Executar un dels seus mètodes.
     *
     * @param metode
     */
    public void executarMetodes(Method metode) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        metode.setAccessible(true);
        metode.invoke(e, null);
    }

    /**
     * Crear una instància.
     *
     * @return
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     */
    public Element crearInstancia() throws InstantiationException, IllegalAccessException {
        return e.getClass().newInstance();
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
