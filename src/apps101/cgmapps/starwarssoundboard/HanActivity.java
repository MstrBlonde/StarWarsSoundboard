package apps101.cgmapps.starwarssoundboard;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class HanActivity extends Activity {

	MediaPlayer clip;
	Toast toast;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_han);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.han, menu);
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
		case R.id.amaze:
			clip = MediaPlayer.create(this, R.raw.han_amaze);
			text = "\"You know, sometimes I amaze even myself.\"";
			break;
		case R.id.badfeeling:
			clip = MediaPlayer.create(this, R.raw.han_badfeeling);
			text = "\"I got a bad feeling about this.\"";
			break;
		case R.id.captain:
			clip = MediaPlayer.create(this, R.raw.han_captain);
			text = "\"I\'m captain of the Millenium Falcon.\"";
			break;
		case R.id.didnthelp:
			clip = MediaPlayer.create(this, R.raw.han_didnthelp);
			text = "\"Somehow I got the felling that didn\'t help us very much.\"";
			break;
		case R.id.falcon:
			clip = MediaPlayer.create(this, R.raw.han_falcon);
			text = "\"You\'ve never heard of the Millenium Falcon?\"";
			break;
		case R.id.flycasual:
			clip = MediaPlayer.create(this, R.raw.han_flycasual);
			text = "\"I don\'t know, fly casual.\"";
			break;
		case R.id.howareyou:
			clip = MediaPlayer.create(this, R.raw.han_howareyou);
			text = "\"Everything\'s perfectly all right now, we\'re fine... we\'re all fine here, now. Thank you. How are you?\"";
			break;
		case R.id.odds:
			clip = MediaPlayer.create(this, R.raw.han_odds);
			text = "\"Never tell me the odds!\"";
			break;
		case R.id.point:
			clip = MediaPlayer.create(this, R.raw.han_point);
			text = "\"Point that thing someplace else!\"";
			break;
		case R.id.religions:
			clip = MediaPlayer.create(this, R.raw.han_religions);
			text = "\"Hoky religions and ancient weapons are no match for a good blaster at your side, kid.\"";
			break;
		case R.id.situation:
			clip = MediaPlayer.create(this, R.raw.han_situation);
			text = "\"Uh, everything\'s under control, situation normal.\"";
			break;
		case R.id.thankme:
			clip = MediaPlayer.create(this, R.raw.han_thankme);
			text = "\"Don\'t everybody thank me at once.\"";
			break;
		case R.id.upset:
			clip = MediaPlayer.create(this, R.raw.han_upset);
			text = "\"It\'s not wise to upset a Wookiee.\"";
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
