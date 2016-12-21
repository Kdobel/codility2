package Lession4.FrogJump;

public class Main {
//100%
	public static void main(String[] args) {

		int[] A = { 3, 1, 4, 2, 3, 5, 4 };
		System.out.println(solution(5, A));
	}

	public static int checkBool(int position, boolean[] bool) {
		for (int i = position; i < bool.length; i++) {
			if (!bool[i])
				return i;
		}
		return bool.length;
	}

	public static int solution(int X, int[] A) {
	       boolean[] bool= new boolean[X];
	       int positionFrog=0;
		   for (int i=0;i<A.length;i++){
//			   System.out.println("i :"+i + " A: " +A[i]+" pos: "+ positionFrog);
			   if (A[i]<=positionFrog||A[i]<=0) continue; 
			   if (A[i]==positionFrog+1){
				   bool[A[i]-1]=true;
				   positionFrog=checkBool(positionFrog, bool);
				   if(positionFrog==X) return i;//finish condition
			   }
			   if(A[i]<X+1) bool[A[i]-1]=true;
			   
			  
		   }
		   return -1;
	    }
}
