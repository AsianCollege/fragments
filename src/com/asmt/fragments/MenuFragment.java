package com.asmt.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class MenuFragment extends Fragment {
	
	
	Fragment fragment;
	FragmentTransaction fragTrans;
	Button frag1;
	Button frag2;
	public MenuFragment(){
		
	}

	@Override
	public View onCreateView(LayoutInflater inflater,
			@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		View rootview = inflater.inflate(R.layout.fragment_menu, null);
		frag1 = (Button)rootview.findViewById(R.id.multiFragment1);
		frag2 = (Button)rootview.findViewById(R.id.multiFragment2);
		frag1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				fragment = new MultiFragment();
				fragTrans = getFragmentManager().beginTransaction().replace(R.id.frameContainer,fragment);
				fragTrans.commit();
			}
		});
		frag2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				fragment = new MultiFragemnt2();
				fragTrans = getFragmentManager().beginTransaction().replace(R.id.frameContainer,fragment);
				fragTrans.commit();				
			}
		});
		return rootview;
	}
	
}
