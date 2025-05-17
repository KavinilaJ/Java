
package OopsPractice;

import static java.lang.Runtime.version;


public class Version {
    public static void main(String[] args) {
        
    String version1="4.0.1";
    String version2="4.0.1";
    char[] char1=version1.toCharArray();
    char[] char2=version2.toCharArray();
    int length1=char1.length;
    int length2=char2.length;

    if(version1 == version2){
            System.out.println("Equal");
    }
    
    
}
}
