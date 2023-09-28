package Views;

import Controllers.EmpleadoController;

public class EmpleadoView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String empleado = new EmpleadoController().createEmpleado("Navarro","Cesar",18,"Masculino",50);
		//String empleado = new EmpleadoController().createEmpleado("Salazar","Carlos",14,"Masculino",30);
		//String empleado = new EmpleadoController().deleteEmpleado(1);
		//String empleado = new EmpleadoController().updateEmpleado(2, "Herrera");
		String empleado = new EmpleadoController().getEmpleado(2);
		System.out.println(empleado);
	}

}
