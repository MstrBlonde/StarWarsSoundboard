package apps101.cgmapps.starwarssoundboard;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class ChewyActivity extends Activity {

	MediaPlayer clip;
	Toast toast;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chewy);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.chewy, menu);
		return true;
	}

	public void playClip(View v) {
		
		if( clip != null ) {
			clip.stop();
			clip.release();
			clip = null;
			toast.cancel();
		}
		CharSequence text;
		switch (v.getId()) {
		case R.id.roar:
			clip = MediaPlayer.create(this, R.raw.chewy_roar);
			text = "[Angry roar]";
			break;
		default:
			text = "error";
		}
		
		clip.start();
		Context context = getApplicationContext();
		int duration = Toast.LENGTH_LONG;

		toast = Toast.makeText(context, text, duration);
		toast.show();
	}

}
