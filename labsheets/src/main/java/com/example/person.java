package com.example;

 public class person {
    
    private String Pname;
    private int age;
    private String email;

        public  person() {
            this.Pname=" ";
            this.age=0;
            this.email=" ";

        }
    
    public void  setName(String Pname){
        this.Pname=Pname;
    }
    public void setAge(int age){
        this.age=age;
    }
    
    public void setEmail(String email){
        this.email=email;
    }
    
    public String getName(){
        return Pname;
    }
    public int getAge(){
        return age;
    }
    public String getEmail(){
        return email;
    }
}
