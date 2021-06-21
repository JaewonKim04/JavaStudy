# 중첩클래스&중첩인터페이스

* __중첩클래스__ 는 클래스 내부에 선언한 클래스
  * 특정 클래스와 관계를 맺을 경우 클래스 내부에 선언하는 것이 좋음
* 장점
  * 두 클래스의 멤버들을 서로 쉽게 접근할 수 있음
  * 외부에는 불필요한 관계 클래스를 감춰줌(코드의 복잡성 감소)

* __중첩 인터페이스__ 는 클래스 내부에 선언한 인터페이스
  * 해당 클래스와 긴밀한 관계를 맺는 구현 클래스를 만들기 위해

* 주로 UI프로그래밍에서 이벤트를 처리할 목적으로 활용

  ```java
  public class View{
    public interface OnClickListener{
      public void onClick(View v);
    }
  }
  ```

  

## 중첩클래스

* 멤버 클래스

  * 인스턴스 멤버 클래스

    ```java
    class A{
      class B{ //A객체가 생성되야 사용가능
        B(){}
        int field1;
        void method(){}
      }
    }
    ```

    * 정적필드 불가

    * 정적 메소드 불가

    * ```java
      A a = new A();
      A.B b = a.new B();
      b.field1 = 3;
      b.method();
      ```

      

  * 정적 멤버 클래스

    ```java
    class A{
      static int field;
      static void method2(){}
      static class B{//A클래스로 바로 접근 가능
        B(){}
        int field1;
        void method();
        static int field2;
        static void method2(){}
        field = 3;//바깥 클래스의 정적 필드
        method2(){}//바깥 클래스의 정적 메소드
      }
    }
    ```

    * 정적 필드,메소드 가능

    * 바깥 클래스의 정적 멤버만 사용가능

    * ```java
      A.C c = new A.C();
      c.field1 = 3;
      c.method();
      A.C.field2 = 3;
      A.C.method2();
      ```

* 로컬 클래스

  ```java
  class A{
    void method(){
      class B{//method()가 실행할 때만 사용가능
        B(){}
        int field1;
        void method1(){}
      }
      B b = new B();
      b.field1 = 3;
      b.method1();
    }
  }
  ```

  * 메소드가 실행될 때 메소드 내에서 객체를 생성하고 사용해야함
  * 주로 비동기 처리를 위해 스레드 객체를 만들 때 사용
  * 바깥 클래스의 필드나 메소드를 제한없이 사용가능
  * 매소드의 __매개 변수__ 나 __로컬 변수__ 를 로컬 클래스에서 사용할 때
    * __final로 선언된 것만 가능__
    * Java 8 부터는 final을 붙이지 않아도 final특성을 갖고있음

* 컴파일하면 .class 파일이 별도로 생성
  * __A$B .class__ (A:바깥클래스, B:멤버클래스)
  * __A $1 B .class__

* this키워드를 사용하면 중첩 클래스의 객체 참조
  * 바깥클래스의 참조를 얻으려면: 바깥클래스.this

## 중첩인터페이스

* 클래스의 멤버로 선언된 인터페이스