package com.example.project.server;

import com.example.project.client.CalculatorService;
import java.lang.Math;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class CalculatorServiceImpl extends RemoteServiceServlet implements
		CalculatorService {

	private static final long serialVersionUID = 1L;
	private static final String pattern="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	@Override
	public Double div(int l1, int l2) {
		return (double)l1 / l2;
	}
	
	@Override
	public Double mul(int l1, int l2) {
		return (double)(l1 * l2);
	}

	@Override
	public Integer add(int l1, int l2) {
		return l1 + l2;
	}
	
	@Override
	public Integer sub(int l1, int l2) {
		return l1 - l2;
	}
	
	
	@Override
	public Double sqrts(double l1) {
		double x = l1;
		
		double z = Math.sqrt(x);
		
		return z;
		
		
	}
	


	
	
	@Override
	public Double rev(double l1) {
		
		
		return 1.0 / l1;
		
		
	}
	
	
	@Override
	public Double dzul(int l11) {
		
		
		return (double) (l11 * 1000);
		
		
	}
	
	@Override
	public Double kj(int l10) {
		
		
		return (double)l10 / 1000;
		
		
	}
	
	@Override
	public Double mg(int l12) {
		
		
		return (double) (l12 * 1000000);
		
		
	}

	
	@Override
	public Double g(int l12) {
		
		
		return  (double) l12 * 1000;
		
		
	}
	
	@Override
	public Double dg(int l12) {
		
		
		return (double) (l12 * 10000);
		
		
	}
	
	@Override
	public Double dag(int l12) {
		
		
		return (double)( l12 * 100);
		
		
	}
	
	@Override
	public Double tona(int l12) {
		
		
		return ((double) l12) / 1000;
		
		
	}
	@Override
	public Integer mod(int l1, int l2) {
		int y,p=0,z=0;
		
		double x=0.0;
		x=( l1 * 1.0 / l2);
		y=(int)x;
		
		p=y * l2;
		z=l1 -p;
		
		return z;
		
	}
	
	
	private static int valueOf(char x, int sys){
	for (int i=0; i<sys; i++){
	if (x == pattern.charAt(i)){
	return i;
	}
	}
	return -1;
	}
	 
	@Override
	public Integer otherToDec(String number, int sys)
	{
	int i, x;
	int p = 1;
	int result = 0;
	 
	
	 
	number = number.toUpperCase();
	 
	for (i=number.length()-1; i>=0; i--)
	{
	x = valueOf(number.charAt(i), sys);
	if (x < 0)
	{
	return 0;
	}
	result += (x * p);
	p *= sys;
	}
	 
	return result;
	}
	 
	
	@Override
	public String decToOther(int number, int sys){
		String result = "";
		if(number ==0){
			return "0";
			
		}
		while(number >0){
			
			result = pattern.charAt(number%sys) + result;
			number /= sys;
		}
		
		
		return result;
		
	}
	
	
	
	


	
	

}
