package dk.scleroseforeningen.ms;

import com.example.ms.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class MainActivity extends Activity {

	ImageButton imagebtn1;
	ImageButton imagebtn2;
	ImageButton imagebtn3;
	ImageButton imagebtn4;
	ImageButton imagebtn5;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	
		addListenerOnButton1();
		addListenerOnButton2();
		addListenerOnButton3();
		addListenerOnButton4();
		addListenerOnButton5();
	}

	

	 
	 public void addListenerOnButton1() {
	        imagebtn1 = (ImageButton) findViewById(R.id.sluk);
	        imagebtn1.setOnClickListener(new OnClickListener() {

	            @Override
	            public void onClick(View arg0) {
	            	finish();
	                System.exit(0); 
	            }
	        });
	    }
	 
	 public void addListenerOnButton2() {
	        imagebtn2 = (ImageButton) findViewById(R.id.registrerMad);
	        imagebtn2.setOnClickListener(new OnClickListener() {

	            @Override
	            public void onClick(View arg0) {

	                Intent intent = new Intent
	                        (getApplicationContext(), RegistrerMad.class);
	                    startActivity(intent); 
	            }
	        });
	    }
	 
	 public void addListenerOnButton3() {
	        imagebtn3 = (ImageButton) findViewById(R.id.MSStatus);
	        imagebtn3.setOnClickListener(new OnClickListener() {

	            @Override
	            public void onClick(View arg0) {

	                Intent intent = new Intent
	                        (getApplicationContext(), MSStatus.class);
	                    startActivity(intent); 
	            }
	        });
	    }
	 
	 public void addListenerOnButton4() {
	        imagebtn4 = (ImageButton) findViewById(R.id.opskrifter);
	        imagebtn4.setOnClickListener(new OnClickListener() {

	            @Override
	            public void onClick(View arg0) {

	                Intent intent = new Intent
	                        (getApplicationContext(), Opskrifter.class);
	                    startActivity(intent); 
	            }
	        });
	    }
	 
	 public void addListenerOnButton5() {
	        imagebtn5 = (ImageButton) findViewById(R.id.kalender);
	        imagebtn5.setOnClickListener(new OnClickListener() {

	            @Override
	            public void onClick(View arg0) {

	                Intent intent = new Intent
	                        (getApplicationContext(), Kalender.class);
	                    startActivity(intent); 
	            }
	        });
	    }
//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.main, menu);
//		return true;
//	}

}
