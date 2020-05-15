package com.example.demo.Service;

import com.example.demo.DAO.FakeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {

    private final FakeRepo user;

    @Autowired
    public UserServiceImpl(@Qualifier("postgres")  FakeRepo user) {
        this.user = user;
    }


    public String addUser(long id, String name, String surname){
        user.insertUser(id,name,surname);
        System.out.println(user);
        return name;
    }

    public String getUser(long id){
      String User =   user.findUserById(id);
        System.out.println("Hello " + user);
        return User;
    }

    public void removeUser(long id){
        user.deleteUser(id);
        System.out.println(user + " removed");
    }

    public String cacheUser(String cachename){
        String name = getUser(15);

        try
        {
            System.out.println("Going to sleep for 5 Secs.. to simulate backend call.");
            Thread.sleep(1000*5);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        return name;
    }

}
