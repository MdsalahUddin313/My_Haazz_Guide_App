package com.example.myhaazzguideapp.Dua;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.myhaazzguideapp.R;

public class Dua_details extends AppCompatActivity {
    TextView Arabic_title, ucharon, description;
    String[] str1 = {"আল্লাহুম্মা বিসমিকা আমুতু ওয়া-আহইয়া",
            "আলহামদুলিল্লাহিল লাজি আহইয়ানা বা’দা মা আমাতানা ওয়া ইলাইহিন নুশুর",
            " বিসমিল্লাহি আল্লাহুম্মা ইন্নি আউযুবিকা মিনাল খুবসী ওয়াল খাবায়িস।",
            "ঘুফরানক, আলহামদু লিল্লাহ-ইল লাজি-আযা হাবা আনিল-আজা ওয়া'আফানী",
            "আলহামদুলিল্লাহি আলা দ্বীন-ই ইসলাম, আলইসলামু-হাক্কু, ওল কুফরে বাতীলুন, ওল ইসলামু নূরুন, ওল কুফরে জুল্বমাত",
            "আশহাদ আল-লা-ইলাহা ইল্লাল্লাহু ওয়াহ্দাহু লা-শরীকালাহু ওয়া আশহাদু আন্না মুহাম্মাদান ’আবদুহু ওয়া রাসূলুহু",
            "আল্ল-হুম্মাহ তাহলী আবওয়া-বা রহমাতিকা",
            "আল্লা-হুম্মা ইন্নী আস্’আলুকা মিন ফায্ লিকা",
            "আল্লাহুম্মা বা-রিক্ লানা- ফী-হি ওয়া আত্বইমনা খাইরাম্ মিনহু",
            "বিসমিল্লাহি ফি আওয়ালিহি ওয়া আখিরিহি।",
            "আলহামদু লিল্লাহিল্লাজি আত্বআমানা ওয়া সাক্বানা ওয়া ঝাআলানা মিনাল মুসলিমিন। (আবু দাউদ, মিশকাত)",
            "আল্লাহুম্মা বারিক লানা ফিহি ওয়া-আঠ-ইমনা খায়রান মিন্",
            " বিসমিল্লাহি তাওয়াক’কালতু আলাল্লাহি ওয়ালা হাওলা ওয়ালা কু’ওয়াতা ইল্লা বিল্লাহ",
            " বিসমিল্লাহি ওয়ালাজনা, ওয়াবিস্িল্লাহি খারাজনা, ওয়া ‘আলাল্লাহি রাব্বিনা তাওয়াক্কালনা",
            "সুভা-নল-লাজি সখ-খা রালানা হাজা ওমা কুনা লাহু মুখরি-নী-না ওয়া-ইন্না ইলা রাব্বিনা লামুন-কালিবুন","ইয়াহেদেকুমুল-লাহু ওয়েসুসলিহু বলাকুম",
"আলহামদু লিল্লাহ","Yaarha-Muk-আল্লাহ",
           "ﺍﻟﻠَّﻬُﻢَّ ﺭَﺏَّ ﻫَﺬِﻩِ ﺍﻟﺪَّﻋْﻮَﺓِ ﺍﻟﺘَّﺎﻣَّﺔِ، ﻭَﺍﻟﺼَّﻼَﺓِ ﺍﻟْﻘَﺎﺋِﻤَﺔِ، ﺁﺕِ ﻣُﺤَﻤَّﺪﺍً ﺍﻟْﻮَﺳِﻴﻠَﺔَ ﻭَﺍﻟْﻔَﻀِﻴﻠَﺔَ، ﻭَﺍﺑْﻌَﺜْﻪُ ﻣَﻘَﺎﻣَﺎً ﻣَﺤﻤُﻮﺩﺍً ﺍﻟَّﺬِﻱ ﻭَﻋَﺪْﺗَﻪُ، ﺇِﻧَّﻚَ ﻟَﺎ ﺗُﺨْﻠِﻒُ ﺍﻟْﻤِﻴﻌَﺎﺩَ ",

    };
    String[] str2 = {"Allah humma bis-mika aamu'tu wa aah'ya",
            "Alhamdu lillahil-lathee ahyana ba'da ma amatana wa-ilayhin-nushoor",
            "Bismil-lah – allahumma innee aa'oozuu bika minal-khubthi wal-khaba-ith",
            "Ghufranak, alhamdu lillah-hil lazee-aaz haba annil-aaza wa'aafani",
            "Ālahāmdulillāhi ālā ddīn-i islām, āl islāmu-hākku, ōl kupharē bātīlun, ōl  islāmu nūrun, ōl kupharē julamāta",
            "Ashhadu al la ilaha illal-lahu wahdahu la shareeka lah, wa-ashhadu anna Muhammadan aab-duhu warasooluh",
            "Bismil-lah, wassalatu wassalamu ala rasoolil-lah, allahummaf tah-lee aab-wa ba rahmatik",
            "Bismil-lah – wassalatu wassalamu ala rasoolil-lah, allahumma innee as-aluka min fadlik",
            "Allahumma ba-riklana-fi-hi wa atbaimana khairam minhu",
            " Bismil-lahi fee awwalihi wa-akhirih",
            "Alhamdu lillah hil lazi aat'aa mana wasakana wa-ja-aa lana Muslimin",
            "Allahumma barik lana feehi wa-aath-imna khayran minh",
            "Bismil-lah, tawakkaltu alal-lah, wala hawla wala quwwata illa billah",
            "Bismil-lahi walajna, wabismil-lahi kharajna, wa'ala rabbina tawakkalna",
            "Subha-nal-lazi sakh-kha ralana haza wama kunna lahu mukhri-nee-na wa-inna ila rabbina lamun-qaliboon",
"Alhamdu lillah","Yaarha-muk-Allah","Yahdeekumul-lahu wayuslihu balakum","Yahdeekumul-lahu wayuslihu balakum"," আল্লা-হুম্মা রববা হা-যিহিদ্ দা‘ওয়াতিত্ তা-ম্মাতি ওয়াস সালা-তিল ক্বা-’ইমাতি আ-তি মুহাম্মাদানিল ওয়াসীলাতা ওয়াল ফাদীলাতা ওয়াব্‘আছহু মাক্বা-মাম\n" +
            "মাহমূদানিল্লাযী ওয়া‘আদতাহ, ইন্নাকা লা তুখলিফুল মী‘আদ।",
    };
    String[] str3 = {"অর্থ : হে আল্লাহ! আমি তোমারই নামে মৃত্যুবরণ করি, আবার তোমারই নামে জীবন ধারন করি।",
            "সমস্ত প্রশংসা আল্লাহর, যিনি আমাদের হত্যা করার পরে আমাদের জীবন দান করেছেন (নিদ্রা একটি মৃত্যুর রূপ) এবং তাঁরই কাছে আমরা পুনরুত্থিত হয়ে ফিরে যাব",
            "আল্লাহর নামে, হে আল্লাহ। আমি পুরুষ স্ত্রী দুষ্ট ও জিনদের কাছ থেকে তোমার কাছে আশ্রয় প্রার্থনা করি",
            "হে আল্লাহ, আমি তোমার কাছে ক্ষমা ও ক্ষমা প্রার্থনা করি, সমস্ত প্রশংসা আল্লাহর, যিনি আমার কাছ থেকে অসুবিধা দূর করেছেন এবং আমাকে স্বাচ্ছন্দ্য দিয়েছেন।",
            "আমি শুরু করি আল্লাহর নামে যিনি পরম করুণাময়, পরম করুণাময়",
            "আমি সাক্ষ্য দিচ্ছি যে, আল্লাহ্ ব্যতীত কোনো ইলাহ্ নেই। তিনি এক, তাঁর কোনো অংশীদার নেই। আমি আরো সাক্ষ্য দিচ্ছি যে, হযরত মুহাম্মদ সল্লাল্লাহু আলাইহি ওয়াসাল্লাম আল্লাহর বান্দা ও রাসূল। হে আল্লাহ! আমাকে তাওবাকারী ও পবিত্রতা অর্জনকারী লোকদের মধ্যে শামিল করুন। (সহীহ মুসলিম ও জামে আত-তিরমিযী)",
            "হে আল্ল-হ! তুমি আমার জন্য তোমার রহমতেরদরজাসমূহ খুলে দাও।",
            "হে আল্ল-হ ! অবশ্যই আমি তোমার অনুগ্রহ আশা করছি।",
            "আল্লাহর নামে",
            "শুরুতে ও শেষে আল্লাহর নামে",
            "সকল প্রশংসা আল্লাহর জন্য যিনি খাওয়ালেন এবং পান করালেন এবং মুসলমান হিসেবে অন্তর্ভূক্ত করলেন।",
            "হে আল্লাহ, আপনি আমাদের এতে বরকত দান করুন এবং এর চেয়ে উত্তম দান করুন",
            "রাসূল বলেছেন যে ব্যাক্তি এই দোয়া পড়ে ঘর থেকে বেরোবে সকল বিপদ থেকে সে নিরাপদে থাকবে ও ইবলিশ শয়তান তার কোনো ক্ষতি করতে পারবে না। (তিরমিজী শরীফ, খন্ড-২ পৃষ্ঠা-১৮০)",
            "আল্লাহ্র নামে আমরা প্রবেশ করলাম, আল্লাহ্র নামেই আমরা বের হলাম এবং আমাদের রব আল্লাহ্র উপরই আমরা ভরসা করলাম",
            "আল্লাহ পবিত্র, তিনি নিয়ন্ত্রণ দান করেছেন এবং তাঁর ক্ষমতা ব্যতীত আমাদের কোন নিয়ন্ত্রণ থাকবে না নিঃসন্দেহে আমরা তাঁর কাছে ফিরে যাব",
"সমস্ত প্রশংসা আল্লাহর জন্য","আল্লাহ আপনার প্রতি দয়া করুন","May Allah guide you and rectify your condition",


            " “হে আল্লাহ! এই পরিপূর্ণ আহ্বান এবং প্রতিষ্ঠিত সালাতের রব্ব! মুহাম্মাদ (সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম) কে ওসীলা তথা জান্নাতের একটি স্তর এবং ফযীলত তথা সকল সৃষ্টির উপর অতিরিক্ত মর্যাদা দান করুন। আর তাঁকে মাকামে মাহমূদে (প্রশংসিত\n" +
                    "স্থানে) পৌঁছে দিন, যার প্রতিশ্রুতি আপনি তাঁকে দিয়েছেন। নিশ্চয় আপনি প্রতিশ্রুতি ভঙ্গ করেন না।”\n" +
                    "\n" +
                    "[বুখারী ১/২৫২,নং ৬১৪",

    };
    String[] str4 = {
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dua_details);

        Arabic_title = findViewById(R.id.title_id);
        ucharon = findViewById(R.id.uccaron_id);
        description = findViewById(R.id.description_id);

        Intent i = getIntent();
        String s = i.getStringExtra("pos");//t1.setText(s);
        int position = Integer.parseInt(s);

        if (position == 0) {
            Arabic_title.setText(str1[0]);
            ucharon.setText(str2[0]);
            description.setText(str3[0]);
        } else if (position == 1) {
            Arabic_title.setText(str1[1]);
            ucharon.setText(str2[1]);
            description.setText(str3[1]);
        } else if (position == 2) {
            Arabic_title.setText(str1[2]);
            ucharon.setText(str2[2]);
            description.setText(str3[2]);
        } else if (position == 3) {
            Arabic_title.setText(str1[3]);
            ucharon.setText(str2[3]);
            description.setText(str3[3]);
        } else if (position == 4) {
            Arabic_title.setText(str1[4]);
            ucharon.setText(str2[4]);
            description.setText(str3[4]);
        } else if (position == 5) {
            Arabic_title.setText(str1[5]);
            ucharon.setText(str2[5]);
            description.setText(str3[5]);
        }
        if (position == 6) {
            Arabic_title.setText(str1[6]);
            ucharon.setText(str2[6]);
            description.setText(str3[6]);
        } else if (position == 7) {
            Arabic_title.setText(str1[7]);
            ucharon.setText(str2[7]);
            description.setText(str3[7]);
        } else if (position == 8) {
            Arabic_title.setText(str1[8]);
            ucharon.setText(str2[8]);
            description.setText(str3[8]);
        } else if (position == 9) {
            Arabic_title.setText(str1[9]);
            ucharon.setText(str2[9]);
            description.setText(str3[9]);
        } else if (position == 10) {
            Arabic_title.setText(str1[10]);
            ucharon.setText(str2[10]);
            description.setText(str3[10]);
        } else if (position == 11) {
            Arabic_title.setText(str1[11]);
            ucharon.setText(str2[11]);
            description.setText(str3[11]);
        }
        if (position == 12) {
            Arabic_title.setText(str1[12]);
            ucharon.setText(str2[12]);
            description.setText(str3[12]);
        } else if (position == 13) {
            Arabic_title.setText(str1[13]);
            ucharon.setText(str2[13]);
            description.setText(str3[13]);
        } else if (position == 14) {
            Arabic_title.setText(str1[14]);
            ucharon.setText(str2[14]);
            description.setText(str3[14]);
        } else if (position == 15) {
            Arabic_title.setText(str1[15]);
            ucharon.setText(str2[15]);
            description.setText(str3[15]);
        } else if (position == 16) {
            Arabic_title.setText(str1[16]);
            ucharon.setText(str2[16]);
            description.setText(str3[16]);
        } else if (position == 17) {
            Arabic_title.setText(str1[17]);
            ucharon.setText(str2[17]);
            description.setText(str3[17]);
        } else if (position == 18) {
            Arabic_title.setText(str1[18]);
            ucharon.setText(str2[18]);
            description.setText(str3[18]);
        }
        else if (position == 19) {
            Arabic_title.setText(str1[19]);
            ucharon.setText(str2[19]);
            description.setText(str3[19]);
        }


    }
}

