/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FishingStrategy;

/**
 *
 * @author 박얼찬
 */
public class ShrimpStrategy implements FishingStrategy{

    @Override
    public void fishing(Man man) {
         System.out.println("---------------------------------------------------");
         System.out.println("새우 미끼 사용하셨습니다");
         System.out.println("300원을 지불하였습니다");
         System.out.println("낚시 능력이 3 만큼 증가했습니다");    
         System.out.println("---------------------------------------------------");
            man.setMoney(-300);
            man.setFishing(3);
    }

    
    
}
