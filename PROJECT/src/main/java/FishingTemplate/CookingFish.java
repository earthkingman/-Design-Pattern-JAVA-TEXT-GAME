/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FishingTemplate;

public abstract class CookingFish {
    
    public final void prepareRecipe() throws InterruptedException{
        trimFish();
         Thread.sleep(1000);
        cookFish();
         Thread.sleep(1000);
        addSeasoning();
         Thread.sleep(1000);
        PutOnPlate();
         Thread.sleep(1000);
    }
    
    protected abstract void cookFish();
    protected abstract void addSeasoning();
    
    private void trimFish(){
        System.out.println("생선을 손질합니다.....손 조심하세요");
    }
    
    private void PutOnPlate(){
        System.out.println("성공 !!!  접시에 담습니다 ");
    }
    
}
