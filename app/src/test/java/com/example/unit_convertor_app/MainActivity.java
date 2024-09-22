import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



import com.example.unit_convertor_app.R;


public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private EditText editTextText4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Make sure this matches the XML layout file name

        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        editTextText4 = findViewById(R.id.editTextText4);

        // onClickListener for the button to perform kg to pounds conversion
        button.setOnClickListener(v -> {
            String inputText = editTextText4.getText().toString();

            if (!inputText.isEmpty()) {
                try {
                    // Convert the input text to a double (assuming it is a valid number)
                    double kilograms = Double.parseDouble(inputText);
                    // Convert kilograms to pounds (1 kg = 2.20462 pounds)
                    double pounds = kilograms * 2.20462;
                    // Display the result in the TextView
                    textView.setText(String.format("%.2f kg = %.2f lbs", kilograms, pounds));
                } catch (NumberFormatException e) {
                    textView.setText("Please enter a valid number");
                }
            } else {
                textView.setText("Input field cannot be empty");
            }
        });
    }
}

