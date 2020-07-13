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
public interface State {
void Shining(WeatherData wheatherdata); 
void Clouding(WeatherData wheatherdata);

}
