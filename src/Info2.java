/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vladi
 */
class Info2 {
    private int package_n,Weight;
    private String Fio, Package_type,Package_status,Country_out,Country_in,Fio_out,Fio_in,Post_num,Post_index,adres_in;
    
    public Info2 (String Fio, int package_n, int Weight,String Package_type,String Package_status,String Country_out,String Country_in,String Fio_out,String Fio_in,String Post_num,String Post_index,String adres_in ){
        
        this.Fio=Fio;
        this.package_n=package_n;
        this.Weight=Weight;
        this.Package_type=Package_type;
        this.Package_status=Package_status;
        this.Country_out=Country_out;
        this.Country_in=Country_in;
        this.Fio_out=Fio_out;
        this.Fio_in=Fio_in;
        this.Post_num=Post_num;
        this.Post_index=Post_index;
        this.adres_in=adres_in;
        
    }
    public String getFio(){
        return Fio;
    }
    
    public int getpackage_n(){
        return package_n;
    }
    public int getWeight(){
        return Weight;
    }
    
    public String getPackage_type(){
        return Package_type;
    }
    public String getPackage_status(){
        return Package_status;
    }
    public String getCountry_out(){
        return Country_out;
    }
    public String getCountry_in(){
        return Country_in;
    }
    public String getFio_out(){
        return Fio_out;
    }
    public String getFio_in(){
        return Fio_in;
    }
    public String getPost_num(){
        return Post_num;
    }
    public String getPost_index(){
        return Post_index;
    }
    public String getadres_in(){
        return adres_in;
    }
}
