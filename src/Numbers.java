import java.util.Random;

public class Numbers {

	private int[]Integers;
	private int arSize;
		
		public Numbers(){
			Integers = null;
			arSize = 0;
		}
	
		public Numbers(int arSize){
			this.arSize = arSize;
		Integers = new int[this.arSize] ;
		
	}
	
	public void generateNumbers(){
		Random r1 = new Random();
		for(int i=0;i< arSize; i++ ){
			Integers[i] = r1.nextInt(50) + 1;
		}
		
	}
	
	public int count(int integer)
	{
		int count = 0;
		
		for(int i = 0; i < arSize; i++){
			if(Integers[i] == integer)
				count++;
		}
		return count;
	}
	
	@Override
	public String toString() {
		
		String array = new String();
		for(int i = 0; i < arSize; i++){
			array += Integers[i] + " "; 
		}
		return array;
	}
}
