package com.uasppm.sanggraloka;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.card.MaterialCardView;

public class HomeActivity extends AppCompatActivity {
    MaterialCardView cvFloatingMarket, cvDeRanch, cvOrchidForestCikole, cvDapoerPandanWangi, cvBurgreens, cvSapulidi, cvJalanDago, cvParisVanJava, cvTheSecret;
    TextView h1, h2, h3, tvFloatingMarket, tvDeRanch, tvOrchidForestCikole, tvDapoerPandanWangi, tvBurgreens, tvSapulidi, tvJalanDago, tvParisVanJava, tvTheSecret;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        cvFloatingMarket = findViewById(R.id.cv_floating_market);
        cvDeRanch = findViewById(R.id.cv_de_ranch);
        cvOrchidForestCikole = findViewById(R.id.cv_orchid_forest_cikole);
        cvDapoerPandanWangi = findViewById(R.id.cv_dapoer_pandan_wangi);
        cvBurgreens = findViewById(R.id.cv_burgreens);
        cvSapulidi = findViewById(R.id.cv_sapulidi);
        cvJalanDago = findViewById(R.id.cv_jalan_dago);
        cvParisVanJava = findViewById(R.id.cv_paris_van_java);
        cvTheSecret = findViewById(R.id.cv_the_secret);
        h1 = findViewById(R.id.heading1);
        h2 = findViewById(R.id.heading2);
        h3 = findViewById(R.id.heading3);
        tvFloatingMarket = findViewById(R.id.tvFloatingMarket);
        tvDeRanch = findViewById(R.id.tvDeRanch);
        tvOrchidForestCikole = findViewById(R.id.tvOrchidForest);
        tvDapoerPandanWangi = findViewById(R.id.tvDapoerPandan);
        tvBurgreens = findViewById(R.id.tvBurgreens);
        tvSapulidi = findViewById(R.id.tvSapulidi);
        tvJalanDago = findViewById(R.id.tvJalanDago);
        tvParisVanJava = findViewById(R.id.tvSapulidi);
        tvTheSecret = findViewById(R.id.tvTheSecret);


        Typeface signikaFont = Typeface.createFromAsset(getAssets(), "font/Signika-Medium.ttf");
        h1.setTypeface(signikaFont);
        h2.setTypeface(signikaFont);
        h3.setTypeface(signikaFont);
        tvFloatingMarket.setTypeface(signikaFont);
        tvDeRanch.setTypeface(signikaFont);
        tvOrchidForestCikole.setTypeface(signikaFont);
        tvDapoerPandanWangi.setTypeface(signikaFont);
        tvBurgreens.setTypeface(signikaFont);
        tvSapulidi.setTypeface(signikaFont);
        tvJalanDago.setTypeface(signikaFont);
        tvParisVanJava.setTypeface(signikaFont);
        tvTheSecret.setTypeface(signikaFont);


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation_view);

        bottomNavigationView.setSelectedItemId(R.id.home_activity_page);

        cvFloatingMarket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toDetailActivity = new Intent(HomeActivity.this, DetailActivity.class);

                toDetailActivity.putExtra("nama", "Floating Market");
                toDetailActivity.putExtra("alamat", "Jl. Grand Hotel No.33E, Lembang, Kec. Lembang, Kabupaten Bandung Barat, Jawa Barat 40391");
                toDetailActivity.putExtra("deskripsi", "Tingkatkan pengalaman berbelanja Anda di Floating Market Lembang di mana Anda dapat berbelanja di atas air. Rasakan sensasi unik berbelanja barang-barang seperti makanan lokal di atas perahu yang mengapung di sepanjang danau yang indah menggunakan koin Pasar Terapung yang dibuat khusus untuk pembelian Anda. Selain berbelanja, Floating Market juga menawarkan aktivitas seru lainnya yang bisa dicoba segala usia.\n\n" +
                        "Mulai dari batagor, rujak, hingga ronde jahe dan kebab, Anda bisa menemukan berbagai suguhan lezat untuk memuaskan selera Anda. Jelajahi atraksi lain di sekitar pasar, seperti wahana air di danau dan Taman Pelangi dengan spot foto outdoor yang indah. Lebih baik lagi, sewa kostum Kyotoku, lalu berjalan-jalan dengan kimono ini bersama orang yang Anda cintai dan rasakan seolah-olah Anda berada di taman Jepang.");
                toDetailActivity.putExtra("gambar", R.drawable.img_floating_market);
                toDetailActivity.putExtra("latitude", -6.81842);
                toDetailActivity.putExtra("longitude", 107.61812);
                startActivity(toDetailActivity);
            }
        });

        cvDeRanch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toDetailActivity = new Intent(HomeActivity.this, DetailActivity.class);

                toDetailActivity.putExtra("nama", "De Ranch");
                toDetailActivity.putExtra("alamat", "Jl. Maribaya No.17, Kayuambon, Lembang, Kabupaten Bandung Barat, Jawa Barat 40391");
                toDetailActivity.putExtra("deskripsi", "Konsep tempat wisata keluarga di Bandung ini mengusung konsep Western/Cowboy. Kita bisa bermain atau menunggang kuda, berfoto dengan kostum koboy yang tersedia, mengelilingi area dengan kuda, dan lain sebagainya.\n" +
                        "\n" +
                        "Pastinya, anak-anak bakal senang banget bermain disini. Dengan konsep yang lumayan beda dengan tempat lainnya di Lembang, tentu bisa memberikan suasana segar bagi anda yang berlibur kesini.");
                toDetailActivity.putExtra("gambar", R.drawable.img_de_ranch);
                toDetailActivity.putExtra("latitude", -6.8159994);
                toDetailActivity.putExtra("longitude", 107.6264600);
                startActivity(toDetailActivity);
            }
        });

        cvOrchidForestCikole.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toDetailActivity = new Intent(HomeActivity.this, DetailActivity.class);

                toDetailActivity.putExtra("nama", "Orchid Forest Cikole");
                toDetailActivity.putExtra("alamat", "Genteng, Cikole, Kec. Lembang, Kabupaten Bandung Barat, Jawa Barat 40391");
                toDetailActivity.putExtra("deskripsi", "Orchid Forest Cikole Lembang sudah berdiri sejak Agustus tahun 2017. Tempat ini merupakan taman anggrek terluas di Indonesia. Berada di tengah kawasan hutan lindung dan terbentang seluas 12 hektar. Setidaknya terdapat 157 jenis bunga anggrek beraneka macam dikembangkan di sini.\n" +
                        "\n" +
                        "Orchid Forest Cikole Bandung memfokuskan diri untuk memperkenalkan dan membudidayakan berbagai tanaman anggrek. Menggunakan metode lokal maupun internasional. Spesies Anggreknya tidak hanya berasal dari Indonesia yang memang merupakan negara kedua terbanyak memiliki varian anggrek. Tanaman anggrek di Orchid Forest juga berasal dari negara lain, seperti Venezuela, Argentina, Filipina, Peru, dan Amerika serikat.");
                toDetailActivity.putExtra("gambar", R.drawable.img_orchid_forest_cikole);
                toDetailActivity.putExtra("latitude", -6.780237302048863);
                toDetailActivity.putExtra("longitude", 107.63752863925544);
                startActivity(toDetailActivity);
            }
        });

        cvDapoerPandanWangi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toDetailActivity = new Intent(HomeActivity.this, DetailActivity.class);

                toDetailActivity.putExtra("nama", "Dapoer Pandan Wangi");
                toDetailActivity.putExtra("alamat", "Jl. Patuha No.38, Lkr. Sel., Kec. Lengkong, Kota Bandung, Jawa Barat 40263");
                toDetailActivity.putExtra("deskripsi", "Dapoer Pandan Wangi berbeda dengan rumah makan lainnya melainkan rumah makan ini terkenal dengan rumah makan sunda dengan dekorasi ala pedesaan dengan suasana yang nyaman serta udara yang segar . Dapoer Pandan Wangi ini sering di rekomendasikan oleh banyak orang sehingga jangan kaget kalau rumah makan sunda ini penuh akan pengunjung, tetapi anda tidak perlu khawatir Dapoer Pandan Wangi memiliki tempat yang besar dan luas. \n" +
                        "\n" +
                        "Menu yang tersedia cukup banyak dan bervariasi seperti olahan ayam, sapi, seafood, tumisan serta berbagai macam minuman. Tidak hanya itu, untuk anda yang ingin menu praktis di Dapoer Pandan Wangi menyediakan menu paket. Menu yang wajib anda coba menurut yatu Terong raos, Sambel dadak, Ikan bakar sambal kecap dan Tumis tauge.");
                toDetailActivity.putExtra("gambar", R.drawable.img_dapoer_pandan_wangi);
                toDetailActivity.putExtra("latitude", -6.9285129);
                toDetailActivity.putExtra("longitude", 107.6241062);
                startActivity(toDetailActivity);
            }
        });

        cvBurgreens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toDetailActivity = new Intent(HomeActivity.this, DetailActivity.class);

                toDetailActivity.putExtra("nama", "Burgreens");
                toDetailActivity.putExtra("alamat", "Jl. Cimanuk No.6, Citarum, Kec. Bandung Wetan, Kota Bandung, Jawa Barat 40115");
                toDetailActivity.putExtra("deskripsi", "Burgreens merupakan salah satu restoran makanan vegan yang dirancang khusus untuk lidah orang Asia, untuk anda yang sudah memulai menjaga makanan resto ini perlu anda kunjungi.  \n" +
                        "\n" +
                        "Walaupun menunya terfragmentasi, menariknya pengunjung terbesar bukan vegetarian, melainkan orang-orang yang sadar terhadap kesehatan. Jadi untuk anda yang bukan vegetarian atau sedang berusaha untuk clean eating burgreens jadi pilihan tempat yang tepat. Banyak berbagai menu di Burgreens anda dapat memilih dengan sesuka hati, menu yang wajib dicoba yaitu Barley quinoa with vegan yakitori dengan saladnya yang segar serta tekstur vegan yakitori yang pas dan lezat menu ini sangan direkomendasika.");
                toDetailActivity.putExtra("gambar", R.drawable.img_burgereens);
                toDetailActivity.putExtra("latitude", -6.90475616656358);
                toDetailActivity.putExtra("longitude", 107.62055252391393);
                startActivity(toDetailActivity);
            }
        });
        cvSapulidi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toDetailActivity = new Intent(HomeActivity.this, DetailActivity.class);

                toDetailActivity.putExtra("nama", "Sapulidi");
                toDetailActivity.putExtra("alamat", "Kompleks Graha Puspa, Jl. Sersan Bajuri, Cihideung, Kec, Parongpong, Kabupaten Bandung Barat, Jawa Barat 40559");
                toDetailActivity.putExtra("deskripsi", "Sapu Lidi yang terletak di Lembang menyajika tempat makan di bandung yang mencitrakan objek wisata dengan konsep Traditional Ethnic budaya khas Jawa Barat. Anda dapat merasakan suasana khas jawa barat, sehingga Sapu lidi ini bisa dikatakan sebagai salah  satu rumah makan sunda di bandung. Resto ini dibuat unik anda dapat merasakan seolah-olah anda makan di tengah sawah, lengkap dengan danau dan sampan-sampan yang boleh dipakai pengunjung.\n" +
                        "\n" +
                        "Konsep rumah makan sunda ini dirancang dan didekorasi dengan sifat pedesaan yang nyaman, dicampur dengan gairah kenikmatan kuliner dan makanan yang menarik. Anda dapat menikmati berbagai makanan khas, seperti jamur jadi ngeunah (jamur tiram digoreng tepung dan disiram saus gurih), lalu ikan bakar daun (ikan air tawar dibumbui, kemudian dibungkus daun pisang dan dibakar, seperti pepes, tetapi tidak dikukus dulu), dan sapi gigibrik (mirip empal daging sapi supergurih).");
                toDetailActivity.putExtra("gambar", R.drawable.img_sapulidi);
                toDetailActivity.putExtra("latitude", -6.8126);
                toDetailActivity.putExtra("longitude", 107.59745);
                startActivity(toDetailActivity);
            }
        });
        cvJalanDago.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toDetailActivity = new Intent(HomeActivity.this, DetailActivity.class);

                toDetailActivity.putExtra("nama", "Jalan Dago");
                toDetailActivity.putExtra("alamat", "Jalan Ir H Djuanda, Kecamatan Coblong, Kota Bandung");
                toDetailActivity.putExtra("deskripsi", "Ir. H. Djuanda merupakan salah satu jalan raya utama yang berada di Kota Bandung. Jalan utama dalam sebuah kota biasanya dilengkapi dengan pedestrian untuk menjadi tempat lalu-lalang para pejalan kaki. Pedestrian merupakan salah satu aspek penting dalam kemajuan sebuah kota. Oleh sebab itu, setiap kota biasanya memperlengkapi pedestrian di setiap jalan raya utama, dimana hal tersebut sangat mempengaruhi citra sebuah kota.");
                toDetailActivity.putExtra("gambar", R.drawable.img_jalan_dago);
                toDetailActivity.putExtra("latitude", -6.882042713954262);
                toDetailActivity.putExtra("longitude", 107.6154855177937);
                startActivity(toDetailActivity);
            }
        });

        cvParisVanJava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toDetailActivity = new Intent(HomeActivity.this, DetailActivity.class);

                toDetailActivity.putExtra("nama", "Paris Van Java");
                toDetailActivity.putExtra("alamat", "Paris Van Java Jl. Sukajadi, 40161, Jawa Barat");
                toDetailActivity.putExtra("deskripsi", "Paris Van Java, salah satu mal besar di Sukajadi, Bandung, esmi dibuka pada Juli 2006. Dikembangkan oleh PT Bintang Bangun Mandiri, mal ini menerapkan arsitektur mediterania yang terdiri dari empat lantai dan uniknya dinamai menjadi Concourse Level, Glamour Level, Resort Level, dan Sky Level. Pusat perbelanjaan dengan total luas pertokoan 4.700 meter persegi ini diisi oleh lebih dari 200 tenants, yang menawarkan barang dan jasa.");
                toDetailActivity.putExtra("gambar", R.drawable.img_paris_van_java_mall);
                toDetailActivity.putExtra("latitude", -6.88890);
                toDetailActivity.putExtra("longitude", 107.59641);
                startActivity(toDetailActivity);
            }
        });
        cvTheSecret.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toDetailActivity = new Intent(HomeActivity.this, DetailActivity.class);

                toDetailActivity.putExtra("nama", "The Secret");
                toDetailActivity.putExtra("alamat", "The Secret, Jln. LL. RE. Martadinata (Riau) No. 47, Kota Bandung, Jawa Barat, Indonesia");
                toDetailActivity.putExtra("deskripsi", "Di bawah manajemen yang sama dengan The Summit, factory outlet The Secret memiliki desain bangunan yang lebih misterius sehingga menarik perhatian para pengunjung. Nuansa hitam yang ditonjolkan serta koridor dengan suasana gelap saat masuk membuat pengunjung semakin penasaran. Akan tetapi, setelah melewati koridor tersebut, pengunjung akan disambut dengan nuansa ceria yang dipantulkan dari warna-warni aksesoris dan variasi model pakaian.\n" +
                        "\n" +
                        "Tak hanya itu, di bagian dalamnya, pengunjung akan dimanjakan dengan pemandangan segar dari taman terbukanya. Di taman terbuka ini terdapat beberapa tempat duduk untuk menunggu, kolam ikan yang cukup besar, dan beberapa kedai makanan untuk mengisi perut yang kosong. Selain produk-produk The Secret yang berkualitas, tempatnya yang unik dan nyaman pun menjadi salah satu alasan factory outlet ini banyak digemari para wisatawan domestik maupun mancanegara.");
                toDetailActivity.putExtra("gambar", R.drawable.img_the_secret);
                toDetailActivity.putExtra("latitude", -6.90631);
                toDetailActivity.putExtra("longitude", 107.61482);
                startActivity(toDetailActivity);
            }
        });
        bottomNavigationView.setOnItemSelectedListener(new BottomNavigationView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.home_activity_page:
                        return true;
                    case R.id.search_activity_page:
                        startActivity(new Intent(getApplicationContext(), SearchActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.save_activity_page:
                        startActivity(new Intent(getApplicationContext(), SavedActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.profil_activity_page:
                        startActivity(new Intent(getApplicationContext(), ProfileActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                }
                return false;
            }
        });
    }
}