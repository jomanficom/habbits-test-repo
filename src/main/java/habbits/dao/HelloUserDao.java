package habbits.dao;

import habbits.model.HelloUser;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class HelloUserDao {

    private List<HelloUser> users = Arrays.asList(
            new HelloUser("user1", "111"), new HelloUser("user2", "222")
    );

    public List<HelloUser> getUsers() {

        return users;
    }
}

