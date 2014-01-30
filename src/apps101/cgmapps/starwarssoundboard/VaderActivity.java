package apps101.cgmapps.starwarssoundboard;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class VaderActivity extends Activity {

	MediaPlayer clip;
	Toast toast;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_vader);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.vader, menu);
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
		case R.id.altering:
			clip = MediaPlayer.create(this, R.raw.vader_altering);
			text = "\"I am altering the deal. Pray I don\'t alter it any further.\"";
			break;
		case R.id.asyouwish:
			clip = MediaPlayer.create(this, R.raw.vader_asyouwish);
			text = "\"As you wish.\"";
			break;
		case R.id.bidding:
			clip = MediaPlayer.create(this, R.raw.vader_bidding);
			text = "\"What is thy bidding, my master?\"";
			break;
		case R.id.destroyyou:
			clip = MediaPlayer.create(this, R.raw.vader_destroyyou);
			text = "\"Don\'t make me destroy you.\"";
			break;
		case R.id.dontfail:
			clip = MediaPlayer.create(this, R.raw.vader_dontfail);
			text = "\"Don\'t fail me again.\"";
			break;
		case R.id.dontknoww:
			clip = MediaPlayer.create(this, R.raw.vader_dontknow);
			text = "\"You don\'t know the power of the Dark Side.\"";
			break;
		case R.id.expecting:
			clip = MediaPlayer.create(this, R.raw.vader_expecting);
			text = "\"The Emperor has been expecting you.\"";
			break;
		case R.id.faith:
			clip = MediaPlayer.create(this, R.raw.vader_faith);
			text = "\"I find your lack of faith disturbing.\"";
			break;
		case R.id.father:
			clip = MediaPlayer.create(this, R.raw.vader_father);
			text = "\"No. I am your father.\"";
			break;
		case R.id.giveyourself:
			clip = MediaPlayer.create(this, R.raw.vader_giveyourself);
			text = "\"Give yourself to the Dark Side.\"";
			break;
		case R.id.haveyounow:
			clip = MediaPlayer.create(this, R.raw.vader_haveyounow);
			text = "\"I have you now.\"";
			break;
		case R.id.joinus:
			clip = MediaPlayer.create(this, R.raw.vader_joinus);
			text = "\"We would be honored if you would join us.\"";
			break;
		case R.id.leavethem:
			clip = MediaPlayer.create(this, R.raw.vader_leavethem);
			text = "\"Leave them to me. I will deal with them myself.\"";
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
