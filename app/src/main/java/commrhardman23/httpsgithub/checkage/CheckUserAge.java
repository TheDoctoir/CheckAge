package commrhardman23.httpsgithub.checkage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CheckUserAge extends AppCompatActivity {

    EditText edtxtUserAge;
    TextView txtvwAgeAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_user_age);

        txtvwAgeAnswer = (TextView) findViewById(R.id.txtvwAgeAnswer);
        edtxtUserAge = (EditText) findViewById(R.id.edtxtUserAge);
    }

    /**
     * ageChecker takes the age of the user and displays a message that is dependent on the age
     * of the user.
     * @param vw is the button associated with this method
     */
    public void ageChecker(View vw){

        int userAge = Integer.parseInt(edtxtUserAge.getText().toString());
        String userResponse;

        //checks whether the user is less than 18
        if(userAge < 18){
            userResponse = "You are still a minor";

        //checks whether the user is 18 or older
        } else {

            //this will be printed regardless of what age you are over 17
            userResponse = "You are legally an adult! Huzzah!";

            /**
             * but if the user is 55 or older, we want to distinguish them from
             * other users who are adults
             */
            if (userAge >= 55) {
                userResponse += "\nYou are even eligible for the senior's discount!";
                userResponse += "\nP.S. Good for you using an Android phone at your age! :p";

            /**
             * if the user is not a senior citizen, then we want to let them know when
             * they can start saving money by using the senior's discount
             */
            } else {
                userResponse += "\nYou are " + (55 - userAge) + " years away from being eligible" +
                        " for the senior's discount";
            }

        }

        txtvwAgeAnswer.setText(userResponse);

    }


}
