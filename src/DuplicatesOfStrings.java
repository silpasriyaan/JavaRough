
public class DuplicatesOfStrings {

	public static void main(String[] args) {
		String str="This is Silpa";
		char dup[]=str.toCharArray();
	for(int i=0;i<str.length();i++)	
	{
		for(int j=i+1;j<str.length();j++)
		{
			if(dup[i]==dup[j])
				System.out.println("Duplicate characters in the string given:"+dup[i]);
			
		}
	}

	}

}
