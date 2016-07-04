package sample;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner; 

public class A { 

 public static void main(String[] args) throws IOException { 
  File file = new File("A"); 
  Scanner scan = new Scanner(file); 
  FileWriter wtr = new FileWriter("A_answer"); 
  // while (true) { 
  while (true) { 
   int a = scan.nextInt(); 
   if (a == 1) { 
    System.out.println("a" + a); 
   } 
   if (a == 0) { 
    break; 
   } 
   int b[] = new int[a]; 

   for (int i = 0; i < a; i++) { 
    b[i] = scan.nextInt(); 
   } 

   // for (int i = 0; i < a; i++) { 
   // System.out.println(b[i]); 
   // } 

   int sa[] = new int[a - 1]; 
   int min = 1000000; 
   for (int i = 0; i < a - 1; i++) { 
    for (int j = 0; j < a - 1; j++) { 

     int abs = b[i] - b[j]; 

     if (i == j) { 
      continue; 
     } 

     if (0 > b[i] - b[j]) { 
      abs = -abs; 
     } 

     if (abs < min) { 
      min = abs; 
     } 

    } 
    //sa[i] = min; 
    //min = 1000000; 
   } 

   //min = sa[0]; 
   //for (int i = 1; i < a - 1; i++) { 

    //if (min > sa[i]) { 
     //min = sa[i]; 
    //} 

   //} 

   System.out.println("min" + min); 
   wtr.write(min + "\r\n"); 
  } 
  wtr.flush(); 
  wtr.close(); 
 } 
}