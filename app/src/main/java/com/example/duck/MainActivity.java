package com.example.duck;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //двухпозиционная кнопка
    public void onToggleButtonClicked(View view){
        boolean on = ((ToggleButton) view).isChecked();
        if (on){
            //Вкл
        } else {
            // Выкл
        }
    }

    //Выключатель
    public void onSwitchClicked(View view){
        boolean on = ((Switch) view).isChecked();
        if (on){
            //Вкл
        } else {
            // Выкл
        }
    }

//    //Флажки
//    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox_milk);
//    boolean checked = checkBox.isChecked();
//    if(checked){
//        //действие для установленного флажка
//    }

    public void onCheckboxClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()){
            case R.id.checkBox_milk:
                if (checked) {
                    //Кофе с молоком
                }else{
                    //Черный кофе
                }
                break;
            case R.id.checkBox_sugar:
                if (checked) {
                    //С сахаром
                }else{
                    //Без сахара
                }
                break;
        }
    }

//    //Переключатели
//    //определение какой переключатель в группе установлен
//    RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
//    int id = radioGroup.getCheckedRadioButtonId();
//    if (id == -1) {
//        //ни один переключатель не установлен
//    } else {
//        RadioGroup radioButton = findViewById(id);
//    }

    public  void onRadioButtonClicked(View view){
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        int id = radioGroup.getCheckedRadioButtonId();
        switch (id){
            case R.id.radio_cavemen:
                //Установлен переключатель Cavemen
                break;
            case R.id.radio_astronauts:
                //Установлен переключатель Astronauts
                break;
        }
    }
}