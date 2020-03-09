//Final Project: BKJ Home Alarm System

/*Setting up the Customer Class */

import java.util.*;

class Customer{
    private String name;

    private Address a;

    private int EmergencyContact;

    private int login_pin;

    /*Setting up the fields */

    public Customer(){

    }

    public Customer(String name, Address a, int login_pin){

    }

    public void setName(String name){

    }

    public String getName(){
        return "";   //Remove later

    }

    public void setAddress(Address a){

    }
    
    public Address getAddress(){
        return null;   //remove later

    }

    public void setContact(int EmergencyContact){

    }

    public int getContact(){
        return 0;    //remove later

    }

    public void setPin(int login_pin){

    }

    public int getPin(){
        return 0;    //remove later

    }

    public String toString(){
        return " ";
    }

}

class Address{
    private String address_name;

    private int HouseNumber;

    private int numOfFloors;

    private int zip_code;

    public Address(){

    }

    public Address(String address_name, int HouseNumber, int numOfFloors){

    }

    public void setName(String address_name){

    }

    public String getName(){
        return "";     //remove later

    }

    public void setHouseNumber(int HouseNumber){

    }

    public int getHouseNumber(){
        return 0;    //remove later
    }

    public void setnumOfFloors(int numOfFloors){

    }

    public int getnumOfFloor(){
        return 0;    //remove later
    }

    public void setZip_Code(int zip_code){

    }

    public int getZipCode(){
        return 0;    //remove later
    }

    public String toString(){
        return "";   //remove later
    }
}