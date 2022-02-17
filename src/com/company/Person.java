package com.company;
/**
 * @author lnagler1
 */
public class Person {
    private String name;
    private String givenname;
    private String nickname;
    Date birthday;
    PhoneNumber phone;

    Person(String n, String gn, Date bd, PhoneNumber p){
        name = n;
        givenname = gn;
        birthday = bd;
        phone = p;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", givenName='" + givenname + '\'' +
                ", nickName='" + nickname + '\'' +
                ", birthday=" + birthday +
                ", phone=" + phone +
                '}';
    }
}
