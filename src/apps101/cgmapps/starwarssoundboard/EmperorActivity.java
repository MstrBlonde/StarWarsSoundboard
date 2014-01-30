package apps101.cgmapps.starwarssoundboard;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class EmperorActivity extends Activity {

	MediaPlayer clip;
	Toast toast;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_emperor);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.emperor, menu);
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
		case R.id.skills:
			clip = MediaPlayer.create(this, R.raw.emperor_skills);
			text = "\"Your feeble skills are no match for the power of the dark side.\"";
			break;
		case R.id.anakin:
			clip = MediaPlayer.create(this, R.raw.emperor_anakin);
			text = "\"Anakin.\"";
			break;
		case R.id.become:
			clip = MediaPlayer.create(this, R.raw.emperor_become);
			text = "\"Become my apprentice.\"";
			break;
		case R.id.doit:
			clip = MediaPlayer.create(this, R.raw.emperor_doit);
			text = "\"Do it.\"";
			break;
		case R.id.forcestrong:
			clip = MediaPlayer.create(this, R.raw.emperor_forcestrong);
			text = "\"The Force is strong with you.\"";
			break;
		case R.id.fulfilling:
			clip = MediaPlayer.create(this, R.raw.emperor_fulfilling);
			text = "\"You\'re fulfilling your destiny.\"";
			break;
		case R.id.good:
			clip = MediaPlayer.create(this, R.raw.emperor_good);
			text = "\"Gooood.\"";
			break;
		case R.id.killhimnow:
			clip = MediaPlayer.create(this, R.raw.emperor_killhimnow);
			text = "\"Kill him now.\"";
			break;
		case R.id.senate:
			clip = MediaPlayer.create(this, R.raw.emperor_senate);
			text = "\"I am the Senate.\"";
			break;
		case R.id.threatening:
			clip = MediaPlayer.create(this, R.raw.emperor_threatening);
			text = "\"Are you threatening me?\"";
			break;
		case R.id.youdidwell:
			clip = MediaPlayer.create(this, R.raw.emperor_youdidwell);
			text = "\"You did well.\"";
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
