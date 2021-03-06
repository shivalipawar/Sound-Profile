package com.example.time1;

import android.os.Bundle;
import android.app.Activity;
import android.text.format.Time;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Time dtNow = new Time();
		dtNow.setToNow();
		int hours = dtNow.hour;
		String lsNow = dtNow.format("%Y.%m.%d %H:%M");
		String lsYMD = dtNow.toString(); 
		Toast.makeText(getApplicationContext(),lsNow+"", Toast.LENGTH_LONG).show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
