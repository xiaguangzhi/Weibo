package com.hzm.weibo;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Toast;

public class HomePage extends Fragment{
	private  Activity activity;
	private View right_btn_View;
	private View left_btn_View;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		  activity = this.getActivity();
		  activity.getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE,R.layout.home_title);
		  right_btn_View=activity.findViewById(R.id.home_title_right);
		  left_btn_View=activity.findViewById(R.id.home_title_left);
		  left_btn_View.setVisibility(View.GONE);
		  right_btn_View.setVisibility(View.GONE);
//		 titleView.setVisibility(View.GONE);
	}
	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onViewCreated(view, savedInstanceState);
		right_btn_View.setVisibility(View.VISIBLE);
		left_btn_View.setVisibility(View.VISIBLE);
		left_btn_View.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(activity, "homeleft", Toast.LENGTH_SHORT).show();
				
			}
		});
		right_btn_View.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(activity, "homeright", Toast.LENGTH_SHORT).show();
				
			}
		});
		 
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		return inflater.inflate(R.layout.home_fragment, container,false);
	}
		@Override
		public void onDestroyView() {
			// TODO Auto-generated method stub
			super.onDestroyView();
			 left_btn_View.setVisibility(View.GONE);
			  right_btn_View.setVisibility(View.GONE);
		}

}
