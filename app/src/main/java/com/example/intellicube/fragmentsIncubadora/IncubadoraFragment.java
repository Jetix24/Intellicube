package com.example.intellicube.fragmentsIncubadora;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.intellicube.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link IncubadoraFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class IncubadoraFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    String titulo= "mi_actividad";

    static String conexion_temperatura , conexion_humedad;

    Button button_revisar;

    LinearLayout button_conectar;


    public IncubadoraFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment IncubadoraFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static IncubadoraFragment newInstance(String param1, String param2) {
        IncubadoraFragment fragment = new IncubadoraFragment();
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
        View vista = inflater.inflate(R.layout.fragment_incubadora, container, false);
        button_conectar =  vista.findViewById(R.id.button_conectar);
        button_revisar = vista.findViewById(R.id.button_revisar);

        button_revisar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        button_conectar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                conexion_temperatura = "10";
                conexion_humedad = "20";
                button_conectar.setVisibility(View.INVISIBLE);
                button_revisar.setVisibility(View.INVISIBLE);
                FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                SeleccionFragment yourFragment= new SeleccionFragment(); // Reemplaza "YourFragment" con el nombre de tu fragmento
                fragmentTransaction.replace(R.id.frameLayout_incubadora, yourFragment);
                fragmentTransaction.addToBackStack(null); // Para agregar a la pila de retroceso
                fragmentTransaction.commit();
            }
        });
        return vista;
    }
}