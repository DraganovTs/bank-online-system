package com.bank.online.system.account.service.domain.entity;

import com.bank.online.system.common.domain.entity.AggregateRoot;
import com.bank.online.system.common.domain.valueobject.LoanNumber;
import com.bank.online.system.common.domain.valueobject.LoanType;
import com.bank.online.system.common.domain.valueobject.Money;

public class Loan extends AggregateRoot<LoanNumber> {

    private final LoanType loanType;
    private final Money totalLoan;
    private final Money amountPaid;
    private boolean active;

    private Loan(Builder builder) {
        loanType = builder.loanType;
        totalLoan = builder.totalLoan;
        amountPaid = builder.amountPaid;
        active = builder.active;
        super.setId(builder.loanNumber);
    }


    public static final class Builder {
        private LoanType loanType;
        private Money totalLoan;
        private Money amountPaid;
        private boolean active;
        private LoanNumber loanNumber;

        private Builder() {
        }

        public static Builder builder() {
            return new Builder();
        }

        public Builder loanType(LoanType val) {
            loanType = val;
            return this;
        }

        public Builder totalLoan(Money val) {
            totalLoan = val;
            return this;
        }

        public Builder amountPaid(Money val) {
            amountPaid = val;
            return this;
        }

        public Builder active(boolean val) {
            active = val;
            return this;
        }

        public Builder loanNumber(LoanNumber val) {
            loanNumber = val;
            return this;
        }

        public Loan build() {
            return new Loan(this);
        }
    }

    public LoanType getLoanType() {
        return loanType;
    }

    public Money getTotalLoan() {
        return totalLoan;
    }

    public Money getAmountPaid() {
        return amountPaid;
    }

    public boolean isActive() {
        return active;
    }
}
