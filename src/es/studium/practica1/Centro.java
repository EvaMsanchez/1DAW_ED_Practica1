package es.studium.practica1;

public class Centro
{

	private String nombreCentro;
	private String direccionCentro;
	private int codigoCentro;
	
	
	public Centro ()
	{
		nombreCentro = "";
		direccionCentro = "";
		codigoCentro = 0;
	}
	
	
	public Centro (String nomC, String dirC, int codC)
	{
		nombreCentro = nomC;
		direccionCentro = dirC;
		codigoCentro = codC;
	}


	public String getNombreCentro()
	{
		return nombreCentro;
	}


	public void setNombreCentro(String nombreCentro)
	{
		this.nombreCentro = nombreCentro;
	}


	public String getDireccionCentro()
	{
		return direccionCentro;
	}


	public void setDireccionCentro(String direccionCentro)
	{
		this.direccionCentro = direccionCentro;
	}


	public int getCodigoCentro()
	{
		return codigoCentro;
	}


	public void setCodigoCentro(int codigoCentro)
	{
		this.codigoCentro = codigoCentro;
	}
	
}
