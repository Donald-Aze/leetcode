package question14;

import junit.framework.Test; 
import junit.framework.TestSuite; 
import junit.framework.TestCase; 

/** 
* LongestCommonPrefix Tester. 
* 
* @author <Authors name> 
* @since <pre>12/17/2017</pre> 
* @version 1.0 
*/ 
public class LongestCommonPrefixTest extends TestCase { 
public LongestCommonPrefixTest(String name) { 
super(name); 
} 


/** 
* 
* Method: getLongestCommonPrefix(String[] strs) 
* 
*/ 
public void testGetLongestCommonPrefix() throws Exception { 
    LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
    String[] strArray = {"leet", "leetcode", "levis"};
    System.out.print(longestCommonPrefix.getLongestCommonPrefix(strArray));
} 



public static Test suite() { 
return new TestSuite(LongestCommonPrefixTest.class); 
} 
} 
