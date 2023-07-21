package com.college.cbit_clubs;

public class userDetail {
    public  String Username;
    public  String Rollnumber;
    public String Email;

    public int Usertype;


    public userDetail(int i){

    }
   public userDetail(String Username,String Rollnumber,String Email,int usertype){

       this.Username=Username;
       this.Rollnumber=Rollnumber;
       this.Email=Email;

       this.Usertype=usertype;

   }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getRollnumber() {
        return Rollnumber;
    }

    public void setRollnumber(String rollnumber) {
        Rollnumber = rollnumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getUsertype(){return  Usertype;}
    public void setUsertype(int usertype){usertype=usertype;}
}
