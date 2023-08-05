package miConversor.modelo;

public class Convertir{
	
		
		
		
	    // Metodo para convertir moneda que sera llamado en la accion del botón
		
		public static double convertirMoneda(Moneda monedaSeleccionada, double valorMoneda) { 
			
			double resultado = 0.0;
	     switch(monedaSeleccionada) {
	     
			case colon_dolar:
				 resultado=ConvertirMoneda.convertirColonaDolar(valorMoneda);
				break;
			case colon_euro:
				resultado=ConvertirMoneda.convertirColonaEURO(valorMoneda);
				break;
			case colon_yenjapon:
				resultado=ConvertirMoneda.convertirColonaYEN(valorMoneda);
				break;
			case colon_libraesterlina:
				resultado=ConvertirMoneda.convertirColonaLIBRA(valorMoneda);
				break;
			case colon_wonsurCoreano:
				resultado=ConvertirMoneda.convertirColonaWONSURCOREA(valorMoneda);
				break;
			case dolar_colon:
				resultado=ConvertirMoneda.convertirDolaraColon(valorMoneda);
				break;
			case euro_colon:
				resultado=ConvertirMoneda.convertirEUROaColon(valorMoneda);
				
				break;
			case yenjapon_colon:
				resultado=ConvertirMoneda.convertirYENaColon(valorMoneda);
				break;
			case libraesterlina_colon:
				resultado=ConvertirMoneda.convertirLIBRAaColon(valorMoneda);
				break;
			case wonsurCoreano_colon:
				resultado=ConvertirMoneda.convertirWONSURCOREaColon(valorMoneda);
				
				break;
				
				
			default:
				throw new IllegalArgumentException("Valor inválido:  " + monedaSeleccionada);
			
			}
	     	return resultado;
		

	}
		 // Metodo para convertir temperatiura que sera llamado en la accion del botón
		// Recibe dos parámetros
		public static double convertirTemperatura(Temperatura temperaturaSeleccionada , double valortemperatura) { 
			//
			double resultado = 0.0;
	     switch(temperaturaSeleccionada) {
	     
			case Celsius_Farenheit:
				 resultado= ConvertirTemperaturas.celsiusAfarenheit(valortemperatura);
				break;
			case Farenheit_Celsius:
				resultado=ConvertirTemperaturas.farenheitAcelsius(valortemperatura);
				break;
			case Farenheit_Kelvin:
				resultado=ConvertirTemperaturas.farenheitAkelvin(valortemperatura);
				break;
			case Kelvin_Farenheit:
				resultado=ConvertirTemperaturas.kelvinAfarenheit(valortemperatura);
				break;
			case Celsius_Kelvin:
				resultado=ConvertirTemperaturas.celsiusAkelvin(valortemperatura);
				break;
			case Kelvin_Celsius:
				resultado=ConvertirTemperaturas.kelvinAcelsius(valortemperatura);
				break;
				
			default:
				throw new IllegalArgumentException("Valor inválido:  " + temperaturaSeleccionada);
			
			}
	     	return resultado;
		

	}

		

	}
	
	
	
	 
	 
