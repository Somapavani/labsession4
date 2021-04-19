public class ReplacingCharacter {
    
   public static void main(String[] args)
    {
        String str = "Hello world.";
        String new_str = str.replace('d', 'e');
        System.out.println("Original string: " + str);
        System.out.println("New String: " + new_str);
    }
}