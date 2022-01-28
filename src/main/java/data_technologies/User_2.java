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
class User_2 {
private int id;
    private String name, type, balance;
    
    public User_2(int Account_ID, String Account_Name, String Account_Type, String Account_Balance)
    {
        this.id=Account_ID;
        this.name=Account_Name;
        this.type=Account_Type;
        this.balance=Account_Balance;

    }
    public int getid()
    {
        return id;
    }
    
    public String getname()
    {
        return name;
    }
     
    public String gettype()
    {
        return type;
    }
    
    public String getbalance()
    {
        return balance;
    }
      
}
