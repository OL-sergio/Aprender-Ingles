package udemy.java.aprender_ingls;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

import udemy.java.aprender_ingls.fragments.AnimalsFragment;
import udemy.java.aprender_ingls.fragments.NumbersFragment;
import udemy.java.aprender_ingls.fragments.VowelsFragment;

public class MainActivity extends AppCompatActivity {

    private SmartTabLayout smartTabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Aprenda Inglês");

        smartTabLayout = findViewById(R.id.viewpager_viewFragments);
        viewPager = findViewById(R.id.viewpager);

        getSupportActionBar().setElevation(0);

        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
          getSupportFragmentManager(), FragmentPagerItems.with(this)
                .add("Animais", AnimalsFragment.class)
                .add("Numeros", NumbersFragment.class)
                .add("Vogais", VowelsFragment.class)
                .create()
        );
        viewPager.setAdapter(adapter);
        smartTabLayout.setViewPager(viewPager);

    }
}