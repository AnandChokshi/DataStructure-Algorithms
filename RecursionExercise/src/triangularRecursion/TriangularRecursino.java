package triangularRecursion;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TriangularRecursino {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int result = triangular(n);
		System.out.println(result);
	}

	public static int triangular(int n){
		if(n == 1){
			return 1;
		}else{
			return (n + triangular(n-1));
		}
	}
}
