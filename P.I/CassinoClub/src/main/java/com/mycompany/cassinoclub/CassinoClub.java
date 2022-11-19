
package com.mycompany.cassinoclub;
import java.util.Scanner;

public class CassinoClub {
    
    Scanner scan =new Scanner(System.in);
    int quant_V = 0;
    double carteira = 0;
    double aposta = 0;
    public static void main(String[] args) {
        
        CassinoClub in =new CassinoClub();
        
       in.MenuPrincipal();
    }//final do static main
    
    public void Tema1Q() {
       
            boolean continuar = false;
            
            do{
            System.out.println(" Quem ganhou mais bola de ouro?  ");
            System.out.println("(1)Messi ");
            System.out.println("(2)Cristiano Ronaldo");
            System.out.println("(3)Robert Lewandowsk");
            System.out.println("(4) Kylian Mbappé");
            System.out.println("(5) Ajuda ! ");
            int r1 = scan.nextInt();
            switch (r1){
                case 1 :
                    System.out.println("você errou!!");
                    MenuPrincipal();
                    break;
                    
                case 2 : 
                    System.out.println("você errou!");
                     MenuPrincipal();
                    break;
                    
                case 3 : 
                    System.out.println("você acertou!");
                     quant_V ++;
                     continuar = true;
                 
                    break;
                case 4 :
                    System.out.println("você errou!!");
                     MenuPrincipal();
                    break;
                    
                case 5 : 
                    System.out.println(" a dica é que já jogou ou joga no barcelona");
                    break;
                default:
                    System.out.println(" não existe essa opção, tente novamente!");
             } 
            }while (continuar == false);

             
           if(quant_V == 1){  
            while (continuar == true){
            System.out.println(" Qual é o melhor time de futebol feminin do mundo?  ");
            System.out.println("(1)Atlético");
            System.out.println("(2)Barcelona");
            System.out.println("(3)Corinthians");
            System.out.println("(4)Paris Saint German");
            System.out.println("(5) Ajuda ! ");
            int r1 = scan.nextInt();
            switch (r1){
                case 1 :
                    System.out.println("você errou!!");
                     MenuPrincipal();
                    break;
                case 2 : 
                    System.out.println("você errou!");
                    break;
                case 3 : 
                    System.out.println("você acertou!!");//certa
                    continuar = false;
                    quant_V ++;
                   
                    break;
                case 4 :
                    System.out.println("você errou!!");
                     MenuPrincipal();
                    break;
                    
                case 5 : 
                    System.out.println("você ");
                    break;
                 default:
                    System.out.println(" não existe essa opção, tente novamente!");   
            } 
         } 
       }else {
         MenuPrincipal();  
    }
            
          
          if(quant_V == 2){
              while (continuar == false){
          System.out.println(" Qual time Brasileiro tem mais títulos?  ");
            System.out.println("(1)Palmeiras");
            System.out.println("(2)Corinthians");
            System.out.println("(3)Santos");
            System.out.println("(4)Flamengo");
            System.out.println("(5) Ajuda ! ");
            int r1 = scan.nextInt();
            switch (r1){
                case 1 :
                 System.out.println("você acertou!");
                continuar = true;
                quant_V ++;
                    break;
                    
                case 2 : 
                    System.out.println("você errou!");
                     MenuPrincipal();
                    break;
                    
                case 3 : 
                    System.out.println("você errou !");
                     MenuPrincipal();
                    break;
                case 4 :
                    System.out.println("você errou!!");
                     MenuPrincipal();
                    break;
                    
                case 5 : 
                    System.out.println(" a dica é que já jogou ou joga no barcelona");
                     MenuPrincipal();
                    break;
                    
                default:
                    System.out.println(" não existe essa opção, tente novamente!");
                    
            }
          }
          }else {
         MenuPrincipal();
          }
            
           
          if(quant_V == 3){
          do{
            System.out.println(" Qual é a maior torcida Brasileira?  ");
            System.out.println("(1)Palmeiras");
            System.out.println("(2)São Paulo");
            System.out.println("(3)Corinthians");
            System.out.println("(4)Flamengo");
            System.out.println("(5) Ajuda ! ");
            int r1 = scan.nextInt();
            switch (r1){
                case 1 :
                    System.out.println("você errou!!");
                     MenuPrincipal();
                    break;
                    
                case 2 : 
                    System.out.println("você errou!");
                     MenuPrincipal();
                    break;
                    
                case 3 : 
                    System.out.println("você errou!");
                     MenuPrincipal();
                    break;
                    
                case 4 :
                    System.out.println("você acertou!");
                   quant_V ++;
                    continuar = false;
                    break;
                    
                case 5 : 
                    System.out.println("tem vermelho na logo do time ");
                     MenuPrincipal();               
                    break;
                    
                 default:
                    System.out.println(" não existe essa opção, tente novamente!");   
            } 
           }while (continuar == true);
          }else{
              MenuPrincipal();}
           
          
           if(quant_V == 4){
           while (continuar == false){
            System.out.println(" Qual time sofreu um gol de cobertura  do Adriano no jogo que foi 3x0 do Flamengo em 2009?  ");
            System.out.println("(1)Palmeiras");
            System.out.println("(2)Juventude");
            System.out.println("(3) Curitiba");
            System.out.println("(4) Goiás");
            System.out.println("(5) Ajuda ! ");
            int r1 = scan.nextInt();
            switch (r1){
                case 1 :
                    System.out.println("você errou!!");
                     MenuPrincipal();
                    break;
                case 2 : 
                    System.out.println("você errou!");
                     MenuPrincipal();
                    break;
                case 3 : 
                    System.out.println("você acertou!");
                     quant_V ++;
                      continuar = true ;
                 
                    break;
                case 4 :
                    System.out.println("você errou!!");
                     MenuPrincipal();
                    break;
                case 5 : 
                    System.out.println(" a dica ....... ");
                    break;
                    
               default:
                    System.out.println(" não existe essa opção, tente novamente!");
             } 
            }
           }else{
               MenuPrincipal();}
            if(quant_V == 5 ){
            aposta = carteira * 3;
                System.out.println("seu saldo é de : " +  carteira);
            }
         
        }//final do jogo do milhão
    
     public void Tema2Q(){}
    
    public void MenuJogo1(){
    
        System.out.println("bem vindo ao Quiz!");
        System.out.println("nesse jogo você tera oportunidade de triplicar seu dinheiro ao acertar 5 questões do tema que escolher");
        System.out.println("porem.... caso erre, perdera seu dinheiro, tem coragem?");
        System.out.println("digite s para sim e n para não");
        String respMen = scan.next();
        if(respMen.equalsIgnoreCase("s")){
            System.out.println("Gostei da sua coragem! :)");
            System.out.println("Vamos lá então! ");
            System.out.println(" mas antes você tem que apostar um valor ");
            System.out.print("quanto quer apostar : ");
            aposta=scan.nextDouble();
            if(aposta>carteira){
                System.out.println("saldo insuficiente !");
                System.out.println("quer voltar para o menu principal do cassino ou o menu do quiz ?");
                System.out.println("1 - para menu principarl.\n2 - para menu do quiz.");
                int respAposta = scan.nextInt();
                switch(respAposta){
                    case 1:
                        MenuPrincipal();
                    case 2 :
                        MenuJogo1 ();
                    default:
                        System.out.println("");
                        System.out.println("não existe esta opçõa, você sera realocado para o menu principal!");
                        MenuPrincipal();
                }
            }else{
            System.out.println("Escolha um tema ! \n1 - Futebol \n2 - Outro tema ");
          int respTema = scan.nextInt();
          switch(respTema){
              case 1 :
                   Tema1Q();
                   break;
              case 2 :
                  Tema2Q();
                  break;
              default:
                  System.out.println(" Não temos esse tema!");
                  MenuJogo1();
          }
        } 
       }else if(respMen.equalsIgnoreCase("N")){
            System.out.println("Entendo, talvez hoje não é seu dia, mas volte aqui quando tiver mais coragem ! :] ");
            MenuPrincipal();
        }
        
    }
      
    public void MenuPrincipal(){
     
         System.out.println("------------------------------------------------------");
         System.out.println("|Bem vindo ao nosso Cassino!!                        |");
         System.out.println("|Você quer depositar algum dineiro eum sua carteira ?|");
         System.out.println("| Respoda com S para sim e N para não!               |");
         String resposta=scan.next();
         System.out.println("");
         if (resposta.equalsIgnoreCase("S")){
         
         System.out.println("------------------------------------------------------");
         System.out.print("Deposite seu dinheiro aqui : ");
           carteira = scan.nextDouble();
           
         System.out.println("------------------------------------------------------");
         System.out.println("|Muito Bem!! Vamos começar                           |");
         System.out.println("|você quer joga qual jogo ?                          |");
         System.out.println("------------------------------------------------------");
         System.out.println("");
         System.out.println("------------");
         System.out.println("|(1) Quiz  |");
         System.out.println("------------");
         int respJogo = scan.nextInt();
         switch(respJogo){
             case 1:
                 MenuJogo1();
                 break;
             default:
                 System.out.println("não existe esta opção, tente novamente!");
                 MenuPrincipal();
         }
         
         }else if (resposta.equalsIgnoreCase("N")){
             
            if(carteira != 0){
         System.out.println("|você quer joga qual jogo ?                          |");
         System.out.println("------------------------------------------------------");
         System.out.println("");
         System.out.println("------------");
         System.out.println("|(1) Quiz  |");
         System.out.println("------------");
         int respJogo = scan.nextInt();
         switch(respJogo){
             case 1:
                 MenuJogo1();
                 break;
             default:
                 System.out.println("não existe esta opção, tente novamente!");
                 MenuPrincipal();
         }
    }else{
                System.out.println("------------------------------------------------------");
                System.out.println("sua carteira esta vazia, deposite algum dinheiro!");
                MenuPrincipal();
            }   
  }
}      
    
    private static double VitoriJ1(double n1){
    
    
        return n1 * 3;
    
    
    }

    
}// final do cassino
