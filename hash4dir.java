package homework.hash;

import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Comparator;

public class hash4dir {
    public static void main(String args[]){
        try {
            byte[] sha1 = Sha1Checksum("/Users/luzhenmin/Desktop/test_sha1");

            String result = "";
            for (int i = 0; i < sha1.length; i++) {
               result+=Integer.toString((sha1[i] & 0xff) + 0x100, 16).substring(1);
            }
            System.out.println("sha1 for this directory is: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static byte[] Sha1Checksum(String path) throws Exception{
        //buffer
        byte[] buffer = new byte[1024];

        MessageDigest sha1code = MessageDigest.getInstance("sha1");
        int numRead = 0;

        //sha1 algorithm
        File dir = new File(path);
        File[] fs = dir.listFiles();
        assert fs != null;
        Arrays.sort(fs, Comparator.comparing(File::getName));

        for(int i=0; i<fs.length; i++){
            if(fs[i].isFile()){
                FileInputStream is = new FileInputStream(fs[i]);
                do{
                    numRead = is.read(buffer);
                    if(numRead > 0) {
                        sha1code.update(buffer, 0, numRead);
                    }
                }while(numRead != -1);
                is.close();
            }
            if(fs[i].isDirectory()){
                Sha1Checksum(path+File.separator+fs[i].getName());
            }
        }
        return sha1code.digest();
    }
}
