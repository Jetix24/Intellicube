package com.example.intellicube;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.intellicube.fragmentsAjustes.AjustesPerfilFragment;
import com.example.intellicube.fragmentsInformacion.CodornizFragmentInformacion;
import com.example.intellicube.fragmentsInformacion.PatoFragmentInformacion;
import com.example.intellicube.ui.HomeActivity;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PerfilFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PerfilFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    Button button_cerrarSesion;
    LinearLayout button_ajustes;
    public PerfilFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PerfilFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PerfilFragment newInstance(String param1, String param2) {
        PerfilFragment fragment = new PerfilFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vista = inflater.inflate(R.layout.fragment_perfil, container, false);

        button_ajustes =  vista.findViewById(R.id.button_ajustesCuenta);
        button_cerrarSesion =  vista.findViewById(R.id.button_cerrarSesion);

        button_ajustes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_ajustes.setVisibility(View.INVISIBLE);
                button_cerrarSesion.setVisibility(View.INVISIBLE);

                FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                AjustesPerfilFragment yourFragment= new AjustesPerfilFragment(); // Reemplaza "YourFragment" con el nombre de tu fragmento
                fragmentTransaction.replace(R.id.frameLayout_perfil , yourFragment);
                fragmentTransaction.addToBackStack(null); // Para agregar a la pila de retroceso
                fragmentTransaction.commit();
            }
        });

        button_cerrarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().finish();
                Intent intent = new Intent(requireActivity().getApplicationContext(), HomeActivity.class);
                startActivity(intent);
            }
        });

        // Inflate the layout for this fragment
        return vista;
    }
}