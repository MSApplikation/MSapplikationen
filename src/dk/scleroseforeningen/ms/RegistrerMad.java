package dk.scleroseforeningen.ms;

import com.example.ms.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class RegistrerMad extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.side5);
        
        

        addListenerOnButton3();
        addListenerOnButton4();
        addListenerOnButton5();
        addListenerOnButton6();
        addListenerOnButton7();
        addListenerOnButton8();
        addListenerOnButton9();
        addListenerOnButton10();
}
	
public void addListenerOnButton3() {
		
		ImageButton regTilbage= (ImageButton)findViewById(R.id.registrer_mad_tilbage);
	    regTilbage.setOnClickListener(new OnClickListener() 
	    {   public void onClick(View v) 
	        {   
	            Intent intent = new Intent(RegistrerMad.this, RegistrerMadTilbage.class);
	                startActivity(intent);      
	                finish();
	        }
	    });
       
    }

public void addListenerOnButton4() {
	
	ImageButton regFrem= (ImageButton)findViewById(R.id.registrer_mad_frem);
    regFrem.setOnClickListener(new OnClickListener() 
    {   public void onClick(View v) 
        {   
            Intent intent = new Intent(RegistrerMad.this, RegistrerMadFrem.class);
                startActivity(intent);      
                finish();
        }
    });
   
}public void addListenerOnButton5() {
	
	ImageButton mondayEdit= (ImageButton)findViewById(R.id.frokost5);
    mondayEdit.setOnClickListener(new OnClickListener() 
    {   public void onClick(View v) 
        {   
            Intent intent = new Intent(RegistrerMad.this, FrokostReg.class);
                startActivity(intent);      
                finish();
        }
    });
   
}public void addListenerOnButton6() {
	
	ImageButton mondayEdit= (ImageButton)findViewById(R.id.aftensmad5);
    mondayEdit.setOnClickListener(new OnClickListener() 
    {   public void onClick(View v) 
        {   
            Intent intent = new Intent(RegistrerMad.this, AftensmadReg.class);
                startActivity(intent);      
                finish();
        }
    });
   
}public void addListenerOnButton7() {
	
	ImageButton mondayEdit= (ImageButton)findViewById(R.id.mellemmaaltid5);
    mondayEdit.setOnClickListener(new OnClickListener() 
    {   public void onClick(View v) 
        {   
            Intent intent = new Intent(RegistrerMad.this, MellemmaaltidReg.class);
                startActivity(intent);      
                finish();
        }
    });
   
}











	public void addListenerOnButton8() {
		
		ImageButton mondayEdit= (ImageButton)findViewById(R.id.registrer_mad_tilbage5);
	    mondayEdit.setOnClickListener(new OnClickListener() 
	    {   public void onClick(View v) 
	        {   
	            Intent intent = new Intent(RegistrerMad.this, TilbageTil6.class);
	                startActivity(intent);      
	                finish();
	        }
	    });
       
    }

	public void addListenerOnButton9() {
		
		ImageButton oversigt5 = (ImageButton)findViewById(R.id.oversigt5);
	    oversigt5.setOnClickListener(new OnClickListener() 
	    {   public void onClick(View v) 
	        {   
	            Intent intent = new Intent(RegistrerMad.this, DagKalender.class);
	                startActivity(intent);      
	                finish();
	        }
	    });
       
    }
	
public void addListenerOnButton10() {
		
		ImageButton mondayEdit= (ImageButton)findViewById(R.id.morgenmad5);
	    mondayEdit.setOnClickListener(new OnClickListener() 
	    {   public void onClick(View v) 
	        {   
	            Intent intent = new Intent(RegistrerMad.this, MorgenReg.class);
	                startActivity(intent);      
	                finish();
	        }
	    });
       
    }
	
}
