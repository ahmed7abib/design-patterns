package behaviourals_patterns.observer;

public interface CoursesSubject {
    void subscribe(CoursesObserver coursesObserver);

    void unsubscribe(CoursesObserver coursesObserver);

    void sendNotifications();
}
