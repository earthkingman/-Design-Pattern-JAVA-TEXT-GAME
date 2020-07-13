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
public class RainyState implements State {
    
      private static RainyState instance = new  RainyState();

            public static State getInstance(){
            return instance ;
  }
          
          
          
          
    @Override
    public void Shining(WeatherData wheatherdata) {
    
      wheatherdata.setState(SunnyState.getInstance());   // RainyDay ->SunnyDay
              System.out.println("날씨 정보 : 비가 그치고 해뜸");
              System.out.println("위험 경보 : 보통 ");
              
    
    }

    @Override
    public void Clouding(WeatherData wheatherdata) {
     
    
              System.out.println("날씨 정보: 여전히 흐림 폭우");
              System.out.println("위험 경보 : 최상 ");
    
    }
    
    
    
}
