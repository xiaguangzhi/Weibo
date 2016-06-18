package com.hzm.view;

import com.hzm.weibo.R;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.PopupWindow;
import android.widget.Toast;

public abstract class BottomPushPopWindows<T> extends PopupWindow{
	protected Context context;
	private WindowManager wm;
	private View maskView;
	public  BottomPushPopWindows(Context context,T t) {
		super(context);
		this.context=context;
		 wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
		 setContentView(generateCustomView(t));
		 //获取宽度和高度
		 setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
		 setHeight(ViewGroup.LayoutParams.MATCH_PARENT);
		 setOutsideTouchable(true);
		 setFocusable(true);
		 
		
		 
		 Drawable drawable = context.getResources().getDrawable(android.R.color.black);
		 drawable.setAlpha(220);
		 setBackgroundDrawable(drawable);
		 
		
	}
	public abstract View generateCustomView(T t);
	 public void show(Activity activity) {
		 Toast.makeText(context, "又成功了", Toast.LENGTH_LONG).show();
	        showAtLocation(activity.getWindow().getDecorView(), Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 0);
	    }

}
