package Ejercicios;

import java.util.Scanner;

public class PracticaJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ejercicio4();
	}
	private static void ejercicio4()
	{
		short nota1 = 0;
		short nota2 = 0;
		short nota3 = 0;
		float promedio;
		
		Scanner sc = new Scanner(System.in);
		try 
		{
		
		
		
		System.out.println("Ingrese un numero del 1 al 10");
		nota1 = (short) sc.nextInt();
		
		System.out.println("Ingrese otro numero del 1 al 10");
		nota2 = (short) sc.nextInt();
		
		System.out.println("Ingrese otro numero del 1 al 10");
		nota3 = (short) sc.nextInt();
		
		if ((nota1 >=0) && (nota1 <= 10) && (nota2 >=0) && (nota2 <= 10) && (nota3 >= 0) && (nota3 <= 10))
		{
			promedio = (nota1 + nota2 + nota3) / 3;
			
			if ((nota1 >= 4) && (nota2 >= 4) && (nota3 >=4) && (promedio >=4))
			{
				System.out.println("El alumno esta aprobado");
			}
			else
			{
				System.out.println("El alumno esta desaprobado");
			}
		}
		else
		{
			System.out.println("no se pudo calcular, verifique las notas ingresadas");
		}
			}
    catch(Exception ex)
		{
		}
	