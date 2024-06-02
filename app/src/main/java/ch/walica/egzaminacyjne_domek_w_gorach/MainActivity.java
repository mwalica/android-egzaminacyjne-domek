package ch.walica.egzaminacyjne_domek_w_gorach;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button btnLike, btnRemove;
    private TextView tvResult;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        btnLike = findViewById(R.id.btnLike);
        btnRemove = findViewById(R.id.btnRemove);
        tvResult = findViewById(R.id.tvResult);

        tvResult.setText(count + " polubień");

        btnLike.setOnClickListener(view -> {
            count++;
            tvResult.setText(count + " polubień");
        });

        btnRemove.setOnClickListener(view -> {

            if (count > 0) {
                count--;
                tvResult.setText(count + " polubień");
            }
        });


    }
}