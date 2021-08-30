package com.covalent.uk.daggerhiltapp.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.covalent.uk.daggerhiltapp.R;
import com.covalent.uk.daggerhiltapp.databinding.ActivityMainBinding;
import com.covalent.uk.daggerhiltapp.repository.model.CreateNewWorkOrder;

import dagger.hilt.android.AndroidEntryPoint;
@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    MainViewModel mainViewModel;

    private ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());

        mainViewModel = new ViewModelProvider(this).get(MainViewModel.class);

        mainBinding.btn.setOnClickListener(view -> {
            CreateNewWorkOrder createNewWorkOrder = new CreateNewWorkOrder();;
            mainViewModel.createRecord(createNewWorkOrder);
            mainBinding.cpIndicator.setVisibility(View.VISIBLE);

        });

        mainViewModel.getSuccessMessage().observe(this, message ->{
            mainBinding.cpIndicator.setVisibility(View.GONE);
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        });

        mainViewModel.getErrorMessage().observe(this, error -> {
            mainBinding.cpIndicator.setVisibility(View.GONE);
            Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
        });
    }
}


