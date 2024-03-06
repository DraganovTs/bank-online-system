package com.bank.online.system.account.service.domain.exception;

import com.bank.online.system.common.domain.exception.DomainException;

public class AccountDomainException extends DomainException {
    public AccountDomainException(String message) {
        super(message);
    }

    public AccountDomainException(String message, Throwable cause) {
        super(message, cause);
    }
}
