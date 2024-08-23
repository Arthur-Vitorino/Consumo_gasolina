package main;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Adicione a Distancia total percorrida (km): ");
		int distancia = scanner.nextInt();
		
		System.out.print("Adicione o combustivel total gasto (L): ");
		int combustivelGasto = scanner.nextInt();
		
		int consumoMedio = distancia / combustivelGasto;
		
		System.out.println("O consumo medio de gasolina e (km/l): "+consumoMedio);
		scanner.close();
	}

}
