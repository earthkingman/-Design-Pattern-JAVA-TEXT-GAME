/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FishingFactory;

    public abstract class FishingPlace {
    
    public abstract Fish catchFish(int ability);
    
    
    public Fish Fishing(int ability) throws InterruptedException{
        Fish fish = catchFish(ability);
        System.out.println("-낚싯대를 " + fish.getHabitat() + "에 던집니다.");
        System.out.println("...............................................");
        Thread.sleep(1000);
         System.out.println("............입질이 옵니다............................");
         Thread.sleep(1000);
         System.out.println("..휘리릭휘리리릭..........낚시대를 잡아올렸습니다......");
         Thread.sleep(1000);
    
          Thread.sleep(1000);
        if(fish.tryToCatchFish() == 1){
            System.out.println(fish.getMoney() + "골드 짜리 " + fish.getName() +"을 잡았습니다!");
                System.out.println("--------------------------------------------");
            System.out.println("경고!!!");
                 fish.note();  // 강 바다 호수마다 물고기의 주의점이 다르므로 정의 하지만 물고기는 잡혀야만 정보를 알수있으니 팩토리메소드패턴  사용 이유 
                 System.out.println("--------------------------------------------");
               Thread.sleep(1000);
        }
        return fish;
    }
}
