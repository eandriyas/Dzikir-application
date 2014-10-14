package com.dzikirapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends Activity {
	Button btnShalat, btnPagi, btnSore, btnAbout;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu);
		btnShalat = (Button) findViewById(R.id.btnShalat);
		btnPagi = (Button) findViewById(R.id.btnPagi);
		btnSore = (Button) findViewById(R.id.btnSore);
		btnAbout = (Button) findViewById(R.id.btnAbout);

		btnShalat.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(v.getContext(), DzikirShalat.class);
				startActivityForResult(myIntent, 0);
			}
		});
		btnPagi.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(v.getContext(), DzikirPagi.class);
				startActivityForResult(myIntent, 0);
			}
		});
		btnSore.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(v.getContext(), DzikirSore.class);
				startActivityForResult(myIntent, 0);
			}
		});
		btnAbout.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(v.getContext(), AboutApp.class);
				startActivityForResult(myIntent, 0);
			}
		});
	}

}
