package habbits.services;

import habbits.dao.HelloUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HelloUserService {

    @Autowired
    private HelloUserDao userDao;

    public List getUseres(){
        return userDao.getUsers();
    }
}
