package mmr.finder.com;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;


public abstract class FinderLocationAppCompatActivity extends AppCompatActivity implements FinderLocationListener {
    private FinderLocationDelegate finderLocationDelegate;

    protected Location getLastKnownLocation() {
        return finderLocationDelegate.getLastKnownLocation();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        finderLocationDelegate = new FinderLocationDelegate(this,this);
        finderLocationDelegate.onCreate();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        finderLocationDelegate.onActivityResult(requestCode);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        finderLocationDelegate.onRequestPermissionsResult(requestCode, grantResults);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        finderLocationDelegate.onDestroy();
    }

    protected void requestLocationUpdates(FinderLocationRequest finderLocationRequest) {
        finderLocationDelegate.requestLocationUpdates(finderLocationRequest);
    }


    protected void requestSingleLocationFix(FinderLocationRequest finderLocationRequest) {
        finderLocationDelegate.requestSingleLocationFix(finderLocationRequest);
    }

    protected void stopLocationUpdates() {
        finderLocationDelegate.stopLocationUpdates();
    }
}