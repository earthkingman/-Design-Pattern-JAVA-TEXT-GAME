/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FishingTemplate;

public class BraisedFish extends CookingFish {
    @Override
    protected void cookFish(){
        System.out.println("생선을 냄비에 넣고 조립니다.");
    }
    @Override
    protected void addSeasoning(){
        System.out.println("고추장등으로 만든 양념장을 넣습니다.");
    }
}
