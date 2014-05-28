package dk.scleroseforeningen.ms;

import com.example.ms.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Uge19 extends Activity {

	ImageButton imagebtn1;
	ImageButton imagebtn2;
	ImageButton imagebtn3;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.side3_frem1);
		
		addListenerOnButton1();
		addListenerOnButton2();
		addListenerOnButton3();

	}
	
public void addListenerOnButton1() {
    imagebtn1 = (ImageButton) findViewById(R.id.til_forside);
    imagebtn1.setOnClickListener(new OnClickListener() {

        @Override
        public void onClick(View arg0) {

            Intent intent = new Intent
                    (getApplicationContext(), MainActivity.class);
                startActivity(intent); 
        }
    });
    
}
public void addListenerOnButton2() {
    imagebtn2 = (ImageButton) findViewById(R.id.til_uge18);
    imagebtn2.setOnClickListener(new OnClickListener() {

        @Override
        public void onClick(View arg0) {

            Intent intent = new Intent
                    (getApplicationContext(), Kalender.class);
                startActivity(intent); 
        }
    });
}

public void addListenerOnButton3() {
    imagebtn3 = (ImageButton) findViewById(R.id.button2);
    imagebtn3.setOnClickListener(new OnClickListener() {

        @Override
        public void onClick(View arg0) {

            Intent intent = new Intent
                    (getApplicationContext(), DagKalender.class);
                startActivity(intent); 
        }
    });
}


}
