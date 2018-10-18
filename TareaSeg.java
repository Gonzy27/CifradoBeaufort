/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaseg;

import java.util.LinkedList;


/**
 *
 * @author fmuno
 */
public class TareaSeg {
    
    char[] clave1 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', '�', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    char[] clave2 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', '�', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    LinkedList<String[]> tablas = new LinkedList();
    String[] tabla0 = {"A", "Z", "Y", "X", "W", "V", "U", "T", "S", "R", "Q", "P", "O", "�", "N", "M", "L", "K", "J", "I", "H", "G", "F", "E", "D", "C", "B"};
    String[] tabla1 = {"B", "A", "Z", "Y", "X", "W", "V", "U", "T", "S", "R", "Q", "P", "O", "�", "N", "M", "L", "K", "J", "I", "H", "G", "F", "E", "D", "C"};
    String[] tabla2 = {"C", "B", "A", "Z", "Y", "X", "W", "V", "U", "T", "S", "R", "Q", "P", "O", "�", "N", "M", "L", "K", "J", "I", "H", "G", "F", "E", "D"};
    String[] tabla3 = {"D", "C", "B", "A", "Z", "Y", "X", "W", "V", "U", "T", "S", "R", "Q", "P", "O", "�", "N", "M", "L", "K", "J", "I", "H", "G", "F", "E"};
    String[] tabla4 = {"E", "D", "C", "B", "A", "Z", "Y", "X", "W", "V", "U", "T", "S", "R", "Q", "P", "O", "�", "N", "M", "L", "K", "J", "I", "H", "G", "F"};
    String[] tabla5 = {"F", "E", "D", "C", "B", "A", "Z", "Y", "X", "W", "V", "U", "T", "S", "R", "Q", "P", "O", "�", "N", "M", "L", "K", "J", "I", "H", "G"};
    String[] tabla6 = {"G", "F", "E", "D", "C", "B", "A", "Z", "Y", "X", "W", "V", "U", "T", "S", "R", "Q", "P", "O", "�", "N", "M", "L", "K", "J", "I", "H"};
    String[] tabla7 = {"H", "G", "F", "E", "D", "C", "B", "A", "Z", "Y", "X", "W", "V", "U", "T", "S", "R", "Q", "P", "O", "�", "N", "M", "L", "K", "J", "I"};
    String[] tabla8 = {"I", "H", "G", "F", "E", "D", "C", "B", "A", "Z", "Y", "X", "W", "V", "U", "T", "S", "R", "Q", "P", "O", "�", "N", "M", "L", "K", "J"};
    String[] tabla9 = {"J", "I", "H", "G", "F", "E", "D", "C", "B", "A", "Z", "Y", "X", "W", "V", "U", "T", "S", "R", "Q", "P", "O", "�", "N", "M", "L", "K"};
    String[] tabla10 = {"K", "J", "I", "H", "G", "F", "E", "D", "C", "B", "A", "Z", "Y", "X", "W", "V", "U", "T", "S", "R", "Q", "P", "O", "�", "N", "M", "L"};
    String[] tabla11 = {"L", "K", "J", "I", "H", "G", "F", "E", "D", "C", "B", "A", "Z", "Y", "X", "W", "V", "U", "T", "S", "R", "Q", "P", "O", "�", "N", "M"};
    String[] tabla12 = {"M", "L", "K", "J", "I", "H", "G", "F", "E", "D", "C", "B", "A", "Z", "Y", "X", "W", "V", "U", "T", "S", "R", "Q", "P", "O", "�", "N"};
    String[] tabla13 = {"N", "M", "L", "K", "J", "I", "H", "G", "F", "E", "D", "C", "B", "A", "Z", "Y", "X", "W", "V", "U", "T", "S", "R", "Q", "P", "O", "�"};
    String[] tabla14 = {"�", "N", "M", "L", "K", "J", "I", "H", "G", "F", "E", "D", "C", "B", "A", "Z", "Y", "X", "W", "V", "U", "T", "S", "R", "Q", "P", "O"};
    String[] tabla15 = {"O", "�", "N", "M", "L", "K", "J", "I", "H", "G", "F", "E", "D", "C", "B", "A", "Z", "Y", "X", "W", "V", "U", "T", "S", "R", "Q", "P"};
    String[] tabla16 = {"P", "O", "�", "N", "M", "L", "K", "J", "I", "H", "G", "F", "E", "D", "C", "B", "A", "Z", "Y", "X", "W", "V", "U", "T", "S", "R", "Q"};
    String[] tabla17 = {"Q", "P", "O", "�", "N", "M", "L", "K", "J", "I", "H", "G", "F", "E", "D", "C", "B", "A", "Z", "Y", "X", "W", "V", "U", "T", "S", "R"};
    String[] tabla18 = {"R", "Q", "P", "O", "�", "N", "M", "L", "K", "J", "I", "H", "G", "F", "E", "D", "C", "B", "A", "Z", "Y", "X", "W", "V", "U", "T", "S"};
    String[] tabla19 = {"S", "R", "Q", "P", "O", "�", "N", "M", "L", "K", "J", "I", "H", "G", "F", "E", "D", "C", "B", "A", "Z", "Y", "X", "W", "V", "U", "T"};
    String[] tabla20 = {"T", "S", "R", "Q", "P", "O", "�", "N", "M", "L", "K", "J", "I", "H", "G", "F", "E", "D", "C", "B", "A", "Z", "Y", "X", "W", "V", "U"};
    String[] tabla21 = {"U", "T", "S", "R", "Q", "P", "O", "�", "N", "M", "L", "K", "J", "I", "H", "G", "F", "E", "D", "C", "B", "A", "Z", "Y", "X", "W", "V"};
    String[] tabla22 = {"V", "U" ,"T", "S", "R", "Q", "P", "O", "�", "N", "M", "L", "K", "J", "I", "H", "G", "F", "E", "D", "C", "B", "A", "Z", "Y", "X", "W"};
    String[] tabla23 = {"W", "V", "U" ,"T", "S", "R", "Q", "P", "O", "�", "N", "M", "L", "K", "J", "I", "H", "G", "F", "E", "D", "C", "B", "A", "Z", "Y", "X"};
    String[] tabla24 = {"X", "W", "V", "U" ,"T", "S", "R", "Q", "P", "O", "�", "N", "M", "L", "K", "J", "I", "H", "G", "F", "E", "D", "C", "B", "A", "Z", "Y"};
    String[] tabla25 = {"Y", "X", "W", "V", "U" ,"T", "S", "R", "Q", "P", "O", "�", "N", "M", "L", "K", "J", "I", "H", "G", "F", "E", "D", "C", "B", "A", "Z"};
    String[] tabla26 = {"Z", "Y", "X", "W", "V", "U" ,"T", "S", "R", "Q", "P", "O", "�", "N", "M", "L", "K", "J", "I", "H", "G", "F", "E", "D", "C", "B", "A"};
    char[] listallave;
    char[] listamensaje;
    char[] cadena;

    public void llenar() {
        tablas.add(tabla0);
        tablas.add(tabla1);
        tablas.add(tabla2);
        tablas.add(tabla3);
        tablas.add(tabla4);
        tablas.add(tabla5);
        tablas.add(tabla6);
        tablas.add(tabla7);
        tablas.add(tabla8);
        tablas.add(tabla9);
        tablas.add(tabla10);
        tablas.add(tabla11);
        tablas.add(tabla12);
        tablas.add(tabla13);
        tablas.add(tabla14);
        tablas.add(tabla15);
        tablas.add(tabla16);
        tablas.add(tabla17);
        tablas.add(tabla18);
        tablas.add(tabla19);
        tablas.add(tabla20);
        tablas.add(tabla21);
        tablas.add(tabla22);
        tablas.add(tabla23);
        tablas.add(tabla24);
        tablas.add(tabla25);
        tablas.add(tabla26);

    }
    String[][] codigos = new String[27][27];

    public void llenarmatriz() {
        for (int j = 0; j < codigos.length; j++) {
            for (int i = 0; i < codigos[j].length; i++) {
                codigos[i][j] = tablas.get(j)[i];
            }
        }
    }
  
    public void inicio() {
        llenar();
        llenarmatriz();
    }

    public int getPos(char letra) {
        int tope = clave1.length;
        for (int i = 0; i < tope; i++) {
            if (clave1[i]==letra || clave2[i]==letra) {
                return i;
            }
        }
           return 28;
    }

    public String cifrar(char letraLlave, char letraOriginal) {
        String letraCod;
        int llave = getPos(letraLlave);
        int original = getPos(letraOriginal);
        letraCod = codigos[original][llave];
        return letraCod;
    }
    //ayuda con las posiciones en la matriz
     public char decifrar(char letraLlave, char letraCodigo) {
        char letraCod;
        int llave = getPos(letraLlave);
        int original=28;
         for (int i = 0; i < codigos.length; i++) {
             if(codigos[i][llave].charAt(0)==letraCodigo){
                 original=i;
             }
         }
        letraCod = clave1[original];
        return letraCod;
    }

    public String codificar(String llave, String mensaje) {

        listallave = llave.toCharArray();
        String msj=mensaje.replaceAll(" ", "");
        listamensaje = msj.toCharArray();
        int tamanoLLave = listallave.length;
        int tamanoMensaje = listamensaje.length;
        String cifrado = "";
        for (int i = 0; i < tamanoMensaje; i++) {
            if(listamensaje[i]==' '){
                cifrado+=" ";
            }else{
                int aux=i%tamanoLLave; 
                cifrado = cifrado + cifrar(listallave[aux], listamensaje[i]);
            System.out.println(aux+ " " +listallave[aux] +" + " + listamensaje[i] + " = "+ cifrar(listallave[aux], listamensaje[i]));
        }}
        for (int i = 0; i < mensaje.length(); i++) {
            if(mensaje.charAt(i)==' '){
                String parte1=cifrado.substring(0, i);
                String resto= cifrado.substring(i);
                parte1+=" ";
                cifrado= parte1+resto;
            }
        }
      
        return cifrado;
    }
    public String decodificar(String llave, String mensaje) {
        listallave = llave.toCharArray();
        String msj=mensaje.replaceAll(" ", "");
        listamensaje = msj.toCharArray();
        int tamanoLLave = listallave.length;
        int tamanoMensaje = listamensaje.length;
        String decifrado = "";
        //has los cambios para q muestre llave por llave
        for (int i = 0; i < tamanoMensaje; i++) {
                int aux=i%tamanoLLave; 
                decifrado = decifrado + decifrar(listallave[aux], listamensaje[i]);
            System.out.println(aux+ " " +listallave[aux] +" + " + listamensaje[i] + " = "+ decifrar(listallave[aux], listamensaje[i]));
        }
       
       for (int i = 0; i < mensaje.length(); i++) {
            if(mensaje.charAt(i)==' '){
                String parte1=decifrado.substring(0, i);
                String resto= decifrado.substring(i);
                parte1+=" ";
                decifrado= parte1+resto;
            }
        }
        return decifrado;
    }

}
