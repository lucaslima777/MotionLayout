package motionlayout.lln;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button start_to_end, top_to_bottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start_to_end = (Button)findViewById(R.id.start_to_end);
        top_to_bottom = (Button)findViewById(R.id.top_to_bottom);

        start_to_end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MotionStartToEnd.class);
                startActivity(intent);
            }
        });

        top_to_bottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MotionTopToBottom.class);
                startActivity(intent);
            }
        });
    }
}
