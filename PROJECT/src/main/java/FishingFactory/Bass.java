/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FishingFactory;

/**
 *
 * @author 박얼찬
 */
public class Bass extends Fish {
    
    
    public Bass(){
    
    name = "베스";
        habitat = "강";
        money = 500;
       
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
    
    @Override
    public int tryToCatchFish(){
        int n = (int) (Math.random() * 10) + 1;
        if(n>6){//값을 높여주면 잡기 어려워집니다.
            System.out.println("n값이 " +n);
            return success();
        }
        else{
            System.out.println("n값이 "+n);
            return fail();
        }
    }
    
    
}
