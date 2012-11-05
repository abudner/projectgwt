package com.example.project.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
@RemoteServiceRelativePath("calculator")
public interface CalculatorService extends RemoteService {
	
	Double div(int l1, int l2);
	Double mul(int l1, int l2);
	Integer add(int l1, int l2);
	Integer sub(int l1, int l2);
	Integer mod(int l1, int l2);
	Double sqrts(double l9);
	Double rev(double l9);
	Double dzul(int l11);
	Double kj(int l10);
	Double mg(int l12);
	Double dg(int l12);
	Double g(int l12);
	Double dag(int l12);
	Double tona(int l12);
	
	
	String decToOther(int number, int sys);
	Integer otherToDec(String nubmer,int sys);
	
}
