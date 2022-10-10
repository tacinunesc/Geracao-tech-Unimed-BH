package com.ame.cartApi.repository;

import  com.ame.cartApi.model.CardOrigin;

import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface CardOriginRepository extends JpaRepository<CardOrigin, Long> {}