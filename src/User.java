/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vladi
 */
class User {
    private String pname,address;
    
    public User(String pname,String address){
        this.pname=pname;
        this.address=address;
    }
    public String getpname(){
        return pname;
    }
    public String getaddress(){
        return address;
    }
}
