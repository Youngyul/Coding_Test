import java.util.*;
public class Main {


    public static void Solution(String s1, String s2){
        HashMap<String, Integer> map = new HashMap<>();
        for(char x : s1.toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(char x : s2.toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1);
        }



    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s2 = sc.nextLine();

        Solution(s,s2);


    }

}
