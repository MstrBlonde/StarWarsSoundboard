package apps101.cgmapps.starwarssoundboard;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	MediaPlayer maintitle;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	protected void onResume() {
		maintitle = MediaPlayer.create(this, R.raw.sw_music);
		maintitle.start();
		super.onResume();
	}

	@Override
	protected void onPause() {
		maintitle.stop();
		maintitle.release();
		super.onPause();
	}

	public void goToMenu(View v) {
		if( this.maintitle != null ) {
			this.maintitle.stop();
			//this.maintitle.release();
			//this.maintitle = null;
		}
		MediaPlayer breath = MediaPlayer.create(this, R.raw.vbreath);

		breath.setOnCompletionListener(new OnCompletionListener() {

			@Override
			public void onCompletion(MediaPlayer breath) {
				// TODO Auto-generated method stub
				goMenu();
			}
		});
		
		breath.start();

	}

	public void goMenu() {
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setClass(this, MenuActivity.class);
		startActivity(i);
	}

}
