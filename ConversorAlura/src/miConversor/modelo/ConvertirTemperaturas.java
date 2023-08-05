package miConversor.modelo;
// Clase y metodos para convertir temperatura
public class ConvertirTemperaturas {
	
	public static double celsiusAfarenheit(double celsius) {
		double resultadoFarenheit=(celsius*1.8)+32;
		
		
		return resultadoFarenheit;
		
	}
	
	public static  double farenheitAcelsius(double farenheit) {
		double resultadoCelsius=(farenheit-32)/1.8;
		
		
		return resultadoCelsius;
		
	}
	
	public static  double farenheitAkelvin(double farenheit) {
		double resultadoKelvin=(farenheit+459.67)*1.8;
		
		
		return resultadoKelvin;
		
	}
	public static  double kelvinAfarenheit(double kelvin) {
		double resultadoFarenheit=(kelvin/1.8)-459.67;
		
		
		return resultadoFarenheit;
		
	}
	public static  double kelvinAcelsius(double kelvin) {
		double resultadoCelsius=kelvin-273.15;
		
		
		return resultadoCelsius;
		
	}
	public static  double celsiusAkelvin(double celsius) {
		double resultadoKelvin=celsius+273.15;
		
		
		return resultadoKelvin;
		
	}
	
}
