public class EmpleadoComision extends Empleado {

    // Atributos
    private final double salarioFijo = 950;
    private int num_clientes_captados;
    private double comision;
    private final double salarioTotal = comision * num_clientes_captados;

    // Constructores
    public EmpleadoComision() {}

    public EmpleadoComision(String dni, String nombre, String apellidos, int fechaAlta, int numClientesCaptados, double comision) {
        super(dni, nombre, apellidos, fechaAlta);
        num_clientes_captados = numClientesCaptados;
        this.comision = comision;
    }

    // Getters y setters
    public double getSalarioFijo() {
        return salarioFijo;
    }

    public int getNum_clientes_captados() {
        return num_clientes_captados;
    }

    public void setNum_clientes_captados(int num_clientes_captados) {
        this.num_clientes_captados = num_clientes_captados;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public double getSalarioTotal() {
        return salarioTotal;
    }

    // Metodos
    @Override
    public double salario() {
        if (salarioTotal < salarioFijo){
            return salarioFijo;
        } else {
            return salarioTotal;
        }
    }
}
