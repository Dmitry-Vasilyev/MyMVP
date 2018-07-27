package com.di.mymvp.signin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.di.mymvp.R;
import com.di.mymvp.util.ActivityUtils;

public class SignInActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_signin);

        SignInFragment signInFragment = (SignInFragment) getSupportFragmentManager()
                .findFragmentById(R.id.contentFrame);
        if(signInFragment == null) {
            //Create fragment
            signInFragment = SignInFragment.newInstance();
            ActivityUtils.addFragmentToActivity(
                    getSupportFragmentManager(), signInFragment, R.id.contentFrame);
        }
        
    }
}
