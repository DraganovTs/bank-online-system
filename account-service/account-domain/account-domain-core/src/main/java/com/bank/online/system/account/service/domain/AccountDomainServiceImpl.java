package com.bank.online.system.account.service.domain;

import com.bank.online.system.account.service.domain.entity.Account;
import com.bank.online.system.account.service.domain.entity.Card;
import com.bank.online.system.account.service.domain.entity.Loan;
import com.bank.online.system.account.service.domain.event.AccountCreatedEvent;
import com.bank.online.system.account.service.domain.exception.AccountDomainException;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class AccountDomainServiceImpl implements AccountDomainService {

    public static final String UTC = "UTC";


    @Override
    public AccountCreatedEvent createAccount(Account account , Card card , Loan loan) {
        validateCard(card);
        validateLoan(loan);
        account.initializeAccount();
        return new AccountCreatedEvent(account, ZonedDateTime.now(ZoneId.of(UTC)));
    }

    private void validateLoan(Loan loan) {
        if (!loan.isActive()) {
            throw new AccountDomainException("Restaurant with id " + loan.getId().getValue() +
                    "is currently not active!");
        }
    }

    private void validateCard(Card card) {
        if (!card.isActive()) {
            throw new AccountDomainException("Restaurant with id " + card.getId().getValue() +
                    "is currently not active!");
        }
    }


}
