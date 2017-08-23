package com.arinerron.ftc;

public class Motor {
    private String name = "";
    private Robot robot = null;
    private DcMotor motor = null;
    private ElapsedTime timer = new ElapsedTime();

    public Motor(Robot robot, String name) {
        this.name = name;
        this.robot = robot;
        this.motor = this.getRobot().dcMotor.get(this.getName());
    }

    public String getName() {
        return this.name;
    }

    public Robot getRobot() {
        return this.robot();
    }

    public DcMotor getDcMotor() {
        return this.motor;
    }

    private void wait(double seconds) {
        
    }
}
