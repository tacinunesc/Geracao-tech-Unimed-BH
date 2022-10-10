package com.ame.cartApi.service;


import  com.ame.cartApi.repository.CardOriginRepository;
import com.ame.cartApi.controller.request.CreateCardOriginRequest;
import  com.ame.cartApi.exception.EntityNotFoundException;
import  com.ame.cartApi.model.CardOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
@Service
public class CardOriginService {
    private final CardOriginRepository cardOriginRepository;

    @Autowired
    public CardOriginService(CardOriginRepository cardOriginRepository) {
        this.cardOriginRepository = cardOriginRepository;
    }

    public CardOrigin findById(long id) {
        return this.cardOriginRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Card origin id [" + id + "] not found."));
    }

    public CardOrigin createCardOrigin(CreateCardOriginRequest cardOriginRequest) {
        var cardOrigin = new CardOrigin();

        cardOrigin.setName(cardOriginRequest.getName());
        cardOrigin.setDescription(cardOriginRequest.getDescription());
        cardOrigin.setCreator(cardOriginRequest.getCreator());

        cardOrigin.setCreatedAt(LocalDateTime.now());
        cardOrigin.setUpdatedAt(LocalDateTime.now());

        return cardOriginRepository.save(cardOrigin);
    }
}