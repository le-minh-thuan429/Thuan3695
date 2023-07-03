package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout mDrawerLayout;
    private static final int FRAGMENT_HOME=0;
    private static final int FRAGMENT_FAVORITE=0;
    private static final int FRAGMENT_HISTORY=0;
    private int mCurrentFragment=1;
    FragmentTransaction transaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar); //thêm toolbar

        //Thiết lập sự kiện đóng mở Navigation Drawer
        mDrawerLayout=findViewById(R.id.drawer_layout);

        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,mDrawerLayout,toolbar,
                R.string.Open,R.string.Close);//Chuyển đổi ngăn thanh tác vụ
        mDrawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        //bắt sự kiện
        NavigationView navigationView=findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.nav_home) {

        } else if (id == R.id.Gioithieu){

        } else if (id == R.id.Quytac){

        }
        else if (id == R.id.Reset){

        }else if (id == R.id.Amthanh){

        }
        mDrawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    public void replaceFragment(Fragment fragment){
        transaction= getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.content_frame,fragment);
        transaction.commit();

    }

    @Override
    public void onBackPressed() {
        if(mDrawerLayout.isDrawerOpen(GravityCompat.START)){
            mDrawerLayout.closeDrawer(GravityCompat.START);
        }else {
            super.onBackPressed();
        }
    }
    //tyyyyyyyyyyttttttttttty
}