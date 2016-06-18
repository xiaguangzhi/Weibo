package com.hzm.weibo;


import java.lang.reflect.Field;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Middle extends Fragment{
	private static View view;
	
	private String[] middle_text={"文字","照片","头条","签到","直播","更多"};   
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		Log.i("middle", "oncreateview");
		view=inflater.inflate(R.layout.middle_fragment, container,false);
			
		return view;
	}
	@Override
	public void onAttach(Activity activity) {
		
		super.onAttach(activity);
	}
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		Log.i("middle", "onActivityCreated");
		super.onActivityCreated(savedInstanceState);
	}
	@Override
	public void onStart() {
		Log.i("middle", "onStart");
		super.onStart();
	}
	@Override
	public void onPause() {
		Log.i("middle", "onPause");
		super.onPause();
	}
	@Override
	public void onDestroyView() {
		Log.i("middle", "onDestroyView");
		super.onDestroyView();
	}
	@Override
	public void onDestroy() {
		Log.i("middle", "onDestroy");
		super.onDestroy();
	}
	@Override
	public void onDetach() {
		Log.i("middle", " onDetach");
		super.onDetach();super.onDetach();
	    try {
		      Field childFragmentManager = Fragment.class
		          .getDeclaredField("mChildFragmentManager");
		      childFragmentManager.setAccessible(true);
		      childFragmentManager.set(this, null);

		    } catch (NoSuchFieldException e) {
		      throw new RuntimeException(e);
		    } catch (IllegalAccessException e) {
		      throw new RuntimeException(e);
		    }
	}
	@Override
	public void onResume() {
		Log.i("middle", " onResume");
		super.onResume();
		
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
