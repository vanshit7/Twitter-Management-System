/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twittermanagementsystem;

/**
 *
 * @author DAMAN KUMAR
 */
public class User {
    private String username;
    private String password;
    private int id;
    private int followers;
    private int following;
    private String status;
    private int m_id;
    
    public String getusername(){
        return username;
    }
    
    public String getpassword(){
        return password;
    }
    public int getid(){
        return id;
    }
    public int getfollowers(){
        return followers;
    }
    public int getfollowing(){
        return following;
    }
    public String getstatus(){
        return status;
    }
    public int getmid(){
        return m_id;
    }
    public void setusername(String un){
        username = un;
    }
    public void setpassword(String pd){
        password = pd;
    }
    public void setid(int i){
        id = i;
    }
    public void setfollowers(int fw){
        followers = fw;
    }
    public void setfollowing(int fwing){
        following = fwing;
    }
    public void setstatus(String stat){
       status = stat;
    }
    public void setmid(int md){
        m_id = md;
    }
}
