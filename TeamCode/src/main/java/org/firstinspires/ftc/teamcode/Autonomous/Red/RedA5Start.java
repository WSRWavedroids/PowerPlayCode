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
        moveRobotForward(1500, 50);
        moveRobotBackward(300, 50);
        moveRobotLeft(1800, 50);
        sleepTime = (1865);
        moveArm("Up",0.75);
        prepareNextAction(100);
        moveRobotForward(275, 50);
        robot.openAndCloseClaw(0.3);
        prepareNextAction(100);
        moveRobotBackward(150, 50);
        moveArm("Down",0.75);
        prepareNextAction(100);

        if (robot.parkingZone == 1){

            moveRobotRight(600, 50);

        } else if (robot.parkingZone == 2){

            moveRobotRight(1400, 50);

        } else if (robot.parkingZone == 3){

            moveRobotRight(2400,50);

        } else {

            moveRobotRight(600,50);

        }

        moveRobotForward(740,50);


    }
    //so uh yeah we totally made this for outreach
}


