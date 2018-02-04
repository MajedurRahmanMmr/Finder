package mmr.finder.com;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;

class LocationBroadcastReceiver extends BroadcastReceiver {
    private final FinderLocationListener finderLocationListener;

    public LocationBroadcastReceiver(FinderLocationListener finderLocationListener) {
        this.finderLocationListener = finderLocationListener;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(AppConstants.INTENT_LOCATION_RECEIVED)) {
            Location location = intent.getParcelableExtra(IntentKey.LOCATION);
            finderLocationListener.onLocationReceived(location);
        } else if (AppConstants.INTENT_NO_LOCATION_RECEIVED.equals(intent.getAction())) {
            finderLocationListener.noLocationReceived();
        }
    }
}