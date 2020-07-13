/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FishingTemplate;

public class GrilledFish extends CookingFish{
    protected void cookFish(){
        System.out.println("생선을 후라이팬에 굽습니다.");
    }
    protected void addSeasoning(){
        System.out.println("소금 등의 양념을 칩니다.");
    }
    
}
