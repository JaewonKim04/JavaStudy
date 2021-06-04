# Set 컬렉션

* 중복저장 불가능
* List컬렉션: 저장순서 유지 :: Set 컬렉션은 저장순서 유지X
* 객체를 중복해서 저장할 수 없음
* null도 하나만 저장가능

* 인덱스로 객체를 검색해서 가져오는 메소드가 없음
  * 대신 전체 객체를 대상으로 한번씩 반복해서 가져오는 반복자를 제공

```java
Set<String> set = ...;
Iterator<String> iterator = set.interator();
while(iterator.hasNext()){
    
}
```

## HashSet

```java
Set<E> set = new HashSet<E>();
```

* 객체들을 순서 없이 저장하고 __동일한 객체는 중복 저장하지 않음__
* 