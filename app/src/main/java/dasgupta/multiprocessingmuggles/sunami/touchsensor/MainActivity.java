package dasgupta.multiprocessingmuggles.sunami.touchsensor;

import static android.os.SystemClock.sleep;

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
                vibrator.vibrate(1500);
            }
        });

        normalClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vibrator.vibrate(400);
            }
        });

        tickClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vibrator.vibrate(250);
                sleep(400);
                vibrator.vibrate(250);
            }
        });

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vibrator.vibrate(250);
                sleep(500);
                vibrator.vibrate(500);
                sleep(300);
                vibrator.vibrate(250);
                sleep(500);
                vibrator.vibrate(500);
                sleep(300);
                vibrator.vibrate(250);
                sleep(400);
                vibrator.vibrate(500);
            }
        });
    }
}