package inf.ritchieg9.cucei;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class Egresados extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_egresados);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.egresados, menu);
		return true;
	}

}
