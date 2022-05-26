package com.live2train.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.live2train.models.Models;

@Repository
public interface TrainingCenterRepository extends CrudRepository<Models,Integer> {

	Models save(Models models);

}
