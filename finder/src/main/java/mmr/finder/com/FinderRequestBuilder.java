package mmr.finder.com;

import com.google.android.gms.location.LocationRequest;

public class FinderRequestBuilder {
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

    public FinderRequestBuilder setLocationRequest(LocationRequest locationRequest) {
        this.locationRequest = locationRequest;
        return this;
    }

    public FinderRequestBuilder setLocationSettingsDialogTitle(String locationSettingsDialogTitle) {
        this.locationSettingsDialogTitle = locationSettingsDialogTitle;
        return this;
    }

    public FinderRequestBuilder setLocationSettingsDialogMessage(String locationSettingsDialogMessage) {
        this.locationSettingsDialogMessage = locationSettingsDialogMessage;
        return this;
    }

    public FinderRequestBuilder setLocationSettingsDialogPositiveButtonText(String locationSettingsDialogPositiveButtonText) {
        this.locationSettingsDialogPositiveButtonText = locationSettingsDialogPositiveButtonText;
        return this;
    }

    public FinderRequestBuilder setLocationSettingsDialogNegativeButtonText(String locationSettingsDialogNegativeButtonText) {
        this.locationSettingsDialogNegativeButtonText = locationSettingsDialogNegativeButtonText;
        return this;
    }

    public FinderRequestBuilder setLocationPermissionDialogTitle(String locationPermissionDialogTitle) {
        this.locationPermissionDialogTitle = locationPermissionDialogTitle;
        return this;
    }

    public FinderRequestBuilder setLocationPermissionDialogMessage(String locationPermissionDialogMessage) {
        this.locationPermissionDialogMessage = locationPermissionDialogMessage;
        return this;
    }

    public FinderRequestBuilder setLocationPermissionDialogPositiveButtonText(String locationPermissionDialogPositiveButtonText) {
        this.locationPermissionDialogPositiveButtonText = locationPermissionDialogPositiveButtonText;
        return this;
    }

    public FinderRequestBuilder setLocationPermissionDialogNegativeButtonText(String locationPermissionDialogNegativeButtonText) {
        this.locationPermissionDialogNegativeButtonText = locationPermissionDialogNegativeButtonText;
        return this;
    }

    public FinderRequestBuilder setFallBackToLastLocationTime(long fallBackToLastLocationTime) {
        this.fallBackToLastLocationTime = fallBackToLastLocationTime;
        return this;
    }


    public FinderLocationRequest build() {
        return new FinderLocationRequest(locationRequest, locationSettingsDialogTitle, locationSettingsDialogMessage, locationSettingsDialogPositiveButtonText, locationSettingsDialogNegativeButtonText, locationPermissionDialogTitle, locationPermissionDialogMessage, locationPermissionDialogPositiveButtonText, locationPermissionDialogNegativeButtonText, fallBackToLastLocationTime);
    }
}