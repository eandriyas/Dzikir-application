package com.dzikirapplication;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DzikirShalat extends Activity {
	int counter, a;
	Button start;
	TextView header, keterangan;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stubn
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dzikir_shalat);
		String f = "font/Roboto-Thin.ttf";

		Typeface tf = Typeface.createFromAsset(getAssets(), f);

		header = (TextView) findViewById(R.id.header);
		start = (Button) findViewById(R.id.start);
		keterangan = (TextView) findViewById(R.id.keterangan);

//		start.setTypeface(tf);
//		header.setTypeface(tf);
		keterangan.setTypeface(tf);
		start.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Vibrator vibe = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
				Typeface face = Typeface.createFromAsset(getAssets(),"font/me_quran.ttf");
				a++;
				counter++;
				start.setText("" + counter);
				vibe.vibrate(50);
				if (a == 1) {
					String[] t = { "اَسْتَغْفِرُ اَللّهَ الْعَظِیْمَ" };
					header.setTypeface(face);
					header.setText(t[0]);
					counter = 0;
					keterangan.setText("Aku memohon ampunan kepada Allah Yang Maha Agung");
					counter++;
					start.setText("" + counter);
				} else if (a == 4) {
					String[] t = { " اللَّهُمَّ أَنْتَ السَّلاَمُ وَمِنْكَ السَّلاَمُ تَبَارَكْتَ يَا ذَا الْجَلاَلِ وَالإِكْرَامِ"};
					header.setTypeface(face);
					header.setText(t[0]);
					counter = 0;
					keterangan.setText("Ya Allah, Engkaulah As-Salaam (Yang selamat dari kejelekan-kejelekan, kekurangan-kekurangan dan kerusakan-kerusakan) dan dari-Mu as-salaam (keselamatan), Maha Berkah Engkau Wahai Dzat Yang Maha Agung dan Maha Baik.");
					counter++;
					start.setText("" + counter);
					vibe.vibrate(400);
				} else if (a == 5) {
					String[] t = { "لاَ إِلَهَ إِلاَّ اللهُ وَحْدَهُ لاَ شَرِيْكَ لَهُ, لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيْرٌ" };
					header.setTypeface(face);
					header.setText(t[0]);
					counter = 0;
					keterangan.setText("Tiada tuhan yang berhak diibadahi selain Allah, tiada sekutu bagi-Nya, bagi-Nya segala kerajaan, dan pujian, dan Dia Maha Berkuasa atas segala sesuatu.");
					counter++;
					start.setText("" + counter);
					vibe.vibrate(400);
				} else if (a == 8) {
					String[] t = { "سُبْحَانَ اللّهِ" };
					header.setTypeface(face);
					header.setText(t[0]);
					counter = 0;
					keterangan.setText("Maha suci Allah");
					counter++;
					start.setText("" + counter);
				} else if (a == 41) {
					String[] t = { " الْحَمْدُ لِلَّهِ" };
					header.setTypeface(face);
					header.setText(t[0]);
					counter = 0;
					keterangan.setText("Segala puji bagi Allah");
					counter++;
					start.setText("" + counter);
					vibe.vibrate(400);
				} else if (a == 74) {
					String[] t = { "اَللّهُ اَكْبَرُ" };
					header.setTypeface(face);
					header.setText(t[0]);
					counter = 0;
					keterangan.setText("Allah maha Besar");
					counter++;
					start.setText("" + counter);
					vibe.vibrate(400);
				} else if (a == 107) {
					vibe.vibrate(600);
					start.setEnabled(false);
					start.setText("Selesai");

				}			}
		});
	}

}
