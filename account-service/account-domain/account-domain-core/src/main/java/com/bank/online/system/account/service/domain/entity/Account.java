package com.bank.online.system.account.service.domain.entity;

import com.bank.online.system.account.service.domain.valueobject.AccountStatus;
import com.bank.online.system.account.service.domain.valueobject.AccountType;
import com.bank.online.system.account.service.domain.valueobject.BranchAddress;
import com.bank.online.system.common.domain.entity.AggregateRoot;
import com.bank.online.system.common.domain.valueobject.AccountNumber;
import com.bank.online.system.common.domain.valueobject.CardId;
import com.bank.online.system.common.domain.valueobject.CustomerId;
import com.bank.online.system.common.domain.valueobject.LoanId;

import java.util.List;

public class Account extends AggregateRoot<AccountNumber> {

    private final CustomerId customerId;
    private final BranchAddress branchAddress;
    private final LoanId loanId;
    private final CardId cardId;


    private AccountType accountType;
    private Boolean communicationSw;
    private AccountStatus accountStatus;
    private List<String> failureMessages;

    private Account(Builder builder) {
        customerId = builder.customerId;
        branchAddress = builder.branchAddress;
        loanId = builder.loanId;
        cardId = builder.cardId;
        accountType = builder.accountType;
        communicationSw = builder.communicationSw;
        accountStatus = builder.accountStatus;
        failureMessages = builder.failureMessages;
        super.setId(builder.accountNumber);
    }


    public void initializeAccount(){
        setId(new AccountNumber());
    }

    public CustomerId getCustomerId() {
        return customerId;
    }

    public BranchAddress getBranchAddress() {
        return branchAddress;
    }

    public LoanId getLoanId() {
        return loanId;
    }

    public CardId getCardId() {
        return cardId;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public Boolean getCommunicationSw() {
        return communicationSw;
    }

    public AccountStatus getAccountStatus() {
        return accountStatus;
    }

    public List<String> getFailureMessages() {
        return failureMessages;
    }

    public static final class Builder {
        private CustomerId customerId;
        private BranchAddress branchAddress;
        private LoanId loanId;
        private CardId cardId;
        private AccountType accountType;
        private Boolean communicationSw;
        private AccountStatus accountStatus;
        private List<String> failureMessages;
        private AccountNumber accountNumber;

        private Builder() {
        }

        public static Builder builder() {
            return new Builder();
        }

        public Builder customerId(CustomerId val) {
            customerId = val;
            return this;
        }

        public Builder branchAddress(BranchAddress val) {
            branchAddress = val;
            return this;
        }

        public Builder loanId(LoanId val) {
            loanId = val;
            return this;
        }

        public Builder cardId(CardId val) {
            cardId = val;
            return this;
        }

        public Builder accountType(AccountType val) {
            accountType = val;
            return this;
        }

        public Builder communicationSw(Boolean val) {
            communicationSw = val;
            return this;
        }

        public Builder accountStatus(AccountStatus val) {
            accountStatus = val;
            return this;
        }

        public Builder failureMessages(List<String> val) {
            failureMessages = val;
            return this;
        }

        public Builder accountNumber(AccountNumber val) {
            accountNumber = val;
            return this;
        }

        public Account build() {
            return new Account(this);
        }
    }
}
