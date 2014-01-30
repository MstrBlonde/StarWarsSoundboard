package apps101.cgmapps.starwarssoundboard;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class R2Activity extends Activity {

	MediaPlayer clip;
	Toast toast;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_r2);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.r2, menu);
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
		case R.id.chatter:
			clip = MediaPlayer.create(this, R.raw.r2_chatter);
			text = "[Random chatter]";
			break;
		case R.id.eureka:
			clip = MediaPlayer.create(this, R.raw.r2_eureka);
			text = "[Discovery beeps]";
			break;
		case R.id.excited:
			clip = MediaPlayer.create(this, R.raw.r2_excited);
			text = "[Excited beeps]";
			break;
		case R.id.laughing:
			clip = MediaPlayer.create(this, R.raw.r2_laughing);
			text = "[Laughing beeps]";
			break;
		case R.id.panic:
			clip = MediaPlayer.create(this, R.raw.r2_panic);
			text = "[Panicky beeps]";
			break;
		case R.id.playful:
			clip = MediaPlayer.create(this, R.raw.r2_playful);
			text = "[Playful beeps]";
			break;
		case R.id.sad:
			clip = MediaPlayer.create(this, R.raw.r2_sad);
			text = "[Sad beeps]";
			break;
		case R.id.sassy:
			clip = MediaPlayer.create(this, R.raw.r2_sassy);
			text = "[Sassy beeps]";
			break;
		case R.id.shocked:
			clip = MediaPlayer.create(this, R.raw.r2_shocked);
			text = "[Shocked beeps]";
			break;
		case R.id.snappy:
			clip = MediaPlayer.create(this, R.raw.r2_snappy);
			text = "[Snappy beeps]";
			break;
		case R.id.surprised:
			clip = MediaPlayer.create(this, R.raw.r2_surprised);
			text = "[Surprised beeps]";
			break;
		case R.id.unbelievable:
			clip = MediaPlayer.create(this, R.raw.r2_unbelievable);
			text = "[Unbelieving beeps]";
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
