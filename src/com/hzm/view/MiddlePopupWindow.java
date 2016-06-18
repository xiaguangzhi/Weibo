package com.hzm.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.hzm.weibo.Data;
import com.hzm.weibo.R;

public class MiddlePopupWindow extends BottomPushPopWindows<Void> {
	
	
	private List<Map<String, Object>> data_list;

	public MiddlePopupWindow(Context context) {
		super(context, null);

	}

	@Override
	public View generateCustomView(Void data) {
		// 获取视图

		Log.i("middle", context + "+++3");
		View root = View.inflate(context, R.layout.middle_view, null);
		Log.i("middle", context + "+++4");
		View btn_view = root.findViewById(R.id.middle_false);

		btn_view.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				dismiss();

			}
		});
		Log.i("middle", context + "+++5");
		GridView gridview = (GridView) root.findViewById(R.id.gridView1);
		Log.i("middle", context + "+++6");
		System.out.println(Data.middle_Image);
		data_list=new ArrayList<Map<String,Object>>();
		data_list = getData();
		Log.i("middle", context + "+++7");
		String[] from = { "image", "text" };
		int[] to = { R.id.image, R.id.text };
		SimpleAdapter simAdapter = new SimpleAdapter(context, data_list,
				R.layout.middle_item_view, from, to);
		gridview.setAdapter(simAdapter);
		
		gridview.setSelector(new ColorDrawable(Color.TRANSPARENT));
		
		gridview.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				System.out.println(view.toString()+":"+position+"："+id);
				Toast.makeText(context, "好累", Toast.LENGTH_LONG).show();

			}

		});

		return root;
	}

	public List<Map<String, Object>> getData() {
	
			int[] array=Data.middle_Image;
		for (int i = 0; i <array.length; i++) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("image", array[i]);
			map.put("text", Data.middle_text[i]);
			data_list.add(map);
		}

		return data_list;

	}

}
