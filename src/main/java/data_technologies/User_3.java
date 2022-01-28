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
class User_3 {
private int id;
    private String amount, total, type, info;
    
    public User_3(int Debit_ID, String Debit_Amount, String Debit_Total, String Debit_Type, String Debit_Info)
    {
        this.id=Debit_ID;
        this.amount=Debit_Amount;
        this.total=Debit_Total;
        this.type=Debit_Type;
        this.info=Debit_Info;

    }
    public int getid()
    {
        return id;
    }
    
    public String getamount()
    {
        return amount;
    }
     
    public String gettotal()
    {
        return total;
    }
    
    public String gettype()
    {
        return type;
    }
    
    public String getdate()
    {
        return info;
    }
      
}
