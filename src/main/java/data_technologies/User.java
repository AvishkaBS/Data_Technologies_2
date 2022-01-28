/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_technologies;

/**
 *
 * @author Avishka
 */
class User {
private int id;
    private String name, address, mobile, email, username, password;
    
    public User(int Customer_ID, String Customer_Name, String Customer_Address, String Customer_Mobile, String Customer_Email, String Username, String Password)
    {
        this.id=Customer_ID;
        this.name=Customer_Name;
        this.address=Customer_Address;
        this.mobile=Customer_Mobile;
        this.email=Customer_Email;
        this.username=Username;
        this.password=Password;
    }
    public int getid()
    {
        return id;
    }
    
    public String getname()
    {
        return name;
    }
     
    public String getaddress()
    {
        return address;
    }
    
    public String getmobile()
    {
        return mobile;
    }
      
    public String getemail()
    {
        return email;
    }
     
    public String getusername()
    {
        return username;
    }
     
    public String getpassword()
    {
        return password;
    }
}
