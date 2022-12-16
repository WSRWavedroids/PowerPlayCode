package org.firstinspires.ftc.teamcode.Autonomous.Red;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.Autonomous.AutonomousPLUS;


@Autonomous(group = "Red", name = "Red A4 Start (Red Terminal)")
public class RedA4continue extends AutonomousPLUS {
    @Override
    public void runOpMode() {

        super.runOpMode();

        waitForStart();
        robot.openAndCloseClaw(0);
        prepareNextAction(300);
        sleepTime = 400;//return to 400
        moveArm("Up", .75);


       /* moveRobotForward(300);
        prepareNextAction(100);
        moveRobotLeft(1400);
        prepareNextAction(100);
        moveRobotBackward(350);
*/
        sleepTime=400;
        moveArm("Up", 0.75);
        moveRobotForward(300);
        prepareNextAction(100);
        moveRobotLeft(2400);
        prepareNextAction(100);
        moveRobotBackward(350);
        prepareNextAction(100);
    }
}

