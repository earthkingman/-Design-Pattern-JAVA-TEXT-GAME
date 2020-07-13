/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FishingGame;

import FishingStrategy.EarthwormStrategy;
import FishingStrategy.Man;
import FishingStrategy.ShrimpStrategy;
import FishingStrategy.SquidStrategy;
import java.util.Scanner;

/**
 *
 * @author 박얼찬
 */
public class SelectBait {
        Scanner scan = new Scanner (System.in);
 int a=0;
       
  
  public void changeBait(Man man){
  
   System.out.println("미끼를 선택해주세요" );
          System.out.println(" 1. 지렁이     50원   [낚시능력 + 1] " );
          System.out.println(" 2. 새끼오징어 100원　 [낚시능력 + 2] " );
          System.out.println(" 3. 새우     　300원  [낚시능력 + 3]" );
       
       int choose = scan.nextInt();
 
      if(choose==1){

           man.setFishingStrategy(new EarthwormStrategy());
           man.fishing(man); //스트레티지 패턴
             a=1;
     
           System.out.println(" 낚시능력  : " + man.getfishingability());
           System.out.println(" 돈  : " + man.getMoney());
             System.out.println("-------------------------------------------------");
      }
       
       if(choose==2){
     
            man.setFishingStrategy(new SquidStrategy());  
            man.fishing(man); //스트레티지 패턴 
            
            a=2;
   
           System.out.println("낚시능력  : " + man.getfishingability());
           System.out.println("돈  : " + man.getMoney());
             System.out.println("-------------------------------------------------");
        
      }
   
      if(choose==3){

          
           man.setFishingStrategy(new ShrimpStrategy());
           man.fishing(man); //스트레티지 패턴
      
              a=3;
            
           System.out.println("낚시능력  : " + man.getfishingability());
           System.out.println("돈  : " + man.getMoney());
           System.out.println("-------------------------------------------------");
      }
      
      man.setFishing(-a);  //미끼 사용하고 다시 원래대로 돌려야함
      
  }

}
