package com.example.try_backpack;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;

import com.example.try_backpack.backpack_system.Backpack;
import com.example.try_backpack.backpack_system.MoveToolDialogLayer;
import com.example.try_backpack.backpack_system.Tool;
import com.example.try_backpack.backpack_system.ToolA;
import com.example.try_backpack.backpack_system.ToolB;
import com.example.try_gameengine.framework.Data;
import com.example.try_gameengine.framework.GameModel;
import com.example.try_gameengine.framework.LayerManager;

public class MyGameModel extends GameModel {
	private Backpack backpack;
	MoveToolDialogLayer moveToolDialogLayer;
	
	public MyGameModel(Context context, Data data) {
		super(context, data);
		// TODO Auto-generated constructor stub
		backpack = new Backpack(BitmapUtil.backpack_bg, 100f, 100f, false);
		Tool tool = new ToolA(0, 0, false);
		tool.setAnchorPoint(1, 1);
		tool.setBitmapAndAutoChangeWH(BitmapUtil.tool_BlackHole_bmp);
		backpack.addTool(tool);
		tool = new ToolB(0, 0, false);
		tool.setAnchorPoint(1, 1);
		tool.setBitmapAndAutoChangeWH(BitmapUtil.tool_BallSpeedUp_bmp);
		backpack.addTool(tool);
	}

	@Override
	protected void process() {
		// TODO Auto-generated method stub
		super.process();
	}
	
	@Override
	protected void doDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.doDraw(canvas);
		
		backpack.drawSelf(canvas, null);
		
		LayerManager.drawLayers(canvas, null);
		if(moveToolDialogLayer!=null)
		moveToolDialogLayer.drawSelf(canvas, null);
	}
	
	@Override
	public void onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
//		super.onTouchEvent(event);
//		backpack.touchTool(event.getX(), event.getY());
		
//		if(moveToolDialogLayer==null)
//    		moveToolDialogLayer = new MoveToolDialogLayer(context, 100, 100, false);
//		else
//			moveToolDialogLayer.onTouchEvent(event);
		backpack.onTouchEvent(event);
	}
}
