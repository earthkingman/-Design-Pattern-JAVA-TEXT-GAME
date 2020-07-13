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
public class Goldfish extends Fish{
    
    public Goldfish(){
    
       name = "금붕어";
        habitat = "호수";
    }
    public void note(){
        System.out.println("호수에서 낚시하면 경찰에 잡혀갑니다 조심하세요");
    }
    
}
