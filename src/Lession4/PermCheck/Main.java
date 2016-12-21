package Lession4.PermCheck;
//100%
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list={4,5,3,2,1,0};
		System.out.println(solution(list));
		
		System.out.println("wholo");
	}
	public static int checkBool(boolean[] bool){
		for (boolean b : bool) {
			if(!b) return 0;
		}
		return 1;
	}
	public static int solution(int[] A){
		boolean[] bool= new boolean[A.length];
		for (int a : A) {
			if(a<A.length+1&&a>0)bool[a-1]=true;
			else return 0;
		}
		
		return checkBool(bool);
	}
	
}
