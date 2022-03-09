import java.util.*;
import java.lang.*;

public class test
{
    public static void ReverseS(Stack<Integer> s1){
        Stack<Integer> s2 = new Stack<>();
        Stack<Integer> s3 = new Stack<>();

        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        while(!s2.isEmpty()){
            s3.push(s2.pop());
        }
        while(!s3.isEmpty()){
            s1.push(s3.pop());
        }

    }

    public static int SearchS(Stack<Integer> s, int k){
        Stack<Integer> S = (Stack<Integer>) s.clone();
        int r = (S.isEmpty())? -1:0;
        while(!S.isEmpty()){
            if(S.pop() == k){
                break;
            }
            else{
                r++;
            }
        }
        r = (r==s.size())? -1:r;
        return r;
    }

    public static Stack<Integer> DecomposeE(Stack<Integer> S){
        Stack<Integer> q = new Stack<>();
        Stack<Integer> s = (Stack<Integer>) S.clone();
        ReverseS(s);
        int i = 1;
        while(!s.isEmpty()){
            if((i&1)==0){
                s.pop();
            }
            else{
                q.push(s.pop());
            }
            i++;
        }
        return q;
    }

    public static Stack<Integer> DecomposeO(Stack<Integer> S){
        Stack<Integer> q = new Stack<>();
        Stack<Integer> s = (Stack<Integer>) S.clone();
        ReverseS(s);
        int i = 1;
        while(!s.isEmpty()){
            if((i&1)==1){
                s.pop();
            }
            else{
                q.push(s.pop());
            }
            i++;
        }
        return q;
    }

    public static Stack<Integer> RemoveI(Stack<Integer> S, int i){
        Stack<Integer> s = new Stack<>();
        Stack<Integer> E = (Stack<Integer>) S.clone();
        ReverseS(E);
        int j = S.size();
        while(!E.isEmpty()){
            if(j!=i) {
                s.push(E.pop());
            }
            else{
                E.pop();
            }
            j--;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<>();
        int k = sc.nextInt();
        
        for (int i = 0; i < k; i++) {
            s.push(sc.nextInt());
        }
        
        System.out.println(s);
    }

}
