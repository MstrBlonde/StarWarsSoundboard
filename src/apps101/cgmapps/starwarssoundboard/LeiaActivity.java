package apps101.cgmapps.starwarssoundboard;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class LeiaActivity extends Activity {

	MediaPlayer clip;
	Toast toast;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_leia);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.leia, menu);
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
		case R.id.carpet:
			clip = MediaPlayer.create(this, R.raw.leia_carpet);
			text = "\"Would somebody get this big walking carpet out of my way?\"";
			break;
		case R.id.doasitellyou:
			clip = MediaPlayer.create(this, R.raw.leia_doasitellyou);
			text = "\"From now on, you\'ll do exactly as I tell you.\"";
			break;
		case R.id.dontknow:
			clip = MediaPlayer.create(this, R.raw.leia_dontknow);
			text = "\"I don\'t know what you\'re talking about.\"";
			break;
		case R.id.helpme:
			clip = MediaPlayer.create(this, R.raw.leia_helpme);
			text = "\"Help me Obi-Wan Kenobi, you\'re my only hope.\"";
			break;
		case R.id.laserbrain:
			clip = MediaPlayer.create(this, R.raw.leia_laserbrain);
			text = "\"I don\'t know where you get your delusions, laser brain.\"";
			break;
		case R.id.reward:
			clip = MediaPlayer.create(this, R.raw.leia_reward);
			text = "\"You needn\'t worry about your reward.\"";
			break;
		case R.id.scruffy:
			clip = MediaPlayer.create(this, R.raw.leia_scruffy);
			text = "\"Why you stuck-up, half-witted, scruffy-looking... nerf herder!\"";
			break;
		case R.id.shortt:
			clip = MediaPlayer.create(this, R.raw.leia_short);
			text = "\"Aren\'t you a little short for a Stormtrooper?\"";
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
