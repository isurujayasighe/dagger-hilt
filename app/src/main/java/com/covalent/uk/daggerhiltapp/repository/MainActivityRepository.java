package com.covalent.uk.daggerhiltapp.repository;

import android.util.Log;

import com.covalent.uk.daggerhiltapp.repository.model.BaseResponse;
import com.covalent.uk.daggerhiltapp.repository.model.CreateNewWorkOrder;
import com.covalent.uk.daggerhiltapp.repository.remote.BackendApiClient;

import io.reactivex.Observable;

public class MainActivityRepository {

    private static final String TAG = MainActivityRepository.class.getSimpleName();

    private final BackendApiClient backendApiClient;

    public MainActivityRepository(BackendApiClient backendApiClient) {
        this.backendApiClient = backendApiClient;
    }

    public Observable<BaseResponse> createNewWorkOrder(CreateNewWorkOrder createNewWorkOrder){
        return backendApiClient.createChildWorkOrder(createNewWorkOrder).doOnNext(baseResponse -> {
            Log.d(TAG, "createNewWorkOrder: DONE");
            Log.d(TAG, baseResponse.getStatusCode().toString());
        });
    }
}
