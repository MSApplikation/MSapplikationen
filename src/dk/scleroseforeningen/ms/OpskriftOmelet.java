package dk.scleroseforeningen.ms;

import com.example.ms.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class OpskriftOmelet extends Activity {

	ImageButton imagebtn1;

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.side9_2);
		
	
		addListenerOnButton1();

	}

	

	 
	 public void addListenerOnButton1() {
	        imagebtn1 = (ImageButton) findViewById(R.id.omelet_tilbage);
	        imagebtn1.setOnClickListener(new OnClickListener() {

	            @Override
	            public void onClick(View arg0) {

	                Intent intent = new Intent
	                        (getApplicationContext(), Opskrifter.class);
	                    startActivity(intent);  
	            }
	        });
	    }

	    
	 
}
//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.main, menu);
//		return true;
//	}


