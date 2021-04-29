package com.example.accounting.domain;

import java.util.concurrent.CompletableFuture;

import com.example.accounting.domain.dto.AccountCreateDTO;
import com.example.accounting.domain.dto.MoneyCreditDTO;
import com.example.accounting.domain.dto.MoneyDebitDTO;

public interface AccountCommandService {

    public CompletableFuture<String> createAccount(AccountCreateDTO accountCreateDTO);
    public CompletableFuture<String> creditMoneyToAccount(String accountNumber, MoneyCreditDTO moneyCreditDTO);
    public CompletableFuture<String> debitMoneyFromAccount(String accountNumber, MoneyDebitDTO moneyDebitDTO);
}