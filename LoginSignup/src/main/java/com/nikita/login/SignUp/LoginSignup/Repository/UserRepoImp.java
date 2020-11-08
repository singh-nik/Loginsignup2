package com.nikita.login.SignUp.LoginSignup.Repository;

import com.nikita.login.SignUp.LoginSignup.Entity.UserEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class UserRepoImp implements UserRepo {
    @PersistenceContext
    EntityManager  entityManager;

    public void save(UserEntity user) {
        entityManager.persist(user);

    }


    public List<UserEntity> findByUserName(String username) {
        TypedQuery<UserEntity> userDetails=entityManager.createQuery("select u from UserEntity u where userName=:username", UserEntity.class);
        userDetails.setParameter("username",username);
        return userDetails.getResultList();
    }


    public void update(UserEntity user) {
        entityManager.merge(user);

    }

}
