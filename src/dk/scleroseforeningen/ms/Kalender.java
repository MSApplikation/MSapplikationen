package dk.scleroseforeningen.ms;

import com.example.ms.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Kalender extends Activity {

	ImageButton imagebtn1;
	ImageButton imagebtn2;
	ImageButton imagebtn3;
	ImageButton imagebtn4;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.side3);
        
        addListenerOnButton1();
        addListenerOnButton2();
        addListenerOnButton3();
        addListenerOnButton4();
        addListenerOnButton5();
        addListenerOnButton6();
        addListenerOnButton7();
}
	
	
	public void addListenerOnButton1() {
		
		imagebtn1 = (ImageButton)findViewById(R.id.til_forside);
	    imagebtn1.setOnClickListener(new OnClickListener() 
	    {   public void onClick(View v) 
	        {   
	            Intent intent = new Intent(Kalender.this, MainActivity.class);
	                startActivity(intent);      
	                finish();
	        }
	    });
       
    }
	
	public void addListenerOnButton2() {
		
		imagebtn2 = (ImageButton)findViewById(R.id.til_uge17);
	    imagebtn2.setOnClickListener(new OnClickListener() 
	    {   public void onClick(View v) 
	        {   
	            Intent intent = new Intent(Kalender.this, Uge17.class);
	                startActivity(intent);      
	                finish();
	        }
	    });
       
    }
	public void addListenerOnButton3() {
		
		imagebtn3 = (ImageButton)findViewById(R.id.til_uge19);
		imagebtn3.setOnClickListener(new OnClickListener() 
	    {   public void onClick(View v) 
	        {   
	            Intent intent = new Intent(Kalender.this, Uge19.class);
	                startActivity(intent);      
	                finish();
	        }
	    });
       
    }

	public void addListenerOnButton4() {
		
		imagebtn4 = (ImageButton)findViewById(R.id.button2);
	    imagebtn4.setOnClickListener(new OnClickListener() 
	    {   public void onClick(View v) 
	        {   
	            Intent intent = new Intent(Kalender.this, DagKalender.class);
	                startActivity(intent);      
	                finish();
	        }
	    });
	    
	          
    }
	
	private void addListenerOnButton5() {
		ImageButton wednesday= (ImageButton)findViewById(R.id.Button02);
	    wednesday.setOnClickListener(new OnClickListener() 
	    {   public void onClick(View v) 
	        {   
	            Intent intent = new Intent(Kalender.this, Vis30.class);
	                startActivity(intent);      
	                finish();
	        }
	    });		
	}



	private void addListenerOnButton6() {
		ImageButton tuesday= (ImageButton)findViewById(R.id.Button01);
	    tuesday.setOnClickListener(new OnClickListener() 
	    {   public void onClick(View v) 
	        {   
	            Intent intent = new Intent(Kalender.this, Vis29.class);
	                startActivity(intent);      
	                finish();
	        }
	    });	
	}



	private void addListenerOnButton7() {
		ImageButton monday= (ImageButton)findViewById(R.id.button1);
	    monday.setOnClickListener(new OnClickListener() 
	    {   public void onClick(View v) 
	        {   
	            Intent intent = new Intent(Kalender.this, DagKalender.class);
	                startActivity(intent);      
	                finish();
	        }
	    });	
	}
}
