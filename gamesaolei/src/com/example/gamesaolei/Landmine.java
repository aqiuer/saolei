package com.example.gamesaolei;

import android.content.Context;
import android.widget.Button;

public class Landmine extends Button  {
	public boolean isLandmine=false;//是否有地雷
	public boolean isNull=false;//是否为空白
	public  int onlong=0;//用于记录是长按了第几次
	public Landmine(Context context) {
		super(context);
		//this.setBackgroundColor(0xD3D3D3);
	}
}
