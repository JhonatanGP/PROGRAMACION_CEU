package tema04.EjBasicos01.Ej50;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class App {

	public static void main(String[] args) {
	// 1. Crea un Set vacío e imprímelo
		Set<Pais> conj = new HashSet<>(); 
		System.out.println(conj);
		
	/* 2. Crea tres países:
		a. ES / España
		b. CK / Islas Cook
		c. CK / Islas Caimán*/
		Pais p1 = new Pais("ES", "España");
		Pais p2 = new Pais("CK", "Islas Cook");
		Pais p3 = new Pais("CK", "Islas Caiman");
		
	// 3. Añade los 3 países al conjunto e imprímelo (Deberían aparecer 2. ¿Sabes por qué?)
		conj.add(p1);
		conj.add(p2);
		conj.add(p3);
		System.out.println(conj);

	// 4. Crea otro país (es / España) y añádelo al conjunto. Imprímelo.
		Pais p4 = new Pais("es", "España");
		conj.add(p4);
		System.out.println(conj);
	/* 5. ¿Qué podrías hacer para que no ocurriera lo del punto anterior (el que se puedan añadir países al conjunto que 
	      son iguales a otro, aunque el código esté en minúsculas)? Si sabes qué… hazlo y repite el punto anterior.*/
		
	// 6. Borra todos los países que no sean “ES” del conjunto. Luego imprímelo.
		Iterator<Pais> iterator = conj.iterator();
        while (iterator.hasNext()) {
            Pais pais = iterator.next();
            if (!pais.getCodigo().equals("ES")) {
                iterator.remove();
            }
        }
        System.out.println(conj);
	// 7. Vacía el conjunto. 
        conj.clear();
        System.out.println(conj);
	}
}
