package com.asmt.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MultiFragment extends Fragment {

	public MultiFragment(){
		
	}

	@Override
	public View onCreateView(LayoutInflater inflater,
			@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		View rootview = inflater.inflate(R.layout.fragment_multi, null);
				
				
		return rootview;
	}
	
	
}
