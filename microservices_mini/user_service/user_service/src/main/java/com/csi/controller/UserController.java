package com.csi.controller;


import com.csi.model.User;
import com.csi.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")

public class UserController {

    @Autowired
    UserServiceImpl userServiceImpl;

    @PostMapping("/savedata")
    public String saveData(@RequestBody User user){
        userServiceImpl.saveData(user);


        return "Data Saved Sucessfully";
    }
    @GetMapping("/getdatabyid/{userId}")
    public Optional<User> getDataById(@PathVariable int userId){
        return userServiceImpl.getDataById(userId);
    }
    @GetMapping("/getalldata")
    public List<User> getAlldata(){
        return userServiceImpl.getAllData();
    }
    @GetMapping("/getdatabyname/{userName}")
    public User getDataByName(@PathVariable String userName){

       return userServiceImpl.getDataByName(userName);
    }
    @PutMapping("/updatedata/{userId}")
    public String updateDataById(@PathVariable int userId,@RequestBody User user){
        userServiceImpl.updateDataById(userId,user);
        return " Data Updated Sucessfully";
    }
    @DeleteMapping("/deletedatabyid/{userId}")
    public String deleteDataById(@PathVariable int userId){
        userServiceImpl.deleteDataById(userId);
        return " Data Deleted Sucessfully";
    }
}
