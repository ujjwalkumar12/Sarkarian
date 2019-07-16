package com.example.sarkarian;

import android.content.pm.ActivityInfo;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sarkarian.Fragment.DashboardFragment;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);
        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

//        View hView =  navigationView.inflateHeaderView(R.layout.nav_header_main);
//        ImageView userimage = hView.findViewById(R.id.textimageview);
//        TextView nameview = hView.findViewById(R.id.nav_name);
//        TextView emailview = hView.findViewById(R.id.nav_email);
//
//        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/Roboto-Regular.ttf");
//        nameview.setTypeface(custom_font);
//        emailview.setTypeface(custom_font);


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open,
                R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        Fragment frag = new DashboardFragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, frag)
                .commit();


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // clear stack
        getSupportFragmentManager().popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
        switch (item.getItemId()) {

            case R.id.nav_dashboard:

                Fragment frag = new DashboardFragment();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, frag)
                        .add(new DashboardFragment(), "dash")
                        .addToBackStack("dash")
                        .commit();

//                break;
//            case R.id.nav_profile:
//                Fragment frag1 = new ProfileFragment();
//                getSupportFragmentManager().beginTransaction()
//                        .replace(R.id.fragment_container, frag1)
//                        .add(new ProfileFragment(), "dash")
//                        .addToBackStack("dash")
//                        .commit();
//                break;
//
//            case R.id.nav_instructions:
//
//                Fragment frag2 = new InstructionFragment();
//                getSupportFragmentManager().beginTransaction()
//                        .replace(R.id.fragment_container, frag2)
//                        .add(new InstructionFragment(), "dash")
//                        .addToBackStack("dash")
//                        .commit();
//                break;
//
//            case R.id.nav_feedback:
//                Fragment frag3 = new FeedbackFragment();
//                getSupportFragmentManager().beginTransaction()
//                        .replace(R.id.fragment_container, frag3)
//                        .add(new FeedbackFragment(), "dash")
//                        .addToBackStack("dash")
//                        .commit();
//                break;
//
//            case R.id.nav_about_us:
//
//                Fragment frag4 = new AboutUsFragment();
//                getSupportFragmentManager().beginTransaction()
//                        .replace(R.id.fragment_container, frag4)
//                        .add(new AboutUsFragment(), "dash")
//                        .addToBackStack("dash")
//                        .commit();
//                break;
//            case R.id.nav_logout:
//                showPopup();
//                break;


        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
