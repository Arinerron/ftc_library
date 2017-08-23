package com.arinerron.ftc;

import com.qualcomm.robotcore.hardware.*;
import com.qualcomm.robotcore.util.*;

public class Robot {
    private ElapsedTime timer = new ElapsedTime();

    private Motor left = null, right = null;

    public Robot() {

    }

    private void wait(double seconds) {
        timer.reset();
        while(timer.seconds() < seconds);
    }
}
