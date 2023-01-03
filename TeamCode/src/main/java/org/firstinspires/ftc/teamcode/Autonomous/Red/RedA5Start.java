package org.firstinspires.ftc.teamcode.Autonomous.Red;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.Autonomous.AutonomousPLUS;

@Autonomous(group = "Red", name = "Red A5 Start (Blue Terminal)")
public class RedA5Start extends AutonomousPLUS {
    @Override
    public void runOpMode() {

        super.runOpMode();
        robot.startingPosition = "Red A5";

        while (!isStarted() && !isStopRequested()) {
            MayFlowers.DEATHLOOP(MayFlowers.aprilTagDetectionPipeline);
            telemetry.addData("Zone", robot.parkingZone);
            telemetry.update();
            idle();
        }

        waitForStart();

        robot.openAndCloseClaw(0);
        prepareNextAction(300);
        sleepTime = 400;
        moveArm("Up", 0.75);
        moveRobotForward(1500);
        prepareNextAction(100);
        moveRobotBackward(300);
        prepareNextAction(100);
        moveRobotLeft(1800);
        prepareNextAction(100);
        sleepTime = (1865);
        moveArm("Up",0.75);
        prepareNextAction(100);
        moveRobotForward(275);
        prepareNextAction(100);
        robot.openAndCloseClaw(0.3);
        prepareNextAction(100);
        moveRobotBackward(150);
        prepareNextAction(100);
        moveArm("Down",0.75);
        prepareNextAction(100);

        if (robot.parkingZone == 1){

            moveRobotRight(600);

        } else if (robot.parkingZone == 2){

            moveRobotRight(1400);

        } else if (robot.parkingZone == 3){

            moveRobotRight(2400);

        } else {

            moveRobotRight(600);

        }

        prepareNextAction(100);
        moveRobotForward(740);


    }
    //so uh yeah we totally made this for outreach
}


