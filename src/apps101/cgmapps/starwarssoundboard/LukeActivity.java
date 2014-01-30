package apps101.cgmapps.starwarssoundboard;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class LukeActivity extends Activity {

	MediaPlayer clip;
	Toast toast;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_luke);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.luke, menu);
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
		case R.id.toschi:
			clip = MediaPlayer.create(this, R.raw.luke_toschi);
			text = "\"But I was going to Toschi Station to pick up some power converters!\"";
			break;
		case R.id.afraid:
			clip = MediaPlayer.create(this, R.raw.luke_afraid);
			text = "\"I'm not afraid.\"";
			break;
		case R.id.becomejedi:
			clip = MediaPlayer.create(this, R.raw.luke_becomejedi);
			text = "\"I want to learn the ways of The Force and become a Jedi like my father.\"";
			break;
		case R.id.callmeluke:
			clip = MediaPlayer.create(this, R.raw.luke_callmeluke);
			text = "\"You can call me Luke.\"";
			break;
		case R.id.glad:
			clip = MediaPlayer.create(this, R.raw.luke_glad);
			text = "\"Boy, am I glad to see you.\"";
			break;
		case R.id.junk:
			clip = MediaPlayer.create(this, R.raw.luke_junk);
			text = "\"What a piece of junk!\"";
			break;
		case R.id.neverturn:
			clip = MediaPlayer.create(this, R.raw.luke_neverturn);
			text = "\"I\'ll never turn to the dark side.\"";
			break;
		case R.id.planet:
			clip = MediaPlayer.create(this, R.raw.luke_planet);
			text = "\"That\'s okay, I\'m never coming back to this planet again.\"";
			break;
		case R.id.rebellion:
			clip = MediaPlayer.create(this, R.raw.luke_rebellion);
			text = "\"You know of the rebellion against the Empire?\"";
			break;
		case R.id.taste:
			clip = MediaPlayer.create(this, R.raw.luke_taste);
			text = "\"You\'re lucky you don\'t taste very good!\"";
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
