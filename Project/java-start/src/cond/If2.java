package cond;

public class If2 {

    public static void main(String[] args) {
        int age = 20; //사용자의 나이

        if(age >= 18) { //true
            System.out.println("성인입니다."); //참일 때 실행
        } else { //false 
            System.out.println("미성년자입니다."); //만족하는 조건이 없을 때 실행
        }
    }
}
