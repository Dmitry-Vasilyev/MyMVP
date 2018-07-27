package com.di.mymvp.signin;

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

public class SignInFragment extends Fragment implements SignInContract.View {
    private SignInContract.Presenter presenter;

    public SignInFragment() {

    }

    public static SignInFragment newInstance() {
        return new SignInFragment();
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
    public void setPresenter(@NonNull SignInContract.Presenter presenter) {
        this.presenter = checkNotNull(presenter);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.frag_signin, container, false);
        ListView listView = (ListView) root.findViewById(R.id.list_users);

        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
