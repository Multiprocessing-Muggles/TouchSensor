package dasgupta.multiprocessingmuggles.sunami.touchsensor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button longClick;
    Button normalClick;
    Button tickClick;
    Button click;

    Vibrator vibrator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        longClick = (Button) findViewById(R.id.lclick);
        normalClick = (Button) findViewById(R.id.normal);
        tickClick = (Button) findViewById(R.id.tick);
        click = (Button) findViewById(R.id.click);

        vibrator = (Vibrator)getSystemService(VIBRATOR_SERVICE);

        longClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vibrator.vibrate(3000);
            }
        });

        normalClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vibrator.vibrate(1000);
            }
        });

        tickClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vibrator.vibrate(1000);
                vibrator.vibrate(3000);
            }
        });

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vibrator.vibrate(1000);

                vibrator.vibrate(3000);
                vibrator.vibrate(1000);

                vibrator.vibrate(3000);
            }
        });
    }
}