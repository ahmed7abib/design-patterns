package behaviourals_patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Course implements CoursesSubject {

    private final List<CoursesObserver> coursesObserverList = new ArrayList<>();

    private final String name;
    private String availability;

    public Course(String name) {
        this.name = name;
    }

    public void setAvailability(boolean isAvailable) {
        this.availability = this.name + (isAvailable ? " is available" : " is not available");
        sendNotifications();
    }

    @Override
    public void subscribe(CoursesObserver coursesObserver) {
        coursesObserverList.add(coursesObserver);
    }

    @Override
    public void unsubscribe(CoursesObserver coursesObserver) {
        coursesObserverList.remove(coursesObserver);
    }

    @Override
    public void sendNotifications() {
        for (CoursesObserver coursesObserver : coursesObserverList) {
            coursesObserver.update(availability);
        }
    }
}
