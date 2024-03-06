package com.bank.online.system.account.service.domain.exception;

import com.bank.online.system.common.domain.exception.DomainException;

public class AccountNotFoundException extends DomainException {
    public AccountNotFoundException(String message) {
        super(message);
    }

    public AccountNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
