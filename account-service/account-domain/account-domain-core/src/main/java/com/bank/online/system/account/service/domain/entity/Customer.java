package com.bank.online.system.account.service.domain.entity;

import com.bank.online.system.common.domain.entity.AggregateRoot;
import com.bank.online.system.common.domain.valueobject.CustomerId;

public class Customer extends AggregateRoot<CustomerId> {

    private String firstName;
    private String lastName;
    private String mobileNumber;

}
