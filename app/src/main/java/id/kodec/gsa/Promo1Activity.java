package id.kodec.gsa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Promo1Activity extends AppCompatActivity {

    private Button paket1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promo1);

        paket1 = findViewById(R.id.paket1);

        paket1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Promo1Activity.this, LoginActivity.class));
            }
        });

    }
}
