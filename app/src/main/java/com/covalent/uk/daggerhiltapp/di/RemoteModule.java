package com.covalent.uk.daggerhiltapp.di;

import com.covalent.uk.daggerhiltapp.repository.remote.BackendAPI;
import com.covalent.uk.daggerhiltapp.repository.remote.BackendApiClient;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@InstallIn(SingletonComponent.class)
@Module
public class RemoteModule {

    public static final String BASE_URL = "https://dev.azurewebsites.net";

    @Singleton
    @Provides
    public BackendAPI backendAPI(Retrofit retrofit){
        return retrofit.create(BackendAPI.class);
    }

    @Singleton
    @Provides
    public BackendApiClient backendAPIClient(BackendAPI backendAPI){
        return new BackendApiClient(backendAPI);
    }

    @Singleton
    @Provides
    public Retrofit provideRetrofit(OkHttpClient okHttpClient){
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

    @Singleton
    @Provides
    HttpLoggingInterceptor provideHttpLoggingInterceptor() {
        return new HttpLoggingInterceptor()
                .setLevel(HttpLoggingInterceptor.Level.BODY);
    }

    @Singleton
    @Provides
    OkHttpClient provideOkHttpClient(HttpLoggingInterceptor loggingInterceptor) {
        return new OkHttpClient.Builder()
                .connectTimeout(50, TimeUnit.SECONDS)
                .writeTimeout(50, TimeUnit.SECONDS)
                .readTimeout(50, TimeUnit.SECONDS)
                .addInterceptor(loggingInterceptor)
                .build();

    }
}
