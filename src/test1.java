import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class test1 
{
	public static void main(String[] args) throws IOException 
    {
//		FileReader fs= new FileReader("E://practice1self/abc.txt");
//		BufferedReader br = new BufferedReader(fs);
//		String str;
//		
//		//System.out.println(str);
//		
//		
//		while((str = br.readLine())!=null)
//         {
//			System.out.println(str);
//         }

//		FileWriter fw= new FileWriter("E://practice1self/abc1.txt",true);
//		fw.write("Hello this is amit");
//		fw.close();
		
		
		FileReader fs= new FileReader("E://practice1self/abc1.txt");
		BufferedReader br = new BufferedReader(fs);
		String str;
		
		//System.out.println(str);
		
		
		while((str = br.readLine())!=null)
         {
			System.out.println(str);
         }
		
			
	}

}
