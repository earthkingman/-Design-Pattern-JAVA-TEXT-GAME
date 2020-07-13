/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FishingFactory;

/**
 *
 * @author samsung
 */
public class Lake extends FishingPlace{
        
    @Override
    public Fish catchFish(int ability){
        if(ability<10){
               return new Goldfish();
       
        }else if (ability>=10){
              return new Catfish();
        }
        
        else{
            return null;
        }
    }
}
