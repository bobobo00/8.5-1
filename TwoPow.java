package day18;

import java.util.Scanner;

/**
 * @ClassName TwoPow
 * @Description TODO
 * @Auther danni
 * @Date 2019/8/6 0:09]
 * @Version 1.0
 **/

public class TwoPow {
        public static void main(String[] args) {
            int n=1;
            System.out.println("请输入要判断的数:");
            Scanner scanner=new Scanner(System.in);
            int num=scanner.nextInt();
            int temp=num;
            while(temp%2==0){
                temp= num>>(n++);
                if(temp==1){
                    System.out.println("true,"+"2^"+(--n));
                    return;
                }
            }
            System.out.println("false");
        }

    }

