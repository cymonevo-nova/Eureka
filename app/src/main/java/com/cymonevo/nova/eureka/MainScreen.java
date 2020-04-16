package com.cymonevo.nova.eureka;

import android.os.Bundle;

import com.cymonevo.nova.eureka.core.Auth;
import com.cymonevo.nova.eureka.core.Router;
import com.cymonevo.nova.eureka.layout.HeaderFragment;
import com.cymonevo.nova.eureka.module.list_repo.ListRepoFragment;

import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;

public class MainScreen extends FragmentActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (!Auth.isAuth(this)) {
            Router.gotoLogin(this);
            finish();
            return;
        }
        setContentView(R.layout.screen_main);
        HeaderFragment header = new HeaderFragment();
        ListRepoFragment fragment = new ListRepoFragment();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.header_container, header)
                .add(R.id.fragment_container, fragment)
                .addToBackStack(null)
                .commit();
    }
}
