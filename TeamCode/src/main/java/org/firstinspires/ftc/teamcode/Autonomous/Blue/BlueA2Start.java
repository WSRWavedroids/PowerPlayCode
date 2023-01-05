package org.firstinspires.ftc.teamcode.Autonomous.Blue;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.Autonomous.AprilTags.MayFlowers;
import org.firstinspires.ftc.teamcode.Autonomous.AutonomousPLUS;
import org.firstinspires.ftc.teamcode.Autonomous.Falafel;

@Autonomous(group = "Blue", name = "Blue A2 Start (Blue Terminal)")
public class BlueA2Start extends Falafel {
    @Override
    public void runOpMode() {

        AutonomousPLUS AP = new AutonomousPLUS();
        MayFlowers MayFlowers = new MayFlowers();
        super.runOpMode();
        robot.startingPosition = "Blue A2";
        AP.sleepTime = 400;

        MayFlowers.initCamera(hardwareMap, telemetry, this);

        while (!isStarted() && !isStopRequested()) {
            MayFlowers.DEATHLOOP(MayFlowers.aprilTagDetectionPipeline);
            telemetry.addData("Zone", robot.parkingZone);
            telemetry.update();
            idle();
        }

        //Do this to pass inspection.
        waitForStart();

        MayFlowers.AprilTagsUpdate();

        robot.openAndCloseClaw(0);
        AP.sleepTime = 400;
        AP.moveArm("Up", 0.75);
        AP.moveRobotForward(1500, 50);
        AP.moveRobotBackward(300, 50);
        AP.moveRobotLeft(1825, 50);
        AP.sleepTime = (1800);
        AP.moveArm("Up",0.75);
        AP.prepareNextAction(100);
        AP.moveRobotForward(275, 50);
        robot.openAndCloseClaw(0.3);
        AP.prepareNextAction(100);
        AP.moveRobotBackward(150, 50);
        AP.moveArm("Down",0.75);
        AP.prepareNextAction(100);

       // if (robot.parkingZone == 1){

           // AP.moveRobotRight(600);

        //} else if (robot.parkingZone == 2){

           // AP.moveRobotRight(1400);

       // } else if (robot.parkingZone == 3){

            //AP.moveRobotRight(2400);

        //} else {

            AP.moveRobotRight(600, 100);

        //}

        AP.moveRobotForward(740, 50);
        robot.openAndCloseClaw(0.3);
        AP.moveArmE("Up", 300);
        AP.prepareNextAction(50);

        turnToHeading(0.5, -90);
        driveStraight(0.5, 24, 0);
        AP.moveRobotForward(50, 50);
        robot.openAndCloseClaw(0);
        AP.moveRobotBackward(100, 50);

        AP.moveTurntable("Left", 600);




        turnToHeading(0.5,90);
        AP.moveRobotLeft(500, 50);
        AP.moveArmE("Up", 1000);
        AP.prepareNextAction(50);
        AP.moveRobotForward(100, 50);
        robot.openAndCloseClaw(0.3);
        AP.moveRobotBackward(100, 50);
        AP.moveArmE("Down", 1000);
        AP.prepareNextAction(50);


    }
}

