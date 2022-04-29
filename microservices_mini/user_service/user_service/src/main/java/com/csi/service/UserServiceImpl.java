package com.csi.service;

import com.csi.dao.UserDaoImpl;
import com.csi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl {

    @Autowired
    UserDaoImpl userDaoImpl;
    public void saveData(User user) {
        userDaoImpl.saveData(user);
    }

    public Optional<User> getDataById(int userId) {
       return userDaoImpl.getDataById(userId);
    }

    public List<User> getAllData() {

          return userDaoImpl.getAllData();
    }

    public User getDataByName(String userName) {
         return  userDaoImpl.getDataByName(userName);

    }

    public void updateDataById(int userId, User user) {
        userDaoImpl.updateDataById(user);

    }

    public void deleteDataById(int userId) {
        userDaoImpl.deleteDataById(userId);
    }
}
