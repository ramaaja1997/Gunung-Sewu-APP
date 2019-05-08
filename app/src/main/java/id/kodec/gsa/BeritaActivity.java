package id.kodec.gsa;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class BeritaActivity extends AppCompatActivity {

    //a list to store all the products
    List<Berita> productList;

    //the recyclerview
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berita);

        //getting the recyclerview from xml
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //initializing the productlist
        productList = new ArrayList<>();


        //adding some items to our list
        productList.add(
                new Berita(
                        1,
                        "Geopark Dinilai Bantu Kurangi Angka Kemiskinan",
                        "Jumat, 16 November 2018 21:21 WIB",
                        4.3,
                        60000,
                        R.drawable.image_1));

        productList.add(
                new Berita(
                        1,
                        "Sudah Tahu? Gunungkidul Punya Taman Batu yang Unik",
                        "Kamis, 15 November 2018 09:10 WIB",
                        4.3,
                        60000,
                        R.drawable.gambar10));

        productList.add(
                new Berita(
                        1,
                        "Jembatan Gantung Pulau Kalong yang Bikin Deg-degan",
                        "Rabu, 14 November 2018 12:10 WIB",
                        4.3,
                        60000,
                        R.drawable.gambar8));

        //creating recyclerview adapter
        BeritaAdapter adapter = new BeritaAdapter(this, productList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);

    }
}