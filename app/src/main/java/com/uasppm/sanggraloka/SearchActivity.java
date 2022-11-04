package com.uasppm.sanggraloka;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class SearchActivity extends AppCompatActivity {
    private RecyclerView rvDestinasiWisata;
    private ArrayList<DestinasiWisata> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation_view);

        rvDestinasiWisata = findViewById(R.id.rv_destinasi_wisata);
        rvDestinasiWisata.setHasFixedSize(true);

        list.addAll(DestinasiWisataData.getListData());

        showRecycleCardView();

        bottomNavigationView.setSelectedItemId(R.id.profil_activity_page);

        bottomNavigationView.setOnItemSelectedListener(new BottomNavigationView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.home_activity_page:
                        startActivity(new Intent(getApplicationContext(), HomeActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.search_activity_page:
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

    private void showRecycleCardView() {
        rvDestinasiWisata.setLayoutManager(new LinearLayoutManager(this));
        CardViewDestinasiWisataAdapter cardViewDestinasiWisataAdapter = new CardViewDestinasiWisataAdapter(list, this);
        rvDestinasiWisata.setAdapter(cardViewDestinasiWisataAdapter);
    }
}