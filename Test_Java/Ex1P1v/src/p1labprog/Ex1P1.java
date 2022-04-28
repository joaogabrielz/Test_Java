/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p1labprog;

/**
 *//  Criar um programa recursivo para determinar o valor do menor elemento 
//  ímpar de um vetor v[0 .. n-1], em que n corresponde 
//    ao número de elementos do vetor. (1,0)
 * 
 */
public class Ex1P1 {

    /**
     * @param args the command line arguments
     */

    public static int VetorRec(int []vet, int tam, int aux){
   
        if(tam > 0 ){
         if(vet[tam] % 2 != 0 ){
           if(vet[tam] > aux){
            aux = vet[tam];
            }  
           if(vet[tam] < aux){
            aux = vet[tam];
           }
         } 
         return VetorRec(vet,tam-1, aux ); 
      }
     
      return aux;  
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int vet[] = {0,2,1,5,9,10,0};
        int tam = vet.length-1;//8 tam vetor
        int aux = 1; //menor
     
        System.out.println(VetorRec(vet, tam, aux));
    }
    
}
