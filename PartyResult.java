package cl.mind.smartmedicine;

/**
 * Created by Gabriel on 05-08-2017.
 */

public class PartyResult extends DrugAnswer {


    public PartyResult(String answer) {
        super(answer);
    }



    public String optionSelected(){


        return processing();

    }

    private String processing(){


        String answer = getAnswer();


        if (answer.contains("Una vez al Día")){

            return "Su Medicación es: " +answer;


        }else if (answer.contains("Dos Veces al Día")){

            return "Su Medicación es: " +answer;

        }else

            return "Su Medicación es: " +answer;

    }
}
