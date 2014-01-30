package apps101.cgmapps.starwarssoundboard;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MenuActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu, menu);
		return true;
	}

	public void go(View v) {
		Intent i = new Intent(Intent.ACTION_VIEW);

		switch (v.getId()) {
		case R.id.luke:
			i.setClass(this, LukeActivity.class);
			break;
		case R.id.han:
			i.setClass(this, HanActivity.class);
			break;
		case R.id.leia:
			i.setClass(this, LeiaActivity.class);
			break;
		case R.id.ben:
			i.setClass(this, BenActivity.class);
			break;
		case R.id.vader:
			i.setClass(this, VaderActivity.class);
			break;
		case R.id.r2:
			i.setClass(this, R2Activity.class);
			break;
		case R.id.c3po:
			i.setClass(this, C3POActivity.class);
			break;
		case R.id.yoda:
			i.setClass(this, YodaActivity.class);
			break;
		case R.id.chewy:
			i.setClass(this, ChewyActivity.class);
			break;
		case R.id.emperor:
			i.setClass(this, EmperorActivity.class);
			break;
		default:
			// text = "error";
		}

		startActivity(i);
	}

}
