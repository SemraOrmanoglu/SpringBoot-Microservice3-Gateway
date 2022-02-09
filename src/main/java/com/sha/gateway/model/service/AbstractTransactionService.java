package com.sha.gateway.model.service;

import com.google.gson.JsonElement;
import com.sha.gateway.channel.service.TransactionServiceCallable;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public abstract class AbstractTransactionService implements EntityService<JsonElement,Integer>
{
    @Autowired
    protected TransactionServiceCallable serviceCallable;


    public abstract List<JsonElement> getAllTransactionOfUser(Integer userID);
}
