package calificaciones;

public class Creditos {
	float promedio; 
	float materias;
	float materiasC;
    float pago;
    float descuento;
    float dies;
	String nombre;
	



public float calcularPago(float materiasC, float materias)
{
this.pago=( materiasC * materias);
return pago;
}

public float getDescuento ()
{
return this.descuento;
}

public float calcularDescuento()
{
this.descuento=(this.pago*30)/100;
return this.descuento;
}

	public float calcularCostoDiez()
{
	this.dies = (this.pago * 10)/100;
    return this.dies;
}	



}
