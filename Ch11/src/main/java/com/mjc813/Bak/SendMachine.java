package com.mjc813.Bak;

public class SendMachine {
    public boolean isActive() throws MachineNotWorkingException {
        if ( Math.random() >= 0.3 ) {
            return true;
        } else {
            throw new MachineNotWorkingException("Machine broken !!");
        }
    }
}
