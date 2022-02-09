package com.sha.gateway.model.service;

import com.google.gson.JsonElement;
import com.sha.gateway.channel.utility.RetrofitUtil;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService extends  AbstractTransactionService{
    @Override
    public List<JsonElement> getAllTransactionOfUser(Integer userID) {
        return RetrofitUtil.callGenericBlock(serviceCallable.getAllTransactionOfAuthorizedUser(userID));
    }

    @Override
    public List<JsonElement> findAll() {
        return null;
    }

    @Override
    public JsonElement save(JsonElement entity) {
        return RetrofitUtil.callGenericBlock(serviceCallable.save(entity));
    }

    @Override
    public void deleteByID(Integer id) {
        RetrofitUtil.callGenericBlock(serviceCallable.deleteByID(id));
    }
}
