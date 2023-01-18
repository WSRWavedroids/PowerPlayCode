package org.firstinspires.ftc.teamcode.Autonomous.Blue;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.Autonomous.AutonomousPLUS;


@Autonomous(group = "Blue", name = "Blue A3 Start (Blue Terminal)")
public class BlueA3Start extends AutonomousPLUS {
    @Override
    public void runOpMode() {

        super.runOpMode();

        waitForStart();

        robot.openAndCloseClaw(0);
        prepareNextAction(300);
        sleepTime = 400;//return to 400
        moveArm("Up", .75);

        prepareNextAction(50);
        moveRobotForward(1500);
        prepareNextAction(50);
        moveRobotBackward(300);
        prepareNextAction(50);
        moveRobotLeft(1870);//strafe is not perfection was 1875
        prepareNextAction(100);
        sleepTime = 1395;
        moveArm("Up", .75);
        prepareNextAction(100);
        moveRobotForward(250);
        prepareNextAction(550);

        robot.openAndCloseClaw(.3);
        prepareNextAction(200);
        robot.openAndCloseClaw(0);
        prepareNextAction(100);
        moveRobotBackward(200);
        prepareNextAction(250);
        moveArm("Down",0.25);
        prepareNextAction(50);
        moveRobotRight(700);
        prepareNextAction(50);
        moveRobotForward(740);
        prepareNextAction(100);
        turnRobotRight(960);
        prepareNextAction(100);
        sleepTime = 400;
        moveArm("Up", 0.75);
        prepareNextAction(100);
        moveRobotForward(2750);
        prepareNextAction(100);
        robot.openAndCloseClaw(0);
        prepareNextAction(100);
        turnRobotLeft(960);
        prepareNextAction(100);
        //then move left ticks
        //move claw based off of pole height for zone
        robot.openAndCloseClaw(.3);
        prepareNextAction(100);
        moveArm("Down", 0.25);
        prepareNextAction(100);
        moveRobotLeft(100);

    }
}

//this works for blue a2 and red a5
