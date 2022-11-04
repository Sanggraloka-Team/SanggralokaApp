package com.uasppm.sanggraloka;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.google.android.material.card.MaterialCardView;

import java.util.ArrayList;

public class CardViewDestinasiWisataAdapter extends RecyclerView.Adapter<CardViewDestinasiWisataAdapter.CardViewViewHolder> {

    private ArrayList<DestinasiWisata> listDestinasiWisata;
    private Context context;

    CardViewDestinasiWisataAdapter(ArrayList<DestinasiWisata> list, Context context) {
        this.listDestinasiWisata = list;
        this.context = context;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_destinasi_wisata, parent, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder holder, int position) {
        DestinasiWisata destinasiWisata = listDestinasiWisata.get(position);

        Glide.with(holder.itemView.getContext()).load(destinasiWisata.getGambar()).apply(new RequestOptions().override(115)).into(holder.gambarDestinasiWisata);

        holder.tvNama.setText(destinasiWisata.getNama());

        holder.materialCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toDetailActivity = new Intent(context, DetailActivity.class);

                toDetailActivity.putExtra("nama_destinasi_wisata", destinasiWisata.getNama());
                toDetailActivity.putExtra("gambar_destinasi_wisata", destinasiWisata.getGambar());
                toDetailActivity.putExtra("alamat_destinasi_wisata", destinasiWisata.getAlamat());
                toDetailActivity.putExtra("deskripsi_destinasi_wisata", destinasiWisata.getDeskripsi());

                context.startActivity(toDetailActivity);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listDestinasiWisata.size();
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView gambarDestinasiWisata;
        TextView tvNama;
        MaterialCardView materialCardView;

        CardViewViewHolder(View itemView) {
            super(itemView);
            gambarDestinasiWisata = itemView.findViewById(R.id.imageview_destinasi_wisata);
            tvNama = itemView.findViewById(R.id.textview_nama_destinasi_wisata);
            materialCardView = itemView.findViewById(R.id.card_view);
        }
    }
}
