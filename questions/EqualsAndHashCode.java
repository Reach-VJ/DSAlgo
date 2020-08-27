package com.reachingskies.corejava.interview.questions;

import java.util.Objects;

public class EqualsAndHashCode {

    public static void main(String [] args) {
        User user1 = new User(1,"Vijay");
        User user2 = new User(1,"Vijay");
        if(user1.equals(user2)) {
            System.out.println("Use1 and User2 both are same");
        } else {
            System.out.println("Not equal");
        }
    }

}

class User {
    private Integer id;
    private String name;

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        User user = (User) o;
        return this.id == user.id && this.name.equals(user.getName());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result+ this.id;
        return result;
    }
}
