/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FishingFactory;

public class Tuna extends Fish {
    public Tuna(){
        name = "참치";
        money = 500;
        habitat = "바다";
    }
    
    @Override
    public int success(){
        System.out.println("잡기 어려운 물고기를 잡았습니다!");
      catches=1;
        return 1;
    }
    
    @Override
    public int fail(){
        System.out.println("잡기 어려워서 놓쳤습니다.");
        return 0;
    }
    
     public void note(){
          System.out.println(" 이 물고기는 바다에 살아서 찌린내가 많이납니다 ");
        
    }
    
    @Override
    public int tryToCatchFish(){
        int n = (int) (Math.random() * 10) + 1;
        if(n>9){//값을 높여주면 잡기 어려워집니다.
         
          
            return success();
        }else{
       
            return fail();
        }
    }
}
