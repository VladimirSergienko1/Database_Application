/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vladi
 */
class UserT {
    private int cashier_id,Age,Service_type,Experience;
    private String Fio,Number;
    
    public UserT(int cashier_id, int Age, int Service_type,int Experience, String Fio,String Number){
        this.cashier_id=cashier_id;
        this.Age=Age;
        this.Service_type=Service_type;
        this.Experience=Experience;
        this.Fio=Fio;
        this.Number=Number;
    }
    public int getcashier_id(){
        return cashier_id;
    }
    public int getAge(){
        return Age;
    }
    public int getService_type(){
        return Service_type;
    }
    public int getExperience(){
        return Experience;
    }
    public String getFio(){
        return Fio;
    }
    public String getNumber(){
        return Number;
    }
}
