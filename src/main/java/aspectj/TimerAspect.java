package aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;


@Aspect
public class TimerAspect {
    @Around("@annotation(Timer)")
    public Object timeAround(ProceedingJoinPoint joinPoint) throws Throwable {
        // Get current time
        long startTime = System.nanoTime();

        // Let the join point proceed
        Object result = joinPoint.proceed();

        // Get end time
        long endTime = System.nanoTime();

        // get difference of two nanoTime values
        long timeElapsed = endTime - startTime;

        System.out.println("Execution time in nanoseconds  : " + timeElapsed);
        System.out.println("Execution time in milliseconds : " +
                timeElapsed / 1000000);

        return result;
    }
}
