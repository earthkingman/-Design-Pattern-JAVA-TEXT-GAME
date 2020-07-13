/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FishingFactory;

public class Fish {
    
    protected String name;
    //protected int power;
    protected int money;
    protected String habitat;
    protected int catches; //물고기 잡힌 여부를 확인하기위해 사용
    
    public String getName(){
        return name;
    }
    /*public int getPower(){
        return power;
    }*/
    public int getMoney(){
        return money;
    }
    public String getHabitat(){
        return habitat;
    }
      public int getcatches(){
        return catches;  //잡힌 여부를위해 사용
    }
      
    public int success(){
        System.out.println(" 물고기를 잡았습니다!");
         catches=1;
        return 1;
       
    }
    public int fail(){
        System.out.println("물고기를 놓쳤습니다!");
        return 0;
    }
    
    public void note(){
          System.out.println(" 이 물고기는 기생충이 있을 확률이 있습니다 ");
        
    }
    
    
    
    public int tryToCatchFish(){
       
        int n = (int) (Math.random() * 10) + 1;
        if(n>4){
            //System.out.println("n값이 " +n); //잘 동작하는지 확인하려구 해놓은것 입니당..
           
            return success();
            
        }else{
           // System.out.println("n값이 "+n); //마찬가지..
            return fail();
        }
    }
    
}
