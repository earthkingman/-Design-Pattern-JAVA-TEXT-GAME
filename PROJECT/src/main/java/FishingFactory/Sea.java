/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FishingFactory;

public class Sea extends FishingPlace{
    
    @Override
    public Fish catchFish(int ability){
        if(ability<10){
            return new Shad();
        }else if (ability>=10){
            return new Tuna();
        }else{
            return null;
        }
    }
}
