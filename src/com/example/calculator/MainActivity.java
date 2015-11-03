package com.example.calculator;

import android.R.integer;
import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity {
	
	private static final String EditText = null;
	EditText editField;
	
	int Num_1 = 0;
	int Num_2 = 0;
	String sign = "";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		editField = (EditText) findViewById(R.id.Num);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	public void inputNum(View view) {
		String resultStr = this.editField.getText().toString();
		switch (view.getId()) {
		case R.id._0:
			if(sign != ""){
				if(resultStr.length() > 0){
					resultStr = resultStr + "0";
					Num_2 = Integer.valueOf(resultStr).intValue();
					Log.d(null, "----" + resultStr);
					editField.setText(resultStr);
				}
			}else {
				if(resultStr.length() > 0){
					resultStr = resultStr + "0";
					Num_1 = Integer.valueOf(resultStr).intValue();
					Log.d(null, "----11" + resultStr);
					editField.setText(resultStr);
				}
			}
			break;
		case R.id._1:
			if(sign != ""){
				resultStr = resultStr + "1";
				Num_2 = Integer.valueOf(resultStr).intValue();
				editField.setText(resultStr);
			}else {
				resultStr = resultStr + "1";
				Num_1 = Integer.valueOf(resultStr).intValue();
				editField.setText(resultStr);
			}
			break;
		case R.id._2:
			if(sign != ""){
				resultStr = resultStr + "2";
				Num_2 = Integer.valueOf(resultStr).intValue();
				editField.setText(resultStr);
			}else {
				resultStr = resultStr + "2";
				Num_1 = Integer.valueOf(resultStr).intValue();
				editField.setText(resultStr);
			}
			break;
		case R.id._3:
			if(sign != ""){
				resultStr = resultStr + "3";
				Num_2 = Integer.valueOf(resultStr).intValue();
				editField.setText(resultStr);
			}else {
				resultStr = resultStr + "3";
				Num_1 = Integer.valueOf(resultStr).intValue();
				editField.setText(resultStr);
			}
			break;
		case R.id._4:
			if(sign != ""){
				resultStr = resultStr + "4";
				Num_2 = Integer.valueOf(resultStr).intValue();
				editField.setText(resultStr);
			}else {
				resultStr = resultStr + "4";
				Num_1 = Integer.valueOf(resultStr).intValue();
				editField.setText(resultStr);
			}
			break;
		case R.id._5:
			if(sign != ""){
				resultStr = resultStr + "5";
				Num_2 = Integer.valueOf(resultStr).intValue();
				editField.setText(resultStr);
			}else {
				resultStr = resultStr + "5";
				Num_1 = Integer.valueOf(resultStr).intValue();
				editField.setText(resultStr);
			}
			break;
		case R.id._6:
			if(sign != ""){
				resultStr = resultStr + "6";
				Num_2 = Integer.valueOf(resultStr).intValue();
				editField.setText(resultStr);
			}else {
				resultStr = resultStr + "6";
				Num_1 = Integer.valueOf(resultStr).intValue();
				editField.setText(resultStr);
			}
			break;
		case R.id._7:
			if(sign != ""){
				resultStr = resultStr + "7";
				Num_2 = Integer.valueOf(resultStr).intValue();
				editField.setText(resultStr);
			}else {
				resultStr = resultStr + "7";
				Num_1 = Integer.valueOf(resultStr).intValue();
				editField.setText(resultStr);
			}
			break;
		case R.id._8:
			if(sign != ""){
				resultStr = resultStr + "8";
				Num_2 = Integer.valueOf(resultStr).intValue();
				editField.setText(resultStr);
			}else {
				resultStr = resultStr + "8";
				Num_1 = Integer.valueOf(resultStr).intValue();
				editField.setText(resultStr);
			}
		break;
		case R.id._9:
			if(sign != ""){
				resultStr = resultStr + "9";
				Num_2 = Integer.valueOf(resultStr).intValue();
				editField.setText(resultStr);
			}else {
				resultStr = resultStr + "9";
				Num_1 = Integer.valueOf(resultStr).intValue();
				editField.setText(resultStr);
			}
			break;
		case R.id.toZero:
			resultStr = "";
			Num_1 = 0;
			Num_2 = 0;
			editField.setText(resultStr);
			
		break;
		default:
			break;
		}
	}
	
	public void cal(View view) {
		
		if (this.editField.getText().toString().length() > 0) {
			this.Num_1 = Integer.valueOf(this.editField.getText().toString()).intValue();
			switch (view.getId()) {
			case R.id.plus:
				sign = "plus";
				this.editField.setText("");
				break;
			case R.id.minus:
				sign = "minus";
				this.editField.setText("");
				break;
			case R.id.times:
				sign = "times";
				this.editField.setText("");
				break;
			case R.id.divide:
				sign = "divide";
				this.editField.setText("");
				break;
			case R.id.isEqual:
				switch (this.sign) {
				case "plus":
					this.editField.setText(Integer.toString(Num_1 + Num_2));
					break;
				case "minus":
					this.editField.setText(Integer.toString(Num_1 - Num_2));
					break;
				case "times":
					this.editField.setText(Integer.toString(Num_1 * Num_2));
					break;
				case "divide":
					this.editField.setText(Integer.toString(Num_1 / Num_2));
					break;

				default:
					break;
				}
				
				break;
			default:
				break;
			}
		}
	}
}
