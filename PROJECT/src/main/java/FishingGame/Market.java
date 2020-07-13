/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FishingGame;

import FishingStrategy.Man;
import java.util.Scanner;


/**
 *
 * @author 박얼찬
 */
public class Market {
        int i;
       int n=0;
     
  
       Scanner scan = new Scanner (System.in);
  
          Tool rod = new Tool_FishingRod();   //기본 낚시대생성
           Tool flo = new Tool_float(); //기본 찌
           Tool reel = new Tool_reel(); // 기본 릴
    
    public void start(Man man){
    
    
           System.out.println("낚시 강화백화점에 입장하셨습니다." );
            
           System.out.println("1 . 낚시대   2. 릴   3. 찌  " );

          int choose = scan.nextInt();
 
    
     if(choose==1){//낚시대 구입
       showMarketitem();
      n = scan.nextInt();
       
      
        switch(n) {  
              
           case 1: 
           rod = new Masterhand(rod);  //장인의 손길
              attach(man,rod);
               break;
           case 2: 
                   rod = new KangTaeGonghand(rod);  //강태공의 손길
                attach(man,rod);
                 break;
           case 3: 
               
           rod = new LeeJongMinhand(rod);  //이종민 교수님의 손길
                   attach(man,rod);
                  break;
           
        }
      n=0;     
     }
         
        
 
       
 
     if(choose==2){ ////릴 구입
         showMarketitem();
          n = scan.nextInt(); //숫자 받기
     
         switch(n) {  
              
           case 1: 
           reel = new Masterhand(reel);  //장인의 손길
             attach(man,reel);
                 break;
       
           case 2: 
                   reel = new KangTaeGonghand(reel);  //강태공의 손길
                    attach(man,reel);
                 break;
           case 3: 
               
           reel = new LeeJongMinhand(reel);  //이종민 교수님의 손길
            attach(man,reel);
                 break;
               
                    }
            n=0;
                            
      
       }
       
         
     if(choose==3){ //찌 구입
         showMarketitem();
            n = scan.nextInt();
 
           switch(n) {  
              
           case 1: 
           flo = new Masterhand(flo);  //장인의 손길
           attach(man,flo);
                      
           break;
           case 2: 
                   flo = new KangTaeGonghand(flo);  //강태공의 손길
                     attach(man,flo);
                 break;
           case 3: 
               
           flo = new LeeJongMinhand(flo);  //이종민 교수님의 손길
             attach(man,flo);
                 break;
               
              
       
                    }
            n=0;
         
      }
     
     
     
     
     
     
     
     
     
    
    }
    
    
    
    
    

    
         public void showMarketitem(){
         
      
          System.out.println("강화할  번호를 입력해주세요 " );
      
          System.out.println("------------------------------------------------" );
          System.out.println(" 1. 장인의 손길           50원   [낚시능력 + 1] " );
          System.out.println(" 2. 강태공의 손길         100원　 [낚시능력 + 2] " );
          System.out.println(" 3. 이종민 교수님의 손길 　150원  [낚시능력 + 3]" );
          System.out.println("--------------------------------------------" );

  
      }         
         
        

       
           
           
           public void attach(Man man,Tool tool){   //아이템 장착하기 
         
           
      
           man.setMoney(-tool.Cost());
           man.setFishing(tool.Increase_fishing());
       
     
     
           }
           
           
    
          
           
           public void attachedItem(){  //장착한 아이템 보기
     
     
        
           System.out.println("------------------------------------");
           System.out.println("낚시대 : "+ rod.getDescription());
              System.out.println("릴  : "+ reel.getDescription());
           System.out.println("찌  :"+  flo.getDescription());
        
           System.out.println("-------------------------------------------------");
     
     
     }
           
           
             public void startiTem(Man man){
     man.setFishing(rod.Increase_fishing()+flo.Increase_fishing()+reel.Increase_fishing());
      
           System.out.println("------------------------------------");
           System.out.println("         장착 아이템                  ");
           System.out.println("낚시대 : "+ rod.getDescription());
           System.out.println("릴  :"+   reel.getDescription());
           System.out.println("찌  : "+flo.getDescription());
          
           System.out.println("-------------------------------------------------");
     
     
       
     }
           
             
             
             
}

