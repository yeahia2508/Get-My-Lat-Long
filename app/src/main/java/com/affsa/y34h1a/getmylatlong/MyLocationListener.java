package com.affsa.y34h1a.getmylatlong;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by y34h1a on 8/11/16.
 */
public class MyLocationListener implements LocationListener {

    @Override
    public void onLocationChanged(Location location) {
        if(location != null)
        {
            Log.i("Lat", "" + location.getLatitude());
            Log.i("Lat", "" + location.getLongitude());
        }
    }

    @Override
    public void onStatusChanged(String s, int i, Bundle bundle) {

    }

    @Override
    public void onProviderEnabled(String s) {

    }

    @Override
    public void onProviderDisabled(String s) {

    }

}