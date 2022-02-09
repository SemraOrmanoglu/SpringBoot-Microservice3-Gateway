package com.sha.gateway.model.service;

import com.google.gson.JsonElement;
import com.sha.gateway.channel.utility.RetrofitUtil;
import org.springframework.stereotype.Service;
import retrofit2.Response;

import java.io.IOException;
import java.util.List;


@Service
public class ProductService extends AbstractProductService
{
    @Override
    public List<JsonElement> findAll() {
        return RetrofitUtil.callGenericBlock(serviceCallable.getAll());
    }

    @Override
    public JsonElement save(JsonElement entity) {

        return RetrofitUtil.callGenericBlock(serviceCallable.save(entity));
    }

    @Override
    public void deleteByID(Integer id)
    {
        RetrofitUtil.callGenericBlock(serviceCallable.deleteByID(id));
    }
}
