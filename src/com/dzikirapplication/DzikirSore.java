package com.dzikirapplication;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DzikirSore extends Activity {
	int counter3, a3;
	Button start3;
	TextView header3, keterangan3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dzikir_sore);

		start3 = (Button) findViewById(R.id.start3);
		header3 = (TextView) findViewById(R.id.header3);
		keterangan3 = (TextView) findViewById(R.id.keterangan3);

		start3.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Vibrator vibe = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
				Typeface face = Typeface.createFromAsset(getAssets(),
						"font/me_quran.ttf");
				a3++;
				counter3++;
				start3.setText("" + counter3);
				vibe.vibrate(50);
				vibe.vibrate(50);
				if (a3 == 1) {
					String[] t = { "أَعُوذُ بِاللَّهِ مِنَ الشَّيْطَانِ الرَّجِيمِ" };
					header3.setTypeface(face);
					header3.setText(t[0]);
					counter3 = 0;
					keterangan3
							.setText("Aku berlindung kepada Allah dari godaan syaitan yang terkutuk.");
					counter3++;
					start3.setText("" + counter3);
				} else if (a3 == 2) {
					String[] t = { "اللَّهُ لاَ إِلَهَ إِلاَّ هُوَ الْحَيُّ الْقَيُّومُ، لاَ تَأْخُذُهُ سِنَةٌ وَلاَ نَوْمٌ، لَهُ مَا فِي السَّمَاوَاتِ وَمَا فِي الْأَرْضِ، مَنْ ذَا الَّذِي يَشْفَعُ عِنْدَهُ إِلاَّ بِإِذْنِهِ، يَعْلَمُ مَا بَيْنَ أَيْدِيهِمْ وَمَا خَلْفَهُمْ، وَلَا يُحِيطُونَ بِشَيْءٍ مِنْ عِلْمِهِ إِلاَّ بِمَا شَاءَ، وَسِعَ كُرْسِيُّهُ السَّمَاوَاتِ وَالْأَرْضَ، وَلَا يَئُودُهُ حِفْظُهُمَا، وَهُوَ الْعَلِيُّ الْعَظِيمُ" };
					header3.setTypeface(face);
					header3.setText(t[0]);
					counter3 = 0;
					keterangan3
							.setText("Allah, tidak ada Tuhan (yang berhak disembah) melainkan Dia, yang hidup kekal lagi terus menerus mengurus (makhluk-Nya). Dia tidak mengantuk dan tidak tidur. Kepunyaan-Nya apa yang di langit dan di bumi. Tiada yang dapat memberi syafa’at di sisi-Nya tanpa seizin-Nya. Dia mengetahui apa-apa yang di hadapan mereka dan di belakang mereka. Mereka tidak mengetahui apa-apa dari ilmu Allah melainkan apa yang dikehendaki-Nya. Kursi Allah meliputi langit dan bumi. Dia tidak merasa berat memelihara keduanya. Dan Dia Maha Tinggi lagi Maha besar. (QS. Al Baqarah: 255)");
					counter3++;
					start3.setText("" + counter3);
					vibe.vibrate(400);
				} else if (a3 == 3) {
					String[] t = { "بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ. قُلْ هُوَ اللَّهُ أَحَدٌ. اللَّهُ الصَّمَدُ. لَمْ يَلِدْ وَلَمْ يُولَدْ. وَلَمْ يَكُن لَّهُ كُفُوًا أَحَدٌ" };
					header3.setTypeface(face);
					header3.setText(t[0]);
					counter3 = 0;
					keterangan3
							.setText("Dengan menyebut nama Allah Yang Maha Pengasih lagi Maha Penyayang. Katakanlah: Dialah Allah, Yang Maha Esa. Allah adalah Ilah yang bergantung kepada- Nya segala urusan. Dia tidak beranak dan tiada pula diperanakkan, dan tidak ada seorang pun yang setara dengan Dia.” (QS. Al Ikhlas: 1-4)");
					counter3++;
					start3.setText("" + counter3);
					vibe.vibrate(400);
				} else if (a3 == 6) {
					String[] t = { "بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ. قُلْ أَعُوذُ بِرَبِّ الْفَلَقِ.  مِن شَرِّ مَا خَلَقَ.  وَمِن شَرِّ غَاسِقٍ إِذَا وَقَبَ.  وَمِن شَرِّ النَّفَّاثَاتِ فِي الْعُقَدِ.   وَمِن شَرِّ حَاسِدٍ إِذَا حَسَدَ" };
					header3.setTypeface(face);
					header3.setText(t[0]);
					counter3 = 0;
					keterangan3
							.setText("Dengan menyebut nama Allah Yang Maha Pengasih lagi Maha Penyayang. Katakanlah: Aku berlindung kepada Rabb yang menguasai Subuh, dari kejahatan makhluk-Nya, dan dari kejahatan malam apabila telah gelap gulita, dan dari kejahatan-kejahatan wanita tukang sihir yang menghembus pada buhul-buhul, dan dari kejahatan orang yang dengki apabila ia dengki. (QS. Al Falaq: 1-5)");
					counter3++;
					start3.setText("" + counter3);
					vibe.vibrate(400);
				} else if (a3 == 9) {
					String[] t = { "بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ. قُلْ أَعُوذُ بِرَبِّ النَّاسِ.  مَلِكِ النَّاسِ.  إِلَهِ النَّاسِ.  مِن شَرِّ الْوَسْوَاسِ الْخَنَّاسِ.  الَّذِي يُوَسْوِسُ فِي صُدُورِ النَّاسِ.  مِنَ الْجِنَّةِ وَ النَّاسِ" };
					header3.setTypeface(face);
					header3.setText(t[0]);
					counter3 = 0;
					keterangan3
							.setText("Dengan menyebut nama Allah Yang Maha Pengasih lagi Maha Penyayang. Katakanlah: Aku berlindung kepada Rabb manusia. Raja manusia. Sembahan manusia, dari kejahatan (bisikan) syaitan yang biasa bersembunyi, yang membisikkan (kejahatan) ke dalam dada manusia, dari jin dan manusia. (QS. An Naas: 1-6)");
					counter3++;
					start3.setText("" + counter3);
					vibe.vibrate(400);
				} else if (a3 == 12) {
					String[] t = {"أَمْسَيْنَا وَأَمْسَى الْمُلْكُ للهِ، وَالْحَمْدُ للهِ، لَا إِلَهَ إِلاَّ اللهُ وَحْدَهُ لاَ شَرِيكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ، وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيرٌ، رَبِّ أَسْأَلُكَ خَيْرَ مَا فِي هَذِهِ اللَّيْلَةِ وَخَيْرَ مَا بَعْدَهَا، وَأَعُوذُبِكَ مِنْ شَرِّ مَا فِي هَذِهِ اللَّيْلَةِ وَشَرِّ مَا بَعْدَهَا، رَبِّ أَعُوذُبِكَ مِنَ الْكَسَلِ وَسُوءِ الْكِبَرِ، رَبِّ أَعُوذُبِكَ مِنْ عَذَابٍ فِي النَّارِ وَعَذَابٍ فِي الْقَبْرِ"};
					header3.setTypeface(face);
					header3.setText(t[0]);
					counter3 = 0;
					keterangan3
							.setText("Kami telah memasuki waktu sore dan kerajaan hanya milik Allah, segala puji bagi Allah. Tidak ada ilah (yang berhak disembah) kecuali Allah semata, tiada sekutu bagi-Nya. Milik Allah kerajaan dan bagi-Nya pujian. Dia-lah Yang Mahakuasa atas segala sesuatu.Ya Rabbku, aku mohon kepada-Mu kebaikan di malam ini dan kebaikan sesudahnya. Aku berlindung kepadaMu dari kejahatan malam ini dan kejahatan sesudahnya. Ya Rabbku, aku berlindung kepadaMu dari kemalasan dan kejelekan di hari tua. Wahai Rabbku, aku berlindung kepada-Mu dari siksaan di Neraka dan siksaan di kubur");
					counter3++;
					start3.setText("" + counter3);
					vibe.vibrate(400);
				} else if (a3 == 13) {
					String[] t = { "اَللَّهُمَّ بِكَ أَصْبَحْنَا، وَبِكَ أَمْسَيْنَا، وَبِكَ نَحْيَا، وَبِكَ نَمُوْتُ وَإِلَيْكَ النُّشُوْرُ." };
					header3.setTypeface(face);
					header3.setText(t[0]);
					counter3 = 0;
					keterangan3
							.setText("Ya Allah, dengan rahmat dan pertolongan-Mu kami memasuki waktu pagi, dan dengan rahmat dan pertolongan-Mu kami memasuki waktu sore. Dengan rahmat dan pertolongan-Mu kami hidup dan dengan kehendak-Mu kami mati. Dan kepada-Mu kebangkitan (bagi semua makhluk).");
					counter3++;
					start3.setText("" + counter3);
					vibe.vibrate(400);
				} else if (a3 == 14) {
					String[] t = { "اَللَّهُمَّ أَنْتَ رَبِّيْ لاَ إِلَـهَ إِلاَّ أَنْتَ، خَلَقْتَنِيْ وَأَنَا عَبْدُكَ، وَأَنَا عَلَى عَهْدِكَ وَوَعْدِكَ مَا اسْتَطَعْتُ، أَعُوْذُ بِكَ مِنْ شَرِّ مَا صَنَعْتُ، أَبُوْءُ لَكَ بِنِعْمَتِكَ عَلَيَّ، وَأَبُوْءُ بِذَنْبِيْ فَاغْفِرْ لِيْ فَإِنَّهُ لاَ يَغْفِرُ الذُّنُوْبَ إِلاَّ أَنْتَ" };
					header3.setTypeface(face);
					header3.setText(t[0]);
					counter3 = 0;
					keterangan3
							.setText("Ya Allah, Engkau adalah Rabbku, tidak ada ilah yang berhak disembah kecuali Engkau, Engkaulah yang menciptakanku. Aku adalah hambaMu. Aku akan setia pada perjanjianku pada-Mu (yaitu menjalankan ketaatan dan menjauhi larangan, pen) semampuku dan aku yakin akan janji-Mu (berupa pahala). Aku berlindung kepada-Mu dari kejelekan yang kuperbuat. Aku mengakui nikmat-Mu kepadaku dan aku mengakui dosaku. Oleh karena itu, ampunilah aku. Sesungguhnya tiada yang mengampuni dosa kecuali Engkau.");
					counter3++;
					start3.setText("" + counter3);
					vibe.vibrate(400);
				} else if (a3 == 15) {
					String[] t = {"اللَّهُمَّ إِنِّي أَمْسَيْتُ أَُشْهِدُكَ، وَأُشْهِدُ حَمَلَةَ عَرْشِكَ، وَمَلَائِكَتَكَ، وَجَمِيعَ خَلْقِكَ، أَنَّكَ أَنْتَ اللهُ، لاَ إِلَهَ إِلاَّ أَنْتَ، وَأَنَّ مُحَمَّدًا عَبْدُهُ وَرَسُولُكَ" };
					header3.setTypeface(face);
					header3.setText(t[0]);
					counter3 = 0;
					keterangan3
							.setText("Ya Allah, sesungguhnya aku di waktu sore ini mempersaksikan Engkau, malaikat yang memikul ‘Arys-Mu, malaikat-malaikat dan seluruh makhluk-Mu, bahwa sesungguhnya Engkau adalah Allah, tiada ilah yang berhak disembah kecuali Engkau semata, tiada sekutu bagi-Mu dan sesungguhnya Muhammad adalah hamba dan utusan-Mu.");
					counter3++;
					start3.setText("" + counter3);
					vibe.vibrate(400);
				} else if (a3 == 18) {
					String[] t = {"اللَّهُمَّ مَا أَمْسَى بِي مِنْ نِعْمَةٍ أَوْ بِأَحَدٍ مِنْ خَلْقِكَ، فَمِنْكَ وَحْدَكَ لَا شَرِيكَ لَكَ، لَكَ الْحَمْدُ وَلَكَ اشُّكْرُ."};
					header3.setTypeface(face);
					header3.setText(t[0]);
					counter3 = 0;
					keterangan3
							.setText("Ya Allah, nikmat yang kuterima atau diterima oleh seseorang di antara makhluk-Mu di sore ini adalah dari-Mu. Maha Esa Engkau, tiada sekutu bagi-Mu. Bagi-Mu segala puji dan kepada-Mu panjatan syukur (dari seluruh makhluk-Mu).");
					counter3++;
					start3.setText("" + counter3);
					vibe.vibrate(400);
				} else if (a3 == 19) {
					String[] t = { "اَللَّهُمَّ عَافِنِيْ فِيْ بَدَنِيْ، اَللَّهُمَّ عَافِنِيْ فِيْ سَمْعِيْ، اَللَّهُمَّ عَافِنِيْ فِيْ بَصَرِيْ، لاَ إِلَـهَ إِلاَّ أَنْتَ. اَللَّهُمَّ إِنِّي أَعُوْذُ بِكَ مِنَ الْكُفْرِ وَالْفَقْرِ، وَأَعُوْذُ بِكَ مِنْ عَذَابِ الْقَبْرِ، لاَ إِلَـهَ إِلاَّ أَنْتَ" };
					header3.setTypeface(face);
					header3.setText(t[0]);
					counter3 = 0;
					keterangan3
							.setText("Ya Allah, selamatkan tubuhku (dari penyakit dan yang tidak aku inginkan). Ya Allah, selamatkan pendengaranku (dari penyakit dan maksiat atau sesuatu yang tidak aku inginkan). Ya Allah, selamatkan penglihatanku, tiada Tuhan (yang berhak disembah) kecuali Engkau. Ya Allah, sesungguhnya aku berlindung kepada-Mu dari kekufuran dan kefakiran. Aku berlindung kepada-Mu dari siksa kubur, tiada ilah (yang berhak disembah) kecuali Engkau.");
					counter3++;
					start3.setText("" + counter3);
					vibe.vibrate(400);
				} else if (a3 == 21) {
					String[] t = { "حَسْبِيَ اللهُ لاَ إِلَـهَ إِلاَّ هُوَ عَلَيْهِ تَوَكَّلْتُ وَهُوَ رَبُّ الْعَرْشِ الْعَظِيْمِ" };
					header3.setTypeface(face);
					header3.setText(t[0]);
					counter3 = 0;
					keterangan3
							.setText("Allah-lah yang mencukupi (segala kebutuhanku), tiada ilah (yang berhak disembah) kecuali Dia, kepadaNya aku bertawakal. Dia-lah Rabb yang menguasai ‘Arsy yang agung.");
					counter3++;
					start3.setText("" + counter3);
					vibe.vibrate(400);
				} else if (a3 == 28) {
					String[] t = { "اَللَّهُمَّ إِنِّيْ أَسْأَلُكَ الْعَفْوَ وَالْعَافِيَةَ فِي الدُّنْيَا وَاْلآخِرَةِ، اَللَّهُمَّ إِنِّيْ أَسْأَلُكَ الْعَفْوَ وَالْعَافِيَةَ فِي دِيْنِيْ وَدُنْيَايَ وَأَهْلِيْ وَمَالِيْ اللَّهُمَّ اسْتُرْ عَوْرَاتِى وَآمِنْ رَوْعَاتِى. اَللَّهُمَّ احْفَظْنِيْ مِنْ بَيْنِ يَدَيَّ، وَمِنْ خَلْفِيْ، وَعَنْ يَمِيْنِيْ وَعَنْ شِمَالِيْ، وَمِنْ فَوْقِيْ، وَأَعُوْذُ بِعَظَمَتِكَ أَنْ أُغْتَالَ مِنْ تَحْتِيْاَللَّهُمَّ إِنِّيْ أَسْأَلُكَ الْعَفْوَ وَالْعَافِيَةَ فِي الدُّنْيَا وَاْلآخِرَةِ، اَللَّهُمَّ إِنِّيْ أَسْأَلُكَ الْعَفْوَ وَالْعَافِيَةَ فِي دِيْنِيْ وَدُنْيَايَ وَأَهْلِيْ وَمَالِيْ اللَّهُمَّ اسْتُرْ عَوْرَاتِى وَآمِنْ رَوْعَاتِى. اَللَّهُمَّ احْفَظْنِيْ مِنْ بَيْنِ يَدَيَّ، وَمِنْ خَلْفِيْ، وَعَنْ يَمِيْنِيْ وَعَنْ شِمَالِيْ، وَمِنْ فَوْقِيْ، وَأَعُوْذُ بِعَظَمَتِكَ أَنْ أُغْتَالَ مِنْ تَحْتِيْ" };
					header3.setTypeface(face);
					header3.setText(t[0]);
					counter3 = 0;
					keterangan3
							.setText("Ya Allah, sesungguhnya aku memohon kebajikan dan keselamatan di dunia dan akhirat. Ya Allah, sesungguhnya aku memohon kebajikan dan keselamatan dalam agama, dunia, keluarga dan hartaku. Ya Allah, tutupilah auratku (aib dan sesuatu yang tidak layak dilihat orang) dan tenteramkanlah aku dari rasa takut. Ya Allah, peliharalah aku dari muka, belakang, kanan, kiri dan atasku. Aku berlindung dengan kebesaran-Mu, agar aku tidak disambar dari bawahku (oleh ular atau bumi pecah yang membuat aku jatuh dan lain-lain).");
					counter3++;
					start3.setText("" + counter3);
					vibe.vibrate(400);
				} else if (a3 == 29) {
					String[] t = { "اَللَّهُمَّ عَالِمَ الْغَيْبِ وَالشَّهَادَةِ فَاطِرَ السَّمَاوَاتِ وَاْلأَرْضِ، رَبَّ كُلِّ شَيْءٍ وَمَلِيْكَهُ، أَشْهَدُ أَنْ لاَ إِلَـهَ إِلاَّ أَنْتَ، أَعُوْذُ بِكَ مِنْ شَرِّ نَفْسِيْ، وَمِنْ شَرِّ الشَّيْطَانِ وَشِرْكِهِ، وَأَنْ أَقْتَرِفَ عَلَى نَفْسِيْ سُوْءًا أَوْ أَجُرُّهُ إِلَى مُسْلِمٍ" };
					header3.setTypeface(face);
					header3.setText(t[0]);
					counter3 = 0;
					keterangan3
							.setText("Ya Allah, Yang Maha Mengetahui yang ghaib dan yang nyata, wahai Rabb pencipta langit dan bumi, Rabb segala sesuatu dan yang merajainya. Aku bersaksi bahwa tidak ada ilah yang berhak disembah kecuali Engkau. Aku berlindung kepadaMu dari kejahatan diriku, setan dan balatentaranya, dan aku (berlindung kepada-Mu) dari berbuat kejelekan terhadap diriku atau menyeretnya kepada seorang muslim.");
					counter3++;
					start3.setText("" + counter3);
					vibe.vibrate(400);
				} else if (a3 == 30) {
					String[] t = { "بِسْمِ اللهِ لاَ يَضُرُّ مَعَ اسْمِهِ شَيْءٌ فِي اْلأَرْضِ وَلاَ فِي السَّمَاءِ وَهُوَ السَّمِيْعُ الْعَلِيْمُ" };
					header3.setTypeface(face);
					header3.setText(t[0]);
					counter3 = 0;
					keterangan3
							.setText("Dengan nama Allah yang bila disebut, segala sesuatu di bumi dan langit tidak akan berbahaya, Dia-lah Yang Maha Mendengar lagi Maha Mengetahui.");
					counter3++;
					start3.setText("" + counter3);
					vibe.vibrate(400);
				} else if (a3 == 33) {
					String[] t = { "رَضِيْتُ بِاللهِ رَبًّا، وَبِاْلإِسْلاَمِ دِيْنًا، وَبِمُحَمَّدٍ صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ نَبِيًّا" };
					header3.setTypeface(face);
					header3.setText(t[0]);
					counter3 = 0;
					keterangan3
							.setText("Aku ridho Allah sebagai Rabb, Islam sebagai agama dan Muhammad shallallahu ‘alaihi wa sallam sebagai nabi (yang diutus oleh Allah).");
					counter3++;
					start3.setText("" + counter3);
					vibe.vibrate(400);
				} else if (a3 == 36) {
					String[] t = { "يَا حَيُّ يَا قَيُّوْمُ بِرَحْمَتِكَ أَسْتَغِيْثُ، أَصْلِحْ لِيْ شَأْنِيْ كُلَّهُ وَلاَ تَكِلْنِيْ إِلَى نَفْسِيْ طَرْفَةَ عَيْنٍ" };
					header3.setTypeface(face);
					header3.setText(t[0]);
					counter3 = 0;
					keterangan3
							.setText("Wahai Rabb Yang Maha Hidup, wahai Rabb Yang Berdiri Sendiri (tidak butuh segala sesuatu), dengan rahmat-Mu aku minta pertolongan, perbaikilah segala urusanku dan jangan diserahkan kepadaku sekali pun sekejap mata (tanpa mendapat pertolongan dari-Mu).");
					counter3++;
					start3.setText("" + counter3);
					vibe.vibrate(400);
				} else if (a3 == 37) {
					String[] t = {"أَمْسَيْنَا وَأَمْسَى الْمُلْكُ للهِ رَبِّ الْعَالَمِينَ، اللَّهُمَّ إِنِّي أَسْأَلُكَ خَيْرَ هَذِهِ اللَّيْلَةِ فَتْحَهَا، وَنَصْرَهَا، وَنُورَهَا، وَبَرَكَتَهَا، وَهُدَاهَا، وَأَعُوذُبِكَ مِنْ شَرِّ مَا فِيهَا، وَشَرِّ مَا بَعْدَهَا."};
					header3.setTypeface(face);
					header3.setText(t[0]);
					counter3 = 0;
					keterangan3
							.setText("Kami memasuki waktu sore, sedang kerajaan hanya milik Allah, Rabb seluruh alam. Ya Allah, sesungguhnya aku memohon kepadaMu agar memperoleh kebaikan, pembuka (rahmat), pertolongan (atas musuh), cahaya (di atas ilmu dan amal), berkah (rizki yang halal) dan petunjuk (untuk mengikuti kebenaran dan menyelisihi hawa nafsu) di malam ini. Aku berlindung kepada-Mu dari kejelekan apa yang ada di dalamnya dan kejahatan sesudahnya.");
					counter3++;
					start3.setText("" + counter3);
					vibe.vibrate(400);
				} else if (a3 == 38) {
					String[] t = { "أَمْسَيْنَا عَلَى فِطْرَةِ اْلإِسْلاَمِ وَعَلَى كَلِمَةِ اْلإِخْلاَصِ، وَعَلَى دِيْنِ نَبِيِّنَا مُحَمَّدٍ صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ، وَعَلَى مِلَّةِ أَبِيْنَا إِبْرَاهِيْمَ، حَنِيْفًا مُسْلِمًا وَمَا كَانَ مِنَ الْمُشْرِكِيْنَ." };
					header3.setTypeface(face);
					header3.setText(t[0]);
					counter3 = 0;
					keterangan3
							.setText("Di waktu سخقث kami memegang agama Islam, kalimat ikhlas, agama Nabi kita Muhammad shallallahu ‘alaihi wa sallam, dan agama ayah kami Ibrahim, yang berdiri di atas jalan yang lurus, muslim dan tidak tergolong orang-orang musyrik.");
					counter3++;
					start3.setText("" + counter3);
					vibe.vibrate(400);
				} else if (a3 == 39) {
					String[] t = { "سُبْحَانَ اللهِ وَبِحَمْدِهِ" };
					header3.setTypeface(face);
					header3.setText(t[0]);
					counter3 = 0;
					keterangan3.setText("Maha suci Allah, aku memujiNya.");
					counter3++;
					start3.setText("" + counter3);
					vibe.vibrate(400);
				} else if (a3 == 139) {
					String[] t = { "لاَ إِلَـهَ إِلاَّ اللهُ وَحْدَهُ لاَ شَرِيْكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيْرُ" };
					header3.setTypeface(face);
					header3.setText(t[0]);
					counter3 = 0;
					keterangan3
							.setText("Tidak ada ilah yang berhak disembah selain Allah semata, tidak ada sekutu bagiNya. BagiNya kerajaan dan segala pujian. Dia-lah yang berkuasa atas segala sesuatu.");
					counter3++;
					start3.setText("" + counter3);
					vibe.vibrate(400);
				} else if (a3 == 149) {
					String[] t = { "أَعُوْذُ بِكَلِمَاتِ اللهِ التَّامَّاتِ مِنْ شَرِّ مَا خَلَقَ" };
					header3.setTypeface(face);
					header3.setText(t[0]);
					counter3 = 0;
					keterangan3
							.setText("Aku berlindung dengan kalimat-kalimat Allah yang sempurna dari kejahatan makhluk yang diciptakanNya.");
					counter3++;
					start3.setText("" + counter3);
					vibe.vibrate(400);
				}else if (a3 == 152) {
					String[] t = { "اَللَّهُمَّ صَلِّ وَسَلِّمْ عَلَى نَبِيِّنَا مُحَمَّدٍ" };
					header3.setTypeface(face);
					header3.setText(t[0]);
					counter3 = 0;
					keterangan3
							.setText("Ya Allah, limpahkanlah shalawat dan salam kepada Nabi kami Muhammad.");
					counter3++;
					start3.setText("" + counter3);
					vibe.vibrate(400);
				} else if (a3 == 162) {
					vibe.vibrate(600);
					start3.setEnabled(false);
					start3.setText("Selesai");
				}
			}
		});
	}

}
