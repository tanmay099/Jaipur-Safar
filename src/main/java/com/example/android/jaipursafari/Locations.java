package com.example.android.jaipursafari;


public class Locations {
    private  String Address;
    private  String Cityname;

public Locations(){
    super();
}

   public  Locations(String address,String city) {
       super();
       this.Address = address;
       this.Cityname = city;
   }
    @Override
    public String toString() {
        return this.Address + ". " + this.Cityname + " ";
    }
}
