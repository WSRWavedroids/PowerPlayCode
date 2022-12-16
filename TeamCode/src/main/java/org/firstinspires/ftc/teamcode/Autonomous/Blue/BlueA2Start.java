package org.firstinspires.ftc.teamcode.Autonomous.Blue;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
import org.firstinspires.ftc.teamcode.Autonomous.AprilTags.AprilTagDetectionPipeline;
import org.firstinspires.ftc.teamcode.Autonomous.AutonomousPLUS;
import org.firstinspires.ftc.teamcode.Robot;
import org.openftc.easyopencv.OpenCvCamera;
import org.openftc.easyopencv.OpenCvCameraFactory;
import org.openftc.easyopencv.OpenCvCameraRotation;

@Autonomous(group = "Blue", name = "Blue A2 Start (Blue Terminal)")
public class BlueA2Start extends AutonomousPLUS {
    @Override
    public void runOpMode() {

        super.runOpMode();
        startingPosition = "Blue A2";



        //Do this to pass inspection.


        //robot.init(hardwareMap, telemetry, this);


        MayFlowers.findAprilTags();
        telemetry.addData("Zone", robot.parkingZone);
        telemetry.update();
        waitForStart();
        if (robot.parkingZone == 1){

            robot.openAndCloseClaw(0);
            prepareNextAction(100);
            moveRobotForward(1100);
            prepareNextAction(100);
            moveRobotLeft(1550);
            prepareNextAction(100);
            moveArm("Up",0.75);
            prepareNextAction(100);
            robot.openAndCloseClaw(1);
            prepareNextAction(100);
            moveArm("Down",0.75);
            prepareNextAction(100);
            moveRobotBackward(50);
            prepareNextAction(100);
            moveRobotRight(250);
            prepareNextAction(100);
            moveRobotForward(300);


        } else if (robot.parkingZone == 2){

            moveRobotForward(2000);
            prepareNextAction(200);

        } else if (robot.parkingZone == 3){

            moveRobotRight(2000);
            prepareNextAction(200);
            moveRobotForward(3000);
            prepareNextAction(200);

        }

    }
}

