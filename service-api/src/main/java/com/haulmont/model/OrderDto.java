package com.haulmont.model;

import java.util.Objects;
import java.util.UUID;

/**
 * @author vasilev
 */
public class OrderDto {

    public OrderDto() {
    }

    public OrderDto(UUID id) {
        this.id = id;
    }

    private UUID id;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderDto orderDto = (OrderDto) o;
        return Objects.equals(id, orderDto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "OrderDto{" +
                "id=" + id +
                '}';
    }
}
