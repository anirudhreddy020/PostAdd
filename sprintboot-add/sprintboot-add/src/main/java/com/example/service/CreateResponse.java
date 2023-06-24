package com.example.service;

import com.example.controller.AdditionResult;

public class CreateResponse {

    public AdditionResult additionResponse (int param1, int param2, int result){
        AdditionResult additionResult = new AdditionResult();
        additionResult.setResult(result);
        additionResult.setParam1(param1);
        additionResult.setParam2(param2);
        return additionResult;
    }
}
