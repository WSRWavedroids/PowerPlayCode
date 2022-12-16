package org.firstinspires.ftc.teamcode.Autonomous.Red;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.Autonomous.AutonomousPLUS;


@Autonomous(group = "Red", name = "Red A3 Start (Red Terminal)")
public class RedA3Start extends AutonomousPLUS {
    @Override
    public void runOpMode() {

        super.runOpMode();

        //boolean armUp = false;
//forward Backward left and right have all been inverted in code to un-invert the function CK
        //Do this to pass inspection.

        waitForStart();

//isolate a move arm to test milisecond to inch times
        //moveArm("Up", .75);


        robot.openAndCloseClaw(0);
        prepareNextAction(300);
        sleepTime = 400;//return to 400
        moveArm("Up", .75);

        prepareNextAction(100);
        moveRobotForward(1500);
        prepareNextAction(120);
        moveRobotBackward(300);
        prepareNextAction(175);
        moveRobotRight(1800);//strafe is not perfection
        prepareNextAction(100);
        sleepTime = 1680;
        moveArm("Up", .75);
        prepareNextAction(100);
        moveRobotForward(275);
        prepareNextAction(450);
        robot.openAndCloseClaw(.3);
        prepareNextAction(200);
        robot.openAndCloseClaw(0);
        prepareNextAction(100);
        moveRobotBackward(150);
        prepareNextAction(100);
        moveArm("Down",0.25);
        prepareNextAction(100);
        moveRobotLeft(600);
        prepareNextAction(100);
        moveRobotForward(740);
        prepareNextAction(100);

    }
}

//this works for blue a2 and red a5/