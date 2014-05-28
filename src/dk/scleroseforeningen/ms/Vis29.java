package dk.scleroseforeningen.ms;

import com.example.ms.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Vis29 extends Activity {

	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.side1_frem1);
        
        addListenerOnButton();
        addListenerOnButton1();
        addListenerOnButton2();
        addListenerOnButton3();
        addListenerOnButton4();
}

	private void addListenerOnButton4() {
		ImageButton tilKalender = (ImageButton)findViewById(R.id.registrer_mad_tilbage);
	    tilKalender.setOnClickListener(new OnClickListener() 
	    {   public void onClick(View v) 
	        {   
	            Intent intent = new Intent(Vis29.this, Kalender.class);
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
	            Intent intent = new Intent(Vis29.this, MSStatus.class);
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
	            Intent intent = new Intent(Vis29.this, Kalender.class);
	                startActivity(intent);      
	                finish();
	        }
	    });
	}

	private void addListenerOnButton1() {
		ImageButton til30 = (ImageButton)findViewById(R.id.imageButton3);
	    til30.setOnClickListener(new OnClickListener() 
	    {   public void onClick(View v) 
	        {   
	            Intent intent = new Intent(Vis29.this, Vis30.class);
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
	            Intent intent = new Intent(Vis29.this, DagKalender.class);
	                startActivity(intent);      
	                finish();
	        }
	    });
	} 

}