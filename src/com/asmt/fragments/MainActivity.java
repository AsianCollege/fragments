package com.asmt.fragments;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	}
	public void simpleFragment(View v){
		startActivity(new Intent(this,SimpleFragmentActivity.class));
	}
	
	public void multipleFragment(View v){
		startActivity(new Intent(this,MultiFragmentActivity.class));
	}
}
