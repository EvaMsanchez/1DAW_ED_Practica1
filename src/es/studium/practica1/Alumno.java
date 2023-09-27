package es.studium.practica1;

public class Alumno
{

	private String nombreAlumno;
	private String apellido;
	private String direccionAlumno;
	private int numeroMatricula;
	private double notaAsignatura;
	private Centro centro;
	private Asignatura asignatura;

	
	public Alumno()
	{
		nombreAlumno = "";
		apellido = "";
		direccionAlumno = "";
		numeroMatricula = 0;
		notaAsignatura = 0.0;
		centro = new Centro();
		asignatura = new Asignatura();
	}

	
	public Alumno(String nomA, String ape, String dirA, int numM, double notA, Centro cen, Asignatura asi)
	{
		nombreAlumno = nomA;
		apellido = ape;
		direccionAlumno = dirA;
		numeroMatricula = numM;
		notaAsignatura = notA;
		centro = cen;
		asignatura = asi;
	}

	
	public String getNombreAlumno()
	{
		return nombreAlumno;
	}

	public void setNombreAlumno(String nombreAlumno)
	{
		this.nombreAlumno = nombreAlumno;
	}

	public String getApellido()
	{
		return apellido;
	}

	public void setApellido(String apellido)
	{
		this.apellido = apellido;
	}

	public String getDireccionAlumno()
	{
		return direccionAlumno;
	}

	public void setDireccionAlumno(String direccionAlumno)
	{
		this.direccionAlumno = direccionAlumno;
	}

	public int getNumeroMatricula()
	{
		return numeroMatricula;
	}

	public void setNumeroMatricula(int numeroMatricula)
	{
		this.numeroMatricula = numeroMatricula;
	}

	public double getNotaAsignatura()
	{
		return notaAsignatura;
	}

	public void setNotaAsignatura(double notaAsignatura)
	{
		this.notaAsignatura = notaAsignatura;
	}

	public Centro getCentro()
	{
		return centro;
	}

	public void setCentro(Centro centro)
	{
		this.centro = centro;
	}

	public Asignatura getAsignatura()
	{
		return asignatura;
	}

	public void setAsignatura(Asignatura asignatura)
	{
		this.asignatura = asignatura;
	}

}
