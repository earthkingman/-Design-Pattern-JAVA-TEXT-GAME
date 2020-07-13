/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FishingGame;

import FishingFactory.Fish;
import FishingFactory.FishingPlace;
import FishingFactory.Lake;
import FishingFactory.River;
import FishingFactory.Sea;
import FishingStrategy.FishMan;
import FishingStrategy.Man;

import java.util.Scanner;

/**
 *
 * @author 박얼찬
 */
public class StartGame {
    
    
       Scanner scan = new Scanner (System.in);
       Weather weather = new Weather(); //날씨 변환기  스테이트패턴
       SelectBait bait=new SelectBait();//미끼 선택 스트레티지 패턴
        Market market = new Market(); //상점 데코레이터패턴
        FishingPlace sea = new Sea();  //물고기 생성 팩토리패턴
        FishingPlace river = new River(); //물고기 생성 팩토리패턴
        FishingPlace lake = new Lake(); //물고기 생성 팩토리패턴
        MakingDish dish =new MakingDish(); //요리를 하기 위한 템플릿 패턴
        Fish fish; //물고기의 정보를 수정하기 위해서 정의
     
         String[] basket = new String[5];//물고기를 담을 통
  
         
         
         int c=0;

       

       
       
     String message;
       int n=0;
   
    public StartGame() throws InterruptedException{
         System.out.println("\n☆☆☆☆☆☆강태공 게임을 시작하였습니다.☆☆☆☆☆☆\n");
         System.out.println("캐릭터 이름을 입력해주세요.");
  
          message = scan.nextLine();            // 키보드 문자 입력 
          Man man = new FishMan(message,1000,5);    //캐릭터 생성 기본으로 돈 1000 , 낚시능력치 5
          market.startiTem(man);
    
         while(true){
           
             
             
           showInfo(man);
          
           playgame();
           n= scan.nextInt();
               
              if(n==1){//낚시하기
              System.out.println("낚시하기를 선택하셨습니다 ");
             
               stage(man);
                  n=0;
              }
                if(n==2){
                System.out.println("강화하기를 선택하셨습니다 ");
                 market.start(man);
                     n=0;
                     market.attachedItem();
              }
      
             
               if(n==3){ 
                   
                  
               System.out.println("요리하기를 선택하셨습니다\n\n");
                          
   
                    for(int i=0 ; i<basket.length;i++){
                             
                              if(basket[i]!=null){
                             System.out.println((i+1)+" 번 "+basket[i]);
                            
                              }
                                   if(basket[i]==null){
                                System.out.println("비어있습니다");
                             }
                            
                      
                           }
                    n=0;
                    
                 
                      
                       int  k= scan.nextInt();
                     System.out.println(basket[k-1]+"를 선택하셨습니다 ");
                     basket[k-1]=null;
                    
                     n=0;
        
       
                           dish.showdish(); //요리방법 보여주기
                   
                                n= scan.nextInt();
                                
                         if(n==1){
                    dish.braised();  //매운탕 조리법
                   
                    }
                         if(n==2){
                    dish.makeGrill();  //생선구이 조리법
                    }
                         if(n==3){
                    dish.makesushi();  //초밥 조리법
                        
                    }
             
                  
                            n=0;
                       
              }
               
           if(n==4){ 
               System.out.println("-----------잡은 몰고기 ---------- ");
                         n=0;   
              
                         
                         for(int i=0 ; i<basket.length;i++){
                             
                              if(basket[i]!=null){ //
                             System.out.println(basket[i]);
                              }
                             if(basket[i]==null){
                                System.out.println("비어있습니다");
                             }
              
                         n=0;   
              
                         }
               
          
             
              }
           
           
            if(n==5){ 
               System.out.println("----------날씨 보기 ---------- ");
           
              }
           
           
           
    }
    }
    
        public void showInfo(Man man){
            System.out.println("------------------------------------------------");
           System.out.println("캐릭터 이름 : " + man.getName());
           System.out.println("낚시 능력치 : " + man.getfishingability());
           System.out.println("돈　　　    : " + man.getMoney()); 
          
           
       }
        
       public void playgame(){
       
      
           System.out.println("-------------  행동을 선택해주세요------------------");
           System.out.println("1. 낚시하러가기 ");
           System.out.println("2. 낚시도구 강화하러가기");
           System.out.println("3. 요리하기");
           System.out.println("4. 잡은 물고기 보기");
           System.out.println("---------------------------------------------------");
       }
    
      
       
       
       public void stage(Man man) throws InterruptedException{
         n=0;
         
        
           weather.change();
            
             System.out.println("낚시 능력치 : " + man.getfishingability()+"\n");
          System.out.println("---------------- 낚시터를 선택해주세요  -------------");
            System.out.println("1.바다 ");
            System.out.println("2.강 ");
            System.out.println("3.호수 ");
          System.out.println("---------------------------------------------------");
              n = scan.nextInt();            // 키보드 문자 입력
     
                if(n==1){ //바다가는경우
                System.out.println(" '바다' 에 입장하셨습니다. \n");
                    Thread.sleep(1000);
                bait.changeBait(man);  //미끼 선택
                 fish = sea.Fishing(man.getfishingability()); //사용자 능력에 따라 나오는 물고기가 다름
                    n=0;
                     
                    
                       if(fish.getcatches()==1){
                   
                        
                      System.out.println("1. 잡은 "+fish.getName()+" 를 판매 ");                   
                      System.out.println("2. 잡은 "+fish.getName()+" 를 가방에 넣기 ");
                        n = scan.nextInt();            // 키보드 문자 입력
                     
                       
                        if(n==1){
                      System.out.println(" 잡은"+fish.getName()+"를 판매하여 "+ fish.getMoney()+"만큼 돈을 얻었습니다");   
                          man.setMoney(fish.getMoney());
                           n=0;
                      }
                      
                        if(n==2){
                          System.out.println(" 잡은"+fish.getName()+"를 가방에 넣었습니다 ");  
                          basket[c]=fish.getName();
                          c++;
                           n=0;
                        }
             
                        
              }
                     
              }
                if(n==2){ //강가는 경우
                System.out.println("강 에 입장하셨습니다 \n");
                  Thread.sleep(1000);
                bait.changeBait(man);  //미끼 선택
                   fish = river.Fishing(man.getfishingability()); //사용자 능력에 따라 나오는 물고기가 다름
                      n=0;
                      
                     
                        
                        if(fish.getcatches()==1){
                   
                        
                      System.out.println("1. 잡은"+fish.getName()+"를 판매 ");                   
                      System.out.println("2. 잡은"+fish.getName()+"를 가방에 넣기 ");
                        n = scan.nextInt();            // 키보드 문자 입력
                     
                       
                        if(n==1){
                      System.out.println(" 잡은"+fish.getName()+"를 판매하여 "+ fish.getMoney()+"만큼 돈을 얻었습니다");   
                          man.setMoney(fish.getMoney());
                           n=0;
                      }
                      
                        if(n==2){
                          System.out.println(" 잡은"+fish.getName()+"를 가방에 넣었습니다 ");  
                          basket[c]=fish.getName();
                          c++;
                           n=0;
                        }
             
                        
              }
                      
                }
      
              if(n==3){ // 호수가는 경우
               System.out.println("호수 에 입장하셨습니다 \n");
                 Thread.sleep(1000);
                bait.changeBait(man); //미끼 선택
               
                
                fish = lake.Fishing(man.getfishingability()); //사용자 능력에 따라 나오는 물고기가 다름
                    n=0;
                     
                 if(fish.getcatches()==1){
                   
                        
                      System.out.println("1. 잡은"+fish.getName()+"를 판매 ");                   
                      System.out.println("2. 잡은"+fish.getName()+"를 가방에 넣기 ");
                        n = scan.nextInt();            // 키보드 문자 입력
                     
                       
                        if(n==1){
                      System.out.println(" 잡은"+fish.getName()+"를 판매하여 "+ fish.getMoney()+"만큼 돈을 얻었습니다");   
                          man.setMoney(fish.getMoney());
                           n=0;
                      }
                      
                        if(n==2){
                          System.out.println(" 잡은"+fish.getName()+"를 가방에 넣었습니다 ");  
                          basket[c]=fish.getName();
                          c++;
                           n=0;
                        }
             
                        
              }
      
              }
              
              
         
       
              
              
       }
    
       
       
       
       
      
       
       
       
    
}
