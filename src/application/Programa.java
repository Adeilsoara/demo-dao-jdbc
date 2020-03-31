package application;

import java.util.Date;

import model.entities.Departamento;
import model.entities.Vendedor;

public class Programa {

	public static void main(String[] args) {
		
		Departamento obj = new Departamento(1, "TI");
		
		Vendedor ven = new Vendedor(1, "Adeilson", "adeilsonaragao@gmail.com", new Date(), 10000.00, obj);
		
		System.out.println(ven);
	}

}
