package com.example;

import java.util.Scanner;
//import java.util.Vector;
/*class member {
    private String Pname;
    private int age;
    private String email;

    public void setName(String name) {
        this.Pname = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return Pname;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }
}
*/
class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int a=197;
        String f="Ben asher";
        int  b=34;
        Integer fg= 45;
        char c = scan.nextLine().charAt(0);
        // person p1 =new person();
        person m1 = new person();

        m1.setName("Ben");
        m1.setAge(22);
        m1.setEmail("sgdfgfgd");

        System.out.println("The person name is " + m1.getName());
        System.out.println("The person's age is " + m1.getAge());
        System.out.println("The  person's email is " + m1.getEmail());
        System.out.println(a<<2);
       
System.out.println(f.contains("B"));
String formattedString =f.format("Hello I am %s he is %d  years old",f,b);
System.out.println(formattedString);
//boolean result = m1 intanceof person;
System.out.println(m1 instanceof person);
System.out.println(f.valueOf(f));
Integer ty= new Integer(5);
String s=ty.toString();
//System.out.println(ty.toString(5));
System.out.println(s.length());
int i=Integer.parseInt(f);
ty.intValue();
    }
}