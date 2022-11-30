package org.firstinspires.ftc.teamcode.Autonomous.Red;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.Autonomous.AutonomousPLUS;

@Autonomous(group = "REd", name = "Red A5 Start (Blue Terminal)")
public class RedA5Start extends AutonomousPLUS {
    @Override
    public void runOpMode() {

        super.runOpMode();

        //Do this to pass inspection.
        waitForStart();
        //moveToParkingZone("Red A5");
        moveRobotForward(55);
        prepareNextAction(300);

        moveRobotLeft(950);
        prepareNextAction(300);

        moveRobotForward(950);
        prepareNextAction(300);

        turnRobotLeft(500);
        prepareNextAction(300);

        moveArm("Up", .5);
        sleep(2000);
        robot.powerSet(0);






        //moveRobotRight(960);
        //prepareNextAction(500);

        //moveRobotForward(1400);
        //prepareNextAction(400);

    }
    //so uh yeah we totally made this for outreach
}

