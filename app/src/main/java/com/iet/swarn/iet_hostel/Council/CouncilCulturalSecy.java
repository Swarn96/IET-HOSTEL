package com.iet.swarn.iet_hostel.Council;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import androidx.core.app.NavUtils;
import androidx.viewpager.widget.PagerAdapter;
import androidx.appcompat.app.AppCompatActivity;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;

import com.iet.swarn.iet_hostel.R;
import com.tmall.ultraviewpager.UltraViewPager;
import com.tmall.ultraviewpager.transformer.UltraDepthScaleTransformer;

import java.util.ArrayList;


public class CouncilCulturalSecy extends AppCompatActivity
        {

    private androidx.appcompat.app.ActionBar culturalActionBar;
    private PagerAdapter adapter;
    private UltraViewPager.Orientation gravity_indicator;
    private ArrayList<CouncilUserClass> culturalList;

            @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.council_warden);

        UltraViewPager ultraViewPager = (UltraViewPager) findViewById(R.id.council_view_pager);
        culturalList =new ArrayList<>();
        CouncilUserClass danceSecy=new CouncilUserClass("Tushar Chawla","IHL Organiser","7489848379","chawla.tushar10@gmail.com", R.drawable.tushar);
        CouncilUserClass filmSecy=new CouncilUserClass("Garvesh Sharma","IHL Organiser","6268079378","garveshsharma50@gmail.com",R.drawable.garvesh);
        CouncilUserClass musicSecy=new CouncilUserClass("Suryadev Singh","IHL Organiser","8765222221","suryadevs993@gmail.com",R.drawable.surya);
        CouncilUserClass artSecy=new CouncilUserClass("Utkarsh Singh","IHL Organiser","6265222353","singhutkarsh0407@gmail.com",R.drawable.utkarsh);
        culturalList.add(danceSecy);
        culturalList.add(filmSecy);
        culturalList.add(musicSecy);
        culturalList.add(artSecy);

        //main code starts here
        ultraViewPager.setScrollMode(UltraViewPager.ScrollMode.HORIZONTAL);
        adapter = new UltraPagerAdapter(true,this, culturalList);
        ultraViewPager.setAdapter(adapter);

        ultraViewPager.setMultiScreen(0.8f);
        ultraViewPager.setItemRatio(1f);
        ultraViewPager.setRatio(0.75f);
        ultraViewPager.setAutoMeasureHeight(true);
        gravity_indicator = UltraViewPager.Orientation.HORIZONTAL;
        ultraViewPager.setPageTransformer(false, new UltraDepthScaleTransformer());



    }



    protected void onResume() {
        super.onResume();

    }

    public boolean onCreateOptionsMenu(Menu menu) {

        culturalActionBar = getSupportActionBar();
        assert culturalActionBar != null;
        culturalActionBar.setHomeButtonEnabled(true);
        culturalActionBar.setDisplayHomeAsUpEnabled(true);
        culturalActionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#5cae80")));
        culturalActionBar.setTitle(Html.fromHtml("<font color='#ffffff'>Council</font>"));
        return super.onCreateOptionsMenu(menu);

    }

    public boolean onOptionsItemSelected(MenuItem item) {

        super.onOptionsItemSelected(item);

        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return true;

    }


}