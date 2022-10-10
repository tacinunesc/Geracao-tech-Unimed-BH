package com.ame.cartApi.repository;

import  com.ame.cartApi.model.CardOrigin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardOriginRepository extends JpaRepository<CardOrigin, Long> {}