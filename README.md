# homework-testexam

Question 1 solutions: Please check src/main/java/com/testexam/demo/question1

Question 2 solutions: Please check src/main/java/com/testexam/demo/question2

Question 3 solutions: Please check src/main/java/com/testexam/demo/question3

Question 4 solutions: The provided Calculation class is already thread-safe

```java
public class Calculation {
    private static Calculation uniqueInstance;
    private Environment env;
    private QueryDAO dao;

    public Calculation(QueryDAO dao, Environment env) {
        this.env = env;
        this.dao = dao;
    }
}
```

