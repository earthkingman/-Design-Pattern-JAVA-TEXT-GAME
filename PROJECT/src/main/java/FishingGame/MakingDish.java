/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FishingGame;

import FishingTemplate.Sushi;
import FishingTemplate.GrilledFish;
import FishingTemplate.BraisedFish;
import FishingTemplate.CookingFish;

/**
 *
 * @author 박얼찬
 */



public class MakingDish {
    CookingFish myDish1 ;
    CookingFish myDish2;
    CookingFish myDish3;
   MakingDish(){
        myDish1 = new BraisedFish(); 
        myDish2 = new GrilledFish();
        myDish3 = new Sushi();
   }
   
   public void makesushi() throws InterruptedException{
   
        myDish3.prepareRecipe();
        System.out.println("---------초밥 완성------------");
   }
   
   
   
   public void makeGrill() throws InterruptedException{

        myDish2.prepareRecipe();
        System.out.println("---------생선구이 완성-----------");
       
   }
   
   
  public void braised() throws InterruptedException{
  
      myDish1.prepareRecipe();
      System.out.println("-----생선조림 완성---------");
  }
   
 public void showdish(){
 
         System.out.println("---- 조리방법 선택---------");
         System.out.println("1 . 생선조림    ");
         System.out.println("2. 생선구이  ");
         System.out.println("3. 초밥 ");
 
 }

}