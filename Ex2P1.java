/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2p1;

import java.util.Scanner;

/**
 *
 *  Faça um programa de Gestão que seja capaz de armazenar e manipular informações relativas aos funcionários de uma empresa X. Esses funcionários possuem como informações os atributos matricula (int), nome (String), departamento (int), salário (double) e cargo (String). Escreva um método main para testar todas as funcionalidades desenvolvidas por meio de um menu. O seu programa deve conter os seguintes métodos:

a. método para adicionar funcionários;

b. método para atualizar as informações de um funcionário (informando a sua matrícula);

c. método que possa imprimir a folha de pagamento informando o nome dos funcionários e os seus respectivos salários e cargos;

d. método que possa retornar o valor total da folha de pagamento;

e. método que possa retornar o nome do funcionário que recebe o maior salário;

f. método que possa retornar o nome do funcionário que recebe o menor salário;

g. método para exibir todos os funcionários que recebam salários em uma faixa de valor estipulada (valor X <= salário <= valor Y).

h. método que possa receber como parâmetro o número de um determinado departamento e mostrar o nome, o cargo e salário de todos os funcionários daquele departamento;
 */
public class Ex2P1 {

    /**
     * @param args the command line arguments
     */
   
    public static void addFunc(int matricula[], String nome[], 
            int departamento[],double salario[], String cargo[], int cont ){
       Scanner s = new Scanner(System.in);
       int i =0;
        if(cont > 1){
            System.out.println("-------------------------------");
            System.out.println("[> SISTEMA Sobrescrevera funcionarios ]");
            System.out.println("para vizualizar mais de um adicione todos juntos...");   
        }
       
          for(i = 0; i < matricula.length; i++){       
          System.out.println("-----------------------");
          System.out.print("Matricula func(num): ");
          matricula[i] = s.nextInt();
          System.out.print("Nome: ");
          nome[i] = s.next();
          System.out.print("Departamento(num): ");
          departamento[i] = s.nextInt();
          System.out.print("Salario: ");
          salario[i] = s.nextDouble();
          System.out.print("Cargo: ");
          cargo[i] = s.next();
          }
     
      
       }
        
    public static void attFunc(int matbusc, int matricula[], String nome[], int departamento[],double salario[], String cargo[]){
    Scanner s = new Scanner(System.in);
    
       for(int i=0; i < matricula.length; i++){
           if(matbusc == matricula[i]){
               System.out.println("Funcionario [" + nome[i] + "] Encontrado! ");
               System.out.println("Oque deseja alterar? ");
               System.out.println("1 - matricula: ");
               System.out.println("2 - nome: ");
               System.out.println("3 - departamento: ");
               System.out.println("4 - salario: ");
               System.out.println("5 - cargo: ");
               System.out.print("Escolha: ");
               int opt = s.nextInt();
               switch(opt){
                   case 1:{
                       System.out.println("--Alterar Matricula--");
                       System.out.print("Nova matricula: ");
                       int newmat = s.nextInt();
                       matricula[i] = newmat;
                       System.out.println("-Ok");
                       break;
                   }
                   case 2:{
                       System.out.println("--Alterar Nome--");
                       System.out.print("Novo Nome: ");
                       String newnam = s.next();
                       nome[i] = newnam;
                       System.out.println("-Ok");
                       break;
                   }
                   case 3:{
                       System.out.println("--Alterar Departamento--");
                       System.out.print("Novo Departamento: ");
                       int newdep = s.nextInt();
                       departamento[i] = newdep;
                       System.out.println("-Ok");
                       break;
                   }
                    case 4:{
                       System.out.println("--Alterar Salario--");
                       System.out.print("Novo salario: ");
                       Double newsal = s.nextDouble();
                       salario[i] = newsal;
                       System.out.println("-Ok");
                       break;
                   }
                     case 5:{
                       System.out.println("--Alterar Cargo--");
                       System.out.print("Novo cargo: ");
                       String newcarg = s.next();
                       cargo[i] = newcarg;
                       System.out.println("-Ok");
                       break;
                   }
                   default:{
                       System.out.println("Opcao invalida! ");
                   }
               }
           }
       }
          
    }
    public static void impfolha(int matricula[], String nome[], int departamento[],double salario[], String cargo[]){
      
        for (int i = 0; i < nome.length ; i++) {
            System.out.println("----------------------");
            System.out.println("Funcionario: "+ nome[i]);
            System.out.println("Salario: "+ salario[i]);
            System.out.println("Cargo: "+ cargo[i]);
            
        }
        System.out.println("----------------------");
    }
    public static int menu(){
        System.out.println("1 -Adicionar Funcionarios");
        System.out.println("2 -Atualizar Funcionaros");
        System.out.println("3 -Imprimir Folha");
        System.out.println("4 -Valor total folha");
        System.out.println("5 -Funcionario Maior Salario");
        System.out.println("6 -Funcionario menor Salario");
        System.out.println("7 -Imprimir Todos Funcionarios que recebem [$ Salario]");
        System.out.println("8 -Departamento Info");
        System.out.println("9 -Cargo Info");
        System.out.println("> 0- Sair");
        System.out.print("Escolha opcao: ");
        Scanner s = new Scanner(System.in);
        int opt = s.nextInt();
        return opt;
        
    }
    public static double valtotfolha(double salario[]){
        double totval = 0;
            for (int i = 0; i < salario.length; i++) {
            totval = totval + salario[i];
        }
        
        return totval;
    }
    public static String maiorSal(String nome [], double salario[]){
        double aux = 0;
        String nam = "";
        for (int i = 0; i < nome.length; i++) {
            if(salario[i] > aux){
                aux = salario[i];
                nam = nome[i];
            }
        }
        
        return nam;
    }
    public static String menorSal(String nome [], double salario[]){
        double maiorsal = 0;
        double menorsal =0;
        String nam = "";
        for (int i = 0; i < nome.length; i++) {
            if(salario[i] > maiorsal){
                maiorsal = salario[i];       
               // nam = nome[i];
            }   
        }
        for (int i = 0; i < nome.length; i++) {
            if(salario[i] < maiorsal){
                menorsal = salario[i];
                nam = nome[i];
            }
        }
        

        return nam;
    }
    public static void faixasal(String nome[], double salario[],double x ,double y){
        
        
        for (int i = 0; i < nome.length; i++) {
            if(x <= salario[i] && y >= salario[i]){
                System.out.println("Funcionario "+ nome[i]+" esta na faixa entre "+ x + " e " + y +".. ");
                System.out.println("Com salario de >" + salario[i]);
                System.out.println("-------------------");
            }
        }
    
    }
    
    public static void depinfo(int depbusc,int departamento [], String nome[],String cargo[] ,double salario[]){
        
        for (int i = 0; i < nome.length; i++) {
            if(depbusc == departamento[i] ){
                 System.out.println("-----------------");
                 System.out.println("Usuarios do departamento ["+ depbusc + "]");
                System.out.println("nome: "+ nome[i]);
                 System.out.println("salario: "+salario[i]);
                  System.out.println("cargo: "+ cargo[i]);
                  System.out.println("-----------------");
            }
        }
    }
    public static void cargbusc(String cargbusc, String nome[],String cargo[] ){
    
    for (int i = 0; i < nome.length; i++) {
            if(cargbusc.equals(cargo[i]) ){
                 System.out.println("-----------------");
                 System.out.println("Usuarios do cargo ["+ cargbusc + "]");
                System.out.println("nome: "+ nome[i]);
                 System.out.println("-----------------");
            }
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner s = new Scanner(System.in);
        System.out.println("--------Tesla--------");
       // int opt = menu();
        int opt = -1; 
        //System.out.println("Opcao escolhida > " + opt);
//        String vetfun[] = new String[1];
        int tam =3;
        int matricula[] = new int[tam];
        String nome[] = new String[tam];
        int departamento[] = new int[tam];
        double salario[] = new double[tam];
        String cargo[] = new String[tam];
        int cont =0;
        
        while(opt != 0){
            opt = menu();
            
            switch(opt){
                case 1:{
                System.out.println("----Adiciona Funcionarios-----"); 
                 System.out.print("Quantos Funcionarios? ");
                 tam = s.nextInt();

    //              vetfun = new String[tam];
                    matricula = new int[tam];   
                    nome = new String[tam];
                    departamento = new int[tam];
                    salario = new double[tam];
                    cargo = new String[tam];
                        //System.out.println(vetfun.length);  
                     cont++;
                    addFunc(matricula, nome, departamento, salario, cargo, cont);
      
                    break;
                }
                
                case 2:{
                 System.out.println("----Atualiza Funcionario-----");
                 System.out.print("Informe a [matricula]: ");
                 int matbusc = s.nextInt();
                 attFunc(matbusc, matricula, nome, departamento, salario, cargo);
                 break;
                }
                
                case 3:{
                System.out.println("----Imprime Folha-----");
                    impfolha(matricula, nome, departamento, salario, cargo);
                  break;  
                }
                case 4:{
                 System.out.println("----Valor total Folha-----");
                 double totval = valtotfolha(salario);
                 System.out.println("Valor total Folha: "+ totval);
                 System.out.println("------------------");
                 break;
                }
                case 5:{
                    System.out.println("----Funcionario Maior Salario-----");
                    String name = maiorSal(nome, salario);
                    System.out.println("Funcionario ["+name+"] tem maior salario");
                    break;
                }
                case 6:{
                    System.out.println("----Funcionario Menor Salario-----");
                    String name = menorSal(nome, salario);
                    System.out.println("Funcionario ["+name+"] tem menor salario");
                    break;
                }
                case 7: {
                 System.out.println("----Faixa salarial entre-----");
                    System.out.println("Digite faixa salaria x e y: ");
                    System.out.print("1 valor x:");
                    double x = s.nextInt();
                    System.out.print("2 valor y:");
                    double y = s.nextInt();
                  faixasal(nome, salario, x , y);
                    System.out.println("------------");
                  break;
                }
                case 8:{
                System.out.println("------Departamento info-----");
                System.out.print("Qual departamento: ");
                int depbusc = s.nextInt();
                depinfo(depbusc,departamento, nome, cargo ,salario);
                break;
                }
                case 9:{
                System.out.println("------Cargo info-----");
                System.out.print("Qual cargo: ");
                String cargbusc = s.next();
                cargbusc(cargbusc, nome, cargo );
                break;
                }
                default:{
                   
                    break;
                }
            }
        }
    }
    
}
