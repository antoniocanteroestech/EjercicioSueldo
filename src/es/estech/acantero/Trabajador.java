package es.estech.acantero;

public class Trabajador {

    static public final int CAT_EMPLEADO = 0;
    static public final int CAT_ENCARGADO = 1;
    static public final int  CAT_DIRECTIVO = 2;
    static public final int ANT_NOVATO = 0;
    static public final int ANT_MADURO = 1;
    static public final int ANT_EXPERTO = 2;
    static public final int SUELDO_BASE = 607;

    private String nombre;
    private int edad;
    private int categoría;
    private int antiguedad;

    public Trabajador(String nombre, int edad, int categoría, int antiguedad) {
        this.nombre = nombre;
        this.edad = edad;
        this.categoría = categoría;
        this.antiguedad = antiguedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCategoría() {
        return categoría;
    }

    public void setCategoría(int categoría) {
        this.categoría = categoría;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", categoría=" + categoría +
                ", antiguedad=" + antiguedad +
                '}';
    }

    public double calcularSueldo (){
        double sueldo = SUELDO_BASE;

        switch (this.categoría){
            case CAT_EMPLEADO:
                sueldo += sueldo*0.15;
                break;
            case CAT_ENCARGADO:
                sueldo += sueldo*0.35;
                break;
            case CAT_DIRECTIVO:
                sueldo += sueldo*0.60;
                break;
        }

        switch (this.antiguedad){
            case ANT_NOVATO:
                sueldo += 150;
                break;
            case ANT_MADURO:
                sueldo += 300;
                break;
            case ANT_EXPERTO:
                sueldo += 600;
                break;
        }

        return sueldo;
    }
}
