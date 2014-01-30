package apps101.cgmapps.starwarssoundboard;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class BenActivity extends Activity {

	MediaPlayer clip;
	Toast toast;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ben);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ben, menu);
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
		case R.id.always:
			clip = MediaPlayer.create(this, R.raw.ben_always);
			text = "\"The Force will be with you, always.\"";
			break;
		case R.id.disturbance:
			clip = MediaPlayer.create(this, R.raw.ben_disturbance);
			text = "\"I felt a great disturbance in The Force.\"";
			break;
		case R.id.dontbeafraid:
			clip = MediaPlayer.create(this, R.raw.ben_dontbeafraid);
			text = "\"Come here, little one. Don\'t be afraid.\"";
			break;
		case R.id.eyes:
			clip = MediaPlayer.create(this, R.raw.ben_eyes);
			text = "\"Your eyes can deceive you. Don\'t trust them.\"";
			break;
		case R.id.feel:
			clip = MediaPlayer.create(this, R.raw.ben_feel);
			text = "\"You must do what you feel is right, of course.\"";
			break;
		case R.id.foolish:
			clip = MediaPlayer.create(this, R.raw.ben_foolish);
			text = "\"Who is the more foolish, the fool, or the fool who follows him?\"";
			break;
		case R.id.forceluke:
			clip = MediaPlayer.create(this, R.raw.ben_forceluke);
			text = "\"Use The Force, Luke.\"";
			break;
		case R.id.luck:
			clip = MediaPlayer.create(this, R.raw.ben_luck);
			text = "\"In my experience, there\'s no such thing as luck.\"";
			break;
		case R.id.nomoon:
			clip = MediaPlayer.create(this, R.raw.ben_nomoon);
			text = "\"That\'s no moon. It\'s a space station.\"";
			break;
		case R.id.seduced:
			clip = MediaPlayer.create(this, R.raw.ben_seduced);
			text = "\"Vader was seduced by the Dark Side of The Force.\"";
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
