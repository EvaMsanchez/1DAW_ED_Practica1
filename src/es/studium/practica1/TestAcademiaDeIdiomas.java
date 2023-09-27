package es.studium.practica1;

public class TestAcademiaDeIdiomas
{

	public static void main(String[] args)
	{
		
		Centro centro1 = new Centro ();
		centro1.setNombreCentro("Escuela de ingl�s");
		centro1.setDireccionCentro("Reyes Cat�licos, 14");
		centro1.setCodigoCentro(100200);
		
		Centro centro2 = new Centro ();
		centro2.setNombreCentro("Escuela de franc�s");
		centro2.setDireccionCentro("Crist�bal Col�n, 92");
		centro2.setCodigoCentro(300400);
			
		Asignatura asignatura1 = new Asignatura ("Ingl�s B1", 42, 122);
		Asignatura asignatura2 = new Asignatura ("Ingl�s B2", 60, 410);
		Asignatura asignatura3 = new Asignatura ("Franc�s A2", 51, 530);
		Asignatura asignatura4 = new Asignatura ("Franc�s B1", 36, 280);
		
		Alumno alumno1 = new Alumno ("Ana", "Abel", "Paseo de Am�rica, 15", 111111, 7, centro1, asignatura1);
		Alumno alumno2 = new Alumno ("Benito", "Bueno", "Reyes Cat�licos, 16", 222222, 6, centro1, asignatura2);
		Alumno alumno3 = new Alumno ("Carmen", "Cano", "Reyes Cat�licos, 2", 333333, 5, centro1, asignatura1);
		Alumno alumno4 = new Alumno ("Esteban", "Escalera", "Isabel la Cat�lica, 28", 444444, 9, centro2, asignatura4);
		Alumno alumno5 = new Alumno ("Francisco", "Farf�n", "Crist�bal Col�n, s/n", 555555, 8.5, centro2, asignatura3);
		Alumno alumno6 = new Alumno ("Eva Mar�a", "S�nchez L�pez", "Anfiteatro, 19", 666666, 8, centro1, asignatura1);
		
		
		//DIRECCIONES DE TODOS LOS CENTROS
		System.out.println("La direcci�n de la "+centro1.getNombreCentro()+" es "+centro1.getDireccionCentro()+".");
		System.out.println("La direcci�n de la "+centro2.getNombreCentro()+" es "+centro2.getDireccionCentro()+".");
		
		
		//DIRECCI�N DEL CENTRO EN EL QUE EST� MATRICULADA CARMEN
		System.out.println("La alumna: "+alumno3.getNombreAlumno()+" "+alumno3.getApellido()+", est� matriculada en el Centro: "+alumno3.getCentro().getNombreCentro()+".");
		
		
		//NOTA QUE BENITO HA SACADO EN EL B2
		System.out.println("La nota que ha sacado "+alumno2.getNombreAlumno()+" "+alumno2.getApellido()+" en "+alumno2.getAsignatura().getNombreAsignatura()+" es un "+alumno2.getNotaAsignatura()+".");
		
	}

}
