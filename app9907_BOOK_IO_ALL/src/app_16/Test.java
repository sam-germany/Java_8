package app_16;

import java.io.File;

public class Test {

	public void reset12() throws Exception{
	File f1 = new File("D:\\Extra_Space_For_FOS_2\\templates\\proofs");  // 1)   it create 2 new folders  templates and proofs
	     f1.mkdirs();
	     
	File f2 = new File("D:\\Extra_Space_For_FOS_2\\templates");
	     f2.mkdir();                            // 2)  as templates exists already so this line will not create anything
	                                                                         
    new File(f2, "draft.doc").createNewFile();  // as   templates   folder exists so draft.doc  file will be created
 	                                                  // under this  templates folder

	     f1.delete();        // f1.delete()  means delete the empty folder only, proofs will be deleted as proofs is empty
                            //  in this case   templates\\proofs  it means templeate has proofs folder and further   
	                       //   we put   draft.doc,  if templeate has only proofs folder then also we can not delete     
	                      // template folder, and not it has also a file , if template has only one file then also
	                       // we can not deltele it , template must be empty 
     
	     f2.delete();   // as  above f1.delete the  proofs folder but draft.doc is still existing in templates folder 
	                    //  templates folder is still having somthing so we are not able to delete it.
	}
	
	public static void main(String[] args) {

     try {
          new Test().reset12();		
	} catch (Exception e) {
		new RuntimeException();
	}		
	}

}
