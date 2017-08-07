package cl.mind.smartmedicine;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.R.attr.button;


/**
 * A simple {@link Fragment} subclass.
 */
public class PatientFragment extends Fragment {

    private TextView patientTV, lastNameTV, ageTV, drugNameTV;



    public static PatientFragment newInstance() {

        return new PatientFragment();

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_patient, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        patientTV = view.findViewById(R.id.namePatientEt);
        lastNameTV = view.findViewById(R.id.lastNamePatientEt);
        ageTV = view.findViewById(R.id.agePatientEt);

        Button showInfo = view.findViewById(R.id.savePatientInfoBtn);

        showInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String patient = patientTV.getText().toString();
                patientTV.setText("Nombre Paciente " +patient);
                String lName = lastNameTV.getText().toString();
                lastNameTV.setText("Apellido Paciente " +lName);
                String age = ageTV.getText().toString();
                ageTV.setText("Edad Paciente " +age);



            }
        });

    }


}
