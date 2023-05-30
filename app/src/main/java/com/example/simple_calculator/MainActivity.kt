package com.example.simple_calculator

import android.os.Bundle
import android.renderscript.Double4
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.simple_calculator.ui.theme.SimpleCalculatorTheme
import android.view.View
import android.widget.EditText


class MainActivity : ComponentActivity() {

    private enum class Operator { none, add, minus, multiply, divide }

    private var data1: Double = 0.0
    private var data2: Double = 0.0
    private var optr: Operator = Operator.none
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout1)
    }

    public fun btn00click(view: View) : Unit {
        var eText: EditText = findViewById(R.id.resultEdit)
        eText.setText(eText.getText().toString().plus("0"))
    }

    public fun btn01click(view: View) : Unit {
        var eText: EditText = findViewById(R.id.resultEdit)
        eText.setText(eText.getText().toString().plus("1"))
    }

    public fun btn02click(view: View) : Unit {
        var eText: EditText = findViewById(R.id.resultEdit)
        eText.setText(eText.getText().toString().plus("2"))
    }

    public fun btn03click(view: View) : Unit {
        var eText: EditText = findViewById(R.id.resultEdit)
        eText.setText(eText.getText().toString().plus("3"))
    }

    public fun btn04click(view: View) : Unit {
        var eText: EditText = findViewById(R.id.resultEdit)
        eText.setText(eText.getText().toString().plus("4"))
    }

    public fun btn05click(view: View) : Unit {
        var eText: EditText = findViewById(R.id.resultEdit)
        eText.setText(eText.getText().toString().plus("5"))
    }
    public fun btn06click(view: View) : Unit {
        var eText: EditText = findViewById(R.id.resultEdit)
        eText.setText(eText.getText().toString().plus("6"))
    }

    public fun btn07click(view: View) : Unit {
        var eText: EditText = findViewById(R.id.resultEdit)
        eText.setText(eText.getText().toString().plus("7"))
    }


    public fun btn08click(view: View) : Unit {
        var eText: EditText = findViewById(R.id.resultEdit)
        eText.setText(eText.getText().toString().plus("8"))
    }

    public fun btn09click(view: View) : Unit {
        var eText: EditText = findViewById(R.id.resultEdit)
        eText.setText(eText.getText().toString().plus("9"))
    }

    public fun btnClearClick(view: View): Unit{
        var eText: EditText = findViewById(R.id.resultEdit)
        eText.setText("")
    }

    public fun btnaddclick(view: View) : Unit {
        optr = Operator.add
        var eText: EditText = findViewById(R.id.resultEdit)
        data1 = eText.getText().toString().toDouble()
        eText.setText("")
    }

    public fun btnminusclick(view: View) : Unit {
        optr = Operator.minus
        var eText: EditText = findViewById(R.id.resultEdit)
        data1 = eText.getText().toString().toDouble()
        eText.setText("")
    }

    public fun btnmultclick(view: View) : Unit {
        optr = Operator.multiply
        var eText: EditText = findViewById(R.id.resultEdit)
        data1 = eText.getText().toString().toDouble()
        eText.setText("")
    }

    public fun btndivclick(view: View) : Unit {
        optr = Operator.divide
        var eText: EditText = findViewById(R.id.resultEdit)
        data1 = eText.getText().toString().toDouble()
        eText.setText("")
    }

    public fun btndotclick(view: View) : Unit {
        var eText: EditText = findViewById(R.id.resultEdit)
        eText.setText(eText.getText().toString().plus("."))
    }

    public fun btnResultClick(view: View) : Unit{
        if(optr!= Operator.none){
            var eText: EditText = findViewById(R.id.resultEdit)
            data2= eText.getText().toString().toDouble()
            var result: Double = 0.0
            if(optr == Operator.add){
                result = data1+data2
            }
            if(optr == Operator.minus){
                result = data1-data2
            }
            if(optr == Operator.multiply){
                result = data1*data2
            }
            if(optr == Operator.divide){
                result = data1/data2
            }
            optr= Operator.none
            data1 = result
            if((result - result.toInt()) != 0.0){
                eText.setText(result.toString())
            }
            else{
                eText.setText(result.toInt().toString())
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SimpleCalculatorTheme {
        Greeting("Android")
    }
}