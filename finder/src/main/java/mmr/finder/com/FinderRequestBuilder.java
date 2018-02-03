package mmr.finder.com;

import mmr.finder.com.EasyLocationRequest;
import com.google.android.gms.location.LocationRequest;

public class EasyLocationRequestBuilder {
    private LocationRequest locationRequest;
    private String locationSettingsDialogTitle;
    private String locationSettingsDialogMessage;
    private String locationSettingsDialogPositiveButtonText;
    private String locationSettingsDialogNegativeButtonText;
    private String locationPermissionDialogTitle;
    private String locationPermissionDialogMessage;
    private String locationPermissionDialogPositiveButtonText;
    private String locationPermissionDialogNegativeButtonText;
    private long fallBackToLastLocationTime;

    public mmr.finder.com.EasyLocationRequestBuilder setLocationRequest(LocationRequest locationRequest) {
        this.locationRequest = locationRequest;
        return this;
    }

    public mmr.finder.com.EasyLocationRequestBuilder setLocationSettingsDialogTitle(String locationSettingsDialogTitle) {
        this.locationSettingsDialogTitle = locationSettingsDialogTitle;
        return this;
    }

    public mmr.finder.com.EasyLocationRequestBuilder setLocationSettingsDialogMessage(String locationSettingsDialogMessage) {
        this.locationSettingsDialogMessage = locationSettingsDialogMessage;
        return this;
    }

    public mmr.finder.com.EasyLocationRequestBuilder setLocationSettingsDialogPositiveButtonText(String locationSettingsDialogPositiveButtonText) {
        this.locationSettingsDialogPositiveButtonText = locationSettingsDialogPositiveButtonText;
        return this;
    }

    public mmr.finder.com.EasyLocationRequestBuilder setLocationSettingsDialogNegativeButtonText(String locationSettingsDialogNegativeButtonText) {
        this.locationSettingsDialogNegativeButtonText = locationSettingsDialogNegativeButtonText;
        return this;
    }

    public mmr.finder.com.EasyLocationRequestBuilder setLocationPermissionDialogTitle(String locationPermissionDialogTitle) {
        this.locationPermissionDialogTitle = locationPermissionDialogTitle;
        return this;
    }

    public mmr.finder.com.EasyLocationRequestBuilder setLocationPermissionDialogMessage(String locationPermissionDialogMessage) {
        this.locationPermissionDialogMessage = locationPermissionDialogMessage;
        return this;
    }

    public mmr.finder.com.EasyLocationRequestBuilder setLocationPermissionDialogPositiveButtonText(String locationPermissionDialogPositiveButtonText) {
        this.locationPermissionDialogPositiveButtonText = locationPermissionDialogPositiveButtonText;
        return this;
    }

    public mmr.finder.com.EasyLocationRequestBuilder setLocationPermissionDialogNegativeButtonText(String locationPermissionDialogNegativeButtonText) {
        this.locationPermissionDialogNegativeButtonText = locationPermissionDialogNegativeButtonText;
        return this;
    }

    public mmr.finder.com.EasyLocationRequestBuilder setFallBackToLastLocationTime(long fallBackToLastLocationTime) {
        this.fallBackToLastLocationTime = fallBackToLastLocationTime;
        return this;
    }


    public mmr.finder.com.EasyLocationRequest build() {
        return new EasyLocationRequest(locationRequest, locationSettingsDialogTitle, locationSettingsDialogMessage, locationSettingsDialogPositiveButtonText, locationSettingsDialogNegativeButtonText, locationPermissionDialogTitle, locationPermissionDialogMessage, locationPermissionDialogPositiveButtonText, locationPermissionDialogNegativeButtonText, fallBackToLastLocationTime);
    }
}