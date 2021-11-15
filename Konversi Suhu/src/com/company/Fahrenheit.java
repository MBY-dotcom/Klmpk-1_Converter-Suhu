package com.company;


public class Fahrenheit {
    Main SA = new Main();
    double toReamur(){
        //°Ré = (°F − 32) / 2,25
        return ((SA.SuhuAwal-32)/2.25);
    }
    double toKelvin(){
        //K = (°F + 459,67) / 1,8
        return ((SA.SuhuAwal+459.67)/ 1.8);
    }
    double toCelcius(){
        //°C = (°F − 32) / 1,8
        return ((SA.SuhuAwal-32)/1.8);
    }
}
