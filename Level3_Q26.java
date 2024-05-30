// package
public class Level3_Q26{
public static void main(String[] args) {
    long num = 30000;
    while(num%1584891!=32134 || num%3438478!=193127){
        num++;
    }
    System.out.println(num);
}
}