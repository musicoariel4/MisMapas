package com.musicoariel4.mismapas;

import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
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
        LatLng sydney = new LatLng(6.230304632156133 ,-75.57680368412548);
       // mMap.setMinZoomPreference(6.0f);
      //  mMap.setMaxZoomPreference(14.0f);
        mMap.getUiSettings().setZoomControlsEnabled(false);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Estacion Industriales").anchor(0.3f, 0.3f));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney,17));

    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event){

        if(keyCode == KeyEvent.KEYCODE_BACK){
            Intent intent2 = new Intent(this,MainActivity.class);
            startActivity(intent2);
        }
        return super.onKeyDown(keyCode,event);
    }
}