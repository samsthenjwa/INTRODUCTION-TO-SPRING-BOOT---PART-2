package com.example.demo.DAO;

import com.example.demo.Model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("postgres")
public class FakeRepo implements FakeRepoInterface {

    private static List<User> array = new ArrayList<>();

    @Override
    public void insertUser(long id, String name, String surname) {
        array.add(new User(id,name,surname));
    }

    @Override
    public String findUserById(long id) {
        User name;
        if(array.equals(id)){
            name = array.get((int) id);
            System.out.println("Hello " + array.contains(id));
        }
        return null;
    }

    @Override
    public void deleteUser(long id) {
        array.remove(id);
            System.out.println("User deleted");
    }
}
