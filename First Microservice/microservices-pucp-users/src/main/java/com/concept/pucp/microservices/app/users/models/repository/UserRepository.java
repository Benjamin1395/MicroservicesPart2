package com.concept.pucp.microservices.app.users.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.concept.pucp.microservices.app.users.models.entity.User;

public interface UserRepository extends CrudRepository <User,Long> {

}
