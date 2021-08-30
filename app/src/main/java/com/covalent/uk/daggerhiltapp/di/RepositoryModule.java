package com.covalent.uk.daggerhiltapp.di;

import com.covalent.uk.daggerhiltapp.repository.MainActivityRepository;
import com.covalent.uk.daggerhiltapp.repository.remote.BackendApiClient;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@InstallIn(SingletonComponent.class)
@Module
public class RepositoryModule {

    @Singleton
    @Provides
    MainActivityRepository provideMainActivityRepository(BackendApiClient backendApiClient){
        return new MainActivityRepository(backendApiClient);
    }


}
