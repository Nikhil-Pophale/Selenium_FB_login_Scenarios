package org.Scripts;

import com.github.javafaker.Faker;

public class faker {
    static Faker faker;
    public static String fname(){
        faker=new Faker();
        String name=faker.name().firstName();
        return name;
    }
    public static String lname(){
        faker=new Faker();
        String name=faker.name().lastName();
        return name;
    }

    public static String email(){
        faker=new Faker();
        String emailAddress=faker.internet().emailAddress();
        return emailAddress;
    }
    public static String address(){
        faker=new Faker();
        String Address=faker.address().streetAddress();
        return Address;
    }
    public static String state(){
        faker=new Faker();
        String state=faker.address().state();
        return state;
    }
    public static String city(){
        faker=new Faker();
        String city=faker.address().cityName();
        return city;
    }
    public static String username(){
        faker=new Faker();
        String uname=faker.name().username();
        return uname;
    }
    public static Integer password(){
        faker=new Faker();
        Integer up= Integer.valueOf(faker.internet().password());
        return up;
    }

    public static Integer id(){
        faker=new Faker();
        Integer xid=faker.number().numberBetween(10,99);
        return xid;
    }
}
