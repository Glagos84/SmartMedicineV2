package cl.mind.smartmedicine;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MedicFragment extends Fragment {


    public static MedicFragment newInstance() {

        return new MedicFragment();

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_medic, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final Button sendInfoDoc = view.findViewById(R.id.sendInfoDocBtn);
        final TextView namePro = view.findViewById(R.id.nameProTv);
        final TextView nameDoc = view.findViewById(R.id.docTv);
        final TextView ageDoc = view.findViewById(R.id.ageDocTv);
        final TextView ageNumber = view.findViewById(R.id.ageTv);
        final TextView careerDoc = view.findViewById(R.id.careerTv);
        final TextView career = view.findViewById(R.id.tittleTv);


        sendInfoDoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setType("*/*");
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]
                        {"squad_gl@hotmail.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT, "Datos del Médico Tratante");
                intent.putExtra(Intent.EXTRA_TEXT, namePro.getText().toString());
                intent.putExtra(Intent.EXTRA_TEXT, nameDoc.getText().toString());
                intent.putExtra(Intent.EXTRA_TEXT, ageDoc.getText().toString());
                intent.putExtra(Intent.EXTRA_TEXT, ageNumber.getText().toString());
                intent.putExtra(Intent.EXTRA_TEXT, careerDoc.getText().toString());
                intent.putExtra(Intent.EXTRA_TEXT, career.getText().toString());
                startActivity(intent);

            }
        });

    }


}
