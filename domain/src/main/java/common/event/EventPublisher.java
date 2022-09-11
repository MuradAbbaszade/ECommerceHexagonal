package common.event;

import common.model.Event;

public interface EventPublisher<T extends Event> {
    void publish(T event);
}
