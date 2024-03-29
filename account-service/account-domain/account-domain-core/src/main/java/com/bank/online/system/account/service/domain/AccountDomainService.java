package com.bank.online.system.account.service.domain;

import com.bank.online.system.account.service.domain.entity.Account;
import com.bank.online.system.account.service.domain.entity.Card;
import com.bank.online.system.account.service.domain.entity.Loan;
import com.bank.online.system.account.service.domain.event.AccountCreatedEvent;

public interface AccountDomainService {

    AccountCreatedEvent createAccount(Account account , Card card , Loan loan);

}
