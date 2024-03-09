package com.bank.online.system.account.service.domain.event;

import com.bank.online.system.account.service.domain.entity.Account;
import com.bank.online.system.common.domain.event.DomainEvent;

import java.time.ZonedDateTime;

public class AccountCreatedEvent implements DomainEvent<Account> {

    private final Account account;
    private final ZonedDateTime createdAt;

    public AccountCreatedEvent(Account account, ZonedDateTime createdAt) {
        this.account = account;
        this.createdAt = createdAt;
    }

    public Account getAccount() {
        return account;
    }

    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }
}
