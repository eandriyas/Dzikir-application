package com.dzikirapplication;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DzikirPagi extends Activity {
	int counter2, a2;
	Button start2;
	TextView header2, keterangan2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dzikir_pagi);

		start2 = (Button) findViewById(R.id.start2);
		header2 = (TextView) findViewById(R.id.header2);
		keterangan2 = (TextView) findViewById(R.id.keterangan2);

		String f = "font/Roboto-Thin.ttf";
		Typeface tf = Typeface.createFromAsset(getAssets(), f);
		keterangan2.setTypeface(tf);

		start2.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Vibrator vibe = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
				Typeface face = Typeface.createFromAsset(getAssets(),
						"font/me_quran.ttf");
				a2++;
				counter2++;
				start2.setText("" + counter2);
				vibe.vibrate(50);
				vibe.vibrate(50);
				if (a2 == 1) {
					String[] t = { "أَعُوذُ بِاللَّهِ مِنَ الشَّيْطَانِ الرَّجِيمِ" };
					header2.setTypeface(face);
					header2.setText(t[0]);
					counter2 = 0;
					keterangan2
							.setText("Aku berlindung kepada Allah dari godaan syaitan yang terkutuk.");
					counter2++;
					start2.setText("" + counter2);
				} else if (a2 == 2) {
					String[] t = { "اللَّهُ لاَ إِلَهَ إِلاَّ هُوَ الْحَيُّ الْقَيُّومُ، لاَ تَأْخُذُهُ سِنَةٌ وَلاَ نَوْمٌ، لَهُ مَا فِي السَّمَاوَاتِ وَمَا فِي الْأَرْضِ، مَنْ ذَا الَّذِي يَشْفَعُ عِنْدَهُ إِلاَّ بِإِذْنِهِ، يَعْلَمُ مَا بَيْنَ أَيْدِيهِمْ وَمَا خَلْفَهُمْ، وَلَا يُحِيطُونَ بِشَيْءٍ مِنْ عِلْمِهِ إِلاَّ بِمَا شَاءَ، وَسِعَ كُرْسِيُّهُ السَّمَاوَاتِ وَالْأَرْضَ، وَلَا يَئُودُهُ حِفْظُهُمَا، وَهُوَ الْعَلِيُّ الْعَظِيمُ" };
					header2.setTypeface(face);
					header2.setText(t[0]);
					counter2 = 0;
					keterangan2
							.setText("Allah, tidak ada Tuhan (yang berhak disembah) melainkan Dia, yang hidup kekal lagi terus menerus mengurus (makhluk-Nya). Dia tidak mengantuk dan tidak tidur. Kepunyaan-Nya apa yang di langit dan di bumi. Tiada yang dapat memberi syafa’at di sisi-Nya tanpa seizin-Nya. Dia mengetahui apa-apa yang di hadapan mereka dan di belakang mereka. Mereka tidak mengetahui apa-apa dari ilmu Allah melainkan apa yang dikehendaki-Nya. Kursi Allah meliputi langit dan bumi. Dia tidak merasa berat memelihara keduanya. Dan Dia Maha Tinggi lagi Maha besar. (QS. Al Baqarah: 255)");
					counter2++;
					start2.setText("" + counter2);
					vibe.vibrate(400);
				} else if (a2 == 3) {
					String[] t = { "بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ. قُلْ هُوَ اللَّهُ أَحَدٌ. اللَّهُ الصَّمَدُ. لَمْ يَلِدْ وَلَمْ يُولَدْ. وَلَمْ يَكُن لَّهُ كُفُوًا أَحَدٌ" };
					header2.setTypeface(face);
					header2.setText(t[0]);
					counter2 = 0;
					keterangan2
							.setText("Dengan menyebut nama Allah Yang Maha Pengasih lagi Maha Penyayang. Katakanlah: Dialah Allah, Yang Maha Esa. Allah adalah Ilah yang bergantung kepada- Nya segala urusan. Dia tidak beranak dan tiada pula diperanakkan, dan tidak ada seorang pun yang setara dengan Dia.” (QS. Al Ikhlas: 1-4)");
					counter2++;
					start2.setText("" + counter2);
					vibe.vibrate(400);
				} else if (a2 == 6) {
					String[] t = { "بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ. قُلْ أَعُوذُ بِرَبِّ الْفَلَقِ.  مِن شَرِّ مَا خَلَقَ.  وَمِن شَرِّ غَاسِقٍ إِذَا وَقَبَ.  وَمِن شَرِّ النَّفَّاثَاتِ فِي الْعُقَدِ.   وَمِن شَرِّ حَاسِدٍ إِذَا حَسَدَ" };
					header2.setTypeface(face);
					header2.setText(t[0]);
					counter2 = 0;
					keterangan2
							.setText("Dengan menyebut nama Allah Yang Maha Pengasih lagi Maha Penyayang. Katakanlah: Aku berlindung kepada Rabb yang menguasai Subuh, dari kejahatan makhluk-Nya, dan dari kejahatan malam apabila telah gelap gulita, dan dari kejahatan-kejahatan wanita tukang sihir yang menghembus pada buhul-buhul, dan dari kejahatan orang yang dengki apabila ia dengki. (QS. Al Falaq: 1-5)");
					counter2++;
					start2.setText("" + counter2);
					vibe.vibrate(400);
				} else if (a2 == 9) {
					String[] t = { "بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ. قُلْ أَعُوذُ بِرَبِّ النَّاسِ.  مَلِكِ النَّاسِ.  إِلَهِ النَّاسِ.  مِن شَرِّ الْوَسْوَاسِ الْخَنَّاسِ.  الَّذِي يُوَسْوِسُ فِي صُدُورِ النَّاسِ.  مِنَ الْجِنَّةِ وَ النَّاسِ" };
					header2.setTypeface(face);
					header2.setText(t[0]);
					counter2 = 0;
					keterangan2
							.setText("Dengan menyebut nama Allah Yang Maha Pengasih lagi Maha Penyayang. Katakanlah: Aku berlindung kepada Rabb manusia. Raja manusia. Sembahan manusia, dari kejahatan (bisikan) syaitan yang biasa bersembunyi, yang membisikkan (kejahatan) ke dalam dada manusia, dari jin dan manusia. (QS. An Naas: 1-6)");
					counter2++;
					start2.setText("" + counter2);
					vibe.vibrate(400);
				} else if (a2 == 12) {
					String[] t = { "أَصْبَحْنَا وَأَصْبَحَ الْمُلْكُ لِلَّهِ، وَالْحَمْدُ لِلَّهِ، لاَ إِلَـهَ إِلاَّ اللهُ وَحْدَهُ لاَ شَرِيْكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيْرُ. رَبِّ أَسْأَلُكَ خَيْرَ مَا فِيْ هَذَا الْيَوْمِ وَخَيْرَ مَا بَعْدَهُ، وَأَعُوْذُ بِكَ مِنْ شَرِّ مَا فِيْ هَذَا الْيَوْمِ وَشَرِّ مَا بَعْدَهُ، رَبِّ أَعُوْذُ بِكَ مِنَ الْكَسَلِ وَسُوْءِ الْكِبَرِ، رَبِّ أَعُوْذُ بِكَ مِنْ عَذَابٍ فِي النَّارِ وَعَذَابٍ فِي الْقَبْرِ." };
					header2.setTypeface(face);
					header2.setText(t[0]);
					counter2 = 0;
					keterangan2
							.setText("“Kami telah memasuki waktu pagi dan kerajaan hanya milik Allah, segala puji bagi Allah. Tidak ada ilah (yang berhak disembah) kecuali Allah semata, tiada sekutu bagiNya. Milik Allah kerajaan dan bagi-Nya pujian. Dia-lah Yang Mahakuasa atas segala sesuatu.Ya Rabbku, aku mohon kepada-Mu kebaikan di hari ini dan kebaikan sesudahnya. Aku berlindung kepada-Mu dari kejahatan hari ini dan kejahatan sesudahnya. Ya Rabbku, aku berlindung kepada-Mu dari kemalasan dan kejelekan di hari tua. Wahai Rabbku, aku berlindung kepada-Mu dari siksaan di Neraka dan siksaan di kubur.");
					counter2++;
					start2.setText("" + counter2);
					vibe.vibrate(400);
				} else if (a2 == 13) {
					String[] t = { "اَللَّهُمَّ بِكَ أَصْبَحْنَا، وَبِكَ أَمْسَيْنَا، وَبِكَ نَحْيَا، وَبِكَ نَمُوْتُ وَإِلَيْكَ النُّشُوْرُ." };
					header2.setTypeface(face);
					header2.setText(t[0]);
					counter2 = 0;
					keterangan2
							.setText("Ya Allah, dengan rahmat dan pertolongan-Mu kami memasuki waktu pagi, dan dengan rahmat dan pertolongan-Mu kami memasuki waktu sore. Dengan rahmat dan pertolongan-Mu kami hidup dan dengan kehendak-Mu kami mati. Dan kepada-Mu kebangkitan (bagi semua makhluk).");
					counter2++;
					start2.setText("" + counter2);
					vibe.vibrate(400);
				} else if (a2 == 14) {
					String[] t = { "اَللَّهُمَّ أَنْتَ رَبِّيْ لاَ إِلَـهَ إِلاَّ أَنْتَ، خَلَقْتَنِيْ وَأَنَا عَبْدُكَ، وَأَنَا عَلَى عَهْدِكَ وَوَعْدِكَ مَا اسْتَطَعْتُ، أَعُوْذُ بِكَ مِنْ شَرِّ مَا صَنَعْتُ، أَبُوْءُ لَكَ بِنِعْمَتِكَ عَلَيَّ، وَأَبُوْءُ بِذَنْبِيْ فَاغْفِرْ لِيْ فَإِنَّهُ لاَ يَغْفِرُ الذُّنُوْبَ إِلاَّ أَنْتَ" };
					header2.setTypeface(face);
					header2.setText(t[0]);
					counter2 = 0;
					keterangan2
							.setText("Ya Allah, Engkau adalah Rabbku, tidak ada ilah yang berhak disembah kecuali Engkau, Engkaulah yang menciptakanku. Aku adalah hambaMu. Aku akan setia pada perjanjianku pada-Mu (yaitu menjalankan ketaatan dan menjauhi larangan, pen) semampuku dan aku yakin akan janji-Mu (berupa pahala). Aku berlindung kepada-Mu dari kejelekan yang kuperbuat. Aku mengakui nikmat-Mu kepadaku dan aku mengakui dosaku. Oleh karena itu, ampunilah aku. Sesungguhnya tiada yang mengampuni dosa kecuali Engkau.");
					counter2++;
					start2.setText("" + counter2);
					vibe.vibrate(400);
				} else if (a2 == 15) {
					String[] t = { "اَللَّهُمَّ إِنِّيْ أَصْبَحْتُ أُشْهِدُ وَأُشْهِدُ حَمَلَةَ عَرْشِكَ، وَمَلاَئِكَتَكَ وَجَمِيْعَ خَلْقِكَ، أَنَّكَ أَنْتَ اللهُ لاَ إِلَـهَ إِلاَّ أَنْتَ وَحْدَكَ لاَ شَرِيْكَ لَكَ، وَأَنَّ مُحَمَّدًا عَبْدُكَ وَرَسُوْلُكَ" };
					header2.setTypeface(face);
					header2.setText(t[0]);
					counter2 = 0;
					keterangan2
							.setText("Ya Allah, sesungguhnya aku di waktu pagi ini mempersaksikan Engkau, malaikat yang memikul ‘Arys-Mu, malaikat-malaikat dan seluruh makhluk-Mu, bahwa sesungguhnya Engkau adalah Allah, tiada ilah yang berhak disembah kecuali Engkau semata, tiada sekutu bagi-Mu dan sesungguhnya Muhammad adalah hamba dan utusan-Mu.");
					counter2++;
					start2.setText("" + counter2);
					vibe.vibrate(400);
				} else if (a2 == 18) {
					String[] t = { "اَللَّهُمَّ مَا أَصْبَحَ بِيْ مِنْ نِعْمَةٍ أَوْ بِأَحَدٍ مِنْ خَلْقِكَ فَمِنْكَ وَحْدَكَ لاَ شَرِيْكَ لَكَ، فَلَكَ الْحَمْدُ وَلَكَ الشُّكْرُ" };
					header2.setTypeface(face);
					header2.setText(t[0]);
					counter2 = 0;
					keterangan2
							.setText("Ya Allah, nikmat yang kuterima atau diterima oleh seseorang di antara makhluk-Mu di pagi ini adalah dari-Mu. Maha Esa Engkau, tiada sekutu bagi-Mu. Bagi-Mu segala puji dan kepada-Mu panjatan syukur (dari seluruh makhluk-Mu).");
					counter2++;
					start2.setText("" + counter2);
					vibe.vibrate(400);
				} else if (a2 == 19) {
					String[] t = { "اَللَّهُمَّ عَافِنِيْ فِيْ بَدَنِيْ، اَللَّهُمَّ عَافِنِيْ فِيْ سَمْعِيْ، اَللَّهُمَّ عَافِنِيْ فِيْ بَصَرِيْ، لاَ إِلَـهَ إِلاَّ أَنْتَ. اَللَّهُمَّ إِنِّي أَعُوْذُ بِكَ مِنَ الْكُفْرِ وَالْفَقْرِ، وَأَعُوْذُ بِكَ مِنْ عَذَابِ الْقَبْرِ، لاَ إِلَـهَ إِلاَّ أَنْتَ" };
					header2.setTypeface(face);
					header2.setText(t[0]);
					counter2 = 0;
					keterangan2
							.setText("Ya Allah, selamatkan tubuhku (dari penyakit dan yang tidak aku inginkan). Ya Allah, selamatkan pendengaranku (dari penyakit dan maksiat atau sesuatu yang tidak aku inginkan). Ya Allah, selamatkan penglihatanku, tiada Tuhan (yang berhak disembah) kecuali Engkau. Ya Allah, sesungguhnya aku berlindung kepada-Mu dari kekufuran dan kefakiran. Aku berlindung kepada-Mu dari siksa kubur, tiada ilah (yang berhak disembah) kecuali Engkau.");
					counter2++;
					start2.setText("" + counter2);
					vibe.vibrate(400);
				} else if (a2 == 21) {
					String[] t = { "حَسْبِيَ اللهُ لاَ إِلَـهَ إِلاَّ هُوَ عَلَيْهِ تَوَكَّلْتُ وَهُوَ رَبُّ الْعَرْشِ الْعَظِيْمِ" };
					header2.setTypeface(face);
					header2.setText(t[0]);
					counter2 = 0;
					keterangan2
							.setText("Allah-lah yang mencukupi (segala kebutuhanku), tiada ilah (yang berhak disembah) kecuali Dia, kepadaNya aku bertawakal. Dia-lah Rabb yang menguasai ‘Arsy yang agung.");
					counter2++;
					start2.setText("" + counter2);
					vibe.vibrate(400);
				} else if (a2 == 28) {
					String[] t = { "اَللَّهُمَّ إِنِّيْ أَسْأَلُكَ الْعَفْوَ وَالْعَافِيَةَ فِي الدُّنْيَا وَاْلآخِرَةِ، اَللَّهُمَّ إِنِّيْ أَسْأَلُكَ الْعَفْوَ وَالْعَافِيَةَ فِي دِيْنِيْ وَدُنْيَايَ وَأَهْلِيْ وَمَالِيْ اللَّهُمَّ اسْتُرْ عَوْرَاتِى وَآمِنْ رَوْعَاتِى. اَللَّهُمَّ احْفَظْنِيْ مِنْ بَيْنِ يَدَيَّ، وَمِنْ خَلْفِيْ، وَعَنْ يَمِيْنِيْ وَعَنْ شِمَالِيْ، وَمِنْ فَوْقِيْ، وَأَعُوْذُ بِعَظَمَتِكَ أَنْ أُغْتَالَ مِنْ تَحْتِيْاَللَّهُمَّ إِنِّيْ أَسْأَلُكَ الْعَفْوَ وَالْعَافِيَةَ فِي الدُّنْيَا وَاْلآخِرَةِ، اَللَّهُمَّ إِنِّيْ أَسْأَلُكَ الْعَفْوَ وَالْعَافِيَةَ فِي دِيْنِيْ وَدُنْيَايَ وَأَهْلِيْ وَمَالِيْ اللَّهُمَّ اسْتُرْ عَوْرَاتِى وَآمِنْ رَوْعَاتِى. اَللَّهُمَّ احْفَظْنِيْ مِنْ بَيْنِ يَدَيَّ، وَمِنْ خَلْفِيْ، وَعَنْ يَمِيْنِيْ وَعَنْ شِمَالِيْ، وَمِنْ فَوْقِيْ، وَأَعُوْذُ بِعَظَمَتِكَ أَنْ أُغْتَالَ مِنْ تَحْتِيْ" };
					header2.setTypeface(face);
					header2.setText(t[0]);
					counter2 = 0;
					keterangan2
							.setText("Ya Allah, sesungguhnya aku memohon kebajikan dan keselamatan di dunia dan akhirat. Ya Allah, sesungguhnya aku memohon kebajikan dan keselamatan dalam agama, dunia, keluarga dan hartaku. Ya Allah, tutupilah auratku (aib dan sesuatu yang tidak layak dilihat orang) dan tenteramkanlah aku dari rasa takut. Ya Allah, peliharalah aku dari muka, belakang, kanan, kiri dan atasku. Aku berlindung dengan kebesaran-Mu, agar aku tidak disambar dari bawahku (oleh ular atau bumi pecah yang membuat aku jatuh dan lain-lain).");
					counter2++;
					start2.setText("" + counter2);
					vibe.vibrate(400);
				} else if (a2 == 29) {
					String[] t = { "اَللَّهُمَّ عَالِمَ الْغَيْبِ وَالشَّهَادَةِ فَاطِرَ السَّمَاوَاتِ وَاْلأَرْضِ، رَبَّ كُلِّ شَيْءٍ وَمَلِيْكَهُ، أَشْهَدُ أَنْ لاَ إِلَـهَ إِلاَّ أَنْتَ، أَعُوْذُ بِكَ مِنْ شَرِّ نَفْسِيْ، وَمِنْ شَرِّ الشَّيْطَانِ وَشِرْكِهِ، وَأَنْ أَقْتَرِفَ عَلَى نَفْسِيْ سُوْءًا أَوْ أَجُرُّهُ إِلَى مُسْلِمٍ" };
					header2.setTypeface(face);
					header2.setText(t[0]);
					counter2 = 0;
					keterangan2
							.setText("Ya Allah, Yang Maha Mengetahui yang ghaib dan yang nyata, wahai Rabb pencipta langit dan bumi, Rabb segala sesuatu dan yang merajainya. Aku bersaksi bahwa tidak ada ilah yang berhak disembah kecuali Engkau. Aku berlindung kepadaMu dari kejahatan diriku, setan dan balatentaranya, dan aku (berlindung kepada-Mu) dari berbuat kejelekan terhadap diriku atau menyeretnya kepada seorang muslim.");
					counter2++;
					start2.setText("" + counter2);
					vibe.vibrate(400);
				} else if (a2 == 30) {
					String[] t = { "بِسْمِ اللهِ لاَ يَضُرُّ مَعَ اسْمِهِ شَيْءٌ فِي اْلأَرْضِ وَلاَ فِي السَّمَاءِ وَهُوَ السَّمِيْعُ الْعَلِيْمُ" };
					header2.setTypeface(face);
					header2.setText(t[0]);
					counter2 = 0;
					keterangan2
							.setText("Dengan nama Allah yang bila disebut, segala sesuatu di bumi dan langit tidak akan berbahaya, Dia-lah Yang Maha Mendengar lagi Maha Mengetahui.");
					counter2++;
					start2.setText("" + counter2);
					vibe.vibrate(400);
				} else if (a2 == 33) {
					String[] t = { "رَضِيْتُ بِاللهِ رَبًّا، وَبِاْلإِسْلاَمِ دِيْنًا، وَبِمُحَمَّدٍ صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ نَبِيًّا" };
					header2.setTypeface(face);
					header2.setText(t[0]);
					counter2 = 0;
					keterangan2
							.setText("Aku ridho Allah sebagai Rabb, Islam sebagai agama dan Muhammad shallallahu ‘alaihi wa sallam sebagai nabi (yang diutus oleh Allah).");
					counter2++;
					start2.setText("" + counter2);
					vibe.vibrate(400);
				} else if (a2 == 36) {
					String[] t = { "يَا حَيُّ يَا قَيُّوْمُ بِرَحْمَتِكَ أَسْتَغِيْثُ، أَصْلِحْ لِيْ شَأْنِيْ كُلَّهُ وَلاَ تَكِلْنِيْ إِلَى نَفْسِيْ طَرْفَةَ عَيْنٍ" };
					header2.setTypeface(face);
					header2.setText(t[0]);
					counter2 = 0;
					keterangan2
							.setText("Wahai Rabb Yang Maha Hidup, wahai Rabb Yang Berdiri Sendiri (tidak butuh segala sesuatu), dengan rahmat-Mu aku minta pertolongan, perbaikilah segala urusanku dan jangan diserahkan kepadaku sekali pun sekejap mata (tanpa mendapat pertolongan dari-Mu).");
					counter2++;
					start2.setText("" + counter2);
					vibe.vibrate(400);
				} else if (a2 == 37) {
					String[] t = { "أَصْبَحْنَا وَأَصْبَحَ الْمُلْكُ لِلَّهِ رَبِّ الْعَالَمِيْنَ، اَللَّهُمَّ إِنِّيْ أَسْأَلُكَ خَيْرَ هَذَا الْيَوْمِ: فَتْحَهُ، وَنَصْرَهُ وَنُوْرَهُ، وَبَرَكَتَهُ، وَهُدَاهُ، وَأَعُوْذُ بِكَ مِنْ شَرِّ مَا فِيْهِ وَشَرِّ مَا بَعْدَهُ" };
					header2.setTypeface(face);
					header2.setText(t[0]);
					counter2 = 0;
					keterangan2
							.setText("Kami memasuki waktu pagi, sedang kerajaan hanya milik Allah, Rabb seluruh alam. Ya Allah, sesungguhnya aku memohon kepadaMu agar memperoleh kebaikan, pembuka (rahmat), pertolongan (atas musuh), cahaya (di atas ilmu dan amal), berkah (rizki yang halal) dan petunjuk (untuk mengikuti kebenaran dan menyelisihi hawa nafsu) di hari ini. Aku berlindung kepada-Mu dari kejelekan apa yang ada di dalamnya dan kejahatan sesudahnya.");
					counter2++;
					start2.setText("" + counter2);
					vibe.vibrate(400);
				} else if (a2 == 38) {
					String[] t = { "أَصْبَحْنَا عَلَى فِطْرَةِ اْلإِسْلاَمِ وَعَلَى كَلِمَةِ اْلإِخْلاَصِ، وَعَلَى دِيْنِ نَبِيِّنَا مُحَمَّدٍ صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ، وَعَلَى مِلَّةِ أَبِيْنَا إِبْرَاهِيْمَ، حَنِيْفًا مُسْلِمًا وَمَا كَانَ مِنَ الْمُشْرِكِيْنَ" };
					header2.setTypeface(face);
					header2.setText(t[0]);
					counter2 = 0;
					keterangan2
							.setText("Di waktu pagi kami memegang agama Islam, kalimat ikhlas, agama Nabi kita Muhammad shallallahu ‘alaihi wa sallam, dan agama ayah kami Ibrahim, yang berdiri di atas jalan yang lurus, muslim dan tidak tergolong orang-orang musyrik.");
					counter2++;
					start2.setText("" + counter2);
					vibe.vibrate(400);
				} else if (a2 == 39) {
					String[] t = { "سُبْحَانَ اللهِ وَبِحَمْدِهِ" };
					header2.setTypeface(face);
					header2.setText(t[0]);
					counter2 = 0;
					keterangan2.setText("Maha suci Allah, aku memujiNya.");
					counter2++;
					start2.setText("" + counter2);
					vibe.vibrate(400);
				} else if (a2 == 139) {
					String[] t = { "لاَ إِلَـهَ إِلاَّ اللهُ وَحْدَهُ لاَ شَرِيْكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيْرُ" };
					header2.setTypeface(face);
					header2.setText(t[0]);
					counter2 = 0;
					keterangan2
							.setText("Tidak ada ilah yang berhak disembah selain Allah semata, tidak ada sekutu bagiNya. BagiNya kerajaan dan segala pujian. Dia-lah yang berkuasa atas segala sesuatu.");
					counter2++;
					start2.setText("" + counter2);
					vibe.vibrate(400);
				} else if (a2 == 149) {
					String[] t = { "سُبْحَانَ اللهِ وَبِحَمْدِهِ: عَدَدَ خَلْقِهِ، وَرِضَا نَفْسِهِ، وَزِنَةَ عَرْشِهِ وَمِدَادَ كَلِمَاتِهِ" };
					header2.setTypeface(face);
					header2.setText(t[0]);
					counter2 = 0;
					keterangan2
							.setText("Maha Suci Allah, aku memujiNya sebanyak makhlukNya, sejauh kerelaanNya, seberat timbangan ‘Arsy-Nya dan sebanyak tinta tulisan kalimatNya");
					counter2++;
					start2.setText("" + counter2);
					vibe.vibrate(400);
				} else if (a2 == 152) {
					String[] t = { "اَللَّهُمَّ إِنِّيْ أَسْأَلُكَ عِلْمًا نَافِعًا، وَرِزْقًا طَيِّبًا، وَعَمَلاً مُتَقَبَّلاً" };
					header2.setTypeface(face);
					header2.setText(t[0]);
					counter2 = 0;
					keterangan2
							.setText("Ya Allah, sungguh aku memohon kepada-Mu ilmu yang bermanfaat (bagi diriku dan orang lain, pen), rizki yang halal dan amal yang diterima (di sisi-Mu dan mendapatkan ganjaran yang baik).");
					counter2++;
					start2.setText("" + counter2);
					vibe.vibrate(400);
				} else if (a2 == 153) {
					String[] t = { "أَسْتَغْفِرُ اللهَ وَأَتُوْبُ إِلَيْهِ" };
					header2.setTypeface(face);
					header2.setText(t[0]);
					counter2 = 0;
					keterangan2
							.setText("Aku memohon ampun kepada Allah dan bertobat kepada-Nya.");
					counter2++;
					start2.setText("" + counter2);
					vibe.vibrate(400);
				} else if (a2 == 253) {
					String[] t = { "اَللَّهُمَّ صَلِّ وَسَلِّمْ عَلَى نَبِيِّنَا مُحَمَّدٍ" };
					header2.setTypeface(face);
					header2.setText(t[0]);
					counter2 = 0;
					keterangan2
							.setText("Ya Allah, limpahkanlah shalawat dan salam kepada Nabi kami Muhammad.");
					counter2++;
					start2.setText("" + counter2);
					vibe.vibrate(400);
				} else if (a2 == 263) {
					vibe.vibrate(600);
					start2.setEnabled(false);
					start2.setText("Selesai");
				}
			}
		});
	}

}
