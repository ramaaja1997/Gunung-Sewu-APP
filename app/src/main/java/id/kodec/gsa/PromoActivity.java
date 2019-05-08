package id.kodec.gsa;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class PromoActivity extends AppCompatActivity {

    //a list to store all the products
    List<Promo> productList;

    //the recyclerview
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promo);

        //getting the recyclerview from xml
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //initializing the productlist
        productList = new ArrayList<>();


        //adding some items to our list
        productList.add(
                new Promo(
                        1,
                        "Kupon Diskon 200Rb Untuk Peket Wisata 2D1N",
                        "Periode booking: 19 - 30 Nov 2018",
                        4.3,
                        60000,
                        R.drawable.gambar3));

        productList.add(
                new Promo(
                        2,
                        "Kupon Diskon 150Rb Untuk Peket Wisata 3D2N",
                        "Periode booking: 16 - 20 Nov 2018",
                        4.3,
                        60000,
                        R.drawable.gambar5));

        productList.add(
                new Promo(
                        3,
                        "Kupon Diskon 20Rb Untuk Peket Wisata 1D",
                        "Periode booking: 16 - 20 Des 2018",
                        4.3,
                        60000,
                        R.drawable.gambar7));

        //creating recyclerview adapter
        PromoAdapter adapter = new PromoAdapter(this, productList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);

    }
}