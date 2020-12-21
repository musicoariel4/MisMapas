package com.musicoariel4.mismapas;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity2 extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps2);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(6.25684379603718 ,-75.59049606090413);
        // mMap.setMinZoomPreference(6.0f);
        //  mMap.setMaxZoomPreference(14.0f);
        mMap.getUiSettings().setZoomControlsEnabled(false);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Estadio Atanacio Girardot").anchor(0.3f, 0.3f));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney,17));

    }
}