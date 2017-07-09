package de.djuelg.neuronizer.domain.model;

import java.util.Date;
import java.util.Objects;

import de.djuelg.neuronizer.domain.model.base.TodoListUsable;

/**
 * Created by Domi on 26.03.2017.
 *
 * Model of a TodoListHeader which knows it's parent parent TodoList
 */
public class TodoListHeader implements TodoListUsable {

    private final String uuid;
    private final String title;
    private final Date createdAt;
    private final Date changedAt;
    private final int position;
    private final Color color;
    private final String parentTodoListUuid;

    public TodoListHeader(String uuid, String title, Date createdAt, Date changedAt, int position, Color color, String parentTodoListUuid) {
        this.uuid = Objects.requireNonNull(uuid);
        this.title = Objects.requireNonNull(title);
        this.createdAt = Objects.requireNonNull(createdAt);
        this.changedAt = Objects.requireNonNull(changedAt);
        this.position = Objects.requireNonNull(position);
        this.color = Objects.requireNonNull(color);
        this.parentTodoListUuid = Objects.requireNonNull(parentTodoListUuid);
    }

    @Override
    public String getUuid() {
        return uuid;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public Date getCreatedAt() {
        return createdAt;
    }

    @Override
    public Date getChangedAt() {
        return changedAt;
    }

    @Override
    public int getPosition() {
        return position;
    }

    public Color getColor() {
        return color;
    }

    public String getParentTodoListUuid() {
        return parentTodoListUuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TodoListHeader that = (TodoListHeader) o;
        return position == that.position &&
                Objects.equals(uuid, that.uuid) &&
                Objects.equals(title, that.title) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(changedAt, that.changedAt) &&
                Objects.equals(color, that.color) &&
                Objects.equals(parentTodoListUuid, that.parentTodoListUuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, title, createdAt, changedAt, position, color, parentTodoListUuid);
    }
}