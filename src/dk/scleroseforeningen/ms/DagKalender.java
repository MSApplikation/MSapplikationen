package dk.scleroseforeningen.ms;

import com.example.ms.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class DagKalender extends Activity {

	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.side1);
        
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
	            Intent intent = new Intent(DagKalender.this, Kalender.class);
	                startActivity(intent);      
	                finish();
	        }
	    });	
	}

	private void addListenerOnButton3() {
		ImageButton til29 = (ImageButton)findViewById(R.id.til_29);
	    til29.setOnClickListener(new OnClickListener() 
	    {   public void onClick(View v) 
	        {   
	            Intent intent = new Intent(DagKalender.this, Vis29.class);
	                startActivity(intent);      
	                finish();
	        }
	    });
	}

	private void addListenerOnButton2() {
		ImageButton tilNoter = (ImageButton)findViewById(R.id.tilStatus);
	    tilNoter.setOnClickListener(new OnClickListener() 
	    {   public void onClick(View v) 
	        {   
	            Intent intent = new Intent(DagKalender.this, MSStatusTilKalender.class);
	                startActivity(intent);      
	                finish();
	        }
	    });
	}

	private void addListenerOnButton1() {
		ImageButton tilKalender = (ImageButton)findViewById(R.id.Button01);
	    tilKalender.setOnClickListener(new OnClickListener() 
	    {   public void onClick(View v) 
	        {   
	            Intent intent = new Intent(DagKalender.this, Kalender.class);
	                startActivity(intent);      
	                finish();
	        }
	    });
	}

	private void addListenerOnButton() {
		ImageButton oversigt5 = (ImageButton)findViewById(R.id.oversigt5);
	    oversigt5.setOnClickListener(new OnClickListener() 
	    {   public void onClick(View v) 
	        {   
	            Intent intent = new Intent(DagKalender.this, Vis27.class);
	                startActivity(intent);      
	                finish();
	        }
	    });
	} 

}