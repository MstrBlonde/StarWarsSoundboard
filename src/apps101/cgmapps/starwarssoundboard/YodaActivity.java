package apps101.cgmapps.starwarssoundboard;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class YodaActivity extends Activity {

	MediaPlayer clip;
	Toast toast;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_yoda);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.yoda, menu);
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
		case R.id.ninehundredyears:
			clip = MediaPlayer.create(this, R.raw.yoda_900years);
			text = "\"When 900 years old you reach, look as good you will not, hmm?\"";
			break;
		case R.id.beware:
			clip = MediaPlayer.create(this, R.raw.yoda_beware);
			text = "\"Beware of the Dark Side.\"";
			break;
		case R.id.big:
			clip = MediaPlayer.create(this, R.raw.yoda_big);
			text = "\"How you get so big eating food of this kind?\"";
			break;
		case R.id.confront:
			clip = MediaPlayer.create(this, R.raw.yoda_confront);
			text = "\"You must confront Vader.\"";
			break;
		case R.id.difficult:
			clip = MediaPlayer.create(this, R.raw.yoda_difficult);
			text = "\"Difficult to see, always in motion is the future.\"";
			break;
		case R.id.harm:
			clip = MediaPlayer.create(this, R.raw.yoda_harm);
			text = "\"I mean you no harm.\"";
			break;
		case R.id.hear:
			clip = MediaPlayer.create(this, R.raw.yoda_hear);
			text = "\"Hear you nothing that I say?\"";
			break;
		case R.id.help:
			clip = MediaPlayer.create(this, R.raw.yoda_help);
			text = "\"Help you I can, yes, hmm?\"";
			break;
		case R.id.last:
			clip = MediaPlayer.create(this, R.raw.yoda_last);
			text = "\"The last of the Jedi will you be.\"";
			break;
		case R.id.laugh:
			clip = MediaPlayer.create(this, R.raw.yoda_laugh);
			text = "[Laugh]";
			break;
		case R.id.nonono:
			clip = MediaPlayer.create(this, R.raw.yoda_nonono);
			text = "\"No, no no!\"";
			break;
		case R.id.seek:
			clip = MediaPlayer.create(this, R.raw.yoda_seek);
			text = "\"Yoda, you seek Yoda!\"";
			break;
		case R.id.strong:
			clip = MediaPlayer.create(this, R.raw.yoda_strong);
			text = "\"Strong am I with The Force.\"";
			break;
		case R.id.tryy:
			clip = MediaPlayer.create(this, R.raw.yoda_try);
			text = "\"Do, or do not. There is no try.\"";
			break;
		case R.id.underestimate:
			clip = MediaPlayer.create(this, R.raw.yoda_underestimate);
			text = "\"Do not underestimate the powers of the Emperor.\"";
			break;
		case R.id.wondering:
			clip = MediaPlayer.create(this, R.raw.yoda_wondering);
			text = "\"I am wondering, why are you here?\"";
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
