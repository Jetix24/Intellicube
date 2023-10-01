package com.example.intellicube;

import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PolloIncubadoraFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PolloIncubadoraFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    View vista;
    LinearLayout button_detener, button_desconectar;
    Button  button_reiniciar;

    TextView textView_titulo, textView_temperatura, textView_humedad;

    ImageView imagen;

    String titulo, temperatura, humedad;

    int seleccion;

    public PolloIncubadoraFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PolloIncubadoraFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PolloIncubadoraFragment newInstance(String param1, String param2) {
        PolloIncubadoraFragment fragment = new PolloIncubadoraFragment();
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
        vista = inflater.inflate(R.layout.fragment_pollo_incubadora, container, false);

        titulo = SeleccionFragment.seleccion_texto;
        temperatura = IncubadoraFragment.conexion_temperatura;
        humedad= IncubadoraFragment.conexion_humedad;

        imagen = vista.findViewById(R.id.imageView_Incubadora);
        textView_titulo = vista.findViewById(R.id.textView_Incubadora);
        textView_temperatura = vista.findViewById(R.id.textView_tempIncubadora);
        textView_humedad = vista.findViewById(R.id.textView_humedadIncubadora);
        button_detener = vista.findViewById(R.id.button_revisar);
        button_reiniciar = vista.findViewById(R.id.button_reiniciarPollo);
        button_desconectar = vista.findViewById(R.id.button_desconectarPollo);

        textView_titulo.setText(titulo);
        textView_temperatura.setText(temperatura);
        textView_humedad.setText(humedad);
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) imagen.getLayoutParams();

        if(titulo.equals("Pollo")){
            imagen.setImageResource(R.drawable.pollo);
            imagen.getLayoutParams().width = ViewGroup.LayoutParams.WRAP_CONTENT;
            imagen.getLayoutParams().height = ViewGroup.LayoutParams.WRAP_CONTENT;
        }else if (titulo.equals("Codorniz")){
            imagen.setImageResource(R.drawable.codorniz);
            imagen.getLayoutParams().width = 500;
            imagen.getLayoutParams().height = 500;
            layoutParams.setMargins(40,120,40,0);
        }else if (titulo.equals("Pato")){
            imagen.setImageResource(R.drawable.pato);
            imagen.getLayoutParams().width = ViewGroup.LayoutParams.WRAP_CONTENT;
            imagen.getLayoutParams().height = ViewGroup.LayoutParams.WRAP_CONTENT;
            layoutParams.setMargins(40,120,40,0);
        }

        button_desconectar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        return vista;
    }



}