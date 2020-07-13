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
public class CoolState implements State{
    
      private static  CoolState instance = new  CoolState();

        public static State getInstance(){ //지금 상태를 반환하기 위해 정의한 함수
      return instance ;
  }
      
      
    @Override
    public void Shining(WeatherData wheatherdata) {
     
       wheatherdata.setState(SunnyState.getInstance());    // CoolDay ->SunnyDay
              System.out.println("날씨 정보: 맑음");
              System.out.println("위험 경보 : 최저 ");
    
    }

    @Override
    public void Clouding(WeatherData wheatherdata) {
   
         
       wheatherdata.setState(RainyState.getInstance());    // CoolDay ->SunnyDay
            System.out.println("날씨 정보: 폭우");
            System.out.println("위험 경보 : 최상 ");
    
    }
    
    
}
