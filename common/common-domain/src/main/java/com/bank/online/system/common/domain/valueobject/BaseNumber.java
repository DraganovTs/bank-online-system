package com.bank.online.system.common.domain.valueobject;

import java.util.Objects;
import java.util.Random;

public abstract class BaseNumber {
    private final long value;

    protected BaseNumber() {
        this.value = 100000000000L + new Random().nextInt(900000000);
    }

    public long getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseNumber that = (BaseNumber) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
