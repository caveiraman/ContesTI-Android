package info.androidhive.materialdesign.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import info.androidhive.materialdesign.R;


public class PerfilFragment extends Fragment {

    public PerfilFragment() {
        // Required empty public constructor
    }


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_perfil, container, false);


        // Inflate the layout for this fragment
        return rootView;
    }


    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }


    public void onDetach() {
        super.onDetach();
    }
}
