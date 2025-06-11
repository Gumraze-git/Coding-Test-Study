# [Bronze IV] 빠른 A+B - 15552 

[문제 링크](https://www.acmicpc.net/problem/15552) 

### 성능 요약

메모리: 236144 KB, 시간: 752 ms

### 분류

구현, 사칙연산, 수학

### 제출 일자

2025년 6월 10일 08:52:14

### 문제 설명

<p>본격적으로 for문 문제를 풀기 전에 주의해야 할 점이 있다. 입출력 방식이 느리면 여러 줄을 입력받거나 출력할 때 시간초과가 날 수 있다는 점이다.</p>

#### C++의 경우
<p>C++을 사용하고 있고 <code>cin</code>/<code>cout</code>을 사용하고자 한다면, <code>cin.tie(NULL)</code>과 <code>sync_with_stdio(false)</code>를 둘 다 적용해 주고, <code>endl</code> 대신 개행문자(<code>\n</code>)를 쓰자. 단, 이렇게 하면 더 이상 <code>scanf</code>/<code>printf</code>/<code>puts</code>/<code>getchar</code>/<code>putchar</code> 등 C의 입출력 방식을 사용하면 안 된다.</p>

#### Java의 경우
<p>Java를 사용하고 있다면, <code>Scanner</code>와 <code>System.out.println</code> 대신 <code>BufferedReader</code>와 <code>BufferedWriter</code>를 사용할 수 있다. <code>BufferedWriter.flush</code>는 맨 마지막에 한 번만 하면 된다.</p>

#### Python의 경우
<p>Python을 사용하고 있다면, <code>input</code> 대신 <code>sys.stdin.readline</code>을 사용할 수 있다. 단, 이때는 맨 끝의 개행문자까지 같이 입력받기 때문에 문자열을 저장하고 싶을 경우 <code>.rstrip()</code>을 추가로 해 주는 것이 좋다.</p>

<p>또한 입력과 출력 스트림은 별개이므로, 테스트케이스를 전부 입력받아서 저장한 뒤 전부 출력할 필요는 없다. 테스트케이스를 하나 받은 뒤 하나 출력해도 된다.</p>

<p>자세한 설명 및 다른 언어의 경우는 <a href="http://www.acmicpc.net/board/view/22716">이 글</a>에 설명되어 있다.</p>

<p><a href="http://www.acmicpc.net/blog/view/55">이 블로그 글</a>에서 BOJ의 기타 여러 가지 팁을 볼 수 있다.</p>

### 입력 

 <p>첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다. 다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.</p>

### 출력 

 <p>각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.</p>

- - -
### 추가 설명(Java)
#### 반복 횟수가 많은 입력/출력에서의 성능저하
Java는 2가지 기본 입출력 방법이 있다.
- `System.in.read()`
- `Scanner`

- - -
##### System.in.read()
`System.in.read()`는 입력을 한 바이트 단위로 읽는다.
운영체제와의 직접적인 I/O 요청이 매번 발생하므로 처리 속도가 느리다.
바이트를 직접 다뤄야 하므로 처리도 복잡하다.

- - -
##### Scanner
`System.in`을 기반으로 동작하며 내부적으로 정규 표현식을 사용하여 문자열을 파싱한다.
`scanner.nextInt()` -> 입력을 문자열로 받아 정규식을 이용하여 정수로 변환함.
코드가 간결하다는 장점은 있으나, 반복적으로 데이터를 읽는 경우 비효율적이다.

- - -
#### Buffered의 동작 원리 및 성능 개선

- - -
##### Buffer?
버퍼는 데이터를 일정 크기만큼 모아서 한꺼번에 처리하는 공간이다.
`BufferedReader`와 `BufferedWriter`는 각각 입력 스트림과 출력 스트림에 버퍼를 추가하여 성능을 향상시킨다.

- - -
##### BufferedReader
`BufferedReader`는 내부에 약 8KB 크기의 문자 배열 버퍼를 가지고 있다.
`readLine()` 호출 시, 버러에 데이터가 없으면 한 번의 시스템 호출로 대량의 데이터를 읽어온다.
이후에는 이 버퍼 내부에서 데이터를 처리하므로 시스템 호출 횟수가 크게 줄어든다.

```java
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

String line = br.readLine(); // 한 줄 전체 입력
```
- `readLine()`은 개행 문자까지 읽어서 문자열로 반환한다.
- 각종 데이터(정수, 실수 등)는 문자열을 파싱하여 직접 변환해야한다.

- - -
##### BufferedWriter
출력 내용을 메모리 버퍼에 저장해두었다가, `flush()`나 `close()` 호출 시, 한 번에 출력한다.
출력 시 마다 System.out.print()를 사용하는 것 보다 출력 횟수를 줄여 I/O 부담을 감소시킨다.

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
