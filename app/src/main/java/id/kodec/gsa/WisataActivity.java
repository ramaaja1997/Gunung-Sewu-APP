package id.kodec.gsa;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class WisataActivity extends AppCompatActivity {

    //a list to store all the products
    List<Wisata> productList;

    //the recyclerview
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata);

        //getting the recyclerview from xml
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //initializing the productlist
        productList = new ArrayList<>();


        //adding some items to our list
        productList.add(
                new Wisata(
                        1,
                        "2D1N Hotel+Trasportasi (Orchid Inn Hotel+Avanza Veloz)",
                        "2-6 Orang",
                        4.3,
                        960000,
                        R.drawable.gambar2));

        productList.add(
                new Wisata(
                        2,
                        "3D2N Hotel+Transportasi+Konsumsi (Orchid Inn Hotel+Xenia+Gudeg)",
                        "2-6 Orang",
                        4.3,
                        1200000,
                        R.drawable.gambar4));

        productList.add(
                new Wisata(
                        3,
                        "1D Wisata+Transportasi+Konsumsi",
                        "1-2 Orang",
                        4.7,
                        150000,
                        R.drawable.gambar12));

        //creating recyclerview adapter
        WisataAdapter adapter = new WisataAdapter(this, productList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);
    }
}