/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.선선한 날

 */
package FishingGame;

import FishingState.WeatherData;
import FishingStrategy.Man;

/**
 *
 * @author 박얼찬
 */
public class Weather { //StartGame 에 날씨 효과를 주기위한 클래스

        WeatherData weatherdata; //스테이트패턴 객체선언
               
    public Weather(){
     
        weatherdata= new WeatherData();      //스테이트패턴 객체    
}

    public void change() throws InterruptedException{

        int weather = (int) (Math.random() * 10) + 1;
           if(weather>5){//날씨 랜덤
               weatherdata.Shining();   //햇빛이 강해지는 경우
                 Thread.sleep(1000);

            }
              else{
               weatherdata.Clouding();  //날이 흐려지는 경우
                 Thread.sleep(1000);

   
                 
           }
        
}

    
    
 



}