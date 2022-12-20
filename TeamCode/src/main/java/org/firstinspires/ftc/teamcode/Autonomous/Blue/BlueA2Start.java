package org.firstinspires.ftc.teamcode.Autonomous.Blue;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import org.firstinspires.ftc.teamcode.Autonomous.AutonomousPLUS;

@Autonomous(group = "Blue", name = "Blue A2 Start (Blue Terminal)")
public class BlueA2Start extends AutonomousPLUS {
    @Override
    public void runOpMode() {

        super.runOpMode();
        robot.startingPosition = "Blue A2";
        //sleepTime = 400;

        MayFlowers.initCamera(hardwareMap, telemetry);
        robot.parkingZone = 8;

        //while (!isStarted() && !isStopRequested()) {
            MayFlowers.DEATHLOOP(MayFlowers.aprilTagDetectionPipeline);
            telemetry.addData("Zone", robot.parkingZone);
            telemetry.update();
            //idle();
       // }

        //Do this to pass inspection.
        waitForStart();



        MayFlowers.AprilTagsUpdate();

        robot.openAndCloseClaw(0);
        prepareNextAction(300);
        sleepTime = 400;
        moveArm("Up", 0.75);
        moveRobotForward(1500);
        prepareNextAction(100);
        moveRobotBackward(300);
        prepareNextAction(100);
        moveRobotLeft(1825);
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
}

