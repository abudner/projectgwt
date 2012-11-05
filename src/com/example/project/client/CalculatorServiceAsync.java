package com.example.project.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface CalculatorServiceAsync {

	void div(int l1, int l2, AsyncCallback<Double> callback);
	void mul(int l1, int l2, AsyncCallback<Double> callback);
	void add(int l1, int l2, AsyncCallback<Integer> callback);
	void sub(int l1, int l2, AsyncCallback<Integer> callback);
	void mod(int l1, int l2, AsyncCallback<Integer> callback);
	void sqrts(double l9, AsyncCallback<Double> callback);
	void rev(double l9, AsyncCallback<Double> callback);
	void dzul(int l11, AsyncCallback<Double> callback);
	void kj(int l10, AsyncCallback<Double> callback);
	void mg(int l12, AsyncCallback<Double> callback);
	void dg(int l12, AsyncCallback<Double> callback);
	void g(int l12, AsyncCallback<Double> callback);
	void dag(int l12, AsyncCallback<Double> callback);
	void tona(int l12, AsyncCallback<Double> callback);
	
	void decToOther(int number, int sys, AsyncCallback<String> callback);
	void otherToDec(String number, int sys, AsyncCallback<Integer> callback);
	
}
