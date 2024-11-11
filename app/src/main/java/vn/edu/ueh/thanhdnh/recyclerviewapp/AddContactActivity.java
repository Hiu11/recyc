package vn.edu.ueh.thanhdnh.recyclerviewapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class AddContactActivity extends AppCompatActivity {
    private EditText editTextName;
    private EditText editTextPhone;
    private Button buttonSave;
    private Button buttonClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);

        editTextName = findViewById(R.id.editTextName);
        editTextPhone = findViewById(R.id.editTextPhone);
        buttonSave = findViewById(R.id.buttonSave);
        buttonClear = findViewById(R.id.buttonClear);  // Đảm bảo bạn đã thêm buttonClear vào XML layout

        // Lắng nghe sự kiện Save
        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextName.getText().toString();
                String phone = editTextPhone.getText().toString();

                // Gửi dữ liệu về MainActivity
                Intent resultIntent = new Intent();
                resultIntent.putExtra("name", name);
                resultIntent.putExtra("phone", phone);
                setResult(RESULT_OK, resultIntent);
                finish(); // Quay lại MainActivity
            }
        });

        // Lắng nghe sự kiện Clear
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Xóa nội dung trong các EditText
                editTextName.setText("");
                editTextPhone.setText("");
            }
        });
    }

}
