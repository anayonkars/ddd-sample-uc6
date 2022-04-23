package com.ddd_bootcamp.domain;

public interface Entity<T> {
    boolean hasSameIdentityAs(T other);
}
