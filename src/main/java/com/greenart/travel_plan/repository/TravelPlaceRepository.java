package com.greenart.travel_plan.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greenart.travel_plan.entity.TravelPlaceEntity;

public interface TravelPlaceRepository extends JpaRepository <TravelPlaceEntity, Long> {
    public List<TravelPlaceEntity> findByTpType (Integer tptype);
}
