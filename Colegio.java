import java.util.ArrayList;
import java.util.Scanner;

public class Colegio {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int opciones;

		ArrayList<AlumnosPoo>	alumnos = new ArrayList<AlumnosPoo>();
		ArrayList<ProfesorPoo> profesores = new ArrayList<ProfesorPoo>();
			
		opciones(alumnos,profesores);
		
	}

	public static void opciones(ArrayList alumnos, ArrayList profesores) {

		Scanner sc = new Scanner(System.in);
		int numero;



	do {
		
		System.out.println("1 : dar alta allumno");
		System.out.println("2 : dar alta profesor");
		System.out.println("3 : Mostrar info alumno");
		System.out.println("4 : Mostrar info profesor");
		System.out.println("5 : Cantidad de alumnos matriculados en primer y segundo año");
		System.out.println("6 :	Porcentaje de alumnos aprobados por curso");
		System.out.println("7 :	Profesor con más asignaturas y que además sea tutor");

		System.out.println("Pulse el numero que desee");
		numero=sc.nextInt();

		switch(numero){

			case 1:
				alumnos.add(crearalumno());
				break;

			case 2:
				profesores.add(crearprofesor());
				break;
			case 3:
				mostrarInfoAlumno(alumnos);
				break;
			
			case 4:
				mostrarInfoProfesor(profesores);
				break;
				
			case 5:
				cantidadalumnos(alumnos);
				break;
				
			case 6:
				alumnosaprobados(alumnos);
				break;
				
			case 7:
				profesorasignaturas(profesores);
				break;
			
		}
		
	}while(numero< 8);



	}



	public static AlumnosPoo crearalumno() {
		
		Scanner sc = new Scanner(System.in);
		AlumnosPoo alumnos = new AlumnosPoo();

		String nombre;
		String apellido;
		String telefono;
		String dni;
		String curso;
		int nota;



		System.out.println("Escribe el nombre del alumno");
		nombre=sc.nextLine();
		alumnos.setNombre(nombre);

		System.out.println("Escribe el apellido del alumno");
		apellido=sc.nextLine();
		alumnos.setApellido(apellido);


		System.out.println("Escribe el telefono del alumno");
		telefono=sc.nextLine();
		alumnos.setTeléfono(telefono);

		System.out.println("Escribe el dni del alumno");
		dni=sc.nextLine();
		alumnos.setDNI(dni);

		System.out.println("Escribe el curso del alumno");
		curso=sc.nextLine();
		alumnos.setCurso(curso);

		System.out.println("Escribe la nota del alumno");
		nota=sc.nextInt();
		alumnos.setNota(nota);


		return alumnos;

	}

	public static ProfesorPoo crearprofesor() {

		Scanner sc = new Scanner(System.in);
		ProfesorPoo Profesor = new ProfesorPoo();

		String nombre;
		String apellido;
		String telefono;
		String dni;
		boolean esTutor;
		int cantidadAsignaturas;



		System.out.println("Escribe el nombre del Profesor");
		nombre=sc.nextLine();
		Profesor.setNombre(nombre);

		System.out.println("Escribe el apellido del Profesor");
		apellido=sc.nextLine();
		Profesor.setApellido(apellido);

		System.out.println("Escribe el telefono del Profesor");
		telefono=sc.nextLine();
		Profesor.setTeléfono(telefono);

		System.out.println("Escribe el dni del Profesor");
		dni=sc.nextLine();
		Profesor.setDNI(dni);

		System.out.println("Escribe TRUE si el profesor es tutor y FALSE en caso de no serlo");
		esTutor=sc.nextBoolean();
		Profesor.setEsTutor(esTutor);

		System.out.println("Escribe la cantidad de asignaturas impartidas");
		cantidadAsignaturas=sc.nextInt();
		Profesor.setCantidadAsignaturas(cantidadAsignaturas);

		return Profesor;

	}

	public static void mostrarInfoAlumno(ArrayList<AlumnosPoo> alumnos) {

		
		
		for (int i = 0; i < alumnos.size(); i++) {
		
		System.out.println("el nombre del alumnos es"+ alumnos.get(i).getNombre());
		System.out.println("El apellido del alumno es "+ alumnos.get(i).getApellido());
		System.out.println("El telefono del alumno es "+ alumnos.get(i).getTelefono());
		System.out.println("El dni del alumno es "+ alumnos.get(i).getDNI());
		System.out.println("El curso del alumno es "+alumnos.get(i).getCurso());
		System.out.println("La nota del alumno es  "+ alumnos.get(i).getNota());
		System.out.println("\n");
		}
		
	}

	public static void mostrarInfoProfesor(ArrayList<ProfesorPoo> profesores) {


	
		
		for (int i = 0; i < profesores.size(); i++) {
			System.out.println("el nombre del profesor es"+ profesores.get(i).getNombre());
			System.out.println("El apellido del profesor es "+ profesores.get(i).getApellido());
			System.out.println("El telefono del profesor es "+ profesores.get(i).getTelefono());
			System.out.println("El dni del profesor es "+ profesores.get(i).getDNI());
			System.out.println("\n");
		}

	}
	
	public static void cantidadalumnos(ArrayList<AlumnosPoo> alumnos) {

		int cantidad=0;
		
		cantidad= cantidad+=alumnos.size();
		
		
		System.out.println(cantidad);

	}
	
	public static void alumnosaprobados(ArrayList<AlumnosPoo> alumnos) {

		int cont=0;
	
		for (int i = 0; i < alumnos.size(); i++) {
		
			if (alumnos.get(i).getNota() > 4 ) {
			
			cont++;
			
			}
		}
		System.out.println("la cantidad de aprobados es "+cont);
		System.out.println("\n");

	}
	
	public static void profesorasignaturas(ArrayList<ProfesorPoo> profesores) {

		int cont=0;
		
		cont=profesores.get(0).getCantidadAsignaturas();
		
		for (int i = 0; i < profesores.size(); i++) {
			
			if (cont<profesores.get(i).getCantidadAsignaturas()) {
				
				cont=profesores.get(i).getCantidadAsignaturas();
			}
	

		}	


		System.out.println("El Profesor con mas asignaturas es "+cont);
		System.out.println("\n");

	}
}
