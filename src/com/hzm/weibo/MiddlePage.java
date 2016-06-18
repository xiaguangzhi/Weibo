package com.hzm.weibo;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MiddlePage extends Fragment{
	private  View view;
	private int[] middle_Image={R.drawable.middle_tabbar_1,
			R.drawable.middle_tabbar_2,
			R.drawable.middle_tabbar_3,
			R.drawable.middle_tabbar_4,
			R.drawable.middle_tabbar_5,
			R.drawable.middle_tabbar_6,
			R.drawable.middle_false,
			};
	private String[] middle_text={"文字","照片","头条","签到","直播","更多"};   
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		Log.i("middle", "oncreateview");
		view=inflater.inflate(R.layout.middle_fragment, container,false);
			
		return view;
	}
	
	
	/*@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		
		super.onActivityCreated(savedInstanceState);
		FragmentManager fm = getChildFragmentManager();
		MiddlePage middle = (MiddlePage) fm.findFragmentById(R.id.left_fragment);
		if (middle==null) {
			 try {
				middle = MiddlePage.class.newInstance();
			} catch (java.lang.InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			fm.beginTransaction().replace(R.id.left_fragment, middle).commit();
		}
	}*/
	
	
	

}
