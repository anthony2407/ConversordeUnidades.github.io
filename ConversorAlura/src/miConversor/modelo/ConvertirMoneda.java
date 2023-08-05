package miConversor.modelo;



public class ConvertirMoneda  {
	 	private static final double COLON_A_DOLAR = 0.00185;
	    private static final double DOLAR_A_COLON = 540.33;
	    
	    private static final double COLON_A_EURO = 0.0017;
	    private static final double EURO_A_COLON = 588.24;
	    
	    private static final double COLON_A_LIBRA = 0.0014;
	    private static final double LIBRA_A_COLON = 693.0;
	    
	    private static final double COLON_A_YEN = 0.26;
	    private static final double YEN_A_COLON = 3.82;
	    
	    private static final double COLON_A_WONSURCOREA = 2.40;
	    private static final double WONSURCOREA_A_COLON = 0.42;
	    
	    
	    
	    
	    // CAMBIO DOLAR

	    public static double convertirColonaDolar(double cantidad) {
	    	double result=cantidad * COLON_A_DOLAR;
	        return result;
	    }

	    public static double convertirDolaraColon(double cantidad) {
	    	double result=cantidad * DOLAR_A_COLON;
	        return result;
	    }
	    
	   // CAMBIO EURO
	    public static double convertirColonaEURO(double cantidad) {
	    	double result=cantidad * COLON_A_EURO;
	        return result;
	    }

	    public static double convertirEUROaColon(double cantidad) {
	    	double result=cantidad * EURO_A_COLON;
	        return result;
	    }
	    
	    //CAMBIO LIBRA ESTERLINA
	    public static double convertirColonaLIBRA(double cantidad) {
	    	double result=cantidad * COLON_A_LIBRA;
	        return result;
	    }

	    public static double convertirLIBRAaColon(double cantidad) {
	    	double result=cantidad * LIBRA_A_COLON;
	        return result;
	    }
	    
	    
	    // CAMBIO YEN JAPONES
	    public static double convertirColonaYEN(double cantidad) {
	    	double result=cantidad * COLON_A_YEN;
	        return result;
	    }

	    public static double convertirYENaColon(double cantidad) {
	    	double result=cantidad * YEN_A_COLON;
	        return result;
	    }
	    
	    
	    // CAMBIO WON SURCOREANO
	    public static double convertirColonaWONSURCOREA(double cantidad) {
	    	double result=cantidad * COLON_A_WONSURCOREA;
	        return result;
	    }

	    public static double convertirWONSURCOREaColon(double cantidad) {
	    	double result=cantidad * WONSURCOREA_A_COLON;
	        return result;
	    }
	
		
	
		
		
	
	
	

	}

		
		
	



