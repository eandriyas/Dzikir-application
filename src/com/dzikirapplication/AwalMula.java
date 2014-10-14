package com.dzikirapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class AwalMula extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setContentView(R.layout.awal_mula);
		Thread timer = new Thread(){
			public void run(){
				try{
					sleep(4000);
					
					
				} catch(InterruptedException e){
					e.printStackTrace();
				}finally{
					Intent i = new Intent("com.dzikirapplication.STARTINGPOINT");
					startActivity(i);
				}
			}
		};
		timer.start();
	}
	

}
