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

public class MessagePage extends Fragment{
	private Activity activity;
	private View btn_left;
	private View btn_right;
	private View text_title;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		 activity= this.getActivity();
		 activity.getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE,R.layout.message_title);
		 btn_left=activity.findViewById(R.id.message_title_left_btn);
		
		 btn_right=activity.findViewById(R.id.messge_title_right_btn);
	
		 text_title=activity.findViewById(R.id.messge_title_text);
		 btn_right.setVisibility(View.GONE);
		 btn_left.setVisibility(View.GONE);
		 text_title.setVisibility(View.GONE);
		 
	}
			@Override
			public void onViewCreated(View view, Bundle savedInstanceState) {
				// TODO Auto-generated method stub
				super.onViewCreated(view, savedInstanceState);
				 btn_right.setVisibility(View.VISIBLE);
				 btn_left.setVisibility(View.VISIBLE);
				 text_title.setVisibility(View.VISIBLE);
				 btn_left.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View v) {
					Toast.makeText(activity, "message", Toast.LENGTH_SHORT).show();
						
					}
				});
			}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		return inflater.inflate(R.layout.message_fragment, container,false);
	}
	@Override
	public void onDestroyView() {
		// TODO Auto-generated method stub
		super.onDestroyView();
		 btn_right.setVisibility(View.GONE);
		 btn_left.setVisibility(View.GONE);
		 text_title.setVisibility(View.GONE);
	}

}
