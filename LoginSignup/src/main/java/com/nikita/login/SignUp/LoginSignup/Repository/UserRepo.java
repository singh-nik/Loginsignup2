package com.nikita.login.SignUp.LoginSignup.Repository;

import com.nikita.login.SignUp.LoginSignup.Entity.UserEntity;

import java.util.List;


public interface UserRepo {

    public void save(UserEntity user);

    public List<UserEntity> findByUserName(String name);

    public void update(UserEntity userEntity);




}
