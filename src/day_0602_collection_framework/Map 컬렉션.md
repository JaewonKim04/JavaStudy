# Map 컬렉션

* __키와 값으로 구성된 Entry 객체__를 저장하는 구조를 가지고 있음
  * 키와 값은 모두 객체
  * 키는 중복저장 x
  * 값은 중복저장 O
  * 기존에 저장된 동일한 키에 값을 저장하면 __기존의 값은 없어지고 새로운 값으로__ 대치됨

* 키를 알고있다면 get() 메소드로 간단하게 찾아오면 됨

  * 저장된 전체 객체를 대상으로 하나씩 얻고 싶을 경우 두 가지 방법을 사용할 수 있다	

  * ```java
    Map<K,V> ma - ~;
    Set<K> KeySet = map.keySet();
    Iterator<K> keyIterator = keySet.iterator();
    while(keyIterator.hasNext){
        K key = keyIterator.next();
        V value = map.get(key);
    }
    
    ```

  * ```java
    Set<Map.Entry<K,V>> entry set = map.entrySet();
    Iterator<K,V? entryIterator = entrySet.iterator();
    while(entryIterator.hasNext()){
        K key = entrySet.getKey();
        V value = entrySet.getValue();
    }
    ```

    

## HashTable

* HashMap과 동일한 내부 구조를 가지고 있음
* HashMap과의 차이점: HashTable은 동기화된 메소드로 구성



## Properties(시험범위 x)

* HashTable의 하위 클래스이기 때문에 HashTable 의 모든 특징을 그대로 갖고있음
* __키와 값을 String으로 제한한__ 컬렉션