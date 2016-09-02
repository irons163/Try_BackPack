package com.example.try_backpack.backpack_system;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import com.example.try_gameengine.framework.ALayer;
import com.example.try_gameengine.framework.ILayer;
import com.example.try_gameengine.framework.LayerManager;

public class ViewLayer extends ALayer{
	private View view;
	
	protected ViewLayer(Context context, float x, float y, boolean autoAdd) {
		super(x, y, autoAdd);
		// TODO Auto-generated constructor stub
		TextView view = new TextView(context);
		view.setText("123");
		view.setX(100);
		view.setY(100);
		view.setWidth(100);
		view.setHeight(100);
		view.layout(100, 100, 200, 200);
		
		this.view = view;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		throw new CloneNotSupportedException();
	}

	@Override
	public void setPosition(float x, float y) {
		// TODO Auto-generated method stub
//		view.layout(l, t, r, b)
	}

	@Override
	public RectF getSmallViewRect() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSmallViewRect(RectF smallViewRect) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setInitWidth(int w) {
		// TODO Auto-generated method stub
		view.layout(view.getLeft(), view.getTop(), view.getLeft() + w, view.getTop());
		this.centerX = view.getX() + w / 2;
	}

	@Override
	public void setInitHeight(int h) {
		// TODO Auto-generated method stub
		view.layout(view.getLeft(), view.getTop(), view.getRight(), view.getTop() + h);
	}

	@Override
	public void setWidth(int w) {
		// TODO Auto-generated method stub
		view.layout(view.getLeft(), view.getTop(), view.getLeft() + w, view.getTop());
	}

	@Override
	public void setHeight(int h) {
		// TODO Auto-generated method stub
		view.layout(view.getLeft(), view.getTop(), view.getLeft(), view.getTop() + h);
	}

	@Override
	public float getCenterX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getCenterY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getX() {
		// TODO Auto-generated method stub
		return view.getX();
	}

	@Override
	public void setX(float x) {
		// TODO Auto-generated method stub
//		this.x = x;
//		this.centerX = x + w/2;
		view.setX(x);
		if(isComposite() && getParent()!=null)
			setLocationInScene(getParent().locationInSceneByCompositeLocation((float) (centerX - w / 2), (float) (centerY - h / 2)));
	}

	@Override
	public float getY() {
		// TODO Auto-generated method stub
		return view.getY();
	}

	@Override
	public void setY(float y) {
		// TODO Auto-generated method stub
		view.setY(y);
	}

	
	@Override
	public void setBitmapAndAutoChangeWH(Bitmap bitmap) {
		// TODO Auto-generated method stub
		this.bitmap = bitmap;
		setInitWidth(bitmap.getWidth());
		setInitHeight(bitmap.getHeight());
	}

	@Override
	public Bitmap getBitmap() {
		// TODO Auto-generated method stub
		return bitmap;
	}

	@Override
	public RectF getDst() {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public int getLayerLevel() {
//		// TODO Auto-generated method stub
//		return layerLevel;
//	}

//	@Override
//	public void setLayerLevel(int layerLevel) {
//		// TODO Auto-generated method stub
//		this.layerLevel = layerLevel;
//	}

	@Override
	public int getAlpha() {
		// TODO Auto-generated method stub
		return (int) (view.getAlpha()*255);
	}
	
	@Override
	public void setAlpha(int alpha) {
		// TODO Auto-generated method stub
		view.setAlpha(alpha/255.0f);
	}

	@Override
	public Paint getPaint() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPaint(Paint paint) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeFromParent() {
		// TODO Auto-generated method stub
		super.removeFromParent();
	}

	@Override
	public void removeFromAuto() {
		// TODO Auto-generated method stub
		super.removeFromAuto();
	}

	@Override
	public boolean isTouching() {
		// TODO Auto-generated method stub
		return super.isTouching();
	}

	@Override
	public void setTouching(boolean isTouching) {
		// TODO Auto-generated method stub
		super.setTouching(isTouching);
	}

	@Override
	public boolean isComposite() {
		// TODO Auto-generated method stub
		return super.isComposite();
	}

	@Override
	public void setComposite(boolean isComposite) {
		// TODO Auto-generated method stub
		super.setComposite(isComposite);
	}

	@Override
	public PointF getLocationInScene() {
		// TODO Auto-generated method stub
		return super.getLocationInScene();
	}

	@Override
	public void setLocationInScene(PointF locationInScene) {
		// TODO Auto-generated method stub
		super.setLocationInScene(locationInScene);
	}

	@Override
	public PointF locationInLayer(float x, float y) {
		// TODO Auto-generated method stub
		return super.locationInLayer(x, y);
	}

	@Override
	public PointF locationInSceneByCompositeLocation(float locationInLayerX,
			float locationInLayerY) {
		// TODO Auto-generated method stub
		return super.locationInSceneByCompositeLocation(locationInLayerX, locationInLayerY);
	}

	@Override
	public ILayer getRootLayer() {
		// TODO Auto-generated method stub
		return super.getRootLayer();
	}

	@Override
	public List<ILayer> getLayersFromRootLayerToCurrentLayerInComposite() {
		// TODO Auto-generated method stub
		return super.getLayersFromRootLayerToCurrentLayerInComposite();
	}
	
	@Override
	public void drawSelf(Canvas canvas, Paint paint) {
		// TODO Auto-generated method stub
		
		view.draw(canvas);
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		return view.onTouchEvent(event);
//		return false;
	}

	@Override
	public ILayer getParent() {
//		 TODO Auto-generated method stub
		return super.getParent();
	}

	public View getView(){
		return view;
	}
	
	public void setView(View view){
		this.view = view;
	}

	@Override
	protected void onTouched(MotionEvent event) {
		// TODO Auto-generated method stub
		
	}
}
