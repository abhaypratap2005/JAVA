public class Y_18_Recursion_level2 {
    //Tower of Hanoi

    // public static void towerOfHanoi(int n, String src, String helper, String dest) {
    //     if (n == 1) {
    //         System.out.println("transfer disk" + n + " from " + src + "to " + dest);
    //         return;
    //     }

    //     towerOfHanoi(n - 1, src, dest, helper);
    //     System.out.println("transfer disk" + n + " from " + src + "to " + dest);
    //     towerOfHanoi(n - 1, helper, src, dest);
    // }

    // public static void main(String args[]) {

    //     int n = 3;
    //     towerOfHanoi(n, "S", "H", "D");
    // }





    // String in Reverse
    // public static void printRev(String str, int ind){

    //     if(ind ==0){
    //         System.out.println(str.charAt(ind));
    //         return;
    //     }
    //     System.out.println(str.charAt(ind));
    //     printRev(str, ind-1);

    // }
    // public static void main(String[] args) {
    //     String str = "abcd";
    //     printRev(str, str.length() -1);
    // }



  // finding first and last occurance
//     public static int first =-1;
//     public static int last = -1;

//     public static void findoccurance(String str, int idx, char element){

//         if(idx == str.length()){

//             System.out.println(first);
//             System.out.println(last);
//             return;
//         }
//          char currChar= str.charAt(idx);
//          if(currChar == element) {
//             if(first == -1){
//                 first = idx;

//             }
//             else{
//                 last = idx;
//             }
//          }
//          findoccurance(str, idx+1, element);

//     }
//     public static void main(String args[]) {
// String str = "abaachshdju";
// findoccurance(str, 0, 'a');    }
   


//sorting an array
// public static boolean isSorted(int arr[], int idx){
//   if(idx == arr.length-1){
//     return true;
//   }
//   if(arr[idx]< arr[idx+1]){

//     return isSorted(arr, idx+1);

//   }
//   else{
//     return false;
//   }
// }
// public static void main(String args[]) {
//   int arr[]={1,2 ,1};
//   System.out.println(isSorted(arr, 0));

// }



//move all x to the end of the string

// public static void moveAllX(String str, int idx, int count, String newString ){
// if(idx == str.length()){
//   for(int i =0; i<count; i++){
//     newString += 'x';
//   }
  
//   System.out.println(newString);
//   return ;
// }
  
  
//   char currChar = str.charAt(idx);
//   if(currChar == 'x'){
//     count++;
//     moveAllX(str, idx+1, count, newString);

//   }
//   else{
//     newString += currChar;
//     moveAllX(str, idx+1, count, newString);
//   }
// }
// public static void main(String args[]) {
  

// String str = "abxxxcd";
// moveAllX(str, 0, 0, "");
// }




//remove duplicates in a string

// public static boolean[] map = new boolean[26];

// public static void removeDuplicates(String str, int idx, String newString){
// if(idx ==str.length()){
//   System.out.println(newString);
//   return;
// }
//   char currChar = str.charAt(idx);
//   if(map[currChar -'a'])  {
//      removeDuplicates(str, idx+1, newString);
//     }  
//    else {
//   newString += currChar;
//   map[currChar - 'a']= true;
//   removeDuplicates(str, idx, newString);

//   }
//   }
//   public static void main(String args[]) {
//     String str = "abbcccdaa";
//     removeDuplicates(str, 0, "");
  
//   }





//consequences of an string
//very important
   
public static void subsequences(String str, int idx, String newString){

  if(idx ==str.length()){
    System.out.println(newString);
    return;
  }
  char currChar= str.charAt(idx);


subsequences(str, idx+1, newString+currChar);


subsequences(str, idx+1, newString);
}

public static void main(String[] args) {
  String str = "abc";
  subsequences(str, 0, "");
}
  
  }
