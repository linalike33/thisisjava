package com.mjc813.machine;

import com.mjc813.machine.Calu;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;
public class TesT {
    @Test
    public void testA(){
        Calu ca = new Calu();
        assertThat(ca.add(1,2,3,4,6)).isEqualTo(22L);
        assertThat(ca.add(-1,-2,-3,-4,-6)).isEqualTo(22L);
        assertThat(ca.add(4594375,254435,345345)).isEqualTo(3487329472934L);

    }
}
