package com.covalent.uk.daggerhiltapp.repository.remote;

import com.covalent.uk.daggerhiltapp.repository.model.BaseResponse;
import com.covalent.uk.daggerhiltapp.repository.model.CreateNewWorkOrder;

import javax.inject.Inject;

import io.reactivex.Observable;

public class BackendApiClient {


    @Inject
    BackendAPI backendAPI;

    public BackendApiClient(BackendAPI backendAPI) {
        this.backendAPI = backendAPI;
    }

    public Observable<BaseResponse> createChildWorkOrder(CreateNewWorkOrder createNewWorkOrder){
        return backendAPI.createChildWorkOrder(createNewWorkOrder);
    }

}
