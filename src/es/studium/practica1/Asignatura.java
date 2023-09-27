package es.studium.practica1;

public class Asignatura
{
	
	private String nombreAsignatura;
	private int numeroHoras;
	private int codigoAsignatura;
	
	
	public Asignatura ()
	{
		nombreAsignatura = "";
		numeroHoras = 0;
		codigoAsignatura = 0;
	}
	
	
	public Asignatura (String nomA, int numH, int codA)
	{
		nombreAsignatura = nomA;
		numeroHoras = numH;
		codigoAsignatura = codA;
	}


	public String getNombreAsignatura()
	{
		return nombreAsignatura;
	}


	public void setNombreAsignatura(String nombreAsignatura)
	{
		this.nombreAsignatura = nombreAsignatura;
	}


	public int getNumeroHoras()
	{
		return numeroHoras;
	}


	public void setNumeroHoras(int numeroHoras)
	{
		this.numeroHoras = numeroHoras;
	}


	public int getCodigoAsignatura()
	{
		return codigoAsignatura;
	}


	public void setCodigoAsignatura(int codigoAsignatura)
	{
		this.codigoAsignatura = codigoAsignatura;
	}
	
}
