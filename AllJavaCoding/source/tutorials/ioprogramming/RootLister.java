package tutorials.ioprogramming;

import java.io.File;
import java.util.Date;
 
public class RootLister {

	static final String rootDir = "C:\\Folders\\";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File f = new File("C:\\Folders");
		
		String[] files = f.list();
		System.out.println("Folders");
		for(String path : files)
			printAttributes(rootDir + path,0);
	}
	
	static void printAttributes(String path,int level) {
		 // final String parentDir = "C:\\Sourish\\" ; 
		File f = new File( path);
		
		for(int i = 0; i<= level;i++)
		System.out.print("-");
		if(f.isFile()){
			//	System.out.print("\n -");
			System.out.println("-" + f.getName());	
		}
		else if(f.isDirectory()){
		//	System.out.print("\n D");
			System.out.println("+" + f.getName());
			String parentPath = f.getAbsolutePath();
			if(f.list().length != 0)
			{
				String files [] = f.list();
				for(String pathf : files){
					File f1 = new File(parentPath + "\\" +  pathf);
					if(f1.isFile())
					{
						for(int i = 0; i<= level;i++)
							System.out.print("-");
						System.out.println("--" + f1.getName());
					}
				}
				for(String pathf : files){
					File f1 = new File(parentPath + "\\" +  pathf);
					if(f1.isDirectory())
					{
						printAttributes(parentPath + "\\" +  pathf,level++);			
					}
				}	
			}
		}
		/*System.out.print(f.canRead()?"R":"-");
		System.out.print(f.canWrite()?"W":"-");
		System.out.print(f.canExecute()?"X":"-");
		System.out.print(f.isHidden()?" H":"-"); */
			
		 /*System.out.print(" " + f.length());
		long lastModified = f.lastModified();
		Date d = new Date(lastModified);
		System.out.print(" " + String.format("%1$td/%1$tm/%1$tY",d));*/
		
	}
	
	static void driveListing(){
		File drives [] = File.listRoots();
		for(File drive : drives) {
			System.out.println("Drive Name " + drive.getAbsolutePath());
			System.out.println("\t Total Space " + drive.getTotalSpace() );
			System.out.println("\t Total Free Space " + drive.getFreeSpace() );
			
		}
	}
}

