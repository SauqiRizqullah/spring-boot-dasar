package com.example.spring.data.cyclic;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class CyclicA {
    private CyclicB cyclicB;
}