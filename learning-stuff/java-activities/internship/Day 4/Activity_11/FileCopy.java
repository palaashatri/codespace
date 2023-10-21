package Activity_11;
import java.io.FileOutputStream;
import java.io.FileInputStream;  
public class FileCopy {
	

		public static void main(String[] args)
		{
			try {
				FileOutputStream fout=new FileOutputStream("abc.txt");
				FileOutputStream out=new FileOutputStream("output.txt");
				String s="Activity to copy contents of file from one to another";
				byte b[]=s.getBytes();
				fout.write(b);
				fout.close();
			FileInputStream fin=new FileInputStream("abc.txt");
				int i=0;
				System.out.print("Text which is printed in new file is: ");
				while((i=fin.read())!=-1)
				{
					out.write((char)i);
					System.out.print((char)i);
				}
			fin.close();
			out.close();
			}
			catch( Exception e)
			{
				System.out.print(e);
			}
		}

	}
