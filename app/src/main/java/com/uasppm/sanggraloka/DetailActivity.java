package com.uasppm.sanggraloka;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    ImageView imageDestinasiWisata;
    TextView namaDestinasiwisata, alamatDestinasiWisata, deskripsiDestinasiWisata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageDestinasiWisata = findViewById(R.id.imageview_gambar_tempat_wisata);
        namaDestinasiwisata = findViewById(R.id.textview_nama_tempat_wisata);
        alamatDestinasiWisata = findViewById(R.id.textview_alamat_tempat_wisata);
        deskripsiDestinasiWisata = findViewById(R.id.textview_isi_deskripsi);

        getIncomingExtra();
    }

    private void getIncomingExtra() {
        if (getIntent().hasExtra("nama_destinasi_wisata") && getIntent().hasExtra("alamat_destinasi_wisata") && getIntent().hasExtra("deskripsi_destinasi_wisata") && getIntent().hasExtra("gambar_destinasi_wisata")) {
            String destinasiWisataNama = getIntent().getStringExtra("nama_destinasi_wisata");
            int destinasiWisataGambar = getIntent().getIntExtra("gambar_destinasi_wisata",0);
            String destinasiWisataAlamat = getIntent().getStringExtra("alamat_destinasi_wisata");
            String destinasiWisataDeskripsi = getIntent().getStringExtra("deskripsi_destinasi_wisata");

            setDataActivity(destinasiWisataNama, destinasiWisataGambar, destinasiWisataAlamat, destinasiWisataDeskripsi);
        }
    }

    private void setDataActivity(String destinasiWisataNama, int destinasiWisataGambar, String destinasiWisataAlamat, String destinasiWisataDeskripsi) {
        namaDestinasiwisata.setText(destinasiWisataNama);

        Glide.with(this).asBitmap().load(destinasiWisataGambar).into(imageDestinasiWisata);
//        Glide.with(this).load(destinasiWisataGambar).apply(new RequestOptions().override(115)).into(imageDestinasiWisata);

        alamatDestinasiWisata.setText(destinasiWisataAlamat);

        deskripsiDestinasiWisata.setText(destinasiWisataDeskripsi);
    }
}