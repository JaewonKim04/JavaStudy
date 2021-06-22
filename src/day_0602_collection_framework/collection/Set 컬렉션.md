# Set 컬렉션

* 중복저장 불가능
  * 객체 중복 저장 불가능
* __순서 유지하지 않고 저장__
* null도 하나만 저장가능
* 인덱스로 객체를 검색해서 가져오는 메소드가 없음
  * 대신 전체 객체를 대상으로 한번씩 반복해서 가져오는 반복자(__iterator__)를 제공

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
* 동일한 객체 판단
  * hashCode()리턴값-> equals()리턴값 -> 동등 판단

