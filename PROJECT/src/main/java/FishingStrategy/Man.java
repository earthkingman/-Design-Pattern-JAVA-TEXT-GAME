/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FishingStrategy;

/**
 *
 * @author 박얼찬
 */

public abstract class Man {
  
       private String name;
       private int fishingability;
       private int money;
      
       private FishingStrategy fishingStrategy;
     
    public Man(String name, int money,int fishingability) {
     
        this.name=name;
        this.fishingability=fishingability;
        this.money=money;

  }
     public void setFishing(int a){
          fishingability=fishingability+a;                            
     }
     public void setMoney(int a){
     
     money=money+a;
     } 
   
     public String getName(){return name;}
    public int getMoney(){return money;}
    public int getfishingability(){return fishingability;}
   
     
     


 

    
    
    
    public  void fishing(Man man)  
    { 
      
      fishingStrategy.fishing(man);
           
        
  }

  public void setFishingStrategy(FishingStrategy fishingStrategy) {
  this.fishingStrategy=fishingStrategy;
  
  }

 

  
  
}
