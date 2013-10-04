package com.mehdi.tp7;

import android.app.Activity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        registerForContextMenu((TextView)findViewById(R.id.textView1));
    }

	    @Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {
		// TODO Auto-generated method stub
	        getMenuInflater().inflate(R.menu.contextmenu, menu);

		super.onCreateContextMenu(menu, v, menuInfo);
	}
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    @Override
    public boolean onContextItemSelected(MenuItem item) {
    
    	switch (item.getItemId()){
    	
    	case R.id.action_settings:
    		Toast.makeText(this,"Item setting", Toast.LENGTH_SHORT).show();
    		return true;
    		
    	case R.id.action_quitter:
    		finish();
    		return true;
    	}
    	
    	
    	// TODO Auto-generated method stub
    	return super.onContextItemSelected(item);
    }
    
}
