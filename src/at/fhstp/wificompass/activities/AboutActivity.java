/*
 * Created on Dec 5, 2011
 * Author: Paul Woelfel
 * Email: frig@frig.at
 */
package at.fhstp.wificompass.activities;

import android.app.Activity;
import android.os.Bundle;
import at.fhstp.wificompass.ApplicationContext;
import at.fhstp.wificompass.R;

public class AboutActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about);
		ApplicationContext.setContext(this);
	}
	
	@Override
	protected void onResume() {
		super.onResume();
//		log.debug("setting context");
		ApplicationContext.setContext(this);
	}

}