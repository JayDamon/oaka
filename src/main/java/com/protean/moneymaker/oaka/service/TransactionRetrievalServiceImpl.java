package com.protean.moneymaker.oaka.service;

import com.protean.moneymaker.rin.dto.TransactionDto;
import com.protean.moneymaker.rin.model.Transaction;
import com.protean.moneymaker.rin.service.TransactionService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class TransactionRetrievalServiceImpl implements TransactionRetrievalService {

    private TransactionService transactionService;

    public TransactionRetrievalServiceImpl(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @Override
    public List<Transaction> getAllTransactions() {
        return transactionService.getAllTransactions();
    }

    @Override
    public Set<TransactionDto> getAllTransactionDtos() {
        return transactionService.getAllTransactionDtos();
    }
}