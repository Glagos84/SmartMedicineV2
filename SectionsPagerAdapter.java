package cl.mind.smartmedicine;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class SectionsPagerAdapter extends FragmentPagerAdapter {


    //        constructor
    public SectionsPagerAdapter(FragmentManager fm) {

        super(fm);
    }

//        fin contructor

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return PatientFragment.newInstance();
            case 1:
                return DrugsFragment.newInstance();
            case 2:
                return MedicFragment.newInstance();
            default:
                return PatientFragment.newInstance();
        }
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Datos Paciente";
            case 1:
                return "Receta Medica";
            case 2:
                return "Medico Tratante";
        }
        return null;
    }
}
