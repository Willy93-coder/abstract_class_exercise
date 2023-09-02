import java.util.GregorianCalendar;

public class EmpleadoAsalariado extends Empleado {

    // Atributos
    private double salarioBase;
    private int antiguedad;
    private final int anio_actual = 2023;

    // Constructores
    public EmpleadoAsalariado() {}

    public EmpleadoAsalariado(String dni, String nombre, String apellidos, int fechaAlta, double salarioBase) {
        super(dni, nombre, apellidos, fechaAlta);
        this.salarioBase = salarioBase;
        this.antiguedad = anio_actual - fechaAlta;
    }

    // Getters y setters
    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public int getAnio_actual() {
        return anio_actual;
    }

    // Metodos
    @Override
    public double salario() {
        double salario = 0;

        if (antiguedad < 2) {
            salario = salarioBase;
        }

        if (2 <= antiguedad && antiguedad <= 3) {
            salario = (salarioBase * 0.7) + salarioBase;
        }

        if (4 <= antiguedad && antiguedad <= 8) {
            salario = (salarioBase * 0.11) + salarioBase;
        }

        if (9 <= antiguedad && antiguedad <= 15) {
            salario = (salarioBase * 0.17) + salarioBase;
        }

        return salario;
    }
}
