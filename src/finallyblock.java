import java.io.InvalidObjectException;
import java.util.NoSuchElementException;
public class finallyblock {
	public static class exceptions {
		public static void calculator(int a, int b) {
			System.out.println(a/b);
			
		}
		public static void main(String[]args) {
			System.out.println("Hi this is calculator");
			try {
				calculator(10,0);
			}
			finally {
				System.err.println("I dont care");
			}
			System.out.println("kya mai bhi aunga");
		}
	}
	

	
	}


