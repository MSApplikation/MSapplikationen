package dk.scleroseforeningen.ms;

import java.util.ArrayList;
import java.util.HashMap;

import com.example.ms.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;

public class Opskrifter extends Activity {
	
	ImageButton imagebtn1;
    
   // List view
   private ListView lv;
   
   
    
   // Listview Adapter
   ArrayAdapter<String> adapter;
    
   // Search EditText
   EditText inputSearch;
    
    
   // ArrayList for Listview
   ArrayList<HashMap<String, String>> productList;

   @Override
   public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.side8);
       
       addListenerOnButton1();
       
        
       // Listview Data
       final String products[] = {"Pasta med kødsovs", "Lakseruller", "Omelet", "Alm. lasagne", "Lakselasagne",
               "Kyllinge/avocado salat", "Koldskål m. kammerjunker", "Kyllingelasagne",
               "Caesar salat", "Tortilla wraps med kylling", "Frikadeller med kartofler"};
	   final HashMap<String, Class<?>> hm = new HashMap<String,Class<?>>();
	   hm.put(products[0], OpskriftPasta.class);
	   hm.put(products[1], OpskriftLaks.class);
	   hm.put(products[2], OpskriftOmelet.class);
	   // tilføj flere opskrift.class'
           
       lv = (ListView) findViewById(R.id.list_view);
       inputSearch = (EditText) findViewById(R.id.inputSearch);
        
       // Adding items to listview
       adapter = new ArrayAdapter<String>(this, R.layout.list_item, R.id.product_name, products);
       lv.setAdapter(adapter);
       
       lv.setOnItemClickListener(new OnItemClickListener() {
    	   public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
  

    		   Intent intent = new Intent(Opskrifter.this, hm.get(adapter.getItem(position)));
	           startActivity(intent);      
	    finish();
    		   
    		   
    		    //Add more cases here similarly. 
    		}
    			    
    			}
    		 
    	    
       );
        
       /**
        * Enabling Search Filter
        * */
       inputSearch.addTextChangedListener(new TextWatcher() {
            
           @Override
           public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
               // When user changed the Text
               Opskrifter.this.adapter.getFilter().filter(cs);  
           }
            
           @Override
           public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
                   int arg3) {
               // TODO Auto-generated method stub
                
           }
            
           @Override
           public void afterTextChanged(Editable arg0) {
               // TODO Auto-generated method stub                         
           }
       });
       
   }
   
   public void addListenerOnButton1() {
	    imagebtn1 = (ImageButton) findViewById(R.id.tilbage8);
	    imagebtn1.setOnClickListener(new OnClickListener() {

	        @Override
	        public void onClick(View arg0) {

	            Intent intent = new Intent
	                    (getApplicationContext(), MainActivity.class);
	                startActivity(intent); 
	        }
	    });
	    
	}
   
}