package es.estech.acantero;

public class Validator {

    static public boolean validate (int valor){
        if (valor < 0 || valor > 2){
            return false;
        } else {
            return true;
        }
    }
}
