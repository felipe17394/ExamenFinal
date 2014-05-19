/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package final_201212762;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


/**
 *
 * @author Felipe
 */
public class Final_201212762 {
    static String ruta;
    int general= 0;
    int casos[];   
    public void leerArchivo(){
     
          try { 
File inFile = new File(ruta); 
BufferedReader reader = new BufferedReader(new FileReader(inFile)); 

//... Continuar el ciclo mientras haya líneas que leer. 
String line = null;

while ((line=reader.readLine()) != null) { 
   String no1 = "", no2 = "";
int contador = 0;
String cadena = "";
int tamaño;
int cont = 0;
int contVer = 0;
char a, b;


    if (contador == 0){
        tamaño = Integer.parseInt(line);
         this.casos = new int[tamaño];
                contador++;
    }else if(contador >0){
        cadena = line;
        for(int i = 0; i < cadena.length(); i++){
        while(cadena.charAt(i) != ' '){
           if (cont ==0){
               no1 = no1+ cadena.charAt(i);
            i++;
            }else if(cont ==1){
               no2 = no2+cadena.charAt(i);
               i++;
        }
           for(int j = Integer.parseInt(no1); j < Integer.parseInt(no2);j++){
               for(int k = Integer.parseInt(no1); k < Integer.parseInt(no2); k++){ 
                    for(int j1 = 0; j1 < no1.length();j1++){
                    for(int k1 = 0; k1 < no2.length(); k1++){ 
                         a = Integer.toString(j).charAt(j1);
                         b = Integer.toString(k).charAt(k1);
                          if(a == b){
                           contVer++;
                         }
                         if(contVer == Integer.toString(j).length()){
                             casos[general] = casos[general]++;
                    }
                    }
                
           }
           }
          
           }
           }
           
        }
        cont++;
        general++;
        }
        
    }
        


reader.close( ); 
} catch (Exception e) { 
        
} 
    }
  public  Final_201212762(){
        leerArchivo();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Final_201212762 examenFinal = new Final_201212762();
         examenFinal.ruta = args[0];
    }
}
