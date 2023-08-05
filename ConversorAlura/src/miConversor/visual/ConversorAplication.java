package miConversor.visual;
import miConversor.modelo.Convertir;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JOptionPane;


import miConversor.modelo.Moneda;
import miConversor.modelo.Temperatura;


import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
/** 
 * @author Anthony Medina García
 * @version 1.0.0*/


public class ConversorAplication {

	private JFrame frame;
	private JTextField textMoneda;
	private JTextField textTemperatura;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConversorAplication window = new ConversorAplication();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ConversorAplication() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(64, 128, 128));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//titulo
		JLabel lbl_titulo = new JLabel("Conversor de unidades Alura");
		lbl_titulo.setForeground(new Color(255, 0, 128));
		lbl_titulo.setBackground(new Color(192, 192, 192));
		lbl_titulo.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_titulo.setBounds(100, 11, 207, 29);
		frame.getContentPane().add(lbl_titulo);
		
		JLabel lblConvertirmoneda = new JLabel("Convertir moneda");
		lblConvertirmoneda.setHorizontalAlignment(SwingConstants.CENTER);
		lblConvertirmoneda.setBounds(10, 87, 138, 22);
		frame.getContentPane().add(lblConvertirmoneda);
		
		// Opciones de conversión de moneda
		JComboBox opcionesMoneda = new JComboBox<Moneda>(Moneda.values());
		opcionesMoneda.setBounds(10, 154, 138, 22);
		frame.getContentPane().add(opcionesMoneda);
		
		//Entrada de valor de monedas
		textMoneda = new JTextField();
		textMoneda.setBounds(10, 123, 53, 20);
		frame.getContentPane().add(textMoneda);
		textMoneda.setColumns(10);
		
		//Saida de valor moneda
		JLabel lblresultadomoneda = new JLabel("00.00");
		lblresultadomoneda.setBounds(73, 129, 75, 14);
		frame.getContentPane().add(lblresultadomoneda);
		
		//Boton para convertir monedas
		JButton btnConvertirmoneda = new JButton("Convertir ");
		btnConvertirmoneda.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
				//Método para convertir moneda
				  Moneda monedaSeleccionada = (Moneda) opcionesMoneda.getSelectedItem();// Selección de la opción de conversión
			      
				  double valorMoneda = Double.parseDouble(textMoneda.getText()); // Trae el texto del Jfield y lo convierte a double y es el valor de la variable valor moneda
			       
			        //Llamada del método convertir moneda que ejecuta toda la lógica de conversión
			        double resultado=Convertir.convertirMoneda(monedaSeleccionada, valorMoneda);
			        lblresultadomoneda.setText(String.format("%.2f", resultado));}
			    
			         catch(NumberFormatException ex) {
			        	 ex.printStackTrace();
			    	  //lblmuestra.setText("Solamente números!");
			        	 JOptionPane.showMessageDialog(frame, "Por favor, ingrese solo números.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
			        	 textMoneda.setText("");
			        	 
			    	  
			      }
			      
			        
			        

			       
			     
			       
			}
		});
		btnConvertirmoneda.setBounds(10, 187, 138, 21);
		frame.getContentPane().add(btnConvertirmoneda);
		
		JLabel lblTemp = new JLabel("Convertir temperaturas");
		lblTemp.setHorizontalAlignment(SwingConstants.CENTER);
		lblTemp.setBounds(242, 91, 152, 14);
		frame.getContentPane().add(lblTemp);
		
		textTemperatura = new JTextField();
		textTemperatura.setBounds(258, 123, 63, 20);
		frame.getContentPane().add(textTemperatura);
		textTemperatura.setColumns(10);
		
		JLabel lblresultadoTemp = new JLabel("00.00");
		lblresultadoTemp.setBounds(331, 126, 75, 14);
		frame.getContentPane().add(lblresultadoTemp);
		
		JComboBox opcionesTemp = new JComboBox<Temperatura>(Temperatura.values());
		opcionesTemp.setBounds(258, 154, 136, 22);
		frame.getContentPane().add(opcionesTemp);
		
		JButton btnConvertirTemp = new JButton("Convertir");
		btnConvertirTemp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
				 Temperatura temperaturaSeleccionada = (Temperatura) opcionesTemp.getSelectedItem();// Selección de la opción de conversión
			      
				 double valorTemperatura = Double.parseDouble(textTemperatura.getText()); // Trae el texto del Jfield y lo convierte a double y es el valor de la variable valor temperatura
			       
				 double resultado=Convertir.convertirTemperatura(temperaturaSeleccionada, valorTemperatura);
				 
				 lblresultadoTemp.setText(String.format("%.2f", resultado));
				
				 }
				 catch(NumberFormatException ex) {
					 ex.printStackTrace();
		         JOptionPane.showMessageDialog(frame, "Por favor, ingrese solo números.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
		         textTemperatura.setText("");
				 }
				
			}
		});
		btnConvertirTemp.setBounds(258, 187, 136, 21);
		frame.getContentPane().add(btnConvertirTemp);
		
		
	}
}
