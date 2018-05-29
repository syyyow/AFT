package jp.techacademy.shoichi.ito.aft;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import jp.techacademy.shoichi.ito.aft.R;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_product:
                    mTextMessage.setText(R.string.title_product);
                    return true;
                case R.id.navigation_cart:
                    mTextMessage.setText(R.string.title_cart);
                    return true;
                case R.id.navigation_delivery_status:
                    mTextMessage.setText(R.string.title_delivery_status);
                    return true;
                case R.id.navigation_mypage:
                    mTextMessage.setText(R.string.title_mypage);
                    return true;
                case R.id.navigation_other:
                    mTextMessage.setText(R.string.title_other);
                    return true;
            }
            return false;
        }
    };
    private BottomNavigationView bnv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_product:
                        setFragment();
                        return true;
                    case R.id.navigation_cart:
                        setFragment();
                        return true;
                    case R.id.navigation_mypage:
                        setFragment();
                        return true;
                    case R.id.navigation_delivery_status:
                        setFragment();
                        return true;
                    case R.id.navigation_other:
                        setFragment();
                        return true;
                }
                return false;
            }
        });
    }
}
