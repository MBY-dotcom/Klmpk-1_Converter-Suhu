package com.company;


public class Reamur {
    Main SA = new Main();
    double toFahrenheit(){

        return (SA.SuhuAwal*2.25+32);
    }
    double toKelvin(){
        //K = °Ré / 0,8 + 273,15
        return (SA.SuhuAwal/0.8+237.15);
    }
    double toCelcius(){
        //°C = °Ré / 0,8
        return (SA.SuhuAwal/0.8);
    }
}
