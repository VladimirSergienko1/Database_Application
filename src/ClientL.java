 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vladi
 */
class ClientL {
    private int client_id,Age,Package_n;
    private String Fio,Sex,Id_number,IIN,Adress,Serv;
    
    public ClientL(int client_id, String Fio,int Age,String Sex,String Id_number,String IIN,String Adress,String Serv,int Package_n){
        this.client_id=client_id;
        this.Age=Age;
        this.Fio=Fio;
        this.Sex=Sex;
        this.Id_number=Id_number;
        this.IIN=IIN;
        this.Adress=Adress;
        this.Serv=Serv;
        this.Package_n=Package_n;
    }
    public int getclient_id(){
        return client_id;
    }
    
    public String getFio(){
        return Fio;
    }
    public int getAge(){
        return Age;
    }
    
    public String getSex(){
        return Sex;
    }
    public String getId_number(){
        return Id_number;
    }
    public String getIIN(){
        return IIN;
    }
    public String getAdress(){
        return Adress;
    }
    public String getServ(){
        return Serv;
    }
    public int getPackage_n(){
        return Package_n;
    }
    
}
