package Lession4.MissingInteger;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list={4,5,2,1,-5,1,3,6,1,6};
		System.out.println(solution(list));
		
		
	}
	public static int checkBool(boolean[] bool){
		for (int i=0;i<bool.length;i++) {
			if(!bool[i]) return i+1;
		}
		return bool.length+1;
	}
	public static int solution(int[] A){
		boolean[] bool= new boolean[A.length];
		int result=Integer.MAX_VALUE;
		for (int a : A) {
			if(a<A.length+1&&a>0)bool[a-1]=true;
			else if(a<result&&a>0) result=a;
		}
		
		return Math.min(checkBool(bool),result);
	}
	
}
