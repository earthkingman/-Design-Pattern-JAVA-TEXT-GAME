/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FishingTemplate;

public class Sushi extends CookingFish{
    @Override
    protected void cookFish(){
        System.out.println("손질된 생선을 밥 위에 얹습니다.");
    }
    @Override
    protected void addSeasoning(){
        System.out.println("와사비를 추가합니다.");
    }
}
