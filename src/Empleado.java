import java.util.GregorianCalendar;

public abstract class Empleado {

    // Atributos
    private String dni;
    private String nombre;
    private String apellidos;
    private int fecha_alta;

    // Constructores
    public Empleado() {}

    protected Empleado(String dni, String nombre, String apellidos, int fechaAlta) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        fecha_alta = fechaAlta;
    }

    // Getters y setters
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(int fecha_alta) {
        this.fecha_alta = fecha_alta;
    }

    // Metodos
    public abstract double salario();

    public void imprimir() {

    }

    public static void sueldoMayor(Empleado[] empleadoArr) {
        double salarioEmpleado = 0;
        for (Empleado empleado : empleadoArr) {
            if (empleado.salario() > salarioEmpleado) {
                salarioEmpleado = empleado.salario();
            }
        }
        for (Empleado empleado : empleadoArr) {
            if (empleado.salario() == salarioEmpleado) {
                System.out.println(empleado.nombre + " " + empleado.apellidos + " " + empleado.salario() + "€");
            }
        }

    }

    public static void mostrarTodos(Empleado[] empleadoArr) {
        for (Empleado empleado : empleadoArr) {
            System.out.println(empleado);
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nApellidos: " + apellidos + "\nDNI: " + dni + "\nFecha alta: " + fecha_alta;
    }
}
