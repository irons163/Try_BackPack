package com.example.try_backpack;

import java.io.IOException;
import java.io.InputStream;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.provider.Settings.Global;

public class BitmapUtil {
	static Context context;
	
public static Bitmap bar;
	
	public static Bitmap brick_once_bmp;
	public static Bitmap brick_twice_bmp;
	public static Bitmap brick_three_bmp;
	public static Bitmap brick_iron_bmp;
	public static Bitmap brick_time_bmp;
	public static Bitmap brick_tool_bmp;
	public static Bitmap brick_ball_level_up_bmp;
	public static Bitmap brick_iron_break_bmp;

	public static Bitmap tool_BallSpeedUp_bmp;
	public static Bitmap tool_BallSpeedDown_bmp;
	public static Bitmap tool_StickLongUp_bmp;
	public static Bitmap tool_StickLongDown_bmp;
	public static Bitmap tool_BallCountUpToThree_bmp;
	public static Bitmap tool_LifeUp_bmp;
	public static Bitmap tool_Weapen_bmp;
	public static Bitmap tool_BallReset_bmp;
	public static Bitmap tool_StickLongMax_bmp;
	public static Bitmap tool_BallRadiusUp_bmp;
	public static Bitmap tool_BallRadiusDown_bmp;
	public static Bitmap tool_BlackHole_bmp;
//	public static Bitmap tool_BallLevelUpOnce_bmp;
	public static Bitmap tool_BallLevelUpTwice_bmp;
	public static Bitmap tool_BallLevelDownOnce_bmp;
	
	public static Bitmap ball_Show_bmp;
	
	public static Bitmap cat;
	public static Bitmap bullet;
	
	public static Bitmap hamster, hamsterShoot, hamsterShoot2;
	public static Bitmap hand;
	
	public static Bitmap backpack_bg;
	public static Bitmap backpack_cell_bg;
	
	public static void initBitmap(Context context){
		BitmapUtil.context = context;
//		initBitmap();
		final BitmapFactory.Options options = new BitmapFactory.Options();
		options.inSampleSize = 1;
		options.inJustDecodeBounds = false;
		
		brick_once_bmp = BitmapFactory.decodeResource(
				context.getResources(), R.drawable.brick01, options);
		brick_twice_bmp = BitmapFactory.decodeResource(
				context.getResources(), R.drawable.brick02, options);
		brick_three_bmp = BitmapFactory.decodeResource(
				context.getResources(), R.drawable.brick03, options);
		brick_iron_bmp = BitmapFactory.decodeResource(
				context.getResources(), R.drawable.brick04, options);
		brick_time_bmp = BitmapFactory.decodeResource(
				context.getResources(), R.drawable.brick05, options);
		brick_tool_bmp = BitmapFactory.decodeResource(
				context.getResources(), R.drawable.brick06, options);
		brick_ball_level_up_bmp = BitmapFactory.decodeResource(
				context.getResources(), R.drawable.brick07, options);
		brick_iron_break_bmp = BitmapFactory.decodeResource(
				context.getResources(), R.drawable.brick04_1, options);
		
		brick_once_bmp = BitmapFactory.decodeResource(
				context.getResources(), R.drawable.brick01, options);
		brick_twice_bmp = BitmapFactory.decodeResource(
				context.getResources(), R.drawable.brick02, options);
		brick_three_bmp = BitmapFactory.decodeResource(
				context.getResources(), R.drawable.brick03, options);
		brick_iron_bmp = BitmapFactory.decodeResource(
				context.getResources(), R.drawable.brick04, options);
		brick_time_bmp = BitmapFactory.decodeResource(
				context.getResources(), R.drawable.brick05, options);
		brick_tool_bmp = BitmapFactory.decodeResource(
				context.getResources(), R.drawable.brick06, options);
		brick_ball_level_up_bmp = BitmapFactory.decodeResource(
				context.getResources(), R.drawable.brick07, options);
		brick_iron_break_bmp = BitmapFactory.decodeResource(
				context.getResources(), R.drawable.brick04_1, options);
		
		tool_BallSpeedUp_bmp = BitmapFactory.decodeResource(
				context.getResources(), R.drawable.tool01, options);
		tool_BallSpeedDown_bmp = BitmapFactory.decodeResource(
				context.getResources(), R.drawable.tool02, options);
		tool_StickLongUp_bmp = BitmapFactory.decodeResource(
				context.getResources(), R.drawable.tool03, options);
		tool_StickLongDown_bmp = BitmapFactory.decodeResource(
				context.getResources(), R.drawable.tool04, options);
		tool_BallCountUpToThree_bmp = BitmapFactory.decodeResource(
				context.getResources(), R.drawable.tool05, options);
		tool_LifeUp_bmp = BitmapFactory.decodeResource(
				context.getResources(), R.drawable.tool06, options);
		tool_Weapen_bmp = BitmapFactory.decodeResource(
				context.getResources(), R.drawable.tool07, options);
		tool_BallReset_bmp = BitmapFactory.decodeResource(
				context.getResources(), R.drawable.tool08, options);
		tool_StickLongMax_bmp = BitmapFactory.decodeResource(
				context.getResources(), R.drawable.tool09, options);
		tool_BallRadiusUp_bmp = BitmapFactory.decodeResource(
				context.getResources(), R.drawable.tool10, options);
		tool_BallRadiusDown_bmp = BitmapFactory.decodeResource(
				context.getResources(), R.drawable.tool11, options);
		tool_BlackHole_bmp = BitmapFactory.decodeResource(
				context.getResources(), R.drawable.tool12, options);
		tool_BallLevelUpTwice_bmp = BitmapFactory.decodeResource(
				context.getResources(), R.drawable.tool13, options);
		tool_BallLevelDownOnce_bmp = BitmapFactory.decodeResource(
				context.getResources(), R.drawable.tool14, options);
		
		bar = BitmapFactory.decodeResource(context.getResources(), R.drawable.bar);  
		
		cat = BitmapFactory.decodeResource(context.getResources(), R.drawable.brown_point);  
		
		bullet = BitmapFactory.decodeResource(context.getResources(), R.drawable.red_point);
		
		hamster = BitmapFactory.decodeResource(context.getResources(), R.drawable.yellow_point);
	
		hamsterShoot  = BitmapFactory.decodeResource(context.getResources(), R.drawable.green_point);
		hamsterShoot2  = BitmapFactory.decodeResource(context.getResources(), R.drawable.blue_point);
	
		hand = BitmapFactory.decodeResource(context.getResources(), R.drawable.orange_point);
		
		BitmapFactory.Options backpack_bg_options = new BitmapFactory.Options();
		backpack_bg_options.inSampleSize = 3;
		backpack_bg_options.inJustDecodeBounds = false;
		backpack_bg = BitmapFactory.decodeResource(context.getResources(), R.drawable.bgbottom_hd, backpack_bg_options);
		
		backpack_cell_bg = BitmapFactory.decodeResource(context.getResources(), R.drawable.ic_launcher);
	}
	
	
	public static Bitmap createSpecificSizeBitmap(Drawable drawable, int width, int height) {
		
		Bitmap bitmap = Bitmap.createBitmap(width, height,
				Bitmap.Config.ARGB_8888);
		Canvas canvas = new Canvas(bitmap); 
		drawable.setBounds(0, 0, width, height);
		drawable.draw(canvas); 
		return bitmap;
	}
	
	public static Bitmap getBitmap(String path) {
		try {
			InputStream is = context.getAssets().open(path);

			return BitmapFactory.decodeStream(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static Bitmap getBitmapFromRes(int resId){
		Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(), resId);
		return bitmap;
	}
	
}
