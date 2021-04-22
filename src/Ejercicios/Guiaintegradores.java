package Ejercicios;

import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Guiaintegradores {
	String Jugador = "X";
	JButton btn1F1C1 = new JButton(".");
	JButton btn2F1C2 = new JButton(".");
	JButton btn3F1C3 = new JButton(".");
	JButton btn4F2C1 = new JButton(".");
	JButton btn5F2C2 = new JButton(".");
	JButton btn6F2C3 = new JButton(".");
	JButton btn7F3C1 = new JButton(".");
	JButton btn8F3C2 = new JButton(".");
	JButton btn9F3C3 = new JButton(".");
	JPanel panel = new JPanel();
	
	
	
	
	
	public void ejerciciotateti() {
		
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(400,600);
		frame.setLocationRelativeTo(null);
		frame.setTitle("TATETI");
		frame.add(panel);
		panel.setLayout(null);
		
		JButton btnLimpiar = new JButton("-");
		btnLimpiar.setBounds(200, 600 , 80 , 80);
		panel.add(btnLimpiar);
		
		
		
		btn1F1C1.setBounds(200, 200 , 50 , 50);
		panel.add(btn1F1C1);
		
		btn1F1C1.addActionListener(e -> {btn1F1C1.setText(Jugador);
		funcion(); btn1F1C1.setEnabled(false);}
		
		
	);
		
		
		btn2F1C2.setBounds(275, 200 , 50, 50 );
		
		btn2F1C2.addActionListener(e -> {btn2F1C2.setText(Jugador);
		funcion();  btn2F1C2.setEnabled(false);}
		
		
	);
		
		
		btn3F1C3.setBounds(350, 200 , 50, 50 );
		
		btn3F1C3.addActionListener(e -> {btn3F1C3.setText(Jugador);
		funcion(); btn3F1C3.setEnabled(false);}
		
		
	);
		
		
		
		
		btn4F2C1.setBounds(200, 275 , 50, 50 );
		
		btn4F2C1.addActionListener(e -> {btn4F2C1.setText(Jugador);
		funcion(); btn4F2C1.setEnabled(false);}
		
		
	);
		
		
		btn5F2C2.setBounds(275, 275 , 50, 50 );
		
		btn5F2C2.addActionListener(e -> {btn5F2C2.setText(Jugador);
		funcion(); btn5F2C2.setEnabled(false);}
		
		
	);
		
		
		btn6F2C3.setBounds(350, 275 , 50, 50 );
		
		btn6F2C3.addActionListener(e -> {btn6F2C3.setText(Jugador);
		funcion(); btn6F2C3.setEnabled(false);}
		
		
	);
		
		
		btn7F3C1.setBounds(200 , 350 ,50 , 50);

		btn7F3C1.addActionListener(e -> {btn7F3C1.setText(Jugador);
		funcion(); btn7F3C1.setEnabled(false);}
		
		
	);
		
		
		btn8F3C2.setBounds(275, 350 ,50, 50);
		
		btn8F3C2.addActionListener(e -> {btn8F3C2.setText(Jugador);
		funcion(); btn8F3C2.setEnabled(false);}
		
		
	);
		
		
		btn9F3C3.setBounds(350, 350 , 50, 50);
		
		btn9F3C3.addActionListener(e -> {btn9F3C3.setText(Jugador);
		funcion(); btn9F3C3.setEnabled(false);}
		
		
		
		
	);
		
		panel.add(btn2F1C2);
		panel.add(btn3F1C3);
		panel.add(btn4F2C1);
		panel.add(btn5F2C2);
		panel.add(btn6F2C3);
		panel.add(btn7F3C1);
		panel.add(btn8F3C2);
		panel.add(btn9F3C3);
		
		btnLimpiar.addActionListener(e -> {btn1F1C1.setText(" ");
		btn1F1C1.setText(" ");
		btn1F1C1.setEnabled(true);
		
		btn2F1C2.setText(" ");
		btn2F1C2.setEnabled(true);
		
		btn3F1C3.setText(" ");
		btn3F1C3.setEnabled(true);
		
		btn4F2C1.setText(" ");
		btn4F2C1.setEnabled(true);
		
		btn5F2C2.setText(" ");
		btn5F2C2.setEnabled(true);
		
		btn6F2C3.setText(" ");
		btn6F2C3.setEnabled(true);
		
		btn7F3C1.setText(" ");
		btn7F3C1.setEnabled(true);
		
		btn8F3C2.setText(" ");
		btn8F3C2.setEnabled(true);
		
		btn9F3C3.setText(" ");
		btn9F3C3.setEnabled(true);
		
		}
		);
	}
	
	public void funcion() {
		if (Jugador == "O") { 
			Jugador = "X";
		}
		else { Jugador = "O";
		      }
//		if  (btn1F1C1.getText()==btn2F1C2.getText() && btn3F1C3.getText()==btn1F1C1.getText() && btn1F1C1.getText() != ".")
//		{
//			JOptionPane.showMessageDialog(panel, "Ganaste1"); // linea arriba
//		}
//		else if  (btn4F2C1.getText()==btn5F2C2.getText() && btn6F2C3.getText()==btn4F2C1.getText() && btn1F1C1.getText() != ".")
//		{
//			JOptionPane.showMessageDialog(panel, "Ganaste2"); // linea medio
//		}
//		if  (btn7F3C1.getText()==btn8F3C2.getText() && btn9F3C3.getText()==btn7F3C1.getText() && btn7F3C1.getText() != ".")
//		{
//			JOptionPane.showMessageDialog(panel, "Ganaste1"); // linea abajo
//		}
//		if  (btn1F1C1.getText()==btn5F2C2.getText() && btn9F3C3.getText()==btn1F1C1.getText() && btn1F1C1.getText() != ".")
//		{
//			JOptionPane.showMessageDialog(panel, "Ganaste1"); // diagonal 1 , 5 , 9
//		}
//		if  (btn3F1C3.getText()==btn5F2C2.getText() && btn7F3C1.getText()==btn3F1C3.getText() && btn3F1C3.getText() != ".")
//		{
//			JOptionPane.showMessageDialog(panel, "Ganaste1"); // diagonal 3 , 5 , 7
//		}
//		if  (btn2F1C2.getText()==btn5F2C2.getText() && btn8F3C2.getText()==btn2F1C2.getText() && btn2F1C2.getText() != ".")
//		{
//			JOptionPane.showMessageDialog(panel, "Ganaste1"); // recta 2, 5, 8
//		}
		chequearenabled(btn1F1C1, btn2F1C2 , btn3F1C3);
		chequearenabled(btn4F2C1, btn5F2C2, btn6F2C3);
		chequearenabled(btn7F3C1, btn8F3C2, btn9F3C3);
		chequearenabled(btn1F1C1, btn5F2C2, btn9F3C3);
		chequearenabled(btn3F1C3, btn5F2C2, btn7F3C1);
		chequearenabled(btn2F1C2, btn5F2C2, btn8F3C2);
		
		// ahora hacer un if que diga si se cumplen los action listener de arriba se reinicie 
		
		
		
		
		
}
	public void chequearenabled(JButton boton1 , JButton boton2, JButton boton3)
	{
		if (!boton3.isEnabled())
		{
			System.out.println("boton3 enabled");
			if(!boton1.isEnabled())
			{
				System.out.println("boton1 enabled");
				if(!boton2.isEnabled())
				{
					System.out.println("boton2 enabled");
				}
			}
			
			if((boton1.getText()==boton2.getText() && boton3.getText()==boton1.getText()))
			{
				JOptionPane.showMessageDialog(panel, "Ganaste1"); 
			}
			
			
		}
	}
		
	
	public void ejercicio4_GI()
	{
		int cantidadIntegrantes = 0;
		char tipoVivienda;
		String nombYApellido;
		short edad;
		char sexo;
		char nivelEstudios;
		char indicador;
		Scanner sc= new Scanner(System.in);
		
		while(cantidadIntegrantes >= 0)
		{
			System.out.println("Ingrese la cantidad de integrantes");
			cantidadIntegrantes = sc.nextInt();
			System.out.println("Ingrese el tipo de vivienda");
			tipoVivienda = sc.next().charAt(0);
			
			for(int i = 0; i < cantidadIntegrantes; i++)
			{
				System.out.println("Ingrese el nombre y apellido");
				nombYApellido = sc.next();
				System.out.println("Ingrese la edad");
				edad = sc.nextShort();
				System.out.println("Ingrese el sexo");
				sexo = sc.next().charAt(0);
				System.out.println("Ingrese el nivel de estudios: N,P,S,T,U");
				nivelEstudios = sc.next().charAt(0);
				System.out.println("Ingrese si esta completo o no: C, I");
				indicador = sc.next().charAt(0);
				
				if (((nivelEstudios == 'p') && (indicador == 'P')) && ((indicador == 'C')) || ((indicador == 'c'))) 
				{
					System.out.println("--------------------------------------------------------------------------------");
					System.out.println("nombre y apellido");
					System.out.println("edad");
					System.out.println("sexo");
					System.out.println("tipo de vivienda");
					
					
					
					
					
					System.out.println(nombYApellido);
					System.out.println(edad+ " ");
					System.out.println(sexo+ " ");
					System.out.println(tipoVivienda+ " ");
					System.out.println("--------------------------------------------------------------------------------");
				}
			}
		}
	}
	
	public void ejercicio3_GI()
	{
		int infracciones=0;
		double acumulador=0;
		double acumulador2=0;
		char gravedad=' ';
		double gravedad2=0;
		int contador=0;
		int continuar=0;
		
		
		Scanner sc= new Scanner(System.in);
		
		
		while (continuar >=0) 
		{
			
			System.out.println("Ingrese infracciones 1 , 2 , 3 , 4 y una letra que indique la gravedad (L, M, G)");
			
			
			infracciones = sc.nextInt();
			gravedad = sc.next().charAt(0);
			
			/*
			 Esto es la declaracion de valores para cada infraccion osea cuanto vale cada infraccion
		    */
			
			if (infracciones == 1) {         
				infracciones = 100;
			}
				
			if (infracciones == 2) {         
				infracciones = 250;
			}
				
			if (infracciones == 3) {
				infracciones = 400;
			}
				
			if (infracciones == 4) {
				infracciones = 450;
			}
				
			/*
			 Esto es la declaracion de valores para la gravedad osea cuanto vale el nivel de gravedad
		    */
			
		    switch(gravedad) {
		    case 'L':
		    case 'l':
		    	gravedad = 1;
		    	break;
		    case 'M':
		    case 'm':
		    	gravedad2 = 1.25;
		    	break;
		    case 'G':
		    case 'g':
		    	gravedad2 = 1.45;
		    	contador++;
		    	break;





		    }
		     
			
			
			acumulador = (acumulador + infracciones)*gravedad2;
			
			acumulador2= acumulador2 + acumulador;
			acumulador=0;
			System.out.println("Ingrese un numero negativo para terminar");
			continuar=sc.nextInt();
			
		}
		System.out.println("la suma de todas las infracciones mas el nivel de gravedad es " + acumulador2);
		
		if (contador >=3) 
		{
			System.out.println("Cerrar fabrica");
		}
	}
		
		
		

		
//	}
//	public void ejercicio1_GI()
//	{
//		int i = 0;
//		int j;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Ingrese un numero entero");
//		j = sc.nextInt();
//
//		int contador = 0;
//
//		for (i = 0; i < j; i = i + 3) {
//			if (( i%3 )==0 &&! ((i%5)==0))
//				contador = contador + 1;
//			}
//
//		System.out.println(i);
//	}
//
//	System.out.println("los multiplos de 3 son " + contador);
//	
//		
//}

	public void palabrasYcaracteres()
	{
		char caracter;

		int contadorA = 0;
		int contadorE = 0;
		int contadorI = 0;
		int contadorO = 0;
		int contadorU = 0;
		int contadorPalabras = 0;
		int palabraMasLarga = 0;
		int contadorCaracteres = 0;
		
	Scanner sc= new Scanner(System.in);
		
		System.out.println("Ingrese caracteres, un punto para finalizar.");
		/* Para leer un char habia escrito sc.next().charAt(0); 
		 * La funcion next() lee hasta donde encuentra un espacio,
		 * La funcion nextLine() lee hasta donde encuentra un enter,
		 * Para lo que quiero hacer en este caso necesito usar nextLine()
		 */
		
		caracter = sc.nextLine().charAt(0);
		contadorCaracteres++;
		
		while(caracter != '.')
		{
			
//			if((caracter == 'a') || (caracter == 'A'))
//			{
//				contadorA++;
//			}
//			if((caracter == 'e') || (caracter == 'E'))
//			{
//				contadorE++;
//			}
//			if((caracter == 'i') || (caracter == 'I'))
//			{
//				contadorI++;
//			}
//			if((caracter == 'o') || (caracter == 'O'))
//			{
//				contadorO++;
//			}
//			if((caracter == 'u') || (caracter == 'U'))
//			{
//				contadorU++;
//			}
			
			switch(caracter)
			{
				case 'A':
				case 'a':
					contadorA++;
					break;
				case 'E':
				case 'e':
					contadorE++;
					break;
				case 'I':
				case 'i':
					contadorI++;
					break;
				case 'O':
				case 'o':
					contadorO++;
					break;
				case 'U':
				case 'u':
					contadorU++;
					break;
				case ' ':
					contadorPalabras++;
					if(palabraMasLarga < contadorCaracteres)
					{
						palabraMasLarga = contadorCaracteres;
					}
					contadorCaracteres = 0;
					break;
			}
			try //este try lo agregue para poder poner si me equivoco varias veces enter y que no se detenga la ejecucion del programa
			{
				caracter = sc.nextLine().charAt(0);//no puede leer el caracter en la posicion 0 si ingreso un enter
				if ((caracter != '.') && (caracter != ' '))
				{
					contadorCaracteres++;
				}
				System.out.println("contadorCaracteres " + contadorCaracteres); 
			}
			catch(Exception ex){
				
			}

		}
		
		System.out.println("Ingresaron " + contadorA + " letras A");
		System.out.println("Ingresaron " + contadorE + " letras E");
		System.out.println("Ingresaron " + contadorI + " letras I");
		System.out.println("Ingresaron " + contadorO + " letras O");
		System.out.println("Ingresaron " + contadorU + " letras U");
		System.out.println("La cantidad de palabras es " + (contadorPalabras + 1));
		System.out.println("La cantidad de letras de la palabra mas larga es " + palabraMasLarga);
	}

}
