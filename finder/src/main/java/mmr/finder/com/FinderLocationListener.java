package mmr.finder.com;

import android.location.Location;

interface FinderLocationListener {
    void onLocationPermissionGranted();
    void onLocationPermissionDenied();
    void onLocationReceived(Location location);
    void noLocationReceived();
    void onLocationProviderEnabled();
    void onLocationProviderDisabled();
}