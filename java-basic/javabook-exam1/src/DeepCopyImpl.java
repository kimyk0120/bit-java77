
public class DeepCopyImpl {

	public static void main(String[] args) {

		
		try {

			
			PersonalInfo pInfo = new PersonalInfo("James", 
					22, "Himedia", "encoding");
			PersonalInfo pCopy = (PersonalInfo)pInfo.clone();
			pCopy.changeWork("decoding");
			
			
			pInfo.showPersonalInfo();
			pCopy.showPersonalInfo();
			
			
			
			
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		
	}

}
