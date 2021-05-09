package com.example.myapplication;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

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

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        //Size Marker
        int tinggi = 120;
        int lebar = 90;
        BitmapDrawable bitmapEl = (BitmapDrawable)getResources().getDrawable(R.drawable.pin_el);
        Bitmap el = bitmapEl.getBitmap();
        Bitmap marker_El = Bitmap.createScaledBitmap(el, lebar, tinggi, false);

        BitmapDrawable bitmapSPBU = (BitmapDrawable)getResources().getDrawable(R.drawable.pin_spbu);
        Bitmap spbu = bitmapSPBU.getBitmap();
        Bitmap marker_SPBU = Bitmap.createScaledBitmap(spbu, lebar,tinggi,false);

        //Lokasi Saya (Eldridge Lianto_F55118057)
        LatLng user_El = new LatLng(-0.735966, 119.863245);
        mMap.addMarker(new MarkerOptions().position(user_El).title("Eldridge Lianto_F55118057")
                .snippet ("Lokasi Eldridge Lianto_F55118057")
                .icon(BitmapDescriptorFactory.fromBitmap(marker_El)));

        //SPBU Kayumalue
        LatLng SPBU_Kayumalue = new LatLng(-0.7438502627699846, 119.86364674658383);
        mMap.addMarker(new MarkerOptions().position(SPBU_Kayumalue).title("SPBU Kayumalue")
                .icon(BitmapDescriptorFactory.fromBitmap(marker_SPBU)));

        //SPBU Mamboro
        LatLng SPBU_Mamboro = new LatLng(-0.8084969119120053, 119.87840160683636);
        mMap.addMarker(new MarkerOptions().position(SPBU_Mamboro).title("SPBU Mamboro")
                .icon(BitmapDescriptorFactory.fromBitmap(marker_SPBU)));

        //SPBU Soekarno Hatta
        LatLng SPBU_SHatta = new LatLng(-0.8476990645395701, 119.89136799432787);
        mMap.addMarker(new MarkerOptions().position(SPBU_SHatta).title("SPBU Soekarno Hatta")
                .icon(BitmapDescriptorFactory.fromBitmap(marker_SPBU)));

        //SPBU Tondo
        LatLng SPBU_Tondo = new LatLng(-0.8606366029679084, 119.88123997363385);
        mMap.addMarker(new MarkerOptions().position(SPBU_Tondo).title("SPBU Tondo")
                .icon(BitmapDescriptorFactory.fromBitmap(marker_SPBU)));

        //SPBU Talise
        LatLng SPBU_Talise = new LatLng(-0.8741104769778001, 119.87482412944671);
        mMap.addMarker(new MarkerOptions().position(SPBU_Talise).title("SPBU Talise")
                .icon(BitmapDescriptorFactory.fromBitmap(marker_SPBU)));

        //SPBU Sigma
        LatLng SPBU_Sigma = new LatLng(-0.8929391478451719, 119.88595788294415);
        mMap.addMarker(new MarkerOptions().position(SPBU_Sigma).title("SPBU Sisingamangaraja")
                .icon(BitmapDescriptorFactory.fromBitmap(marker_SPBU)));

        //SPBU Pramuka
        LatLng SPBU_Pramuka = new LatLng(-0.8926816869121792, 119.86831967690937);
        mMap.addMarker(new MarkerOptions().position(SPBU_Pramuka).title("SPBU Pramuka")
                .icon(BitmapDescriptorFactory.fromBitmap(marker_SPBU)));

        //SPBU Kartini
        LatLng SPBU_Kartini = new LatLng(-0.9004913232416577, 119.87952058112707);
        mMap.addMarker(new MarkerOptions().position(SPBU_Kartini).title("SPBU Kartini")
                .icon(BitmapDescriptorFactory.fromBitmap(marker_SPBU)));

        //SPBU Maluku
        LatLng SPBU_Maluku = new LatLng(-0.9050826949743277, 119.87299744944397);
        mMap.addMarker(new MarkerOptions().position(SPBU_Maluku).title("SPBU Maluku")
                .icon(BitmapDescriptorFactory.fromBitmap(marker_SPBU)));

        //SPBU Muhammad Yamin
        LatLng SPBU_MYamin = new LatLng(-0.9080005732356062, 119.8902494174945);
        mMap.addMarker(new MarkerOptions().position(SPBU_MYamin).title("SPBU Muhammad Yamin")
                .icon(BitmapDescriptorFactory.fromBitmap(marker_SPBU)));

        //SPBU Towua
        LatLng SPBU_Towua = new LatLng(-0.9194575131618082, 119.87771813793863);
        mMap.addMarker(new MarkerOptions().position(SPBU_Towua).title("SPBU Towua")
                .icon(BitmapDescriptorFactory.fromBitmap(marker_SPBU)));

        //SPBU Sis Aljufri
        LatLng SPBU_Aljufri = new LatLng(-0.905461540406123, 119.85739918884522);
        mMap.addMarker(new MarkerOptions().position(SPBU_Aljufri).title("SPBU Sis Aljufri")
                .icon(BitmapDescriptorFactory.fromBitmap(marker_SPBU)));

        //SPBU Imam Bonjol
        LatLng SPBU_IBonjol = new LatLng(-0.893216970482703, 119.85584104761229);
        mMap.addMarker(new MarkerOptions().position(SPBU_IBonjol).title("SPBU Imam Bonjol")
                .icon(BitmapDescriptorFactory.fromBitmap(marker_SPBU)));

        //SPBU Diponegoro
        LatLng SPBU_Ponegoro = new LatLng(-0.8860777318610693, 119.8470251466988);
        mMap.addMarker(new MarkerOptions().position(SPBU_Ponegoro).title("SPBU Diponegoro")
                .icon(BitmapDescriptorFactory.fromBitmap(marker_SPBU)));

        //SPBU Tavanjuka
        LatLng SPBU_Tavanjuka = new LatLng(-0.9186044641540901, 119.86299584909953);
        mMap.addMarker(new MarkerOptions().position(SPBU_Tavanjuka).title("SPBU Tavanjuka")
                .icon(BitmapDescriptorFactory.fromBitmap(marker_SPBU)));

        //SPBU Dewi Sartika
        LatLng SPBU_Destik = new LatLng(-0.9409586454745802, 119.90120943188268);
        mMap.addMarker(new MarkerOptions().position(SPBU_Destik).title("SPBU Dewi Sartika")
                .icon(BitmapDescriptorFactory.fromBitmap(marker_SPBU)));

        //Jalur Lokasi User (Eldridge Lianto_F55118057) -> SPBU Terdekat (SPBU Kayumalue)
        mMap.addPolyline(new PolylineOptions().add(
                user_El,
                new LatLng(-0.735966, 119.863245),
                new LatLng(-0.735985, 119.863113),
                new LatLng(-0.739202, 119.863284),
                new LatLng(-0.741093, 119.863496),
                new LatLng(-0.743888, 119.863910),
                SPBU_Kayumalue).width(15).color(Color.MAGENTA));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(user_El,13f));
    }
}