/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FishingState;

import FishingStrategy.Man;

/**
 *
 * @author 박얼찬
 */
public class WeatherData {

    public State state = new CoolState();


    
public void setState(State state) {
    this.state = state;
}

public void Shining(){

 state.Shining(this);

}; 
public void Clouding(){ 

state.Clouding(this);


};

    }




