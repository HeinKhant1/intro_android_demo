package codepath.apps.demointroandroid;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;

public class BasicTextViewActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_basic_text_view);
		Log.d("DEBUG", "onCreate was just called!");
		AppCenter.start(getApplication(), "be77fb56-6600-4d00-97be-31282bcfbbd0",
                 Analytics.class, Crashes.class);
	}
	
	protected void onResume() {
		super.onResume();
		Log.d("DEBUG", "onResume was just called!");
	}
	
	protected void onPause() {
		super.onPause();
		Log.d("DEBUG", "onPause was just called!");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_basic_text_view, menu);
		return true;
	}

}
