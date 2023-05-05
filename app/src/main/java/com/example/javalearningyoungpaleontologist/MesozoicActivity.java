package com.example.javalearningyoungpaleontologist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MesozoicActivity extends AppCompatActivity {

    private ListView mesozoicList;
    private TextView mesozoicOut;

    // массив данных животных кайнозойского периода
    private String[] arrayMesozoic = {"Аллозавр", "Велоцираптор", "Диплодок", "Стегозавр", "Цзяньчанозавр", "Ютараптор", "Мегалодон"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesozoic);

        mesozoicList = findViewById(R.id.mesozoicList);
        mesozoicOut = findViewById(R.id.mesozoicOut);

        // создание адаптера (текущий объект активити, стандартный шаблон разметки вывода информации, массив данных)
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrayMesozoic);

        // устанавливаем для списка (вывода информации на экран) адаптер
        mesozoicList.setAdapter(adapter);

        // создадим слушатель выбора элементов списка
        mesozoicList.setOnItemClickListener(listenerItem);

    }

    AdapterView.OnItemClickListener listenerItem = new AdapterView.OnItemClickListener() {
        // (элемент AdapterView, нажатый виджет внутри AdapterView, индекс нажатого виждета внутри AdapterView, идентификатор строки нажатого элемента)
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            // считываем выбранный индекс из массива данных
            String selectedItem = arrayMesozoic[position];
            mesozoicOut.setText(selectedItem);

        }
    };

}