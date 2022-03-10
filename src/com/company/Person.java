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

    Person(String n, String gn, String nk, Date bd, PhoneNumber p){
        name = n;
        givenname = gn;
        nickname = nk;
        birthday = bd;
        phone = p;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getGivenname() {
        return givenname;
    }

    public String getName() {
        return name;
    }

    public PhoneNumber getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + name + '\'' +
                ", GivenName='" + givenname + '\'' +
                ", NickName='" + nickname + '\'' +
                ", Birthday=" + birthday.toString() +
                ", " + phone.toString() +
                '}';
    }

    public String toFile(){
        return name + ";" + givenname + ";" + nickname + ";" + birthday.toFile() + ";" + phone.toFile();
    }
}
