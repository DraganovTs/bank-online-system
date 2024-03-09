package com.bank.online.system.account.service.domain;

import com.bank.online.system.account.service.domain.entity.Account;
import com.bank.online.system.account.service.domain.event.AccountCreatedEvent;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class AccountDomainServiceImpl implements AccountDomainService {

    public static final String UTC = "UTC";


    @Override
    public AccountCreatedEvent createAccount(Account account) {
        validateCard();
        validateLoan();
        initializeAccount();
        return new AccountCreatedEvent(account, ZonedDateTime.now(ZoneId.of(UTC)));
    }
}
