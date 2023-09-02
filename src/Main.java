public class Main {
    public static void main(String[] args) {
        EmpleadoAsalariado antonio = new EmpleadoAsalariado("6546546Z", "Antonio", "López", 2014, 1125);
        EmpleadoComision sara = new EmpleadoComision("7879879S", "Sandra", "Nieto", 2011, 35, 7.10);
        EmpleadoComision manuel = new EmpleadoComision();
        EmpleadoAsalariado maria = new EmpleadoAsalariado();

        manuel.setDni("4654654D");
        manuel.setNombre("Manuel");
        manuel.setApellidos("Ruíz");
        manuel.setFecha_alta(2010);
        manuel.setNum_clientes_captados(35);
        manuel.setComision(6.90);

        maria.setDni("77879878F");
        maria.setNombre("María");
        maria.setApellidos("Ramos");
        maria.setFecha_alta(2011);
        maria.setSalarioBase(1055);


        Empleado[] empleados = new Empleado[4];

        empleados[0] = antonio;
        empleados[1] = sara;
        empleados[2] = manuel;
        empleados[3] = maria;

        Empleado.sueldoMayor(empleados);
        System.out.println();
        Empleado.mostrarTodos(empleados);
    }
}