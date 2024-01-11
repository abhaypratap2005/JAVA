public class Y_13_String_Builder {
    public static void main(String[] args) {
        
    
    // strings in java are immutable
    StringBuilder sb = new StringBuilder("hello");
    for(int i =0; i<sb.length()/2; i++){
        int front = i;
        int back = sb.length()- 1- i;   //5-1-0

        char frontChar = sb.charAt(front);
        char backChar = sb.charAt(back);

        sb.setCharAt(front, backChar);
        sb.setCharAt(back, frontChar);

    }

    // sb.append("e");
    // sb.append("l");
    // sb.append("l");
    // sb.append("o");
    // System.out.println(sb.length());
    // System.out.println(sb);

    // //char at index 0
    //  System.out.println(sb.charAt(0));


    //  // set char at index 0
    //  sb.setCharAt(0, 'p');
    //  System.out.println(sb);

    // sb.insert(2, 'n');
    // System.out.println(sb);

    // //delete extra n

    // sb.delete(2, 3);
    // System.out.println(sb);
    System.out.println(sb);
    }
}
