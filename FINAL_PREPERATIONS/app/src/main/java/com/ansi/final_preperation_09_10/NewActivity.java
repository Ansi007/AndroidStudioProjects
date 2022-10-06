package com.ansi.final_preperation_09_10;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.ansi.final_preperation_09_10.databinding.ActivityNewBinding;

public class NewActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityNewBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("TAG ACTIVITY", " onCreate Activity Main2");

        binding = ActivityNewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_new);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_new);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TAG ACTIVITY", "onStart Activity Main2");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TAG ACTIVITY", " onResume Activity Main2");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TAG ACTIVITY", " onPause Activity Main2");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TAG ACTIVITY", " onStop Activity Main2");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TAG ACTIVITY", " onDestroy Activity Main2");
    }
}

//On Create, On Start, On Resume, On Pause, On Stop, On Destroy
//On Restart