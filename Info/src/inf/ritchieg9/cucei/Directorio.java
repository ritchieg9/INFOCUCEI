package inf.ritchieg9.cucei;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class Directorio extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_directorio);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.directorio, menu);
		return true;
	}

}