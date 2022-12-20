package org.firstinspires.ftc.teamcode.Autonomous.Red;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.Autonomous.AutonomousPLUS;

@Autonomous(group = "Red", name = "Red A2 Start (Red Terminal)")
public class RedA2Start extends AutonomousPLUS {
    @Override
    public void runOpMode() {

        super.runOpMode();
        robot.startingPosition = "Red A2";

        MayFlowers.initCamera(hardwareMap, telemetry);

            MayFlowers.DEATHLOOP(MayFlowers.aprilTagDetectionPipeline);
            telemetry.addData("Zone", robot.parkingZone);
            telemetry.update();
            idle();

        //Do this to pass inspection.
        waitForStart();

        robot.openAndCloseClaw(0);
        prepareNextAction(300);
        sleepTime = 400;
        moveArm("Up", 0.75);
        moveRobotForward(1500);
        prepareNextAction(100);
        moveRobotBackward(300);
        prepareNextAction(100);
        moveRobotRight(1825);
        prepareNextAction(100);
        sleepTime = (1800);
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

            moveRobotLeft(600);

        } else if (robot.parkingZone == 2){

            moveRobotLeft(1400);

        } else if (robot.parkingZone == 3){

            moveRobotLeft(2400);

        } else {

            moveRobotLeft(600);

        }

        prepareNextAction(100);
        moveRobotForward(740);

    }
}


