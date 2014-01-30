package apps101.cgmapps.starwarssoundboard;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class C3POActivity extends Activity {

	MediaPlayer clip;
	Toast toast;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_c3po);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.c3po, menu);
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
		case R.id.against:
			clip = MediaPlayer.create(this, R.raw.c3po_against);
			text = "\"It\'s against my programming to impersonate a deity.\"";
			break;
		case R.id.allsystems:
			clip = MediaPlayer.create(this, R.raw.c3po_allsystems);
			text = "\"All systems have been alerted to your presence, sir.\"";
			break;
		case R.id.boring:
			clip = MediaPlayer.create(this, R.raw.c3po_boring);
			text = "\"You wouldn\'t want my life to get boring, would you?\"";
			break;
		case R.id.desolate:
			clip = MediaPlayer.create(this, R.raw.c3po_desolate);
			text = "\"What a desolate place this is.\"";
			break;
		case R.id.hellosir:
			clip = MediaPlayer.create(this, R.raw.c3po_hellosir);
			text = "\"Hello sir. I am C-3PO, human-cyborg relations.\"";
			break;
		case R.id.language:
			clip = MediaPlayer.create(this, R.raw.c3po_language);
			text = "\"You watch your language.\"";
			break;
		case R.id.madmen:
			clip = MediaPlayer.create(this, R.raw.c3po_madmen);
			text = "\"They\'re madmen! They\'re heading for the prison level! If you hurry, you might catch them!\"";
			break;
		case R.id.regretthis:
			clip = MediaPlayer.create(this, R.raw.c3po_regretthis);
			text = "\"I\'m going to regret this.\"";
			break;
		case R.id.safe:
			clip = MediaPlayer.create(this, R.raw.c3po_safe);
			text = "\"Are you sure this thing is safe?\"";
			break;
		case R.id.suffer:
			clip = MediaPlayer.create(this, R.raw.c3po_suffer);
			text = "\"We seem to be made to suffer. It\'s our lot in life.\"";
			break;
		case R.id.technical:
			clip = MediaPlayer.create(this, R.raw.c3po_technical);
			text = "\"Don\'t get technical with me.\"";
			break;
		case R.id.terminated:
			clip = MediaPlayer.create(this, R.raw.c3po_terminated);
			text = "\"I\'m afraid she\'s scheduled to be terminated.\"";
			break;
		case R.id.whereareyou:
			clip = MediaPlayer.create(this, R.raw.c3po_whereareyou);
			text = "\"R2-D2, where are you?\"";
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
