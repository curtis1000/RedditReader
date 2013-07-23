package com.cbranum.redditreader;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;

public class MainActivity extends FragmentActivity {
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // create an instance of Reddit Reader List Fragment
        RedditReaderListFragment redditReaderListFragment = new RedditReaderListFragment();
        
        // add the Simple Activity List Fragment to its layout container
		getSupportFragmentManager().beginTransaction().replace(R.id.container, redditReaderListFragment).commit();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}

