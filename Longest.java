public class Longest{
	public static void main(String[] args){
		
		if (args.length == 0){
			System.err.println("Usage: java Longest <words>");
			return;
		}
		
		String longest = args[0];	
		String alphabeta = args[0];
		
		for(int i = 0; i < args.length; i++){
			String word = args[i];
			
			if (word.length() > longest.length()){
				longest = word; 
			}
			
			if (word.compareTo(alphabeta) < 0){
				alphabeta = word;
			}
			
		}
		
		System.out.println("Longest: " + longest + "(" + longest.length() + " letters)");
		System.out.println("First alphabetically: " + alphabeta);
	}
	
}
