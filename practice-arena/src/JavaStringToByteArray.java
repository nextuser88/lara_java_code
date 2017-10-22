public class JavaStringToByteArray {
        public static void main(String args[]){
               
                //Java String object
                String str = "Hello World";
               
                /*
                 * To convert Java String to byte array, use
                 * byte[] getBytes() method of Java String class.
                 */
               
                byte[] bytes = str.getBytes();
				System.out.println(str);
				System.out.println(bytes);
        }
}