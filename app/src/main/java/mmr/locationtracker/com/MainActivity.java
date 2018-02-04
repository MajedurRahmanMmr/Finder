package mmr.locationtracker.com;

import android.location.Location;

import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.location.LocationRequest;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import mmr.finder.com.FinderLocationAppCompatActivity;
import mmr.finder.com.FinderLocationRequest;
import mmr.finder.com.FinderRequestBuilder;

public class MainActivity extends FinderLocationAppCompatActivity {
    @BindView(R.id.requestSingleLocationButton)
    CardView requestSingleLocationButton;
    @BindView(R.id.requestLocationUpdatesButton)
    CardView requestLocationUpdatesButton;
    @BindView(R.id.stopLocationUpdatesButton)
    CardView stopLocationUpdatesButton;

    @BindView(R.id.latitudeTV)
    TextView latitudeTextview;

    @BindView(R.id.longitudeTV)
    TextView longitudeTv;

    private Unbinder unbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        unbinder = ButterKnife.bind(this);
    }

    @Override
    public void onLocationPermissionGranted() {
        showToast("Location permission granted");
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();



    }

    @Override
    public void onLocationPermissionDenied() {
        showToast("Location permission denied");
    }

    @Override
    public void onLocationReceived(Location location) {
        showToast(" Your Location is : "+ location.getLatitude() + " , " + location.getLongitude());

        longitudeTv.setText("Longitude : "+location.getLongitude() +"  \n Speed : "+ location.getSpeed() +" km/h");
        latitudeTextview.setText("Latitude : " + location.getLatitude());
    }

    @Override
    public void noLocationReceived() {
        showToast("No location received");
    }

    @Override
    public void onLocationProviderEnabled() {
        showToast("Location services are now ON");
    }

    @Override
    public void onLocationProviderDisabled() {
        showToast("Location services are still Off");
    }

    @OnClick({R.id.requestSingleLocationButton, R.id.requestLocationUpdatesButton, R.id.stopLocationUpdatesButton})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.requestSingleLocationButton: {
                LocationRequest locationRequest = new LocationRequest()
                        .setPriority(LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY)
                        .setInterval(5000)
                        .setFastestInterval(5000);
                FinderLocationRequest finderLocationRequest = new FinderRequestBuilder()
                        .setLocationRequest(locationRequest)
                        .setFallBackToLastLocationTime(3000)
                        .build();
                requestSingleLocationFix(finderLocationRequest);
            }
            break;
            case R.id.requestLocationUpdatesButton: {
                LocationRequest locationRequest = new LocationRequest()
                        .setPriority(LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY)
                        .setInterval(5000)
                        .setFastestInterval(5000);
                FinderLocationRequest finderLocationRequest = new FinderRequestBuilder()
                        .setLocationRequest(locationRequest)
                        .setFallBackToLastLocationTime(3000)
                        .build();
                requestLocationUpdates(finderLocationRequest);
            }
            break;
            case R.id.stopLocationUpdatesButton:
                stopLocationUpdates();
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }
}