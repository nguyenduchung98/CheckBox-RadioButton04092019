package nguyenduchung.ndh.checkboxradiobutton04092019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity {
    CheckBox mCbAndroid,mCbIos,mCbPhp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCbAndroid=findViewById(R.id.checkboxAndroid);
        mCbIos=findViewById(R.id.checkboxIos);
        mCbPhp=findViewById(R.id.checkboxPhp);

        mCbAndroid.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (!isChecked)return;
                mCbIos.setChecked(false);
                mCbPhp.setChecked(false);
            }
        });
        mCbIos.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (!isChecked)return;
                mCbAndroid.setChecked(false);
                mCbPhp.setChecked(false);
            }
        });
        mCbPhp.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (!isChecked)return;
                mCbIos.setChecked(false);
                mCbAndroid.setChecked(false);
            }
        });
    }
}
