package com.uasppm.sanggraloka;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class DetailActivity extends AppCompatActivity {

    ImageView imageDestinasiWisata;
    TextView namaDestinasiwisata, alamatDestinasiWisata, deskripsiDestinasiWisata;
    FloatingActionButton FAB;
    Button btnBookmark;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageDestinasiWisata = findViewById(R.id.imageview_gambar_tempat_wisata);
        namaDestinasiwisata = findViewById(R.id.textview_nama_tempat_wisata);
        alamatDestinasiWisata = findViewById(R.id.textview_alamat_tempat_wisata);
        deskripsiDestinasiWisata = findViewById(R.id.textview_isi_deskripsi);
        FAB = findViewById(R.id.floating_action_button_buka_maps);
        btnBookmark = findViewById(R.id.button_add_bookmark);

        btnBookmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Destinasi Wisata Tersimpan!", Toast.LENGTH_SHORT).show();
            }
        });

        FAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double longitude = getIntent().getDoubleExtra("longitude", 0);
                double latitude = getIntent().getDoubleExtra("latitude", 0);

                Toast.makeText(getApplicationContext(), "Membuka peta...", Toast.LENGTH_SHORT).show();

                Intent toMapsActivity = new Intent(DetailActivity.this, MapActivity.class);
                toMapsActivity.putExtra("longitude", longitude);
                toMapsActivity.putExtra("latitude", latitude);

                startActivity(toMapsActivity);
            }
        });

        getIncomingExtra();
        getIncomingExtra2();

    }

    private void getIncomingExtra() {
        if (getIntent().hasExtra("nama_destinasi_wisata") && getIntent().hasExtra("alamat_destinasi_wisata") && getIntent().hasExtra("deskripsi_destinasi_wisata") && getIntent().hasExtra("gambar_destinasi_wisata")) {
            String destinasiWisataNama = getIntent().getStringExtra("nama_destinasi_wisata");
            int destinasiWisataGambar = getIntent().getIntExtra("gambar_destinasi_wisata", 0);
            String destinasiWisataAlamat = getIntent().getStringExtra("alamat_destinasi_wisata");
            String destinasiWisataDeskripsi = getIntent().getStringExtra("deskripsi_destinasi_wisata");

            setDataActivity(destinasiWisataNama, destinasiWisataGambar, destinasiWisataAlamat, destinasiWisataDeskripsi);
        }
    }

    private void setDataActivity(String destinasiWisataNama, int destinasiWisataGambar, String destinasiWisataAlamat, String destinasiWisataDeskripsi) {
        namaDestinasiwisata.setText(destinasiWisataNama);

        Glide.with(this).asBitmap().load(destinasiWisataGambar).into(imageDestinasiWisata);

        alamatDestinasiWisata.setText(destinasiWisataAlamat);

        deskripsiDestinasiWisata.setText(destinasiWisataDeskripsi);
    }

    private void getIncomingExtra2() {
        if (getIntent().hasExtra("nama") && getIntent().hasExtra("alamat") && getIntent().hasExtra("deskripsi") && getIntent().hasExtra("gambar") && getIntent().hasExtra("latitude") && getIntent().hasExtra("longitude")) {
            String destinasiWisataNama = getIntent().getStringExtra("nama");
            int destinasiWisataGambar = getIntent().getIntExtra("gambar", 0);
            String destinasiWisataAlamat = getIntent().getStringExtra("alamat");
            String destinasiWisataDeskripsi = getIntent().getStringExtra("deskripsi");
            double latitude = getIntent().getDoubleExtra("latitude", 0);
            double longitude = getIntent().getDoubleExtra("longitude", 0);

            setDataActivity(destinasiWisataNama, destinasiWisataGambar, destinasiWisataAlamat, destinasiWisataDeskripsi);
        }
    }
}