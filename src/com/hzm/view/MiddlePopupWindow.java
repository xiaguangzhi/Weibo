package com.hzm.view;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

import com.hzm.weibo.R;

public class MiddlePopupWindow extends BottomPushPopWindows<Void> {
		
	public MiddlePopupWindow(Context context) {
		super(context,null);
		
		
	}
	
	@Override
	public View generateCustomView(Void data) {
		//获取视图
		View root = View.inflate(context, R.layout.middle_view,null);
		View btn_view = root.findViewById(R.id.middle_btn);
		btn_view.setAlpha(10);
		btn_view.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				dismiss();
				Toast.makeText(context, "又成功了", Toast.LENGTH_LONG).show();
				
			}
		});
		
		return root;
	}

}
