
package filetrans;

import java.io.File;

public class FileTrans {
   
    public static void main(String[] args) {
        // TODO code application logic here
        
    {
        File file = new File("D:\\DSLR\\IMG_8758 (2).JPG");
   
        boolean success = file.renameTo(new File("E:\\manish.png"));
        System.out.println("success = " + success);
    
    }
    }
    
}
