package com.migapps.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnAdicao,btnSub,btnMulti,btnDiv,btnResultado,btnPonto,btnClear;
    private EditText resultado;
    private double num1,num2;
    private String OP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    btn1=findViewById(R.id.btn1);
    btn2=findViewById(R.id.btn2);
    btn3=findViewById(R.id.btn3);
    btn4=findViewById(R.id.btn4);
    btn5=findViewById(R.id.btn5);
    btn6=findViewById(R.id.btn6);
    btn7=findViewById(R.id.btn7);
    btn8=findViewById(R.id.btn8);
    btn9=findViewById(R.id.btn9);
    btn0=findViewById(R.id.btn0);
    btnAdicao=findViewById(R.id.btnAdi);
    btnSub=findViewById(R.id.btnSub);
    btnMulti=findViewById(R.id.btnMulti);
    btnDiv=findViewById(R.id.btnDiv);
    btnResultado=findViewById(R.id.btnResult);
    btnPonto=findViewById(R.id.btnPonto);
    resultado=findViewById(R.id.editNum);
    btnClear=findViewById(R.id.btnClear);

getSupportActionBar().hide();

btn0.setOnClickListener(this);
btn1.setOnClickListener(this);
btn2.setOnClickListener(this);
btn3.setOnClickListener(this);
btn4.setOnClickListener(this);
btn5.setOnClickListener(this);
btn6.setOnClickListener(this);
btn7.setOnClickListener(this);
btn8.setOnClickListener(this);
btn9.setOnClickListener(this);
btnAdicao.setOnClickListener(this);
btnSub.setOnClickListener(this);
btnMulti.setOnClickListener(this);
btnDiv.setOnClickListener(this);
btnPonto.setOnClickListener(this);
btnResultado.setOnClickListener(this);
btnClear.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btnClear:
                resultado.getText().clear();


                break;


            case R.id.btn0:

                if (resultado.getText().toString().isEmpty()) {
                    resultado.setText("0");
                } else {
                    resultado.setText(resultado.getText().toString() + "0");
                }

                break;

            case R.id.btn1:

                if (resultado.getText().toString().isEmpty()) {
                    resultado.setText("1");
                } else {
                    resultado.setText(resultado.getText().toString() + "1");
                }

                break;

            case R.id.btn2:
                if (resultado.getText().toString().isEmpty()) {
                    resultado.setText("2");
                } else {
                    resultado.setText(resultado.getText().toString() + "2");
                }

                break;

            case R.id.btn3:

                if (resultado.getText().toString().isEmpty()) {
                    resultado.setText("3");
                } else {
                    resultado.setText(resultado.getText().toString() + "3");
                }
                break;

            case R.id.btn4:

                if (resultado.getText().toString().isEmpty()) {
                    resultado.setText("4");
                } else {
                    resultado.setText(resultado.getText().toString() + "4");
                }
                break;

            case R.id.btn5:

                if (resultado.getText().toString().isEmpty()) {
                    resultado.setText("5");
                } else {
                    resultado.setText(resultado.getText().toString() + "5");
                }

                break;

            case R.id.btn6:
                if (resultado.getText().toString().isEmpty()) {
                    resultado.setText("6");
                } else {
                    resultado.setText(resultado.getText().toString() + "6");
                }

                break;

            case R.id.btn7:

                if (resultado.getText().toString().isEmpty()) {
                    resultado.setText("7");
                } else {
                    resultado.setText(resultado.getText().toString() + "7");
                }

                break;

            case R.id.btn8:

                if (resultado.getText().toString().isEmpty()) {
                    resultado.setText("8");
                } else {
                    resultado.setText(resultado.getText().toString() + "8");
                }

                break;

            case R.id.btn9:

                if (resultado.getText().toString().isEmpty()) {
                    resultado.setText("9");
                } else {
                    resultado.setText(resultado.getText().toString() + "9");
                }
                break;

            case R.id.btnAdi:


                num1 = Double.parseDouble(resultado.getText().toString());
                OP = "+";

                resultado.getText().clear();


                break;

            case R.id.btnSub:

                num1 = Double.parseDouble(resultado.getText().toString());
                OP = "-";

                resultado.getText().clear();

                break;

            case R.id.btnMulti:

                num1 = Double.parseDouble(resultado.getText().toString());
                OP = "*";

                resultado.getText().clear();

                break;

            case R.id.btnDiv:
                num1 = Double.parseDouble(resultado.getText().toString());
                OP = "/";

                resultado.getText().clear();

                break;

            case R.id.btnPonto:

                if (resultado.getText().toString().isEmpty()) {
                    resultado.setText(".");
                } else {
                    resultado.setText(resultado.getText().toString() + ".");
                }


                break;

            case R.id.btnResult:
                try {


                    num2 = Double.parseDouble(resultado.getText().toString());


                    switch (OP) {
                        case "+":

                            resultado.setText(String.valueOf(num1 + num2));

                            break;

                        case "-":
                            resultado.setText(String.valueOf(num1 - num2));

                            break;

                        case "*":

                            resultado.setText(String.valueOf(num1 * num2));
                            break;

                        case "/":
                            resultado.setText(String.valueOf(num1 / num2));

                            break;

                        }
                    }catch(Exception e){

                    e.printStackTrace();
                }



            }













        }




    }




