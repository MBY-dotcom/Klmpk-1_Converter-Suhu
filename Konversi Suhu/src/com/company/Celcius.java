
package com.company;


public class Celcius {
    Main SA = new Main();
    double toFahrenheit(){
        //°F = °C × 1,8 + 32
        return (SA.SuhuAwal*1.8+32);
    }
    double toReamur(){
        //°Ré = °C × 0,8
        return (SA.SuhuAwal*0.8);
    }
    double toKelvin(){
        //K = °C + 273,15
        return (SA.SuhuAwal+273.15);
    }
}