# Generic

* 잘못된 타입이 사용될 수 있는 문제를 제거하기 위해

* 클래스와 인터페이스, 메소드를 정의할 때 타입을 파라미터로 사용할 수 있게 해줌

* 장점

  * 컴파일 시 강한 타입 체크 가능
  * 타입 변환을 제거

* 예시(Box class)

  ```java
  public class Box<T>{
    private T t;
    public void set(T t){this.t = t;}
    public T get(){return t;}
  }
  
  Box<String> box = new Box<String>();
  box.set("hello");
  String str = box.get();
  ```

  * 타입 변환이 발생하지 않음

## 제네릭 타입(class<T>, interface<T>)

* __타입을 파라미터로 가지는__ 클래스와 인터페이스

* 클래스,인터페이스 이름뒤에 "<>"가 붙고, 사이에 타입 파라미터가 위치

* 일반적으로 대문자 알파벳 한 글자로 표현

* __멀티 타입 파라미터__

  * 각타입 파라미터를 콤마로 구분

    ```java
    class Box<K,V>{}
    interface Box <K,V>{}
    ```

    * 자바 7부터 <> 연산자를 사용하면 타입 파라미터를 유추하여 설정

      ```java
      Product<Tv,String> product = new Product<Tv,String>();
      //->
      Product<Tv,String> product = new Product<>();
      ```

      

## 제네릭 메소드

* 매개 타입과 리턴 타입으로 타입 파라미터를 갖는 메소드

* 리턴 타입 앞에 <> 기호 추가하고 타입 파라미터 기술 후, 리턴 타입과 매개 타입으로 타입 파라미터 사용

  ```java
  public static <T> T a(T t){
    T tt = t;
    return tt;
  }
  ```

  

## 제한된 타입 파라미터

* 타입 파라미터 뒤에 extends 키워드 붙이고 상위 타입 명시

  ```java
  public <T extends 상위타입> 리턴타입 메소드(매개변수){...}
  ```

* 상위 타입은 인터페이스도 가능(인터페이스도 extends)

* 타입 파라미터(T)에 지정되는 구체적인 타입은 상위 타입이거나 상위 타입의 하위 또는 구현 클래스만 가능

  * ```java
    class A{
      void a(){
        System.out.println("a실행");
      }
    }
    
    class B extends A{
      void b(){
        System.out.println("b실행")
      }
    }
    
    public class Ex{
      public static <T extends A> void a(T t){
        t.a();
        //t.b(); 
      }
      
      public static void main(String[] args){
        a(new A());
        a(new B());
      }
    }
    ```

    

## 와일드카드 타입

* 와일드 카드: __?__
* 제네릭 타입을 매개값이나 리턴 타입으로 사용할 때 다음과 같이 세 가지 형태로 사용 가능
  1. 제네릭타입<?>:제한없음
  2. 제네릭타입<? extends 상위타입>:상위 클래스 제한
  3. 제네릭타입<? super 하위타입>:하위 클래스 제한

## 제네릭 타입의 상속과 구현

* Product<T,M>제네릭 타입을 상속해서 ChildProduct<T,M>타입을 정의함

  ```java
  public class ChildProduct<T,M> extends Product<T,M>{...}
  ```

* 자식 제네릭 타입은 추가적으로 타입 파라미터를 가질 수 있음

  ```java
  public class ChildProduct<T,M,C> extends Product<T,M>{...}
  ```

  