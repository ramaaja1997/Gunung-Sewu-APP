package id.kodec.gsa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Paket1Activity extends AppCompatActivity{

    private Button beli;
    private EditText something;
    String content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paket1);

        beli = findViewById(R.id.beli);
        beli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                something = findViewById(R.id.quantity);
                content = something.getText().toString();
                Intent ii=new Intent(Paket1Activity.this, PayPaket1Activity.class);
                ii.putExtra("quantity", content);
                startActivity(ii);
            }
        });

    }
}
