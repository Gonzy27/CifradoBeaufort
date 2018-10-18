/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaseg;

/**
 *
 * @author fmuno
 */
public class test {
	public static void main(String[] args) {
		TareaSeg test = new TareaSeg();
		test.inicio();
		String llave = "pan";
		String mensaje = "pan con queso";		
		String codigo = test.codificar(llave, mensaje);		
		System.out.println("Mensaje cifrado: "+codigo);
               String deco= test.decodificar(llave, codigo);
               System.out.println("Mensaje decifrado: "+deco);
	}
}
