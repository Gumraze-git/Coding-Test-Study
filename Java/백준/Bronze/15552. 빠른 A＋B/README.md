# [Bronze IV] 빠른 A+B - 15552 

[문제 링크](https://www.acmicpc.net/problem/15552) 

### 성능 요약

메모리: 236144 KB, 시간: 752 ms

### 분류

구현, 사칙연산, 수학

### 제출 일자

2025년 6월 10일 08:52:14
- - -
### 문제 설명

<p>본격적으로 for문 문제를 풀기 전에 주의해야 할 점이 있다. 입출력 방식이 느리면 여러 줄을 입력받거나 출력할 때 시간초과가 날 수 있다는 점이다.</p>

- - -
####  C++의 경우
<p>C++을 사용하고 있고 <code>cin</code>/<code>cout</code>을 사용하고자 한다면, <code>cin.tie(NULL)</code>과 <code>sync_with_stdio(false)</code>를 둘 다 적용해 주고, <code>endl</code> 대신 개행문자(<code>\n</code>)를 쓰자. 단, 이렇게 하면 더 이상 <code>scanf</code>/<code>printf</code>/<code>puts</code>/<code>getchar</code>/<code>putchar</code> 등 C의 입출력 방식을 사용하면 안 된다.</p>

- - -
#### Java의 경우
<p>Java를 사용하고 있다면, <code>Scanner</code>와 <code>System.out.println</code> 대신 <code>BufferedReader</code>와 <code>BufferedWriter</code>를 사용할 수 있다. <code>BufferedWriter.flush</code>는 맨 마지막에 한 번만 하면 된다.</p>

- - -
####  Python의 경우
<p>Python을 사용하고 있다면, <code>input</code> 대신 <code>sys.stdin.readline</code>을 사용할 수 있다. 단, 이때는 맨 끝의 개행문자까지 같이 입력받기 때문에 문자열을 저장하고 싶을 경우 <code>.rstrip()</code>을 추가로 해 주는 것이 좋다.</p>

<p>또한 입력과 출력 스트림은 별개이므로, 테스트케이스를 전부 입력받아서 저장한 뒤 전부 출력할 필요는 없다. 테스트케이스를 하나 받은 뒤 하나 출력해도 된다.</p>

<p>자세한 설명 및 다른 언어의 경우는 <a href="http://www.acmicpc.net/board/view/22716">이 글</a>에 설명되어 있다.</p>

<p><a href="http://www.acmicpc.net/blog/view/55">이 블로그 글</a>에서 BOJ의 기타 여러 가지 팁을 볼 수 있다.</p>

- - -
### 입력 

 <p>첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다. 다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.</p>

- - -
### 출력 

 <p>각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.</p>

- - -
### 추가 설명(Java)
#### 반복 횟수가 많은 입력/출력에서의 성능저하
Java에서는 기본적으로 두 가지 입력 방식이 제공된다.
- `System.in.read()`
- `Scanner`

위 방식은 구현이 간단하지만, 대용량 입력이나 반복적 입출력 상황에서는 성능이 크게 저하될 수 있다.
- - -
##### System.in.read()
- `System.in.read()`는 입력을 한 바이트 단위로 처리한다.
- 위 방식은 운영체제와의 I/O 시스템 호출이 요청될 때마다 발생하므로, 반복 횟수가 많아질수록 성능저하가 발생한다.
- 또한, 바이트 값을 직접 처리해야 하므로 코드가 복잡해질 수 있다.

- - -
##### Scanner
- `Scanner`는 `System.in`을 기반으로 동작하며 내부적으로 정규 표현식을 사용하여 문자열을 파싱한다.
- 내부 동작 순서
1. `java.util.regex.Pattern`을 사용하여 정규표현식을 컴파일
2. 입력 버퍼에서 데이터를 읽음
3. 정규표현식으로 매칭을 시도
4. 필요한 타입으로 파싱

- 동작 과정
```java
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
```

`Scanner.nextInt()`가 내부적으로 `next(Pattern integerPattern` 호출

```java
public int nextInt() {
    return nextInt(defaultRadix);
}

public int nextInt(int radix) {
    // 정수 패턴에 맞는 문자열을 찾기 위해 정규표현식 사용
    String token = next(integerPattern);
    return Integer.parseInt(token, radix);
}
```

`integerPattern`은 내부적으로 다음과 같이 정의되어 있음.

```java
private static final String Digits = "(\\p{Digit}+)";
private static final String HexDigits = "(\\p{XDigit}+)";
private static final Pattern integerPattern = Pattern.compile("[+-]?(\\p{Digit}+)");
```

즉, `nextInt()`는 
1. 정규식 패턴 컴파일 + 실행
2. 매칭된 문자열 추출
3. 형변환(ex: Integer.parseInt)
가 실행된다.

따라서, 코드가 간결하다는 장점은 있으나, 반복적으로 데이터를 읽는 경우 비효율적이다.

- - -
#### Buffered의 동작 원리 및 성능 개선

- - -
##### Buffer?
- 버퍼(Buffer)는 데이터를 임시로 저장해두는 메모리 공간이다.
 - Java의 경우에는 버퍼는 힙(Heap)에 저장된다.
- 입출력(I/O)는 CPU에 비해 매우 느리기 때문에 데이터를 한 번에 전송하거나 수신하는 것이 효율적이다.
- 이때 버퍼가 데이터를 모아서 한꺼번에 처리하는 완충 장치 역할을 한다.
 - 작은 단위의 데이터라도 메모리에 먼저 저장하여 일정량 이상 모이면 한꺼번에 처리할 수 있다.

- - -
##### BufferedReader
- `BufferedReader` 버퍼를 이용한 입출력 방법이다.
- `BufferedReader`는 내부에 약 8KB 크기의 문자 배열 버퍼를 가지고 있다.

**BufferedReader의 내부 구조(개념도)**

```text
[ System.in ]  --->  [ InputStreamReader ]  --->  [ BufferedReader (버퍼) ]  --->  [ 사용자 코드 ]
                        (byte → char)               (문자 배열 8KB 정도)
```
- `BufferedReader`는 내부적으로 **문자 배열(`char[]`) 버퍼**를 가지고 있음.
- 버퍼가 비어있을 경우에만 `System.in`에서 데이터를 읽고, 나머지는 버퍼 메모리에서 빠르게 처리한다.

**사용 방법**
```java
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

String line = br.readLine(); // 한 줄 전체 입력
```
- `readLine()`은 개행 문자까지 읽어서 문자열로 반환한다.
- 각종 데이터(정수, 실수 등)는 문자열을 파싱하여 직접 변환해야한다.

- - -
##### BufferedWriter
- `BufferedWriter`도 `BufferedReader`와 동일하게 작동한다.
- 출력 시 마다 바로 `System.out`에 출력하지 않고 버퍼에 저장한 뒤
- `flush()` 시점에 한 번에 출력한다.
 - I/O 요청 횟수 감소

```java
BufferedWriter bw = BufferedWriter(new OutputStreamWriter(System.out));

bw.write("Hello, World!");
bw.flush(); // 반드시 flush 또는 close가 필요하다.
```
- 특히 for 루프 내에서 많은 양의 출력을 다룰 때 `BufferedWriter`는 성능 향상에 효과적이다.

- - -
##### StringTokenizer과 String.split()
추가로 `String.spilt()`도 마찬가지로 종종 성능 저하가 발생한다.
`String.split()`은 내부적으로 정규표현식을 처리하기 때문에 느리다.
반면에 `StringTokenizer`은 단순 문자 비교 방식으로 구분자를 찾기 때문에 훨씬 빠른 속도를 가지고 있다.

```java
StringTokenizer st = new StringTokenizer("10 20 30");
while (st.hasMoreTokens()) {
   int num = Integer.parseInt(st.nextToken());
```
  
[참고 자료] https://st-lab.tistory.com/30
