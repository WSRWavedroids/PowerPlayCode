package org.firstinspires.ftc.teamcode.Autonomous.Blue;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.Autonomous.AutonomousPLUS;
import org.firstinspires.ftc.teamcode.Robot;


@Autonomous(group = "Blue", name = "Blue A5 Start (Red Terminal)")
public class BlueA5Start extends AutonomousPLUS {
    @Override
    public void runOpMode() {

        super.runOpMode();
        robot.startingPosition = "Blue A5";
        MayFlowers.initCamera(hardwareMap, telemetry, this);

        while (!isStarted() && !isStopRequested()) {
            MayFlowers.DEATHLOOP(MayFlowers.aprilTagDetectionPipeline);
            telemetry.addData("Zone", robot.parkingZone);
            telemetry.update();
            idle();
        }

        //Do this to pass inspection.
        waitForStart();

        robot.openAndCloseClaw(0);
        prepareNextAction(300);
        sleepTime = 400;
        moveArm("Up", 0.75);
        moveRobotForward(1500, 50);
        moveRobotBackward(300, 50);
        moveRobotRight(1800, 50);
        sleepTime = (1865);
        moveArm("Up",0.75);
        prepareNextAction(100);
        moveRobotForward(275, 50);
        robot.openAndCloseClaw(0.3);
        prepareNextAction(50);
        moveRobotBackward(150, 50);
        moveArm("Down",0.75);
        prepareNextAction(100);

        if (robot.parkingZone == 1){
            moveRobotLeft(600, 50);

        } else if (robot.parkingZone == 2){

            moveRobotLeft(1400, 50);

        } else if (robot.parkingZone == 3){

            moveRobotLeft(2400, 50);

        } else {

            moveRobotLeft(600, 50);

        }

        moveRobotForward(740, 50);

    }
}


