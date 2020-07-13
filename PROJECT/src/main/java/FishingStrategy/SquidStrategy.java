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
public class SquidStrategy implements FishingStrategy{


    @Override
    public void fishing(Man man) {
             System.out.println("---------------------------------------------------");
        System.out.println("새끼 오징어미끼를 사용하셨습니다");
           System.out.println("200원을 지불하였습니다");
        System.out.println("낚시 능력이 2 만큼 증가했습니다");
           man.setMoney(-200);
            man.setFishing(2);
               System.out.println("---------------------------------------------------");
    }


    
}
