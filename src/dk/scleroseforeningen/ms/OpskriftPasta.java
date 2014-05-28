package dk.scleroseforeningen.ms;

import com.example.ms.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class OpskriftPasta extends Activity {

	ImageButton imagebtn1;

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.side9);
		
	
		addListenerOnButton1();

	}

	

	 
	 public void addListenerOnButton1() {
	        imagebtn1 = (ImageButton) findViewById(R.id.registrer_mad_tilbage);
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