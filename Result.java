/*
Develop an application that will store the quiz results of 10 students
across three quizzes. The application should accept all of the quiz results for each student
in turn from the user and then calculate and output the best and worst quiz result from the whole set.
*/
/*
Result.java
Yo
21/04/17
*/
public class Result{
	//vars
	double arr[][];
	double max;
	double min;

	//constructor
	public Result(){
		arr= new double[10][3];
		max=0;
		min=0;
	}
	//set
	public void setArr(double arr[][]){
		this.arr=arr;
	}
	public void compute(){
		max=arr[0][0];
		min=arr[0][0];
		for(int i=0; i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				if(arr[i][j]>max){
					max=arr[i][j];
				}
				else if(max < min){
					min=arr[i][j];
				}
			}
		}
	}
	public double getMax(){
		return max;
	}
	public double getMin(){
		return min;
	}









}