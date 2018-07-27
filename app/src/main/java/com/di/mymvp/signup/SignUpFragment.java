package com.di.mymvp.signup;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.di.mymvp.R;

import static com.google.common.base.Preconditions.checkNotNull;

public class SignUpFragment extends Fragment implements SignUpContract.View {
    private SignUpContract.Presenter presenter;

    public SignUpFragment() {

    }

    public static SignUpFragment newInstance() {
        return new SignUpFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onResume() {
        super.onResume();
//        presenter.start();
    }

    @Override
    public void setPresenter(@NonNull SignUpContract.Presenter presenter) {
        this.presenter = checkNotNull(presenter);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.frag_signUp, container, false);
        ListView listView = (ListView) root.findViewById(R.id.list_users);

        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
