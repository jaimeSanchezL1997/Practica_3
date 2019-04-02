/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author jaime
 */
public class Practica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
       int cont1=0,cont2=0,cont3=0,cont4=0,cont5=0;
       FileReader fr = new FileReader("datos.txt");
BufferedReader bf = new BufferedReader(fr); 
       String sPalabra;
       String sCadena,cad="";
        while ((sCadena = bf.readLine())!=null) {
            cad=sCadena;
   System.out.println(sCadena);
        }
        
for(int x=0;x<cad.length();x++){
  if (cad.charAt(x)=='a'){ 
    cont1++;
  }
    if(cad.charAt(x)=='e'){
        cont2++;
    }
    if(cad.charAt(x)=='i'){
        cont3++;
    }
    if(cad.charAt(x)=='o'){
        cont4++;
    }
    if(cad.charAt(x)=='u'){
        cont5++;
    }
  }
        System.out.println("a"+cont1+"e"+cont2+"i"+cont3+"o"+cont4+"u"+cont5);
        
        
        
         try {
            String ruta = "ejemplo.txt";
            String contenido = ("A"+ cont1+"E"+cont2+"I"+cont3+"O"+cont4+"u"+cont5);
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }
    
}
