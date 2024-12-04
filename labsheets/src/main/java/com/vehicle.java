package com;

public class vehicle {
String manufacturer;
String colour;
int year;
boolean startEngine;

public void  Vehicle(){
    this.manufacturer=" ";
    this.colour=" ";
    this.year=0;
    this.startEngine=false;

}

public void startEngine(){
    if(startEngine=true){
        System.out.println("Engine started");
    }
    else 
    System.out.println("Engine failed");
}
class car extends vehicle{

}
class lorry extends vehicle{

}


}
