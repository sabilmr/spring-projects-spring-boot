package org.bootcamp.springbootdasar.cyclic;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class CyclicA {

   private CyclicB cyclicB;
}
