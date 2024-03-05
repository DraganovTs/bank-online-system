package com.bank.online.system.common.domain.valueobject;

import java.util.UUID;

public class CardId extends BaseId<UUID> {
    protected CardId(UUID value) {
        super(value);
    }
}
