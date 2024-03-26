package com.bank.online.system.account.service.domain.entity;

import com.bank.online.system.common.domain.entity.AggregateRoot;
import com.bank.online.system.common.domain.valueobject.AccountNumber;
import com.bank.online.system.common.domain.valueobject.CardId;
import com.bank.online.system.common.domain.valueobject.CardNumber;
import com.bank.online.system.common.domain.valueobject.CardType;

public class Card extends AggregateRoot<CardId> {

    private  CardNumber cardNumber;
    private  CardType cardType;
    private boolean active;

    private AccountNumber accountNumber;

    public Card(CardId cardId,CardNumber cardNumber, CardType cardType, boolean active) {
        super.setId(cardId);
        this.cardNumber = cardNumber;
        this.cardType = cardType;
        this.active = active;
    }

    public AccountNumber getAccountNumber() {
        return accountNumber;
    }

    public CardNumber getCardNumber() {
        return cardNumber;
    }

    public CardType getCardType() {
        return cardType;
    }

    public boolean isActive() {
        return active;
    }
}
