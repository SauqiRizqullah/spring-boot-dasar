package com.example.spring.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class FooBar {
    private Foo foo;

    private Bar bar;
}
