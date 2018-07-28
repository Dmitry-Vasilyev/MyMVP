package com.di.mymvp.signup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.di.mymvp.R;
import com.di.mymvp.util.ActivityUtils;

public class SignUpActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_signup);

        SignUpFragment signUpFragment = (SignUpFragment) getSupportFragmentManager()
                .findFragmentById(R.id.contentFrame);
        if(signUpFragment == null) {
            //Create fragment
            signUpFragment = SignUpFragment.newInstance();
            ActivityUtils.addFragmentToActivity(
                    getSupportFragmentManager(), signUpFragment, R.id.contentFrame);
        }
        
    }
}
