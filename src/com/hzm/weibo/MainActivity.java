package com.hzm.weibo;

import com.hzm.view.MiddlePopupWindow;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TabHost.TabSpec;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends FragmentActivity {
	private FragmentTabHost mTabHost;
	private LayoutInflater layoutInflater;
	MiddlePopupWindow middlePopupWindow;
	
	
	private Class fragmentArray[] = { HomePage.class, MessagePage.class,
			MiddlePage.class, FindPage.class, MyFragment.class };
	private int mImageViewArray[] = { R.drawable.tab_home_btn,
			R.drawable.tab_message_btn, R.drawable.tab_middle_btn,
			R.drawable.tab_find_btn, R.drawable.tab_my_btn };
	private String mTextviewArray[] = { "首页", "消息", "", "发现", "我" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_main);
		
		initView();
		
	
		mTabHost.getTabWidget().getChildAt(2)
				.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View v) {
						
						MiddlePopupWindow middlePopupWindow=new MiddlePopupWindow(MainActivity.this);
						middlePopupWindow.show(MainActivity.this);
						
						
					}
				});

	}

	private void initView() {
		layoutInflater = LayoutInflater.from(this);
		mTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
		mTabHost.setup(MainActivity.this, getSupportFragmentManager(),
				R.id.realtabcontent);
		for (int i = 0; i < fragmentArray.length; i++) {
			// 设置图片和文字内容
			TabSpec tabSpec = mTabHost.newTabSpec(mTextviewArray[i])
					.setIndicator(getTabItemView(i));
			mTabHost.addTab(tabSpec, fragmentArray[i], null);
			mTabHost.getTabWidget().getChildAt(i)
					.setBackgroundColor(Color.rgb(140, 227, 190));
		}
	}

	private View getTabItemView(int index) {
		View view = layoutInflater.inflate(R.layout.tab_item_view, null);

		ImageView imageView = (ImageView) view.findViewById(R.id.imageview);
		imageView.setImageResource(mImageViewArray[index]);

		TextView textView = (TextView) view.findViewById(R.id.textview);
		textView.setText(mTextviewArray[index]);

		return view;
	}
	public void myDialog(){
		
	}

	

}
