package practica1;

import java.time.LocalTime;

public class Practica {

	static void primerMetodo(int x) {
		System.out.println(x);
	}

	static void metodo1(int a, String b, boolean c) {
		// instrucciones
		System.out.println("resultado: ");
	}

	// public static void main (String [] args) {
	// primerMetodo(7);
	// }

//1 Escribir un metodo para encontrar el área de un triángulo a partir de 3 lados ingresados                                     
	// Revisar si es un triángulo válido

	static void metodoTriangulo(double ladoA, double ladoB, double ladoC) {
		double sp = (ladoA + ladoB + ladoC) / 2;
		double area = Math.sqrt(sp * (sp - ladoA) * (sp - ladoB) * (sp - ladoC));
		System.out.println("EL area del triangulo es: " + area);

	}

	// 2 Escribir un metodo para encontrar el area y la circumferencia de un circulo
	// dado el radio
	// Utilizar PI de la libreria de Java

	static void metodoCirculo(float radio) {
		double area = Math.PI * radio * radio;
		double circunferencia = 2 * Math.PI * radio;
		System.out.println("La circunferencia y el area del circulo son: " + circunferencia + " " + area);
	}

	// 3 Escribir un metodo que muestre por consola la hora del sistema
	// Utilizar e investigar la libreria de Java

	static void metodoHora() {
		LocalTime hora = LocalTime.now();
		System.out.println("La hora del sistema es: " + hora);
	}

	// 4 Escribir un metodo que convierta n cantidad de segundos a (hora, minutos,
	// segundos) segun sea el caso
	// ej 3600 = "1 hora = 60 min = 3600 seg"

	static void metodoSegundos(int seg) {
		double hora = seg / 3600;
		double min = seg / 60;
		System.out.println(seg + " segundos es igual a " + min + " minutos" + " que es igual a " + hora + "hora(s)");
	}

	// 5 Escribir un metodo para encontrar el volumen de una esfera dado el radio
	static void metodoEsfera(float radio) {
		double volumen = (4 / 3) * Math.PI * Math.pow(radio, 3);
		System.out.println("El volumen de la esfera es: " + volumen);

	}

	// 6 Escribir un metodo para encontrar el volumen de un cono a dado el radio y
	// la altura
	static void metodoCono(double radio, double altura) {
		double volumen = (1.0 / 3.0) * Math.PI * Math.pow(radio, 2) * altura;
		System.out.println("El volumen del cono es: " + volumen);
	}

	// 7 Encontrar el area superficial de un cubo dado un lado a
	static void metodoCubo(double ladoA) {
		double areaSuperficial = 6 * Math.pow(ladoA, 2);
		System.out.println("El area superficial del cubo es: " + areaSuperficial);
	}

	// 8 Escribir un metodo para descubrir si un año ingresado es bisiesto o no
	static void metodoBisiesto(int anio) {
		if (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0)) {
			System.out.println(anio + " Es año bisiesto");
		} else {
			System.out.println(anio + " No es año bisiesto");
		}

	}

// 9. Escribir mostrar en pantalla los primeros 100 numeros primos
	static void metodoPrimos() {
		int count = 0;
		int num = 2;

		while (count < 100) {
			boolean sp = true;
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					sp = false;
					break;
				}
			}
			if (sp) {
				System.out.println(num);
				count++;
			}
			num++;
		}
	}

// 10. Escribir un programa para sumar 2 numeros sin usar operadores aritmeticos

// 11. Escribir un método para verificar si un numero positivo de 2 digitos es
// palindromo

	static void metodoPalindromo(int num) {
		if (num > 9 && num < 100) {
			char[] sNum = (Integer.toString(num)).toCharArray();
			if (sNum[0] == sNum[1]) {
				System.out.println(String.valueOf(sNum) + " es Palindromo");
			} else {
				System.out.println(String.valueOf(sNum) + " No es Palindromo");
			}
		} else {
			System.out.println(num + " No es un numero de dos digitos");
		}

	}
// 12. Sin usar loops, escribir un metodo para sumar todos los digitos de un
// numero donde 99 >= n >= 10

	static void metodoDigitos(int n) {
		if (n < 10 || n > 99) {
			System.out.println("Ingresa un numero de dos digitos (entre 10 y 99)");
		} else if (n == 0) {
			System.out.println("La suma de los digitos es: 0");
		} else {
			int suma = n % 10 + n / 10;
			System.out.println("La suma de los digitos es: " + suma);
		}
	}
// 13. Escribir un método para remover espacios en blanco de un String. ej ->
// "Hola Mundo" -> "HolaMundo"

	static void metodoString(String cadena) {
		String sinEspacios = cadena.replaceAll("\\s+", "");
		System.out.println("La cadena sin espacios es: " + sinEspacios);

	}

// 14. Escribir un método para invertir un String. ej -> "Hola" -> "aloH" ---
// Sin usar loops

	static void metodoInvertirString(String s) {
		if (s.length() <= 1) {
			System.out.println("Ingresa un string de al menos 2 caracteres");
		} else {
			String invertido = new StringBuilder(s).reverse().toString();
			System.out.println("El string invertido es: " + invertido);
		}
	}
// 15x. Escribir un metodo para encontrar el factorial de un numero sin loops

	static void metodoFactorial(int num) {
		int factorial = 1;
		int originalNum = num;
		if (num == 0 || num == 1) {
			System.out.println("El factorial de " + num + " es 1");
		} else {
			while (num > 1) {
				factorial *= num;
				num--;
			}
			System.out.println("El factorial de " + originalNum + " es " + factorial);
		}
	}

	public static void main(String[] args) {
		metodoTriangulo(10, 5, 10);
		metodoCirculo(8);
		metodoHora();
		metodoSegundos(3600);
		metodoEsfera(25);
		metodoCono(6, 19);
		metodoCubo(7);
		metodoBisiesto(2023);
		metodoPrimos();
		metodoPalindromo(19);
		metodoDigitos(18);
		metodoInvertirString("Hola");
		metodoString("Hola Mundo");
		metodoFactorial(6);
	}

}
