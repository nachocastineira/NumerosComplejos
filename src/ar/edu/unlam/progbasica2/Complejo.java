package ar.edu.unlam.progbasica2;

public class Complejo { // Se crea la clase
	
	private Double real; // Creo los atributos privados
	private Double imaginario;
	
	public Complejo (Double real, Double imaginario) //CONSTRUCTOR DE LA CLASE, PARA SUMAR REAL CON IMAGINARIO
	{
		this.imaginario = imaginario; //INICIALIZO LAS VARIABLES Y LAS IGUALO (variable global con variable local)
		this.real = real;
	}

	public Complejo (Double numeroReal) //SEGUNDO CONTRUCTOR, PARA SUMAR SOLO LOS REALES
		{
			this.real = numeroReal;
			this.imaginario = 0.0; // INICIALIZO EN 0 PARA QUE NO SEA NULL Y SE PUEDA SUMAR CON OTRO
		}
		
	public Complejo Suma(Complejo z)
	{
		this.real = this.real + z.getReal();
		this.imaginario = this.imaginario + z.getImaginario();
		return this;
	}

	public Double getReal() { //DEVUELVO o TRAIGO PARTE REAL
		return real;
	}

	public void setReal(Double real) { // LE ASIGNO UN VALOR A LA PARTE REAL
		this.real = real;
	}

	public Double getImaginario() { //DEVUELVO o TRAIGO PARTE IMAGINARIA
		return imaginario;
	}

	public void setImaginario(Double imaginario) { // LE ASIGNO UN VALOR A LA PARTE IMAGINARIA
		this.imaginario = imaginario;
	}
	
}
