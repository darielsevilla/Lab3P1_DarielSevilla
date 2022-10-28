
package lab3p1_darielsevilla;

import java.util.Scanner;

public class Lab3P1_DarielSevilla {
    
    public static void main(String[] args) {
        int menu;
        do{
            Scanner lea = new Scanner(System.in);
            //entrada
            System.out.println("\n--Menu--\n");
            System.out.println("1-Diptongo");
            System.out.println("2-Sumatoria Pi");
            System.out.println("3-Time clock");
            System.out.println("4-Salida");
            System.out.print("Opcion: ");
            menu = lea.nextInt();
            
            switch(menu){
                case 1:
                    System.out.println("--Opcion diptongo--\n");
                    System.out.print("Ingrese palabra: ");
                    String palabra = lea.next().toLowerCase();
                    int dip = 0;
                    //vocales 
                 
                    String vocales = "aeiou";
                    
                    for(int i = 0; i < palabra.length(); i++){
                      //buscador de vocales
                      int voc = 0;
                      for (int j = 0; j < vocales.length();j++){
                          if (palabra.charAt(i) == vocales.charAt(j)){
                              dip++;
                              voc++;
                          }
                              
                      }
                      
                      if(dip == 1 && voc == 0){
                          dip = 0;
                      }
                         
                    }
                    
                    
                      
                    //salida
                    if(dip >= 2){
                        System.out.println("La palabra es diptongo\n");
                    }
                    else{
                        System.out.print("La palabra no es diptongo\n");
                    }
                    break;
                case 2:
                    //entrada
                    System.out.println("\n--Opcion Sumatoria pi--\n");
                    System.out.print("Ingrese numero: ");
                    int lim = lea.nextInt();
                    double acu = 0;
                    //sumatoria
                    for(double i = 0; i < lim; i++){
                        int one = 0;
                        if( (int) i % 2 == 0){
                            one = 1;
                        }
                        else {
                            one = -1;
                        }
                        
                        double numBajo = (2 * i) + 1;
                        
                        acu += (one/numBajo);
                    }
                    //multiplicación
                    double resp = 4 * acu;
                    
                    System.out.printf("Resultado: %f%n", resp);
                    
                    break;
                case 3:
                    //Time clock
                    System.out.println("\n--Opcion time clock--\n");
                    float test;
                    int num1;
                    //entrada 
                    do{
                       System.out.print("Ingrese numero entero impar: ");
                       test = lea.nextFloat();
                       num1 = (int) test;
                    }while(test - num1 != 0 || num1 % 2 == 0);
                    //dibujo triangulo
                    int filMax = (num1 - 1)/2;
                    for(int i = 0; i < num1; i++){
                        int esp = i;
                        
                        if (i > filMax){
                            
                            esp = num1 - (i+1);
                        }
                        
                        for(int j = 0; j < esp; j++){
                            System.out.print(" ");
                        }
                        
                        for (int x = 0; x < num1 - (2*esp); x++){
                            System.out.print("*");
                        }
                        System.out.print("\n");
                       //x < (num1 - i) + (num1 - (i+1))
                    }
                    break;
               
            }
            
            
        }while(menu != 4);
    }
    
}
