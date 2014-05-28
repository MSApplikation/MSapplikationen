package dk.scleroseforeningen.ms;

import com.example.ms.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Vis30 extends Activity {

	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.side1_frem2);
        
        addListenerOnButton();
        addListenerOnButton2();
        addListenerOnButton3();
        addListenerOnButton4();
}

	private void addListenerOnButton4() {
		ImageButton tilKalender = (ImageButton)findViewById(R.id.registrer_mad_tilbage);
	    tilKalender.setOnClickListener(new OnClickListener() 
	    {   public void onClick(View v) 
	        {   
	            Intent intent = new Intent(Vis30.this, Kalender.class);
	                startActivity(intent);      
	                finish();
	        }
	    });		
	}

	private void addListenerOnButton3() {
		ImageButton tilNoter = (ImageButton)findViewById(R.id.tilStatus);
	    tilNoter.setOnClickListener(new OnClickListener() 
	    {   public void onClick(View v) 
	        {   
	            Intent intent = new Intent(Vis30.this, MSStatus.class);
	                startActivity(intent);      
	                finish();
	        }
	    });	
	}

	private void addListenerOnButton2() {
		ImageButton uge = (ImageButton)findViewById(R.id.Button01);
	    uge.setOnClickListener(new OnClickListener() 
	    {   public void onClick(View v) 
	        {   
	            Intent intent = new Intent(Vis30.this, Kalender.class);
	                startActivity(intent);      
	                finish();
	        }
	    });
	}



	private void addListenerOnButton() {
		ImageButton til28 = (ImageButton)findViewById(R.id.oversigt5);
	    til28.setOnClickListener(new OnClickListener() 
	    {   public void onClick(View v) 
	        {   
	            Intent intent = new Intent(Vis30.this, Vis29.class);
	                startActivity(intent);      
	                finish();
	        }
	    });
	} 

}