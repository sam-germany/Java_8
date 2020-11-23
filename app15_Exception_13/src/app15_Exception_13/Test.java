package app15_Exception_13;

class SpellingException extends RuntimeException{}

public class Test {

	public static void main(String[] args) {

		try {
			
			if (!"cat".equals("CAT")) {
				throw new SpellingException();
			}
		} catch (SpellingException | NullPointerException e) {
     
			 System.out.println("Spelling problem");
		}catch (Exception e) {
			System.out.println("-----------");
		}finally {
			System.out.println("Done");
		}
		
		
		
	}

}
