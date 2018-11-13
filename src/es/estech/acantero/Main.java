package es.estech.acantero;

public class Main {



    public static void main(String[] args) {

        Trabajador t1 = new Trabajador("Antonio", 40,
                Trabajador.CAT_EMPLEADO, Trabajador.ANT_MADURO);

        if (Validator.validate(t1.getAntiguedad()) && Validator.validate(t1.getCategoría())){
            System.out.println(t1.calcularSueldo());
        } else {
            System.out.println("la antigüedad o la categoría no son un valor correcto");
        }


    }
}
