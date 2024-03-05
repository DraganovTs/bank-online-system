package com.bank.online.system.common.domain.valueobject;

import java.util.UUID;

public class LoanId extends BaseId<UUID> {
    protected LoanId(UUID value) {
        super(value);
    }
}
