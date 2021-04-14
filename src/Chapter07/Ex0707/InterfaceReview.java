package Chapter07.Ex0707;

public class InterfaceReview {
    public static void main(String[] args) {
        // 객체 생성
        Sounding dog = new Dog();
        Sounding baby = new Baby();
        Sounding tiger = new Tiger();
        Sounding robot = new Robot();

        // 인터페이스 배열 생성
        Sounding[] arr = { dog, baby, tiger, robot};

        // 소리내기
        for (int k = 0; k < arr.length; k++) {
            arr[k].sound();
        }
    }
}

/* 인터페이스 및 클래스를 작성하시오. */
interface Sounding {
    public void sound();
}

class Dog implements Sounding {
    public void sound() {
        System.out.println("Dog: 멍멍!");
    }
}

class Baby implements Sounding{
    public void sound() {
        System.out.println("Baby: 응애!");
    }
}

class Tiger implements Sounding{
    public void sound() {
        System.out.println("Tiger: 어흥!");
    }
}

class Robot implements Sounding{
    public void sound() {
        System.out.println("Robot: 삐빕!");
    }
}