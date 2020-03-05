/**
 * 
 */
package com.demo.postgres.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.postgres.model.User;

/**
 * @author Mehul
 *
  */
public interface UserDao extends JpaRepository<User, Integer> {

}
