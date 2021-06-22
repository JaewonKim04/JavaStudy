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

  