package org.firstinspires.ftc.teamcode.Autonomous.Red;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.Autonomous.AutonomousPLUS;

@Autonomous(group = "Red", name = "Red A2 Start (Red Terminal)")
public class RedA2Start extends AutonomousPLUS {
    @Override
    public void runOpMode() {

        super.runOpMode();

        //Do this to pass inspection.
        waitForStart();

        moveRobotLeft(1250);
        prepareNextAction(500);

        moveRobotRight(100);
        prepareNextAction(100);

        moveRobotForward(1300);
        prepareNextAction(400);

    }
}

