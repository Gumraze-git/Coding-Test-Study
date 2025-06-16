# [Bronze III] 팩토리얼 - 10872 

[문제 링크](https://www.acmicpc.net/problem/10872) 

### 성능 요약

메모리: 17704 KB, 시간: 192 ms

### 분류

수학, 구현

### 제출 일자

2025년 6월 17일 08:24:09

### 문제 설명

<p>0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.</p>

### 입력 

 <p>첫째 줄에 정수 N(0 ≤ N ≤ 12)이 주어진다.</p>

### 출력 

 <p>첫째 줄에 N!을 출력한다.</p>

- - -
### 다른 풀이(재귀함수)

```java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }

    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }
}
```
#### 재귀 호출에 대한 설명
```java
return n * factorial(n - 1);
```

위 부분이 재귀 호출을 수행하는 부분이다. 예시로 `factorial(5)`를 호출하면 다음과 같이 작동한다.

```plaintext
factorial(5) → 5 * factorial(4)
             → 5 * 4 * factorial(3)
             → 5 * 4 * 3 * factorial(2)
             → 5 * 4 * 3 * 2 * factorial(1)
             → 5 * 4 * 3 * 2 * 1 = 120
```

