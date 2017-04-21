/*
ResultApp.java
Yo
21/04/17
*/
import javax.swing.*;
public class ResultApp{
	public static void main (String args[]){

	//vars
	double arr [][]= new double[10][3];
	double max;
	double min;

	//object
	Result myResult=new Result();

	//input
	for(int i=0;i<arr.length;i++){
		for(int j=0;j<arr[i].length;j++){
			arr[i][j]=Double.parseDouble(JOptionPane.showInputDialog(null, "What is your score?"));
		}
	}
	myResult.setArr(arr);

	//compute
	myResult.compute();

	//output
	max=myResult.getMax();
	min=myResult.getMin();
	JOptionPane.showMessageDialog(null, "The best is "+max);
	JOptionPane.showMessageDialog(null, "The worst is "+min);



}
}