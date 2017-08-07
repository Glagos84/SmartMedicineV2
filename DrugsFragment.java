package cl.mind.smartmedicine;


import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class DrugsFragment extends Fragment {


    public static DrugsFragment newInstance() {

        return new DrugsFragment();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_drugs, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // porq no me pide q lo castee?? en le video lo estaba casteando;

        final EditText drug = view.findViewById(R.id.drugNameEt);
        final RadioGroup radioGroup = view.findViewById(R.id.drugsRg);
        Button button = view.findViewById(R.id.drugBtn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //String drugs = drug.getText().toString();

                int id = radioGroup.getCheckedRadioButtonId();



                if (id != -1) {

                    RadioButton radiobutton = radioGroup.findViewById(id);
                    String answer = radiobutton.getText().toString();
                    showDialog(answer);

                } else {

                    Toast.makeText(getContext(), "DEBES MARCAR UNA OPCION", Toast.LENGTH_SHORT).show();

                }


            }
        });

    }

    private void showDialog(String answer) {

        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(getActivity());
        alertDialog.setTitle("Medicación Diaria");
        alertDialog.setMessage(new PartyResult(answer).optionSelected()); /* llamo las clases que cree para el answer y el result, ESTO
         ES LO IMPORTANTE esto me va a mostrar el resultado procesado.*/
        alertDialog.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {

                dialog.dismiss();
            }
        });


        alertDialog.show();

    }

}
