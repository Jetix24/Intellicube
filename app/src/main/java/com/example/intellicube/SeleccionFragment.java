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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SeleccionFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SeleccionFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    LinearLayout button_polloIncubadora, button_codornizIncubadora, button_patoIncubadora;
    Button button_iniciar;
    int seleccion = 0;

    static String seleccion_texto;


    ImageView imageView_Incubadora;

    TextView textView_titulo;

    public SeleccionFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SeleccionFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SeleccionFragment newInstance(String param1, String param2) {
        SeleccionFragment fragment = new SeleccionFragment();
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

        View vista = inflater.inflate(R.layout.fragment_seleccion, container, false);

        FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        button_polloIncubadora = vista.findViewById(R.id.linearLayout_polloIncubadora);
        button_codornizIncubadora = vista.findViewById(R.id.linearLayout_codornizIncubadora);
        button_patoIncubadora = vista.findViewById(R.id.linearLayout_patoIncubadora);
        button_iniciar = vista.findViewById(R.id.button_iniciarIncubadora);
        imageView_Incubadora = vista.findViewById(R.id.imageView_Incubadora);


        button_polloIncubadora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_polloIncubadora.setBackgroundResource(R.drawable.rounded_border_select);
                button_codornizIncubadora.setBackgroundResource(R.drawable.rounded_border);
                button_patoIncubadora.setBackgroundResource(R.drawable.rounded_border);
                seleccion = 1;
                seleccion_texto = "Pollo";
            }
        });
        button_codornizIncubadora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_polloIncubadora.setBackgroundResource(R.drawable.rounded_border);
                button_codornizIncubadora.setBackgroundResource(R.drawable.rounded_border_select);
                button_patoIncubadora.setBackgroundResource(R.drawable.rounded_border);
                seleccion = 2;
                seleccion_texto = "Codorniz";
            }
        });
        button_patoIncubadora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_polloIncubadora.setBackgroundResource(R.drawable.rounded_border);
                button_codornizIncubadora.setBackgroundResource(R.drawable.rounded_border);
                button_patoIncubadora.setBackgroundResource(R.drawable.rounded_border_select);
                seleccion = 3;
                seleccion_texto = "Pato";
            }
        });

        button_iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seleccion >= 1  && seleccion <=3) {
                    Intent intent = new Intent(getContext(), MainActivity2.class);
                    startActivity(intent);
                /*    PolloIncubadoraFragment yourFragment= new PolloIncubadoraFragment(); // Reemplaza "YourFragment" con el nombre de tu fragmento
                    fragmentTransaction.replace(R.id.frameLayout_seleccion, yourFragment);
                    fragmentTransaction.addToBackStack(null); // Para agregar a la pila de retroceso
                    fragmentTransaction.commit();
                else if (seleccion == 2){
                    button_iniciar.setVisibility(View.INVISIBLE);
                    CodornizIncubadoraFragment yourFragment= new CodornizIncubadoraFragment(); // Reemplaza "YourFragment" con el nombre de tu fragmento
                    fragmentTransaction.replace(R.id.frameLayout_seleccion, yourFragment);
                    fragmentTransaction.addToBackStack(null); // Para agregar a la pila de retroceso
                    fragmentTransaction.commit();
                } else if (seleccion == 3) {
                    button_iniciar.setVisibility(View.INVISIBLE);
                    PatoIncubadoraFragment yourFragment= new PatoIncubadoraFragment(); // Reemplaza "YourFragment" con el nombre de tu fragmento
                    fragmentTransaction.replace(R.id.frameLayout_seleccion, yourFragment);
                    fragmentTransaction.addToBackStack(null); // Para agregar a la pila de retroceso
                    fragmentTransaction.commit();*/
                }else{
                    Toast.makeText(requireActivity().getApplicationContext(), "Selecciona una opción ", Toast.LENGTH_LONG).show();
                }
            }
        });


        return vista;
    }
}