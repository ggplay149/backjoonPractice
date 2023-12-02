package 단계별풀기.no_16_스택큐덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class no_07 {
    //카드2
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i = 1 ; i <= n ; i++ ){
            deque.add(i);
        }
        while(deque.size()>1){
            deque.removeFirst();
            deque.add(deque.pollFirst());
        }
        System.out.print(deque.getFirst());
    }
}
