package com.app.dao;

import com.app.repository.User;

import java.util.List;

/**
 * Created by iBank on 12/29/13.
 */
public interface UserDao {

    public int insert(User user);

    public int update(User user);

    public int delete(String userName);

    public List<User> selectAll();

    public int countAll();

    public User findByUserName(String userName);

}
