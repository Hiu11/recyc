package vn.edu.ueh.thanhdnh.recyclerviewapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    private TextView nameTextView;
    private TextView phoneTextView;
    private ImageView contactImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        nameTextView = findViewById(R.id.detailName);
        phoneTextView = findViewById(R.id.detailPhone);
        contactImageView = findViewById(R.id.detailImage);

        // Nhận dữ liệu từ Intent
        Intent intent = getIntent();
        String name = intent.getStringExtra("contactName");
        String phone = intent.getStringExtra("contactPhone");
        String photo = intent.getStringExtra("contactPhoto");

        // Cập nhật thông tin lên giao diện
        nameTextView.setText(name);
        phoneTextView.setText(phone);

        // Hiển thị ảnh liên hệ nếu có
        if (photo != null && !photo.isEmpty()) {
            contactImageView.setImageURI(Uri.parse(photo));
        } else {
            contactImageView.setImageResource(R.drawable.ic_default_contact); // Sử dụng hình mặc định
        }

        // Thêm sự kiện nhấn vào số điện thoại để gọi
        phoneTextView.setOnClickListener(v -> {
            Intent dialIntent = new Intent(Intent.ACTION_DIAL);
            dialIntent.setData(Uri.parse("tel:" + phone));
            startActivity(dialIntent);
        });
    }
}
