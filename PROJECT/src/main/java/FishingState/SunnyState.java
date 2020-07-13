/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FishingState;

/**
 *
 * @author 박얼찬
 */
public class SunnyState implements State{
    
    private static SunnyState instance = new SunnyState();
    
  public static State getInstance(){
      return instance ;
  }
    

    @Override
    public void Shining(WeatherData wheatherdata) {
        
     System.out.println("날씨 정보: 여전히 맑음");
     System.out.println("위험 경보 : 최저 ");
 
    }
    
    @Override
    public void Clouding(WeatherData wheatherdata) {
       
         wheatherdata.setState(CoolState.getInstance());    // SunnyDay ->CoolDay
            System.out.println("날씨 정보: 비 조금 흐려짐");
            System.out.println("위험 경보 : 보통 ");
    }
  
}
